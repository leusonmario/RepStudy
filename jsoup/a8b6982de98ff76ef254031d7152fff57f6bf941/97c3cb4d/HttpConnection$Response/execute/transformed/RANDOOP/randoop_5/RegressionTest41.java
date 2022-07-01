import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest41 {

    public static boolean debug = false;

    @Test
    public void test20501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20501");
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
        response1.contentType = "Location";
        boolean boolean24 = response1.hasCookie("hi!");
        response1.charset = "";
        org.jsoup.Connection.Method method27 = response1.method();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(method27);
    }

    @Test
    public void test20502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20502");
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
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.headers();
        java.lang.String str20 = response1.header("Location");
        java.net.URL uRL21 = response1.url();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(uRL21);
    }

    @Test
    public void test20503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20503");
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
        response1.charset = "Location";
        int int20 = response1.statusCode();
        response1.statusMessage = "";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test20504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20504");
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
        response1.contentType = "";
        java.lang.String str26 = response1.contentType;
        java.nio.ByteBuffer byteBuffer27 = null;
        response1.byteData = byteBuffer27;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test20505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20505");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.contentType();
        org.jsoup.Connection.Response response10 = response1.removeHeader("Location");
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        java.lang.String str13 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        java.net.HttpURLConnection httpURLConnection17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.Connection.Request request20 = null;
        response19.req = request20;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry23 = response19.scanHeaders("hi!");
        response19.charset = "hi!";
        java.lang.String str26 = response19.contentType();
        response19.charset = "hi!";
        org.jsoup.Connection.Response response30 = response19.removeHeader("Location");
        org.jsoup.Connection.Response response33 = response19.cookie("Location", "hi!");
        response19.contentType = "";
        int int36 = response19.numRedirects;
        response19.statusMessage = "Location";
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection17, (org.jsoup.Connection.Response) response19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(strEntry23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test20506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20506");
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
        boolean boolean15 = response1.hasHeader("hi!");
        java.net.URL uRL16 = response1.url();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test20507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20507");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.executed = false;
        response1.contentType = "Location";
        boolean boolean14 = response1.hasHeader("hi!");
        response1.executed = false;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test20508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20508");
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
        java.lang.String str16 = response1.header("Location");
        java.lang.String str18 = response1.header("hi!");
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        java.lang.String str21 = response1.statusMessage;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test20509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20509");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.header("");
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("hi!", "");
        response1.executed = true;
        java.lang.String str18 = response1.statusMessage;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test20510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20510");
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
        response1.executed = false;
        java.lang.String str20 = response1.cookie("Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test20511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20511");
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
        int int23 = response1.statusCode;
        java.lang.String str25 = response1.header("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry27 = response1.scanHeaders("");
        java.lang.String str29 = response1.header("Location");
        java.lang.String str31 = response1.header("");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(strEntry27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test20512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20512");
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
        org.jsoup.Connection.Response response22 = response1.removeCookie("Location");
        org.jsoup.Connection.Response response25 = response1.cookie("Location", "Location");
        java.lang.String str26 = response1.charset;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test20513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20513");
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
        boolean boolean18 = response1.hasCookie("Location");
        boolean boolean20 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test20514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20514");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        response1.executed = true;
        int int9 = response1.statusCode();
        java.lang.String str10 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        java.net.URL uRL17 = response1.url();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test20515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20515");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        boolean boolean10 = response1.executed;
        int int11 = response1.numRedirects;
        org.jsoup.Connection.Method method12 = response1.method();
        response1.statusMessage = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("");
        java.net.URL uRL17 = response1.url();
        int int18 = response1.statusCode();
        java.lang.String str20 = response1.getHeaderCaseInsensitive("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test20516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20516");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.net.URL uRL6 = response1.url();
        org.jsoup.Connection.Request request7 = response1.req;
        java.lang.String str9 = response1.cookie("Location");
        response1.charset = "Location";
        response1.statusMessage = "Location";
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        int int16 = response1.statusCode;
        org.jsoup.Connection.Method method17 = response1.method();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test20517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20517");
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
        response1.charset = "";
        org.jsoup.Connection.Response response18 = response1.cookie("Location", "hi!");
        java.nio.ByteBuffer byteBuffer19 = null;
        response1.byteData = byteBuffer19;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test20518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20518");
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
        int int18 = response1.numRedirects;
        org.jsoup.Connection.Response response20 = response1.removeCookie("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test20519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20519");
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
        java.lang.String str24 = response1.charset;
        int int25 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap26 = response1.headers();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(strMap26);
    }

    @Test
    public void test20520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20520");
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
        org.jsoup.Connection.Response response17 = response1.removeCookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("hi!");
        int int20 = response1.statusCode;
        response1.contentType = "Location";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test20521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20521");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        int int9 = response1.statusCode();
        int int10 = response1.numRedirects;
        response1.contentType = "Location";
        java.lang.String str13 = response1.charset();
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        java.lang.String str16 = response1.charset();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test20522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20522");
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
        java.lang.String str14 = response1.statusMessage();
        boolean boolean17 = response1.hasHeaderWithValue("Location", "hi!");
        org.jsoup.Connection.Request request18 = null;
        response1.req = request18;
        java.lang.String str21 = response1.header("hi!");
        org.jsoup.Connection.Request request22 = response1.req;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(request22);
    }

    @Test
    public void test20523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20523");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response9 = response7.removeCookie("hi!");
        response7.statusCode = 35;
        boolean boolean13 = response7.hasHeader("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test20524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20524");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        response1.numRedirects = '4';
        java.lang.String str11 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        java.net.URL uRL14 = response1.url();
        response1.executed = true;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test20525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20525");
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
        java.lang.String str19 = response17.header("");
        boolean boolean21 = response17.hasHeader("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test20526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20526");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        int int12 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        org.jsoup.Connection.Response response16 = response1.cookie("Location", "Location");
        java.lang.String str17 = response1.statusMessage;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test20527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20527");
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
        java.lang.String str18 = response1.header("");
        java.lang.String str19 = response1.statusMessage;
        java.net.URL uRL20 = response1.url();
        java.lang.String str21 = response1.charset();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test20528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20528");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        java.lang.String str17 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("Location");
        response1.statusCode = (short) 0;
        response1.executed = true;
        boolean boolean25 = response1.hasCookie("Location");
        boolean boolean26 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean29 = response1.hasHeader("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test20529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20529");
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
        response1.statusCode = (-1);
        boolean boolean22 = response1.executed;
        org.jsoup.Connection.Response response24 = response1.removeCookie("Location");
        boolean boolean27 = response1.hasHeaderWithValue("hi!", "hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test20530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20530");
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
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean19 = response1.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response1.scanHeaders("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(strEntry21);
    }

    @Test
    public void test20531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20531");
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
        response1.charset = "hi!";
        org.jsoup.Connection.Request request19 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document22 = response21.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
        org.junit.Assert.assertNull(request19);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test20532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20532");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.header("");
        int int11 = response1.statusCode;
        java.lang.String str12 = response1.contentType;
        response1.executed = false;
        int int15 = response1.statusCode();
        boolean boolean17 = response1.hasCookie("hi!");
        java.lang.String str18 = response1.statusMessage;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test20533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20533");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.contentType();
        org.jsoup.Connection.Response response10 = response1.removeHeader("Location");
        response1.contentType = "Location";
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        java.nio.ByteBuffer byteBuffer15 = null;
        response1.byteData = byteBuffer15;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(strEntry18);
    }

    @Test
    public void test20534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20534");
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
        java.lang.String str19 = response1.contentType();
        java.lang.String str20 = response1.contentType;
        org.jsoup.Connection.Response response23 = response1.header("hi!", "Location");
        java.lang.String str24 = response1.contentType();
        java.net.URL uRL25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response26 = response1.url(uRL25);
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
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test20535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20535");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.lang.String str6 = response1.charset;
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        boolean boolean10 = response1.hasCookie("Location");
        org.jsoup.Connection.Method method11 = response1.method();
        int int12 = response1.numRedirects;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test20536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20536");
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
        org.jsoup.Connection.Response response17 = response1.cookie("Location", "Location");
        int int18 = response1.statusCode;
        java.lang.String str19 = response1.charset;
        java.lang.String str21 = response1.cookie("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Location" + "'", str13, "Location");
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Location" + "'", str19, "Location");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test20537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20537");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.statusCode = 10;
        int int9 = response1.numRedirects;
        boolean boolean10 = response1.executed;
        java.lang.String str11 = response1.statusMessage();
        java.lang.String str12 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        org.jsoup.Connection.Request request14 = response1.req;
        response1.contentType = "Location";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(request14);
    }

    @Test
    public void test20538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20538");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        response1.charset = "Location";
        java.lang.String str9 = response1.contentType;
        response1.statusCode = (-1);
        java.lang.String str13 = response1.cookie("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test20539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20539");
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
        org.jsoup.Connection.Response response17 = response1.removeCookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        response1.charset = "Location";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test20540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20540");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
    }

    @Test
    public void test20541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20541");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        response2.charset = "";
        response2.statusMessage = "";
        java.lang.String str11 = response2.header("");
        java.lang.String str12 = response2.statusMessage();
        java.lang.String str13 = response2.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response2.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response2.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response2.scanHeaders("Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strEntry16);
        org.junit.Assert.assertNull(strEntry19);
    }

    @Test
    public void test20542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20542");
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
        org.jsoup.Connection.Response response27 = response1.removeHeader("hi!");
        boolean boolean28 = response1.executed;
        org.jsoup.Connection.Method method29 = response1.method();
        java.nio.ByteBuffer byteBuffer30 = null;
        response1.byteData = byteBuffer30;
        java.lang.String str33 = response1.header("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(method29);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test20543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20543");
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
        java.lang.String str13 = response1.charset();
        java.lang.String str14 = response1.statusMessage;
        int int15 = response1.statusCode();
        org.jsoup.Connection.Request request16 = response1.req;
        int int17 = response1.numRedirects;
        org.jsoup.Connection.Method method18 = response1.method();
        response1.statusCode = (short) 10;
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(method18);
    }

    @Test
    public void test20544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20544");
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
        java.lang.String str24 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test20545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20545");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.contentType();
        int int9 = response1.statusCode;
        org.jsoup.Connection.Response response12 = response1.cookie("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test20546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20546");
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
        java.lang.String str22 = response1.statusMessage;
        response1.statusMessage = "hi!";
        response1.numRedirects = (byte) 10;
        response1.numRedirects = (-1);
        response1.executed = false;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test20547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20547");
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
        java.lang.String str20 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean22 = response21.executed;
        response21.contentType = "hi!";
        response21.statusCode = (short) 10;
        response21.contentType = "hi!";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test20548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20548");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        org.jsoup.Connection.Method method11 = response1.method();
        org.jsoup.Connection.Response response13 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response16 = response1.cookie("hi!", "");
        int int17 = response1.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.headers();
        java.net.URL uRL19 = response1.url();
        org.jsoup.Connection.Method method20 = response1.method();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(method20);
    }

    @Test
    public void test20549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20549");
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
        org.jsoup.Connection.Request request22 = null;
        response1.req = request22;
        int int24 = response1.numRedirects;
        java.lang.String str26 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNull(strEntry20);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test20550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20550");
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
        org.jsoup.Connection.Request request23 = response1.req;
        response1.contentType = "hi!";
        response1.statusMessage = "Location";
        response1.executed = true;
        java.lang.String str30 = response1.charset;
        response1.contentType = "";
        response1.statusCode = 32;
        java.util.Map<java.lang.String, java.lang.String> strMap35 = response1.cookies();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(request23);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(strMap35);
    }

    @Test
    public void test20551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20551");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        java.nio.ByteBuffer byteBuffer4 = null;
        response1.byteData = byteBuffer4;
        response1.executed = false;
        boolean boolean8 = response1.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        boolean boolean12 = response1.hasCookie("Location");
        java.lang.String str13 = response1.statusMessage();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test20552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20552");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.header("");
        java.net.URL uRL11 = response1.url();
        response1.charset = "";
        java.lang.String str14 = response1.charset;
        int int15 = response1.statusCode;
        java.lang.String str17 = response1.getHeaderCaseInsensitive("");
        boolean boolean19 = response1.hasCookie("hi!");
        org.jsoup.Connection.Request request20 = null;
        response1.req = request20;
        java.lang.Class<?> wildcardClass22 = response1.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test20553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20553");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str10 = response1.charset;
        java.lang.String str11 = response1.charset();
        java.lang.String str12 = response1.statusMessage();
        response1.charset = "Location";
        java.net.URL uRL15 = response1.url();
        response1.executed = true;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test20554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20554");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.lang.String str11 = response1.contentType;
        response1.statusMessage = "Location";
        java.lang.String str15 = response1.getHeaderCaseInsensitive("");
        response1.charset = "Location";
        org.jsoup.Connection.Response response19 = response1.removeHeader("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test20555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20555");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        response1.charset = "hi!";
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        org.jsoup.Connection.Method method15 = response1.method();
        boolean boolean17 = response1.hasCookie("Location");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer20 = response1.byteData;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNull(byteBuffer20);
    }

    @Test
    public void test20556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20556");
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
        java.lang.String str25 = response1.cookie("hi!");
        org.jsoup.Connection.Response response27 = response1.removeHeader("hi!");
        response1.numRedirects = '4';
        java.lang.String str30 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer31 = null;
        response1.byteData = byteBuffer31;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Location" + "'", str23, "Location");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Location" + "'", str30, "Location");
    }

    @Test
    public void test20557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20557");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        int int9 = response1.statusCode();
        response1.contentType = "";
        int int12 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test20558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20558");
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
        java.lang.String str20 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response21.cookies();
        response21.contentType = "Location";
        boolean boolean26 = response21.hasHeader("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test20559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20559");
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
        response1.executed = true;
        boolean boolean20 = response1.executed;
        java.net.URL uRL21 = response1.url();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(uRL21);
    }

    @Test
    public void test20560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20560");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean13 = response1.hasHeaderWithValue("Location", "");
        java.lang.String str14 = response1.charset;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        org.jsoup.Connection.Method method16 = response1.method();
        java.lang.String str18 = response1.header("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.headers();
        java.lang.String str21 = response1.cookie("hi!");
        response1.statusMessage = "Location";
        response1.statusCode = (-1);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test20561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20561");
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
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.url(uRL18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test20562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20562");
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
        java.util.Map<java.lang.String, java.lang.String> strMap28 = response1.cookies();
        java.net.URL uRL29 = response1.url();
        org.jsoup.Connection.Response response31 = response1.removeCookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry33 = response1.scanHeaders("Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(uRL29);
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertNull(strEntry33);
    }

    @Test
    public void test20563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20563");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        response1.statusMessage = "hi!";
        java.lang.String str14 = response1.statusMessage();
        boolean boolean16 = response1.hasCookie("hi!");
        java.lang.String str17 = response1.charset;
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test20564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20564");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        response2.charset = "";
        boolean boolean10 = response2.hasHeaderWithValue("hi!", "");
        response2.contentType = "hi!";
        int int13 = response2.statusCode();
        org.jsoup.Connection.Request request14 = null;
        response2.req = request14;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test20565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20565");
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
        boolean boolean20 = response1.hasHeader("hi!");
        java.net.URL uRL21 = response1.url();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(uRL21);
    }

    @Test
    public void test20566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20566");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        response1.numRedirects = 100;
        java.lang.String str15 = response1.charset();
        java.net.URL uRL16 = response1.url();
        java.lang.String str17 = response1.charset;
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test20567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20567");
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
        java.lang.String str17 = response1.cookie("Location");
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        boolean boolean21 = response1.hasHeader("hi!");
        java.lang.String str22 = response1.contentType();
        int int23 = response1.numRedirects;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test20568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20568");
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
        response1.statusCode = (short) 10;
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
    public void test20569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20569");
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
        boolean boolean21 = response1.hasHeader("Location");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry23 = response1.scanHeaders("Location");
        org.jsoup.Connection.Request request24 = null;
        response1.req = request24;
        response1.statusCode = (short) 10;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(strEntry23);
    }

    @Test
    public void test20570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20570");
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
        response1.numRedirects = '4';
        java.lang.String str17 = response1.cookie("Location");
        boolean boolean19 = response1.hasHeader("Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test20571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20571");
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
        java.lang.String str31 = response1.getHeaderCaseInsensitive("Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test20572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20572");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        response1.charset = "hi!";
        org.jsoup.Connection.Response response8 = response1.header("Location", "");
        org.jsoup.Connection.Request request9 = response1.req;
        java.lang.String str11 = response1.cookie("Location");
        org.jsoup.Connection.Response response14 = response1.cookie("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        java.lang.Class<?> wildcardClass16 = strMap15.getClass();
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test20573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20573");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        java.lang.String str10 = response1.contentType;
        response1.statusCode = (short) 1;
        response1.charset = "Location";
        java.lang.String str15 = response1.statusMessage;
        java.lang.String str16 = response1.statusMessage;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test20574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20574");
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
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response1.headers();
        java.lang.String str22 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry25 = response23.scanHeaders("");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(strEntry25);
    }

    @Test
    public void test20575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20575");
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
        java.lang.String str19 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response1.scanHeaders("Location");
        org.jsoup.Connection.Method method22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.method(method22);
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(strEntry21);
    }

    @Test
    public void test20576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20576");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        boolean boolean8 = response1.hasHeaderWithValue("Location", "Location");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        java.lang.String str10 = response1.charset();
        java.lang.String str11 = response1.charset;
        java.lang.String str12 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test20577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20577");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = null;
        response2.req = request3;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        org.jsoup.Connection.Response response9 = response2.cookie("hi!", "");
        org.jsoup.Connection.Response response12 = response2.cookie("Location", "");
        boolean boolean15 = response2.hasHeaderWithValue("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response2.cookies();
        org.jsoup.Connection.Response response19 = response2.cookie("Location", "hi!");
        response2.charset = "Location";
        org.jsoup.Connection.Response response24 = response2.cookie("hi!", "");
        java.nio.ByteBuffer byteBuffer25 = null;
        response2.byteData = byteBuffer25;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response27 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(response24);
    }

    @Test
    public void test20578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20578");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        response1.executed = false;
        int int13 = response1.statusCode();
        org.jsoup.Connection.Response response16 = response1.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = response1.hasHeaderWithValue("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test20579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20579");
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
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.headers();
        org.jsoup.Connection.Response response21 = response1.cookie("Location", "Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test20580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20580");
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
        org.jsoup.Connection.Method method26 = response1.method();
        boolean boolean29 = response1.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.Connection.Response response31 = response1.removeCookie("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(response31);
    }

    @Test
    public void test20581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20581");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        response1.statusMessage = "Location";
        org.jsoup.Connection.Response response14 = response1.cookie("Location", "");
        org.jsoup.Connection.Response response17 = response1.cookie("hi!", "");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test20582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20582");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Response response8 = response1.removeHeader("Location");
        java.lang.String str9 = response1.contentType;
        response1.executed = false;
        java.lang.String str12 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.headers();
        int int14 = response1.statusCode();
        int int15 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document16 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test20583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20583");
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
        org.jsoup.Connection.Response response18 = response1.cookie("hi!", "hi!");
        java.lang.String str19 = response1.contentType();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test20584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20584");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.net.URL uRL6 = response1.url();
        org.jsoup.Connection.Request request7 = response1.req;
        java.lang.String str9 = response1.cookie("Location");
        response1.contentType = "hi!";
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test20585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20585");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer2 = null;
        response1.byteData = byteBuffer2;
        java.nio.ByteBuffer byteBuffer4 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        java.lang.String str7 = response1.contentType;
        org.jsoup.Connection.Request request8 = response1.req;
        int int9 = response1.statusCode;
        org.jsoup.Connection.Request request10 = response1.req;
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        int int15 = response1.numRedirects;
        int int16 = response1.numRedirects;
        int int17 = response1.statusCode();
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test20586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20586");
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
        boolean boolean35 = response1.hasHeaderWithValue("hi!", "Location");
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response(response1);
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test20587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20587");
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
        int int22 = response1.statusCode();
        response1.executed = false;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Location" + "'", str18, "Location");
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test20588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20588");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.net.URL uRL11 = response1.url();
        org.jsoup.Connection.Method method12 = response1.method();
        org.jsoup.Connection.Request request13 = response1.req;
        java.lang.String str14 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        org.jsoup.Connection.Response response18 = response1.header("Location", "");
        java.lang.String str19 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test20589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20589");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.header("");
        int int11 = response1.statusCode;
        java.lang.String str12 = response1.contentType;
        response1.executed = false;
        java.lang.String str15 = response1.charset();
        boolean boolean17 = response1.hasCookie("Location");
        boolean boolean19 = response1.hasCookie("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test20590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20590");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.lang.String str6 = response1.statusMessage;
        java.lang.String str7 = response1.charset;
        java.lang.String str8 = response1.statusMessage();
        boolean boolean9 = response1.executed;
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test20591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20591");
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
        java.lang.String str24 = response1.statusMessage();
        java.lang.String str25 = response1.statusMessage;
        int int26 = response1.statusCode();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test20592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20592");
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
        java.lang.String str23 = response1.charset;
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test20593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20593");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.lang.String str7 = response1.statusMessage();
        java.lang.String str9 = response1.header("");
        org.jsoup.Connection.Response response12 = response1.cookie("Location", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test20594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20594");
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
        org.jsoup.Connection.Request request27 = null;
        response1.req = request27;
        java.lang.String str29 = response1.charset;
        boolean boolean31 = response1.hasCookie("Location");
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test20595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20595");
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
        java.lang.String str19 = response1.charset;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test20596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20596");
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
        boolean boolean19 = response1.hasHeaderWithValue("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray20 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test20597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20597");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str8 = response1.cookie("hi!");
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        java.net.URL uRL12 = response1.url();
        org.jsoup.Connection.Response response15 = response1.header("hi!", "Location");
        int int16 = response1.statusCode;
        java.lang.String str17 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.headers();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test20598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20598");
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
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.cookies();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test20599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20599");
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
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        boolean boolean16 = response1.hasHeaderWithValue("Location", "Location");
        java.lang.String str17 = response1.charset;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test20600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20600");
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
        java.lang.String str19 = response1.contentType;
        java.lang.String str20 = response1.contentType;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test20601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20601");
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
        int int20 = response1.numRedirects;
        java.net.URL uRL21 = response1.url();
        boolean boolean23 = response1.hasCookie("hi!");
        java.lang.String str24 = response1.contentType;
        org.jsoup.Connection.Response response27 = response1.cookie("hi!", "hi!");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(response27);
    }

    @Test
    public void test20602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20602");
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
        java.lang.String str16 = response1.header("");
        org.jsoup.Connection.Response response18 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test20603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20603");
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
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry27 = response1.scanHeaders("");
        java.net.URL uRL28 = response1.url();
        java.lang.String str29 = response1.charset;
        java.lang.String str30 = response1.charset;
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
        org.junit.Assert.assertNull(strEntry27);
        org.junit.Assert.assertNull(uRL28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test20604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20604");
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
        java.nio.ByteBuffer byteBuffer24 = null;
        response1.byteData = byteBuffer24;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry27 = response1.scanHeaders("");
        org.jsoup.Connection.Response response29 = response1.removeCookie("hi!");
        java.lang.Class<?> wildcardClass30 = response29.getClass();
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
        org.junit.Assert.assertNull(strEntry27);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test20605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20605");
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
        int int21 = response1.numRedirects;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(byteBuffer18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test20606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20606");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean12 = response1.hasCookie("Location");
        boolean boolean14 = response1.hasCookie("Location");
        org.jsoup.Connection.Request request15 = response1.req;
        java.lang.String str16 = response1.statusMessage;
        org.jsoup.Connection.Response response19 = response1.cookie("hi!", "");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test20607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20607");
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
        response1.statusMessage = "";
        org.jsoup.Connection.Method method28 = response1.method();
        java.lang.String str30 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response33 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strMap31);
    }

    @Test
    public void test20608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20608");
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
        boolean boolean22 = response1.hasHeaderWithValue("Location", "hi!");
        boolean boolean25 = response1.hasHeaderWithValue("Location", "");
        java.lang.String str26 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test20609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20609");
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
        java.net.URL uRL14 = response1.url();
        response1.executed = false;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test20610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20610");
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
        java.lang.String str20 = response1.charset;
        int int21 = response1.statusCode;
        java.lang.String str22 = response1.statusMessage;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test20611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20611");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        java.nio.ByteBuffer byteBuffer4 = null;
        response1.byteData = byteBuffer4;
        response1.executed = false;
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        java.lang.String str11 = response1.contentType();
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test20612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20612");
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
        java.lang.String str17 = response1.charset();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test20613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20613");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str9 = response1.header("hi!");
        java.lang.String str10 = response1.statusMessage;
        org.jsoup.Connection.Method method11 = response1.method();
        java.lang.String str12 = response1.contentType();
        boolean boolean14 = response1.hasCookie("Location");
        org.jsoup.Connection.Response response16 = response1.removeCookie("Location");
        java.lang.String str18 = response1.header("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test20614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20614");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL18 = response17.url();
        response17.statusMessage = "hi!";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(uRL18);
    }

    @Test
    public void test20615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20615");
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
        java.lang.String str20 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean22 = response21.executed;
        org.jsoup.Connection.Request request23 = response21.req;
        response21.statusCode = 1;
        java.lang.String str26 = response21.contentType;
        int int27 = response21.statusCode();
        java.lang.String str28 = response21.statusMessage;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(request23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test20616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20616");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str18 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response1.scanHeaders("");
        int int21 = response1.statusCode;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response1);
        response22.statusCode = (short) 100;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = response22.body();
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
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(strEntry20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test20617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20617");
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
        int int27 = response1.numRedirects;
        response1.contentType = "";
        org.jsoup.Connection.Request request30 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray31 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNull(request30);
    }

    @Test
    public void test20618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20618");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        response1.charset = "Location";
        java.lang.String str9 = response1.contentType;
        response1.statusCode = 1;
        java.lang.String str12 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test20619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20619");
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
        response1.statusCode = (-1);
        java.lang.String str22 = response1.statusMessage;
        org.jsoup.Connection.Response response25 = response1.cookie("Location", "Location");
        response1.numRedirects = (byte) 10;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response29 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
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
        org.junit.Assert.assertNotNull(response25);
    }

    @Test
    public void test20620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20620");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        org.jsoup.Connection.Response response7 = response2.removeCookie("Location");
        response2.statusCode = '#';
        boolean boolean10 = response2.executed;
        java.lang.String str11 = response2.contentType();
        response2.charset = "hi!";
        boolean boolean14 = response2.executed;
        org.jsoup.Connection.Response response16 = response2.removeCookie("hi!");
        response2.numRedirects = (byte) 100;
        java.lang.String str20 = response2.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response21 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test20621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20621");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str11 = response1.statusMessage;
        response1.contentType = "Location";
        int int14 = response1.numRedirects;
        response1.contentType = "hi!";
        org.jsoup.Connection.Response response18 = response1.removeCookie("hi!");
        int int19 = response1.statusCode();
        org.jsoup.Connection.Response response22 = response1.cookie("Location", "");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test20622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20622");
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
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        boolean boolean16 = response1.hasCookie("Location");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean19 = response1.hasHeader("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test20623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20623");
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
        response1.statusMessage = "hi!";
        response1.charset = "hi!";
        response1.executed = false;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test20624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20624");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        response1.charset = "hi!";
        org.jsoup.Connection.Method method11 = response1.method();
        org.jsoup.Connection.Request request12 = response1.req;
        int int13 = response1.statusCode();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test20625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20625");
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
        response1.charset = "Location";
        java.lang.String str22 = response1.getHeaderCaseInsensitive("Location");
        response1.executed = false;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test20626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20626");
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
        response1.charset = "Location";
        java.lang.String str20 = response1.statusMessage();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test20627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20627");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.lang.String str7 = response1.charset();
        response1.statusMessage = "hi!";
        int int10 = response1.statusCode();
        int int11 = response1.numRedirects;
        response1.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response16 = response14.removeCookie("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test20628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20628");
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
        int int24 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer26 = null;
        response25.byteData = byteBuffer26;
        java.lang.String str28 = response25.contentType();
        java.lang.String str30 = response25.header("hi!");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test20629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20629");
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
        java.lang.String str26 = response1.contentType();
        java.lang.String str28 = response1.getHeaderCaseInsensitive("hi!");
        response1.statusCode = 32;
        org.jsoup.Connection.Request request31 = null;
        response1.req = request31;
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test20630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20630");
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
        java.lang.String str13 = response1.charset();
        int int14 = response1.statusCode;
        boolean boolean16 = response1.hasHeader("Location");
        java.net.URL uRL17 = response1.url();
        response1.numRedirects = (short) 10;
        java.lang.String str21 = response1.cookie("Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test20631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20631");
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
        java.lang.String str20 = response1.header("");
        java.nio.ByteBuffer byteBuffer21 = response1.byteData;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(byteBuffer21);
    }

    @Test
    public void test20632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20632");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        java.lang.String str9 = response1.charset;
        int int10 = response1.statusCode();
        java.lang.String str12 = response1.header("Location");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str14 = response13.contentType;
        response13.executed = true;
        java.lang.String str17 = response13.statusMessage();
        boolean boolean18 = response13.executed;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test20633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20633");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        java.lang.String str17 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("Location");
        java.nio.ByteBuffer byteBuffer20 = response1.byteData;
        java.lang.String str21 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNull(byteBuffer20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test20634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20634");
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
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry25 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = response1.headers();
        int int27 = response1.numRedirects;
        response1.statusMessage = "Location";
        java.lang.String str30 = response1.charset();
        int int31 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap32 = response1.headers();
        java.lang.Class<?> wildcardClass33 = response1.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strEntry25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test20635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20635");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.net.URL uRL11 = response1.url();
        boolean boolean13 = response1.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test20636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20636");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.contentType();
        int int9 = response1.statusCode;
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        boolean boolean13 = response1.hasCookie("Location");
        response1.numRedirects = '#';
        java.lang.String str16 = response1.contentType();
        org.jsoup.Connection.Response response19 = response1.header("Location", "hi!");
        java.lang.String str20 = response1.contentType();
        java.lang.String str21 = response1.charset;
        java.net.HttpURLConnection httpURLConnection22 = null;
        org.jsoup.helper.HttpConnection.Response response23 = null;
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.Connection.Request request25 = null;
        response24.req = request25;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry28 = response24.scanHeaders("hi!");
        response24.charset = "hi!";
        int int31 = response24.numRedirects;
        response24.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer34 = response24.byteData;
        java.lang.String str35 = response24.contentType;
        org.jsoup.Connection.Response response38 = response24.cookie("Location", "Location");
        int int39 = response24.numRedirects;
        int int40 = response24.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry42 = response24.scanHeaders("");
        java.nio.ByteBuffer byteBuffer43 = null;
        response24.byteData = byteBuffer43;
        java.util.Map<java.lang.String, java.lang.String> strMap45 = response24.cookies();
        boolean boolean48 = response24.hasHeaderWithValue("hi!", "Location");
        response24.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry52 = response24.scanHeaders("Location");
        response24.statusMessage = "";
        org.jsoup.Connection.Response response57 = response24.header("Location", "hi!");
        java.lang.String str58 = response24.contentType();
        java.lang.String str60 = response24.cookie("Location");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection22, (org.jsoup.Connection.Response) response24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(strEntry28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(byteBuffer34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(response38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(strEntry42);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(strEntry52);
        org.junit.Assert.assertNotNull(response57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Location" + "'", str60, "Location");
    }

    @Test
    public void test20637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20637");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        boolean boolean10 = response1.executed;
        response1.statusMessage = "";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test20638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20638");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean13 = response1.hasHeaderWithValue("Location", "");
        java.lang.String str14 = response1.charset;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        org.jsoup.Connection.Method method16 = response1.method();
        java.lang.String str18 = response1.header("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.headers();
        java.lang.String str21 = response1.cookie("hi!");
        response1.statusMessage = "Location";
        java.lang.String str25 = response1.cookie("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test20639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20639");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = (byte) -1;
        java.lang.String str4 = response1.statusMessage;
        org.jsoup.Connection.Response response7 = response1.header("Location", "hi!");
        org.jsoup.Connection.Response response10 = response1.header("hi!", "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test20640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20640");
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
        int int11 = response1.numRedirects;
        response1.numRedirects = (byte) -1;
        boolean boolean15 = response1.hasCookie("hi!");
        org.jsoup.Connection.Response response18 = response1.header("Location", "Location");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test20641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20641");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray24 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(method23);
    }

    @Test
    public void test20642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20642");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        org.jsoup.Connection.Request request6 = null;
        response2.req = request6;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response2.scanHeaders("Location");
        boolean boolean12 = response2.hasHeaderWithValue("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response2.headers();
        java.nio.ByteBuffer byteBuffer14 = response2.byteData;
        int int15 = response2.numRedirects;
        response2.numRedirects = (short) 0;
        java.lang.String str18 = response2.contentType;
        int int19 = response2.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test20643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20643");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        org.jsoup.Connection.Response response15 = response1.header("Location", "Location");
        response1.statusCode = (byte) 1;
        int int18 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test20644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20644");
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
        boolean boolean24 = response1.hasHeaderWithValue("hi!", "hi!");
        java.lang.String str26 = response1.getHeaderCaseInsensitive("");
        boolean boolean28 = response1.hasHeader("Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test20645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20645");
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
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str17 = response16.contentType();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test20646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20646");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        response1.charset = "hi!";
        java.net.URL uRL9 = response1.url();
        int int10 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        response1.statusCode = 1;
        int int15 = response1.statusCode();
        int int16 = response1.statusCode;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strEntry12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test20647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20647");
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
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        java.lang.String str18 = response1.cookie("Location");
        java.lang.String str19 = response1.charset;
        int int20 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test20648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20648");
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
        org.jsoup.Connection.Response response22 = response1.header("Location", "");
        response1.numRedirects = 53;
        java.lang.String str25 = response1.contentType;
        boolean boolean26 = response1.executed;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test20649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20649");
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
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.headers();
        boolean boolean22 = response1.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean24 = response23.executed;
        int int25 = response23.statusCode();
        response23.contentType = "hi!";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test20650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20650");
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
        boolean boolean26 = response1.hasHeaderWithValue("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test20651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20651");
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
        java.lang.String str18 = response1.charset;
        java.lang.String str20 = response1.cookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray22 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test20652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20652");
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
        response1.executed = true;
        java.net.URL uRL20 = response1.url();
        response1.contentType = "Location";
        response1.contentType = "";
        int int25 = response1.statusCode();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test20653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20653");
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
        java.lang.String str20 = response1.contentType();
        response1.contentType = "";
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray23 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Location" + "'", str20, "Location");
    }

    @Test
    public void test20654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20654");
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
        response1.executed = true;
        org.jsoup.Connection.Method method28 = response1.method();
        org.jsoup.Connection.Response response31 = response1.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response(response1);
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
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertNotNull(response31);
    }

    @Test
    public void test20655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20655");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer2 = null;
        response1.byteData = byteBuffer2;
        java.nio.ByteBuffer byteBuffer4 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        int int7 = response1.statusCode();
        response1.statusCode = (byte) 10;
        response1.statusCode = 0;
        int int12 = response1.numRedirects;
        org.jsoup.Connection.Response response14 = response1.removeCookie("hi!");
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test20656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20656");
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
        org.jsoup.Connection.Request request21 = null;
        response1.req = request21;
        org.jsoup.Connection.Response response25 = response1.header("Location", "Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(response25);
    }

    @Test
    public void test20657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20657");
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
        java.lang.String str13 = response1.charset();
        java.lang.String str14 = response1.statusMessage;
        int int15 = response1.statusCode();
        org.jsoup.Connection.Request request16 = response1.req;
        org.jsoup.Connection.Request request17 = response1.req;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertNull(request17);
    }

    @Test
    public void test20658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20658");
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
        java.lang.String str15 = response12.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response12.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test20659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20659");
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
        int int15 = response1.statusCode;
        boolean boolean18 = response1.hasHeaderWithValue("Location", "Location");
        java.net.URL uRL19 = response1.url();
        boolean boolean21 = response1.hasCookie("Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test20660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20660");
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
        org.jsoup.Connection.Request request25 = response1.req;
        java.lang.String str26 = response1.contentType();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(request25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test20661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20661");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str19 = response1.getHeaderCaseInsensitive("Location");
        java.lang.String str21 = response1.header("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test20662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20662");
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
        boolean boolean24 = response1.executed;
        org.jsoup.Connection.Method method25 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document26 = response1.parse();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(method25);
    }

    @Test
    public void test20663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20663");
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
        response1.executed = true;
        java.lang.String str21 = response1.contentType;
        boolean boolean24 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.Connection.Response response27 = response1.cookie("Location", "Location");
        java.lang.String str28 = response1.charset();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test20664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20664");
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
        java.lang.String str16 = response1.contentType();
        org.jsoup.Connection.Request request17 = response1.req;
        int int18 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        java.net.URL uRL20 = response1.url();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry22 = response1.scanHeaders("");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(strEntry22);
    }

    @Test
    public void test20665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20665");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        response1.charset = "hi!";
        boolean boolean13 = response1.executed;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test20666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20666");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        response1.statusCode = 100;
        boolean boolean12 = response1.hasHeader("Location");
        org.jsoup.Connection.Response response15 = response1.header("Location", "Location");
        java.lang.String str16 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL18 = response17.url();
        org.jsoup.Connection.Response response20 = response17.removeHeader("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test20667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20667");
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
        response1.executed = true;
        java.lang.String str17 = response1.statusMessage();
        response1.executed = false;
        boolean boolean22 = response1.hasHeaderWithValue("Location", "hi!");
        org.jsoup.Connection.Method method23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response1.method(method23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test20668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20668");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        java.lang.String str9 = response1.charset;
        int int10 = response1.statusCode();
        java.lang.String str12 = response1.header("Location");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str14 = response13.contentType();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test20669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20669");
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
        java.lang.String str24 = response1.statusMessage();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test20670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20670");
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
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("hi!");
        java.lang.String str18 = response1.statusMessage;
        java.lang.String str20 = response1.cookie("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(strEntry17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test20671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20671");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        response1.charset = "hi!";
        org.jsoup.Connection.Method method11 = response1.method();
        org.jsoup.Connection.Request request12 = response1.req;
        response1.statusMessage = "";
        org.jsoup.Connection.Response response16 = response1.removeCookie("Location");
        org.jsoup.Connection.Method method17 = response1.method();
        int int18 = response1.statusCode;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.numRedirects = (byte) 100;
        response1.charset = "hi!";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test20672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20672");
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
        org.jsoup.Connection.Request request19 = response1.req;
        org.jsoup.Connection.Request request20 = null;
        response1.req = request20;
        java.nio.ByteBuffer byteBuffer22 = response1.byteData;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(request19);
        org.junit.Assert.assertNull(byteBuffer22);
    }

    @Test
    public void test20673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20673");
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
        java.lang.String str17 = response1.contentType();
        int int18 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Location" + "'", str15, "Location");
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test20674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20674");
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
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response18.cookies();
        org.jsoup.Connection.Response response21 = response18.removeHeader("Location");
        boolean boolean23 = response18.hasCookie("Location");
        response18.contentType = "Location";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test20675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20675");
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
        int int19 = response1.statusCode();
        java.lang.String str20 = response1.contentType;
        response1.statusCode = 32;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test20676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20676");
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
        java.lang.String str17 = response1.contentType;
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strEntry16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test20677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20677");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str8 = response1.cookie("hi!");
        java.lang.String str10 = response1.header("");
        java.net.URL uRL11 = response1.url();
        response1.contentType = "";
        int int14 = response1.numRedirects;
        boolean boolean16 = response1.hasCookie("Location");
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        java.nio.ByteBuffer byteBuffer19 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(byteBuffer19);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test20678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20678");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        boolean boolean7 = response1.executed;
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        response1.statusMessage = "hi!";
        response1.numRedirects = 32;
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test20679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20679");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = (byte) -1;
        boolean boolean5 = response1.hasCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        int int7 = response1.statusCode();
        java.lang.String str8 = response1.statusMessage;
        response1.statusMessage = "hi!";
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test20680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20680");
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
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("hi!");
        java.lang.String str20 = response1.statusMessage();
        org.jsoup.Connection.Response response22 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str25 = response1.cookie("Location");
        java.lang.String str26 = response1.charset();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strEntry19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test20681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20681");
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
        boolean boolean16 = response1.hasCookie("hi!");
        java.lang.String str18 = response1.header("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test20682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20682");
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
        boolean boolean28 = response1.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response30 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test20683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20683");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusCode = (short) 0;
        response1.charset = "hi!";
        boolean boolean13 = response1.hasHeaderWithValue("Location", "Location");
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        response1.charset = "hi!";
        java.lang.String str19 = response1.cookie("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test20684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20684");
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
        response1.statusMessage = "Location";
        java.lang.String str31 = response1.statusMessage;
        org.jsoup.Connection.Request request32 = null;
        response1.req = request32;
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Location" + "'", str31, "Location");
    }

    @Test
    public void test20685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20685");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        int int11 = response1.statusCode();
        int int12 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        java.net.URL uRL14 = response1.url();
        int int15 = response1.statusCode();
        org.jsoup.Connection.Response response18 = response1.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test20686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20686");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        boolean boolean14 = response1.hasCookie("hi!");
        java.lang.String str15 = response1.statusMessage;
        response1.numRedirects = (byte) 100;
        boolean boolean18 = response1.executed;
        java.lang.String str20 = response1.header("Location");
        java.nio.ByteBuffer byteBuffer21 = null;
        response1.byteData = byteBuffer21;
        java.lang.String str23 = response1.contentType;
        org.jsoup.Connection.Request request24 = response1.req;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(request24);
    }

    @Test
    public void test20687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20687");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.charset();
        java.lang.String str8 = response1.charset();
        java.lang.String str10 = response1.header("hi!");
        java.lang.String str11 = response1.contentType;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test20688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20688");
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
        response1.charset = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        boolean boolean19 = response1.hasHeader("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Location" + "'", str12, "Location");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test20689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20689");
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
        boolean boolean19 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document20 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test20690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20690");
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
        response1.executed = true;
        response1.statusMessage = "hi!";
        boolean boolean20 = response1.hasCookie("Location");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test20691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20691");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        java.nio.ByteBuffer byteBuffer4 = null;
        response1.byteData = byteBuffer4;
        response1.executed = false;
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        response1.contentType = "";
        org.jsoup.Connection.Request request12 = response1.req;
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("Location");
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNull(strEntry16);
    }

    @Test
    public void test20692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20692");
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
        int int22 = response1.statusCode;
        java.net.URL uRL23 = response1.url();
        org.jsoup.Connection.Method method24 = response1.method();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(method24);
    }

    @Test
    public void test20693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20693");
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
        java.net.URL uRL22 = response1.url();
        java.lang.String str24 = response1.header("");
        org.jsoup.Connection.Response response26 = response1.removeHeader("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(response26);
    }

    @Test
    public void test20694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20694");
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
        response1.statusMessage = "Location";
        java.lang.String str22 = response1.getHeaderCaseInsensitive("hi!");
        int int23 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap24 = response1.cookies();
        int int25 = response1.numRedirects;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(byteBuffer18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test20695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20695");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        int int11 = response1.statusCode();
        response1.numRedirects = '4';
        response1.charset = "";
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
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test20696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20696");
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
        java.lang.String str18 = response1.charset();
        java.net.URL uRL19 = response1.url();
        java.lang.String str21 = response1.header("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test20697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20697");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        response1.statusMessage = "Location";
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        org.jsoup.Connection.Response response15 = response1.header("hi!", "");
        java.lang.String str16 = response1.contentType();
        java.lang.String str17 = response1.charset;
        java.lang.String str18 = response1.statusMessage();
        org.jsoup.Connection.Response response21 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method22 = response1.method();
        java.nio.ByteBuffer byteBuffer23 = null;
        response1.byteData = byteBuffer23;
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str27 = response1.cookie("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Location" + "'", str18, "Location");
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test20698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20698");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        java.nio.ByteBuffer byteBuffer4 = null;
        response1.byteData = byteBuffer4;
        org.jsoup.Connection.Request request6 = response1.req;
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response11 = response1.cookie("hi!", "hi!");
        java.lang.String str12 = response1.contentType();
        int int13 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test20699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20699");
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
        java.net.URL uRL22 = response1.url();
        java.lang.String str23 = response1.charset;
        org.jsoup.Connection.Response response26 = response1.cookie("hi!", "hi!");
        response1.statusCode = (short) 1;
        java.lang.String str29 = response1.contentType();
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
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test20700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20700");
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
        java.lang.String str14 = response1.statusMessage();
        java.lang.String str15 = response1.charset();
        response1.contentType = "";
        org.jsoup.Connection.Request request18 = null;
        response1.req = request18;
        org.jsoup.Connection.Method method20 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response1.headers();
        response1.contentType = "";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test20701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20701");
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
        java.lang.String str19 = response1.charset;
        boolean boolean21 = response1.hasHeader("Location");
        java.nio.ByteBuffer byteBuffer22 = null;
        response1.byteData = byteBuffer22;
        response1.statusMessage = "Location";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test20702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20702");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        java.lang.String str6 = response1.cookie("Location");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test20703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20703");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean11 = response1.executed;
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        java.net.URL uRL13 = response1.url();
        org.jsoup.Connection.Request request14 = response1.req;
        java.nio.ByteBuffer byteBuffer15 = null;
        response1.byteData = byteBuffer15;
        java.net.URL uRL17 = response1.url();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test20704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20704");
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
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.cookies();
        java.lang.String str19 = response1.getHeaderCaseInsensitive("Location");
        java.lang.String str20 = response1.contentType;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test20705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20705");
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
        org.jsoup.Connection.Request request23 = null;
        response1.req = request23;
        response1.statusCode = '4';
        org.jsoup.Connection.Request request27 = response1.req;
        boolean boolean29 = response1.hasCookie("Location");
        org.jsoup.Connection.Request request30 = null;
        response1.req = request30;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(request27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test20706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20706");
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
        response1.statusCode = 32;
        java.net.URL uRL15 = response1.url();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test20707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20707");
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
        int int21 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer22 = response1.byteData;
        java.nio.ByteBuffer byteBuffer23 = response1.byteData;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strEntry17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(request19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(byteBuffer22);
        org.junit.Assert.assertNull(byteBuffer23);
    }

    @Test
    public void test20708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20708");
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
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response18.scanHeaders("Location");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response18.headers();
        boolean boolean22 = response18.executed;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test20709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20709");
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
        org.jsoup.Connection.Response response17 = response1.removeCookie("hi!");
        org.jsoup.Connection.Method method18 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(method18);
    }

    @Test
    public void test20710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20710");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str18 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response1.scanHeaders("");
        int int21 = response1.statusCode;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response22.cookies();
        boolean boolean25 = response22.hasHeader("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(strEntry20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test20711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20711");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Response response8 = response1.removeHeader("Location");
        response1.executed = false;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("Location");
        java.lang.String str13 = response1.statusMessage();
        response1.statusMessage = "";
        response1.numRedirects = (short) -1;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strEntry19);
    }

    @Test
    public void test20712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20712");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        org.jsoup.Connection.Request request8 = response1.req;
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        java.net.URL uRL13 = response1.url();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test20713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20713");
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
        int int23 = response1.statusCode;
        org.jsoup.Connection.Method method24 = response1.method();
        java.nio.ByteBuffer byteBuffer25 = null;
        response1.byteData = byteBuffer25;
        java.nio.ByteBuffer byteBuffer27 = null;
        response1.byteData = byteBuffer27;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(method24);
    }

    @Test
    public void test20714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20714");
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
        org.jsoup.Connection.Method method16 = response1.method();
        java.lang.String str17 = response1.statusMessage;
        response1.statusMessage = "hi!";
        response1.executed = false;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry23 = response1.scanHeaders("");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strEntry23);
    }

    @Test
    public void test20715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20715");
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
        java.lang.String str22 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.Class<?> wildcardClass25 = response1.getClass();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test20716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20716");
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
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        java.lang.String str17 = response1.statusMessage;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test20717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20717");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.numRedirects = '4';
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test20718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20718");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean13 = response1.hasHeaderWithValue("Location", "");
        response1.executed = false;
        java.lang.String str17 = response1.cookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int20 = response19.statusCode();
        int int21 = response19.statusCode;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test20719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20719");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str8 = response1.cookie("hi!");
        java.lang.String str10 = response1.header("");
        java.net.URL uRL11 = response1.url();
        boolean boolean12 = response1.executed;
        int int13 = response1.statusCode();
        response1.contentType = "Location";
        response1.contentType = "";
        response1.charset = "hi!";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test20720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20720");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.net.URL uRL11 = response1.url();
        java.net.URL uRL12 = response1.url();
        java.lang.String str13 = response1.statusMessage;
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.url(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test20721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20721");
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
        org.jsoup.Connection.Request request18 = response1.req;
        org.jsoup.Connection.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.method(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(request18);
    }

    @Test
    public void test20722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20722");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.charset = "Location";
        java.lang.String str11 = response1.statusMessage;
        int int12 = response1.numRedirects;
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.Connection.Request request16 = null;
        response15.req = request16;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response15.scanHeaders("hi!");
        org.jsoup.Connection.Response response22 = response15.cookie("hi!", "");
        boolean boolean23 = response15.executed;
        int int24 = response15.statusCode;
        response15.statusMessage = "hi!";
        java.net.URL uRL27 = response15.url();
        java.net.URL uRL28 = response15.url();
        java.lang.String str29 = response15.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap30 = response15.cookies();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(uRL27);
        org.junit.Assert.assertNull(uRL28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(strMap30);
    }

    @Test
    public void test20723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20723");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        int int8 = response1.statusCode();
        java.lang.String str9 = response1.charset;
        boolean boolean11 = response1.hasCookie("Location");
        java.lang.String str13 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(strEntry15);
    }

    @Test
    public void test20724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20724");
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
        response1.contentType = "Location";
        java.lang.String str27 = response1.charset();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test20725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20725");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        org.jsoup.Connection.Request request12 = response1.req;
        response1.numRedirects = '4';
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(request12);
    }

    @Test
    public void test20726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20726");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        int int8 = response1.numRedirects;
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        java.lang.String str13 = response1.contentType();
        boolean boolean16 = response1.hasHeaderWithValue("hi!", "hi!");
        java.lang.String str17 = response1.statusMessage;
        java.lang.String str18 = response1.charset();
        int int19 = response1.statusCode();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test20727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20727");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str9 = response1.header("hi!");
        response1.statusMessage = "hi!";
        int int12 = response1.statusCode();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test20728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20728");
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
        org.jsoup.Connection.Response response21 = response1.header("hi!", "");
        response1.contentType = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document24 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test20729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20729");
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
        boolean boolean24 = response1.hasHeaderWithValue("hi!", "hi!");
        int int25 = response1.statusCode();
        boolean boolean27 = response1.hasHeader("hi!");
        java.lang.String str28 = response1.charset;
        int int29 = response1.statusCode();
        boolean boolean30 = response1.executed;
        int int31 = response1.statusCode;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test20730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20730");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        org.jsoup.Connection.Response response8 = response1.removeHeader("Location");
        java.lang.String str9 = response1.contentType();
        int int10 = response1.statusCode;
        response1.contentType = "hi!";
        response1.numRedirects = 35;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test20731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20731");
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
        java.lang.String str19 = response1.charset;
        response1.executed = true;
        java.lang.String str23 = response1.header("hi!");
        java.nio.ByteBuffer byteBuffer24 = null;
        response1.byteData = byteBuffer24;
        java.lang.String str27 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request28 = response1.req;
        org.jsoup.Connection.Method method29 = response1.method();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(request28);
        org.junit.Assert.assertNull(method29);
    }

    @Test
    public void test20732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20732");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        response1.executed = true;
        org.jsoup.Connection.Method method11 = response1.method();
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response15 = response1.removeCookie("Location");
        org.jsoup.Connection.Request request16 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(request16);
    }

    @Test
    public void test20733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20733");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.net.URL uRL6 = response1.url();
        org.jsoup.Connection.Request request7 = response1.req;
        java.lang.String str8 = response1.charset();
        java.lang.String str10 = response1.cookie("hi!");
        java.lang.String str11 = response1.charset();
        response1.charset = "Location";
        response1.executed = true;
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test20734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20734");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        int int4 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer5 = response1.byteData;
        java.nio.ByteBuffer byteBuffer6 = response1.byteData;
        boolean boolean7 = response1.executed;
        java.lang.String str9 = response1.header("hi!");
        java.lang.String str11 = response1.header("hi!");
        response1.numRedirects = 35;
        java.lang.String str14 = response1.contentType;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test20735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20735");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.numRedirects = 10;
        java.lang.String str20 = response1.charset();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test20736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20736");
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
        java.lang.String str24 = response1.contentType;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test20737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20737");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Method method13 = response1.method();
        response1.contentType = "";
        java.lang.String str16 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        java.lang.String str18 = response1.charset();
        response1.contentType = "hi!";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test20738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20738");
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
        response18.contentType = "hi!";
        response18.charset = "hi!";
        response18.statusCode = 'a';
        java.lang.String str26 = response18.header("");
        int int27 = response18.numRedirects;
        java.lang.String str29 = response18.header("Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test20739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20739");
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
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int27 = response1.statusCode;
        int int28 = response1.numRedirects;
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test20740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20740");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        boolean boolean11 = response1.hasCookie("hi!");
        response1.charset = "";
        int int14 = response1.statusCode();
        response1.numRedirects = (short) 10;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test20741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20741");
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
        java.lang.String str19 = response1.charset;
        response1.executed = true;
        org.jsoup.Connection.Request request22 = null;
        response1.req = request22;
        java.nio.ByteBuffer byteBuffer24 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap25 = response1.cookies();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(byteBuffer24);
        org.junit.Assert.assertNotNull(strMap25);
    }

    @Test
    public void test20742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20742");
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
        java.lang.String str30 = response1.getHeaderCaseInsensitive("hi!");
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
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test20743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20743");
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
        boolean boolean25 = response1.hasHeaderWithValue("hi!", "Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test20744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20744");
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
        java.lang.String str26 = response1.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = response1.hasHeaderWithValue("", "hi!");
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test20745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20745");
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
        int int21 = response1.numRedirects;
        int int22 = response1.numRedirects;
        int int23 = response1.numRedirects;
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test20746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20746");
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
        response1.statusMessage = "hi!";
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
    }

    @Test
    public void test20747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20747");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusCode = (byte) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.headers();
        org.jsoup.Connection.Response response16 = response1.header("Location", "hi!");
        response1.contentType = "Location";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test20748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20748");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        response1.executed = true;
        int int9 = response1.statusCode();
        response1.contentType = "Location";
        java.lang.String str12 = response1.statusMessage();
        response1.statusMessage = "";
        response1.statusCode = 32;
        response1.executed = true;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test20749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20749");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.contentType();
        org.jsoup.Connection.Response response10 = response1.removeHeader("Location");
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        int int13 = response1.numRedirects;
        java.lang.String str15 = response1.cookie("hi!");
        response1.numRedirects = (byte) 10;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test20750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20750");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        boolean boolean9 = response1.hasCookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("");
        int int12 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test20751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20751");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.net.URL uRL6 = response1.url();
        org.jsoup.Connection.Request request7 = response1.req;
        java.lang.String str9 = response1.cookie("Location");
        response1.charset = "Location";
        response1.statusMessage = "Location";
        int int14 = response1.statusCode;
        java.lang.String str15 = response1.contentType;
        java.net.HttpURLConnection httpURLConnection16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.Connection.Response response21 = response18.header("hi!", "");
        java.lang.String str23 = response18.getHeaderCaseInsensitive("");
        response18.executed = false;
        org.jsoup.Connection.Response response28 = response18.header("Location", "");
        int int29 = response18.statusCode;
        java.lang.String str30 = response18.charset();
        java.lang.String str31 = response18.statusMessage();
        org.jsoup.Connection.Request request32 = null;
        response18.req = request32;
        java.lang.String str34 = response18.statusMessage();
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response(response18);
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection16, (org.jsoup.Connection.Response) response18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test20752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20752");
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
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        org.jsoup.Connection.Response response18 = response1.removeHeader("hi!");
        int int19 = response1.numRedirects;
        java.lang.String str20 = response1.contentType;
        java.lang.String str21 = response1.charset;
        java.nio.ByteBuffer byteBuffer22 = null;
        response1.byteData = byteBuffer22;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test20753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20753");
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
        java.lang.String str18 = response1.getHeaderCaseInsensitive("");
        java.lang.String str19 = response1.charset();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test20754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20754");
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
        response1.contentType = "";
        java.lang.String str21 = response1.charset();
        java.lang.String str22 = response1.contentType;
        java.lang.String str23 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = response1.cookie("");
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
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test20755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20755");
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
        java.lang.String str19 = response1.contentType;
        org.jsoup.Connection.Request request20 = response1.req;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(request20);
    }

    @Test
    public void test20756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20756");
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
        org.jsoup.Connection.Request request18 = null;
        response1.req = request18;
        java.lang.String str20 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response1.headers();
        java.nio.ByteBuffer byteBuffer22 = null;
        response1.byteData = byteBuffer22;
        java.nio.ByteBuffer byteBuffer24 = null;
        response1.byteData = byteBuffer24;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test20757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20757");
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
        java.lang.String str15 = response1.statusMessage;
        java.lang.String str17 = response1.getHeaderCaseInsensitive("Location");
        int int18 = response1.statusCode;
        boolean boolean20 = response1.hasCookie("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test20758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20758");
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
        response1.statusMessage = "";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test20759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20759");
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
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response1.cookies();
        response1.executed = true;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test20760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20760");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        boolean boolean10 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("Location");
        org.jsoup.Connection.Request request14 = response1.req;
        java.lang.String str16 = response1.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method18 = response17.method();
        org.jsoup.Connection.Request request19 = null;
        response17.req = request19;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method18);
    }

    @Test
    public void test20761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20761");
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
        java.lang.String str21 = response1.contentType;
        response1.statusCode = 0;
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap25 = response1.headers();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNotNull(strEntry20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(strMap25);
    }

    @Test
    public void test20762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20762");
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
        boolean boolean19 = response1.hasCookie("Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test20763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20763");
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
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.cookies();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test20764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20764");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        response1.charset = "hi!";
        java.net.URL uRL9 = response1.url();
        int int10 = response1.statusCode;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.statusMessage();
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Method method15 = response1.method();
        org.jsoup.Connection.Response response17 = response1.removeHeader("Location");
        org.jsoup.Connection.Response response20 = response1.header("hi!", "");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test20765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20765");
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
        response1.statusCode = 0;
        int int21 = response1.statusCode;
        java.lang.String str22 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response1.cookies();
        java.lang.String str25 = response1.header("");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test20766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20766");
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
        java.lang.String str17 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.cookies();
        java.lang.String str20 = response1.header("");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test20767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20767");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.Connection.Request request13 = null;
        response12.req = request13;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response12.scanHeaders("hi!");
        response12.charset = "hi!";
        int int19 = response12.numRedirects;
        response12.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer22 = response12.byteData;
        java.nio.ByteBuffer byteBuffer23 = null;
        response12.byteData = byteBuffer23;
        org.jsoup.Connection.Response response27 = response12.header("hi!", "hi!");
        java.lang.String str29 = response12.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(byteBuffer22);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test20768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20768");
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
        java.lang.String str19 = response1.contentType;
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.lang.Class<?> wildcardClass22 = response1.getClass();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test20769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20769");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(request14);
    }

    @Test
    public void test20770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20770");
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
        java.lang.String str19 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray20 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test20771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20771");
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
        java.nio.ByteBuffer byteBuffer19 = response1.byteData;
        boolean boolean22 = response1.hasHeaderWithValue("Location", "Location");
        java.lang.String str23 = response1.charset();
        java.lang.String str25 = response1.header("");
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
        java.nio.ByteBuffer byteBuffer52 = response28.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap53 = response28.headers();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection26, (org.jsoup.Connection.Response) response28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
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
        org.junit.Assert.assertNull(byteBuffer52);
        org.junit.Assert.assertNotNull(strMap53);
    }

    @Test
    public void test20772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20772");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str11 = response1.statusMessage;
        response1.contentType = "Location";
        response1.statusCode = '#';
        java.net.URL uRL16 = response1.url();
        int int17 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test20773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20773");
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
        response1.statusMessage = "hi!";
        response1.contentType = "";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test20774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20774");
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
        org.jsoup.Connection.Response response19 = response1.cookie("hi!", "Location");
        response1.executed = false;
        org.jsoup.Connection.Request request22 = response1.req;
        response1.statusCode = '4';
        java.net.URL uRL25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response26 = response1.url(uRL25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(request22);
    }

    @Test
    public void test20775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20775");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        int int8 = response1.numRedirects;
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        java.lang.String str13 = response1.statusMessage();
        java.lang.Class<?> wildcardClass14 = response1.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test20776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20776");
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
        java.lang.String str22 = response1.statusMessage;
        response1.statusMessage = "hi!";
        java.lang.String str25 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = response1.headers();
        org.jsoup.Connection.Request request27 = response1.req;
        java.lang.String str28 = response1.contentType();
        java.nio.ByteBuffer byteBuffer29 = null;
        response1.byteData = byteBuffer29;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document31 = response1.parse();
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
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNull(request27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test20777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20777");
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
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry25 = response1.scanHeaders("Location");
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
        org.junit.Assert.assertNull(strEntry25);
    }

    @Test
    public void test20778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20778");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.net.URL uRL6 = response1.url();
        response1.statusCode = (byte) 1;
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        java.lang.String str13 = response1.header("");
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test20779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20779");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        response1.statusMessage = "Location";
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        org.jsoup.Connection.Response response15 = response1.header("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        org.jsoup.Connection.Response response19 = response1.cookie("Location", "Location");
        response1.statusMessage = "hi!";
        java.lang.String str23 = response1.cookie("Location");
        org.jsoup.Connection.Response response25 = response1.removeCookie("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Location" + "'", str23, "Location");
        org.junit.Assert.assertNotNull(response25);
    }

    @Test
    public void test20780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20780");
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
        boolean boolean23 = response1.hasCookie("Location");
        org.jsoup.Connection.Request request24 = null;
        response1.req = request24;
        response1.contentType = "hi!";
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
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test20781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20781");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.executed = true;
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusCode = 10;
        java.lang.String str13 = response1.statusMessage;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test20782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20782");
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
        int int22 = response1.statusCode;
        org.jsoup.Connection.Response response24 = response1.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response26 = response1.removeCookie("");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(response24);
    }

    @Test
    public void test20783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20783");
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
        java.lang.String str19 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        int int21 = response1.numRedirects;
        org.jsoup.Connection.Method method22 = response1.method();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(method22);
    }

    @Test
    public void test20784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20784");
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
        org.jsoup.Connection.Request request25 = null;
        response1.req = request25;
        java.lang.String str27 = response1.contentType;
        org.jsoup.Connection.Method method28 = response1.method();
        org.jsoup.Connection.Method method29 = response1.method();
        int int30 = response1.statusCode;
        java.net.URL uRL31 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap32 = response1.cookies();
        java.nio.ByteBuffer byteBuffer33 = null;
        response1.byteData = byteBuffer33;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertNull(method29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertNull(uRL31);
        org.junit.Assert.assertNotNull(strMap32);
    }

    @Test
    public void test20785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20785");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        boolean boolean6 = response1.hasHeaderWithValue("hi!", "hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        response1.charset = "Location";
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test20786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20786");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str8 = response1.cookie("hi!");
        java.lang.String str10 = response1.header("");
        java.net.URL uRL11 = response1.url();
        response1.contentType = "";
        response1.statusCode = '4';
        java.lang.String str16 = response1.statusMessage;
        response1.contentType = "Location";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test20787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20787");
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
        response1.contentType = "hi!";
        org.jsoup.Connection.Request request19 = response1.req;
        response1.statusCode = 2;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(request19);
    }

    @Test
    public void test20788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20788");
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
        response1.statusCode = 32;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test20789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20789");
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
        java.lang.String str21 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test20790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20790");
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
        java.net.URL uRL20 = response1.url();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(byteBuffer19);
        org.junit.Assert.assertNull(uRL20);
    }

    @Test
    public void test20791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20791");
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
        response1.statusCode = 97;
        java.lang.String str21 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry23 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strEntry23);
    }

    @Test
    public void test20792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20792");
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
        java.lang.String str16 = response1.statusMessage();
        response1.statusMessage = "Location";
        org.jsoup.Connection.Response response21 = response1.cookie("hi!", "Location");
        int int22 = response1.numRedirects;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test20793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20793");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        boolean boolean9 = response1.hasHeaderWithValue("hi!", "");
        response1.contentType = "hi!";
        org.jsoup.Connection.Request request12 = response1.req;
        org.jsoup.Connection.Response response15 = response1.header("Location", "hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("hi!");
        java.lang.Class<?> wildcardClass18 = response1.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(strEntry17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test20794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20794");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        org.jsoup.Connection.Response response9 = response1.header("Location", "");
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        java.lang.String str12 = response1.contentType();
        java.lang.String str13 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        java.lang.String str15 = response1.statusMessage;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test20795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20795");
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
        int int18 = response1.statusCode();
        response1.statusMessage = "Location";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test20796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20796");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        java.lang.String str9 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
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
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry25 = response13.scanHeaders("");
        java.lang.String str27 = response13.header("Location");
        response13.statusCode = (byte) 100;
        java.lang.String str30 = response13.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap31 = response13.headers();
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Method method33 = response32.method();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection11, (org.jsoup.Connection.Response) response32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(byteBuffer23);
        org.junit.Assert.assertNull(strEntry25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNull(method33);
    }

    @Test
    public void test20797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20797");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.lang.String str7 = response1.charset();
        response1.statusMessage = "hi!";
        java.lang.String str10 = response1.contentType();
        org.jsoup.Connection.Response response13 = response1.header("Location", "");
        int int14 = response1.statusCode;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test20798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20798");
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
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        response1.statusMessage = "Location";
        org.jsoup.Connection.Method method21 = response1.method();
        java.lang.String str22 = response1.charset;
        java.lang.String str24 = response1.header("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(byteBuffer18);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test20799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20799");
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
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("hi!");
        java.lang.String str17 = response1.contentType;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test20800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20800");
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
        java.lang.String str19 = response1.contentType;
        java.lang.String str20 = response1.charset;
        boolean boolean21 = response1.executed;
        response1.contentType = "Location";
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray24 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test20801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20801");
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
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        response1.numRedirects = (short) 0;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test20802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20802");
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
        java.lang.String str20 = response1.statusMessage;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test20803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20803");
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
        response1.executed = true;
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test20804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20804");
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
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response1);
        response26.contentType = "Location";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(request23);
    }

    @Test
    public void test20805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20805");
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
        org.jsoup.Connection.Method method21 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray22 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(method21);
    }

    @Test
    public void test20806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20806");
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
        response1.executed = true;
        boolean boolean19 = response1.executed;
        org.jsoup.Connection.Request request20 = response1.req;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(request20);
    }

    @Test
    public void test20807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20807");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.net.URL uRL9 = response1.url();
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        boolean boolean14 = response1.hasHeaderWithValue("Location", "");
        java.lang.String str15 = response1.charset;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test20808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20808");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        java.lang.String str9 = response1.charset;
        response1.charset = "";
        java.lang.String str12 = response1.charset();
        java.lang.String str13 = response1.charset;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test20809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20809");
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
        response1.statusCode = '#';
        response1.numRedirects = 52;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test20810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20810");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        int int9 = response1.statusCode();
        response1.contentType = "";
        int int12 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test20811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20811");
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
        org.jsoup.Connection.Request request18 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.headers();
        org.jsoup.Connection.Response response22 = response1.cookie("Location", "Location");
        boolean boolean24 = response1.hasCookie("hi!");
        org.jsoup.Connection.Method method25 = response1.method();
        org.jsoup.Connection.Method method26 = response1.method();
        org.jsoup.Connection.Request request27 = null;
        response1.req = request27;
        java.lang.String str29 = response1.charset;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(request18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test20812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20812");
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
        java.lang.String str21 = response1.contentType();
        int int22 = response1.numRedirects;
        boolean boolean23 = response1.executed;
        java.nio.ByteBuffer byteBuffer24 = response1.byteData;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(byteBuffer24);
    }

    @Test
    public void test20813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20813");
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
        boolean boolean18 = response1.executed;
        response1.contentType = "hi!";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test20814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20814");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        response1.charset = "hi!";
        boolean boolean14 = response1.hasHeader("Location");
        org.jsoup.Connection.Response response16 = response1.removeHeader("Location");
        org.jsoup.Connection.Response response18 = response1.removeCookie("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test20815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20815");
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
        org.jsoup.Connection.Method method24 = response1.method();
        boolean boolean25 = response1.executed;
        response1.numRedirects = (short) 0;
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
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test20816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20816");
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
        response1.statusCode = '4';
        java.net.URL uRL20 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response1.cookies();
        response1.executed = true;
        java.nio.ByteBuffer byteBuffer24 = null;
        response1.byteData = byteBuffer24;
        java.lang.String str27 = response1.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test20817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20817");
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
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response18.cookies();
        org.jsoup.Connection.Response response21 = response18.removeHeader("Location");
        response18.statusCode = '#';
        java.lang.String str24 = response18.charset();
        org.jsoup.Connection.Request request25 = response18.req;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(request25);
    }

    @Test
    public void test20818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20818");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.contentType();
        java.lang.String str10 = response1.statusMessage;
        java.lang.String str11 = response1.charset();
        java.lang.String str12 = response1.charset;
        java.lang.String str14 = response1.cookie("Location");
        java.net.URL uRL15 = response1.url();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test20819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20819");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        java.lang.String str9 = response1.charset;
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Location" + "'", str9, "Location");
    }

    @Test
    public void test20820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20820");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        response1.statusMessage = "";
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response18 = response1.cookie("Location", "");
        response1.numRedirects = (short) 10;
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
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test20821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20821");
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
        response1.executed = false;
        java.lang.String str19 = response1.charset();
        java.lang.String str20 = response1.statusMessage;
        java.lang.String str21 = response1.statusMessage();
        java.net.URL uRL22 = response1.url();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(uRL22);
    }

    @Test
    public void test20822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20822");
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
        java.lang.String str20 = response1.charset();
        response1.executed = true;
        org.jsoup.Connection.Response response24 = response1.removeCookie("Location");
        java.lang.String str25 = response1.charset();
        java.lang.String str26 = response1.contentType();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test20823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20823");
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
        org.jsoup.Connection.Method method14 = response1.method();
        java.lang.String str15 = response1.statusMessage();
        java.lang.String str17 = response1.getHeaderCaseInsensitive("");
        response1.statusCode = 52;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test20824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20824");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusMessage = "hi!";
        boolean boolean11 = response1.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int13 = response1.statusCode();
        org.jsoup.Connection.Request request14 = response1.req;
        org.jsoup.Connection.Response response17 = response1.header("hi!", "Location");
        java.lang.String str18 = response1.contentType();
        org.jsoup.Connection.Response response21 = response1.header("hi!", "hi!");
        response1.numRedirects = 53;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test20825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20825");
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
        response1.charset = "";
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer19 = response18.byteData;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(byteBuffer19);
    }

    @Test
    public void test20826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20826");
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
        org.jsoup.Connection.Method method16 = response1.method();
        java.lang.String str18 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test20827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20827");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        java.lang.String str17 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("Location");
        response1.statusCode = (short) 0;
        response1.executed = true;
        boolean boolean25 = response1.hasCookie("Location");
        boolean boolean26 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document28 = response27.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test20828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20828");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        response1.contentType = "hi!";
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test20829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20829");
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
        response1.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry24 = response1.scanHeaders("Location");
        java.util.Map<java.lang.String, java.lang.String> strMap25 = response1.headers();
        response1.contentType = "";
        response1.charset = "";
        response1.executed = true;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strEntry24);
        org.junit.Assert.assertNotNull(strMap25);
    }

    @Test
    public void test20830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20830");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str10 = response1.statusMessage();
        boolean boolean12 = response1.hasHeader("Location");
        java.lang.String str13 = response1.statusMessage();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test20831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20831");
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
        response1.statusCode = (short) 0;
        java.lang.String str21 = response1.charset();
        org.jsoup.Connection.Response response23 = response1.removeCookie("Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response25 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test20832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20832");
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
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response1.scanHeaders("Location");
        java.nio.ByteBuffer byteBuffer22 = null;
        response1.byteData = byteBuffer22;
        org.jsoup.Connection.Request request24 = null;
        response1.req = request24;
        org.jsoup.Connection.Response response28 = response1.cookie("hi!", "Location");
        response1.numRedirects = 0;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(strEntry21);
        org.junit.Assert.assertNotNull(response28);
    }

    @Test
    public void test20833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20833");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        java.lang.String str9 = response1.charset;
        java.lang.String str10 = response1.charset;
        response1.contentType = "";
        response1.executed = false;
        boolean boolean16 = response1.hasCookie("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test20834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20834");
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
        java.nio.ByteBuffer byteBuffer23 = null;
        response1.byteData = byteBuffer23;
        java.util.Map<java.lang.String, java.lang.String> strMap25 = response1.headers();
        java.lang.Class<?> wildcardClass26 = strMap25.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(request21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test20835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20835");
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
        java.lang.String str26 = response1.contentType();
        org.jsoup.Connection.Response response28 = response1.removeHeader("hi!");
        java.lang.Class<?> wildcardClass29 = response28.getClass();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Location" + "'", str26, "Location");
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test20836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20836");
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
        java.nio.ByteBuffer byteBuffer17 = null;
        response1.byteData = byteBuffer17;
        java.lang.String str19 = response1.charset();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response1.scanHeaders("Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(strEntry21);
    }

    @Test
    public void test20837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20837");
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
        java.lang.String str20 = response1.contentType();
        java.nio.ByteBuffer byteBuffer21 = response1.byteData;
        java.lang.String str22 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response1.cookies();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(byteBuffer21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test20838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20838");
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
        response1.numRedirects = (short) 0;
        java.lang.String str24 = response1.contentType();
        org.jsoup.Connection.Request request25 = null;
        response1.req = request25;
        boolean boolean27 = response1.executed;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test20839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20839");
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
        java.lang.String str19 = response1.contentType();
        java.lang.String str20 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str22 = response21.contentType();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test20840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20840");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = (byte) -1;
        int int4 = response1.statusCode;
        response1.contentType = "";
        java.lang.String str7 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("");
        response1.statusMessage = "";
        boolean boolean13 = response1.hasCookie("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test20841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20841");
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
        boolean boolean25 = response1.hasHeaderWithValue("Location", "");
        org.jsoup.Connection.Request request26 = null;
        response1.req = request26;
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test20842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20842");
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
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test20843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20843");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Response response6 = response1.removeCookie("Location");
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        response1.statusCode = 'a';
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test20844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20844");
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
        org.jsoup.Connection.Request request21 = null;
        response1.req = request21;
        org.jsoup.Connection.Response response25 = response1.cookie("Location", "Location");
        java.nio.ByteBuffer byteBuffer26 = null;
        response1.byteData = byteBuffer26;
        java.lang.String str28 = response1.statusMessage;
        response1.statusMessage = "";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test20845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20845");
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
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.headers();
        boolean boolean22 = response1.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.Connection.Request request23 = response1.req;
        int int24 = response1.statusCode;
        java.lang.Class<?> wildcardClass25 = response1.getClass();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(request23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test20846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20846");
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
        boolean boolean22 = response1.hasHeaderWithValue("hi!", "Location");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method24 = response1.method();
        java.lang.String str25 = response1.charset;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test20847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20847");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        response1.statusCode = (short) -1;
        int int14 = response1.numRedirects;
        java.net.URL uRL15 = response1.url();
        response1.numRedirects = (byte) 100;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test20848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20848");
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
        response1.statusCode = (short) 100;
        response1.charset = "hi!";
        java.lang.String str22 = response1.charset();
        java.net.HttpURLConnection httpURLConnection23 = null;
        org.jsoup.helper.HttpConnection.Response response24 = null;
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response24);
        org.jsoup.Connection.Request request26 = null;
        response25.req = request26;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry29 = response25.scanHeaders("hi!");
        org.jsoup.Connection.Response response32 = response25.cookie("hi!", "");
        java.net.URL uRL33 = response25.url();
        java.nio.ByteBuffer byteBuffer34 = null;
        response25.byteData = byteBuffer34;
        java.lang.String str36 = response25.contentType;
        org.jsoup.Connection.Method method37 = response25.method();
        response25.contentType = "Location";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry41 = response25.scanHeaders("hi!");
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(strEntry29);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNull(uRL33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(method37);
        org.junit.Assert.assertNull(strEntry41);
    }

    @Test
    public void test20849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20849");
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
        int int14 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        boolean boolean18 = response1.hasHeaderWithValue("hi!", "hi!");
        response1.numRedirects = 10;
        org.jsoup.Connection.Response response23 = response1.header("Location", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test20850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20850");
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
        org.jsoup.Connection.Request request20 = null;
        response1.req = request20;
        int int22 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response1.headers();
        org.jsoup.Connection.Request request24 = null;
        response1.req = request24;
        org.jsoup.Connection.Response response28 = response1.cookie("hi!", "hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(response28);
    }

    @Test
    public void test20851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20851");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        int int11 = response1.statusCode();
        response1.numRedirects = '4';
        response1.charset = "";
        org.jsoup.Connection.Response response17 = response1.removeHeader("Location");
        response1.contentType = "Location";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test20852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20852");
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
        java.lang.String str15 = response1.statusMessage;
        org.jsoup.Connection.Response response17 = response1.removeHeader("Location");
        java.net.URL uRL18 = response1.url();
        java.net.HttpURLConnection httpURLConnection19 = null;
        org.jsoup.helper.HttpConnection.Response response20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.Connection.Response response24 = response21.header("hi!", "");
        response21.charset = "";
        response21.statusMessage = "";
        java.lang.String str30 = response21.getHeaderCaseInsensitive("");
        boolean boolean31 = response21.executed;
        int int32 = response21.numRedirects;
        java.nio.ByteBuffer byteBuffer33 = response21.byteData;
        java.lang.String str35 = response21.header("");
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response(response21);
        java.nio.ByteBuffer byteBuffer37 = null;
        response36.byteData = byteBuffer37;
        java.lang.String str39 = response36.charset;
        response36.statusCode = 0;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection19, (org.jsoup.Connection.Response) response36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(byteBuffer33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test20853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20853");
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
        java.lang.String str17 = response1.contentType;
        boolean boolean20 = response1.hasHeaderWithValue("hi!", "Location");
        response1.executed = false;
        boolean boolean24 = response1.hasCookie("Location");
        java.lang.String str25 = response1.statusMessage;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test20854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20854");
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
        int int16 = response1.numRedirects;
        response1.executed = true;
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        java.lang.String str22 = response1.header("Location");
        int int23 = response1.numRedirects;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test20855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20855");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        java.lang.String str8 = response1.header("Location");
        int int9 = response1.statusCode;
        java.net.URL uRL10 = response1.url();
        boolean boolean12 = response1.hasCookie("hi!");
        java.lang.String str14 = response1.header("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test20856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20856");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        response1.statusCode = 100;
        boolean boolean12 = response1.hasHeader("Location");
        org.jsoup.Connection.Response response15 = response1.cookie("hi!", "Location");
        java.lang.String str17 = response1.getHeaderCaseInsensitive("hi!");
        boolean boolean19 = response1.hasCookie("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test20857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20857");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.net.URL uRL6 = response1.url();
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        response1.charset = "Location";
        boolean boolean11 = response1.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test20858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20858");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean11 = response1.executed;
        java.lang.String str13 = response1.header("Location");
        response1.numRedirects = (byte) 10;
        java.lang.String str17 = response1.cookie("Location");
        java.lang.String str19 = response1.cookie("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test20859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20859");
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
        int int22 = response1.statusCode;
        java.lang.String str24 = response1.getHeaderCaseInsensitive("Location");
        java.net.URL uRL25 = response1.url();
        java.lang.String str27 = response1.cookie("Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test20860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20860");
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
        int int12 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        java.net.URL uRL15 = response1.url();
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        response1.executed = true;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(byteBuffer16);
    }

    @Test
    public void test20861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20861");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        response1.executed = true;
        org.jsoup.Connection.Method method11 = response1.method();
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response15 = response1.removeCookie("Location");
        org.jsoup.Connection.Request request16 = response1.req;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertNull(strEntry18);
    }

    @Test
    public void test20862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20862");
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
        int int18 = response1.numRedirects;
        java.lang.String str19 = response1.statusMessage;
        response1.statusCode = 32;
        boolean boolean23 = response1.hasCookie("Location");
        java.lang.String str25 = response1.getHeaderCaseInsensitive("hi!");
        int int26 = response1.statusCode();
        org.jsoup.Connection.Request request27 = response1.req;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertNull(request27);
    }

    @Test
    public void test20863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20863");
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
        response1.numRedirects = '4';
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test20864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20864");
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
        response1.numRedirects = ' ';
        java.util.Map<java.lang.String, java.lang.String> strMap26 = response1.headers();
        java.net.URL uRL27 = response1.url();
        java.lang.String str28 = response1.contentType;
        response1.numRedirects = 52;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNull(uRL27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test20865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20865");
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
        java.lang.String str21 = response1.charset();
        java.lang.String str22 = response1.charset;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test20866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20866");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test20867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20867");
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
        org.jsoup.Connection.Response response18 = response1.removeHeader("Location");
        java.lang.String str19 = response1.charset();
        boolean boolean22 = response1.hasHeaderWithValue("Location", "");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test20868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20868");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        boolean boolean7 = response1.executed;
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        response1.statusCode = (short) -1;
        java.lang.String str16 = response1.getHeaderCaseInsensitive("");
        response1.statusCode = 100;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test20869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20869");
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
        boolean boolean22 = response20.hasCookie("Location");
        response20.charset = "hi!";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test20870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20870");
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
        response1.contentType = "Location";
        int int27 = response1.statusCode;
        response1.contentType = "hi!";
        boolean boolean30 = response1.executed;
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test20871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20871");
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
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str22 = response20.header("hi!");
        org.jsoup.Connection.Response response24 = response20.removeCookie("Location");
        java.lang.String str26 = response20.cookie("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test20872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20872");
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
        java.lang.String str12 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusCode = (short) 0;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test20873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20873");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        response1.charset = "hi!";
        org.jsoup.Connection.Method method11 = response1.method();
        org.jsoup.Connection.Request request12 = response1.req;
        response1.statusMessage = "";
        org.jsoup.Connection.Response response16 = response1.removeCookie("Location");
        org.jsoup.Connection.Response response19 = response1.header("hi!", "");
        java.lang.String str20 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer21 = null;
        response1.byteData = byteBuffer21;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test20874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20874");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode();
        java.lang.String str14 = response1.header("");
        response1.numRedirects = 35;
        org.jsoup.Connection.Method method17 = response1.method();
        int int18 = response1.numRedirects;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test20875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20875");
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
        org.jsoup.Connection.Response response18 = response1.removeHeader("Location");
        response1.statusMessage = "Location";
        response1.statusCode = 52;
        int int23 = response1.statusCode;
        java.net.URL uRL24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response25 = response1.url(uRL24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
    }

    @Test
    public void test20876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20876");
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
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean14 = response12.hasHeader("Location");
        response12.statusMessage = "Location";
        java.lang.Class<?> wildcardClass17 = response12.getClass();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test20877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20877");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.lang.String str6 = response1.statusMessage;
        boolean boolean7 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.header("hi!");
        response1.executed = true;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusCode = 35;
        response1.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response1.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strEntry20);
    }

    @Test
    public void test20878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20878");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document32 = response1.parse();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(response27);
    }

    @Test
    public void test20879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20879");
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
        int int19 = response1.numRedirects;
        java.lang.String str20 = response1.statusMessage;
        org.jsoup.Connection.Request request21 = response1.req;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(request21);
    }

    @Test
    public void test20880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20880");
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
        java.lang.String str20 = response18.getHeaderCaseInsensitive("Location");
        org.jsoup.Connection.Method method21 = response18.method();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = response18.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(method21);
    }

    @Test
    public void test20881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20881");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        boolean boolean10 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("Location");
        boolean boolean15 = response1.hasCookie("hi!");
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.headers();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test20882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20882");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = (byte) -1;
        java.lang.String str4 = response1.statusMessage;
        response1.contentType = "hi!";
        org.jsoup.Connection.Response response9 = response1.cookie("Location", "");
        boolean boolean10 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        int int12 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test20883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20883");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.contentType();
        org.jsoup.Connection.Response response10 = response1.removeHeader("Location");
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        response1.charset = "Location";
        response1.executed = false;
        java.net.URL uRL17 = response1.url();
        boolean boolean18 = response1.executed;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test20884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20884");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        org.jsoup.Connection.Response response11 = response1.cookie("Location", "");
        boolean boolean14 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.Connection.Response response16 = response1.removeCookie("Location");
        response1.numRedirects = (short) -1;
        java.lang.String str19 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test20885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20885");
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
        org.jsoup.Connection.Response response16 = response1.removeHeader("Location");
        int int17 = response1.statusCode();
        boolean boolean20 = response1.hasHeaderWithValue("Location", "Location");
        int int21 = response1.statusCode();
        boolean boolean22 = response1.executed;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test20886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20886");
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
        java.lang.String str24 = response1.contentType;
        java.nio.ByteBuffer byteBuffer25 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap26 = response1.cookies();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(byteBuffer25);
        org.junit.Assert.assertNotNull(strMap26);
    }

    @Test
    public void test20887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20887");
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
        java.lang.String str26 = response1.cookie("Location");
        java.lang.String str27 = response1.contentType;
        java.nio.ByteBuffer byteBuffer28 = response1.byteData;
        org.jsoup.Connection.Method method29 = response1.method();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Location" + "'", str26, "Location");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNull(byteBuffer28);
        org.junit.Assert.assertNull(method29);
    }

    @Test
    public void test20888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20888");
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
        java.lang.String str19 = response1.statusMessage();
        response1.charset = "hi!";
        boolean boolean22 = response1.executed;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test20889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20889");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.header("", "");
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
    }

    @Test
    public void test20890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20890");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        response1.statusCode = 100;
        java.net.URL uRL11 = response1.url();
        org.jsoup.Connection.Method method12 = response1.method();
        java.lang.Class<?> wildcardClass13 = response1.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test20891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20891");
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
        java.lang.String str16 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Location" + "'", str15, "Location");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Location" + "'", str16, "Location");
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test20892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20892");
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
        int int16 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.headers();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test20893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20893");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        java.lang.String str7 = response2.getHeaderCaseInsensitive("");
        response2.executed = false;
        org.jsoup.Connection.Response response12 = response2.header("Location", "");
        int int13 = response2.statusCode;
        java.lang.String str14 = response2.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response2.headers();
        java.lang.String str16 = response2.contentType();
        java.lang.String str17 = response2.contentType;
        response2.contentType = "Location";
        java.lang.String str20 = response2.charset();
        boolean boolean23 = response2.hasHeaderWithValue("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response24 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test20894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20894");
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
        java.lang.String str20 = response1.contentType;
        java.lang.String str21 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document22 = response1.parse();
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
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test20895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20895");
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
        java.lang.String str21 = response1.contentType();
        org.jsoup.Connection.Response response24 = response1.cookie("hi!", "hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(response24);
    }

    @Test
    public void test20896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20896");
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
        response16.executed = false;
        java.lang.String str20 = response16.getHeaderCaseInsensitive("Location");
        boolean boolean21 = response16.executed;
        response16.executed = true;
        org.jsoup.Connection.Response response26 = response16.cookie("hi!", "Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(response26);
    }

    @Test
    public void test20897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20897");
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
        response1.statusCode = (byte) 10;
        java.net.URL uRL16 = response1.url();
        java.lang.String str17 = response1.charset();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test20898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20898");
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
        org.jsoup.Connection.Request request15 = response1.req;
        java.lang.String str16 = response1.contentType();
        java.lang.String str17 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document18 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test20899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20899");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        boolean boolean14 = response1.hasCookie("hi!");
        response1.executed = true;
        java.lang.String str18 = response1.cookie("Location");
        response1.statusCode = '#';
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test20900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20900");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        org.jsoup.Connection.Method method11 = response1.method();
        org.jsoup.Connection.Response response13 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response16 = response1.cookie("hi!", "");
        int int17 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("Location");
        org.jsoup.Connection.Request request20 = null;
        response1.req = request20;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
    }

    @Test
    public void test20901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20901");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        java.lang.String str10 = response1.contentType;
        org.jsoup.Connection.Request request11 = response1.req;
        java.lang.String str12 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.headers();
        response1.statusMessage = "";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test20902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20902");
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
        response1.charset = "";
        int int18 = response1.numRedirects;
        org.jsoup.Connection.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.method(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test20903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20903");
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
        response1.statusCode = '4';
        response1.numRedirects = '#';
        int int18 = response1.statusCode();
        boolean boolean21 = response1.hasHeaderWithValue("hi!", "Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test20904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20904");
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
        java.lang.String str17 = response1.getHeaderCaseInsensitive("Location");
        org.jsoup.Connection.Response response20 = response1.header("Location", "Location");
        java.nio.ByteBuffer byteBuffer21 = response1.byteData;
        response1.numRedirects = 2;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(byteBuffer21);
    }

    @Test
    public void test20905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20905");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusCode = (byte) 10;
        java.lang.String str14 = response1.cookie("Location");
        java.lang.String str15 = response1.charset();
        java.net.URL uRL16 = response1.url();
        java.lang.String str17 = response1.charset();
        boolean boolean19 = response1.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test20906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20906");
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
        java.lang.String str19 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response1.scanHeaders("");
        org.jsoup.Connection.Request request22 = null;
        response1.req = request22;
        java.lang.String str24 = response1.contentType;
        java.net.URL uRL25 = response1.url();
        response1.executed = false;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry29 = response1.scanHeaders("");
        boolean boolean32 = response1.hasHeaderWithValue("Location", "hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(strEntry21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNull(strEntry29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test20907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20907");
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
        java.lang.String str19 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        boolean boolean22 = response1.hasCookie("Location");
        response1.statusCode = (byte) 1;
        response1.charset = "";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test20908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20908");
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
        response1.executed = true;
        response1.statusMessage = "hi!";
        response1.statusCode = 100;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test20909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20909");
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
        java.lang.String str23 = response19.getHeaderCaseInsensitive("Location");
        response19.executed = false;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(byteBuffer20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test20910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20910");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.net.URL uRL9 = response1.url();
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request14 = response1.req;
        java.lang.String str15 = response1.contentType;
        response1.statusMessage = "";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test20911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20911");
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
        org.jsoup.Connection.Request request19 = response1.req;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNull(byteBuffer18);
        org.junit.Assert.assertNull(request19);
    }

    @Test
    public void test20912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20912");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        boolean boolean9 = response1.hasHeaderWithValue("hi!", "");
        response1.charset = "";
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        response1.executed = true;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(byteBuffer12);
    }

    @Test
    public void test20913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20913");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer2 = null;
        response1.byteData = byteBuffer2;
        java.nio.ByteBuffer byteBuffer4 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        java.lang.String str7 = response1.contentType;
        org.jsoup.Connection.Request request8 = response1.req;
        int int9 = response1.statusCode;
        org.jsoup.Connection.Request request10 = response1.req;
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        java.lang.String str16 = response1.header("hi!");
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test20914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20914");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str18 = response17.charset;
        java.lang.String str19 = response17.statusMessage;
        response17.charset = "";
        java.lang.String str23 = response17.getHeaderCaseInsensitive("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test20915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20915");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer2 = null;
        response1.byteData = byteBuffer2;
        java.nio.ByteBuffer byteBuffer4 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        int int7 = response1.statusCode();
        java.lang.String str8 = response1.contentType;
        java.lang.String str9 = response1.contentType;
        response1.contentType = "";
        response1.statusMessage = "Location";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test20916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20916");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode();
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        java.net.URL uRL15 = response1.url();
        response1.statusMessage = "Location";
        response1.numRedirects = ' ';
        org.jsoup.Connection.Response response21 = response1.removeCookie("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test20917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20917");
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
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        org.jsoup.Connection.Response response17 = response1.removeCookie("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test20918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20918");
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
        response1.statusCode = '4';
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response22 = response1.removeCookie("hi!");
        java.lang.String str23 = response1.statusMessage();
        java.lang.String str24 = response1.contentType();
        org.jsoup.Connection.Method method25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response26 = response1.method(method25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test20919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20919");
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
        boolean boolean19 = response1.hasCookie("Location");
        org.jsoup.Connection.Request request20 = null;
        response1.req = request20;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test20920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20920");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str8 = response1.cookie("hi!");
        java.lang.String str10 = response1.header("");
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        response1.numRedirects = 0;
        int int15 = response1.statusCode();
        response1.charset = "hi!";
        java.net.HttpURLConnection httpURLConnection18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = null;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.Connection.Response response23 = response20.header("hi!", "");
        java.lang.String str25 = response20.getHeaderCaseInsensitive("");
        java.lang.String str26 = response20.statusMessage;
        int int27 = response20.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection18, (org.jsoup.Connection.Response) response20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test20921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20921");
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
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.headers();
        java.lang.String str21 = response1.header("");
        org.jsoup.Connection.Method method22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.method(method22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test20922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20922");
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
        response1.statusMessage = "Location";
        boolean boolean14 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        int int16 = response1.statusCode;
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.url(uRL17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test20923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20923");
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
        response1.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry24 = response1.scanHeaders("Location");
        java.util.Map<java.lang.String, java.lang.String> strMap25 = response1.headers();
        response1.contentType = "";
        response1.charset = "";
        response1.contentType = "Location";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strEntry24);
        org.junit.Assert.assertNotNull(strMap25);
    }

    @Test
    public void test20924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20924");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        response2.charset = "";
        response2.statusMessage = "";
        java.lang.String str11 = response2.getHeaderCaseInsensitive("");
        boolean boolean14 = response2.hasHeaderWithValue("Location", "");
        response2.executed = false;
        java.lang.String str18 = response2.cookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response2.headers();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.executed = false;
        response2.statusMessage = "";
        response2.charset = "Location";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response27 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test20925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20925");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        java.nio.ByteBuffer byteBuffer4 = null;
        response1.byteData = byteBuffer4;
        org.jsoup.Connection.Method method6 = response1.method();
        java.lang.String str7 = response1.charset;
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Location" + "'", str7, "Location");
    }

    @Test
    public void test20926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20926");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = (byte) -1;
        int int4 = response1.statusCode;
        response1.contentType = "";
        response1.statusMessage = "Location";
        java.lang.String str9 = response1.statusMessage;
        int int10 = response1.statusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Location" + "'", str9, "Location");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test20927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20927");
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
        org.jsoup.Connection.Request request25 = response1.req;
        java.lang.String str26 = response1.contentType;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(request25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test20928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20928");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        org.jsoup.Connection.Response response9 = response1.header("Location", "");
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        response1.contentType = "hi!";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test20929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20929");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean13 = response1.hasHeaderWithValue("Location", "");
        response1.executed = true;
        java.lang.String str17 = response1.header("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test20930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20930");
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
        java.lang.String str19 = response1.contentType();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test20931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20931");
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
        response1.statusCode = 100;
        response1.executed = false;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test20932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20932");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.charset();
        response1.statusMessage = "hi!";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test20933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20933");
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
        java.lang.String str13 = response1.charset();
        int int14 = response1.statusCode;
        boolean boolean16 = response1.hasHeader("Location");
        java.net.URL uRL17 = response1.url();
        response1.numRedirects = (short) 10;
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test20934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20934");
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
        int int19 = response1.numRedirects;
        boolean boolean22 = response1.hasHeaderWithValue("hi!", "hi!");
        java.lang.String str24 = response1.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test20935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20935");
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
        java.lang.String str17 = response1.statusMessage;
        java.lang.String str18 = response1.statusMessage;
        java.lang.String str20 = response1.header("Location");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer22 = response21.byteData;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(byteBuffer22);
    }

    @Test
    public void test20936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20936");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        org.jsoup.Connection.Response response11 = response1.cookie("Location", "");
        response1.statusMessage = "";
        java.lang.String str15 = response1.cookie("Location");
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        java.lang.String str18 = response1.charset();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test20937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20937");
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
        response1.contentType = "";
        response1.executed = false;
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
    }

    @Test
    public void test20938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20938");
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
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry22 = response1.scanHeaders("Location");
        boolean boolean23 = response1.executed;
        java.nio.ByteBuffer byteBuffer24 = null;
        response1.byteData = byteBuffer24;
        java.nio.ByteBuffer byteBuffer26 = null;
        response1.byteData = byteBuffer26;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(strEntry22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test20939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20939");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        java.nio.ByteBuffer byteBuffer4 = null;
        response1.byteData = byteBuffer4;
        response1.executed = false;
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        org.jsoup.Connection.Response response13 = response1.cookie("hi!", "Location");
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test20940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20940");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        java.nio.ByteBuffer byteBuffer4 = null;
        response1.byteData = byteBuffer4;
        org.jsoup.Connection.Request request6 = response1.req;
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response11 = response1.cookie("hi!", "hi!");
        org.jsoup.Connection.Response response14 = response1.header("hi!", "Location");
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        java.lang.String str17 = response1.cookie("hi!");
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test20941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20941");
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
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("Location");
        java.lang.String str21 = response1.header("hi!");
        java.lang.String str22 = response1.charset();
        response1.charset = "";
        java.lang.String str25 = response1.charset;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Location" + "'", str21, "Location");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test20942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20942");
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
        org.jsoup.Connection.Response response23 = response1.removeHeader("Location");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
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
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test20943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20943");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str8 = response1.cookie("hi!");
        java.lang.String str10 = response1.header("");
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        response1.numRedirects = 0;
        java.lang.String str16 = response1.header("Location");
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Request request19 = response1.req;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response1.scanHeaders("hi!");
        boolean boolean22 = response1.executed;
        response1.numRedirects = 52;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(request19);
        org.junit.Assert.assertNull(strEntry21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test20944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20944");
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
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        org.jsoup.Connection.Response response15 = response1.removeCookie("Location");
        java.lang.String str16 = response1.charset();
        java.net.URL uRL17 = response1.url();
        java.lang.String str18 = response1.contentType;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test20945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20945");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str10 = response1.header("hi!");
        response1.contentType = "Location";
        java.lang.String str14 = response1.header("Location");
        java.lang.String str15 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test20946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20946");
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
        java.lang.String str19 = response1.charset;
        java.nio.ByteBuffer byteBuffer20 = response1.byteData;
        java.lang.String str22 = response1.header("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Location" + "'", str19, "Location");
        org.junit.Assert.assertNull(byteBuffer20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test20947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20947");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        org.jsoup.Connection.Response response7 = response2.removeCookie("Location");
        response2.statusCode = '#';
        java.nio.ByteBuffer byteBuffer10 = null;
        response2.byteData = byteBuffer10;
        java.lang.String str12 = response2.charset();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response2);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test20948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20948");
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
        int int18 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test20949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20949");
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
        java.lang.String str22 = response1.charset();
        org.jsoup.Connection.Response response24 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response27 = response1.cookie("Location", "");
        java.util.Map<java.lang.String, java.lang.String> strMap28 = response1.headers();
        org.jsoup.Connection.Method method29 = response1.method();
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
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(method29);
    }

    @Test
    public void test20950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20950");
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
        response1.charset = "";
        java.lang.String str16 = response1.charset();
        java.nio.ByteBuffer byteBuffer17 = null;
        response1.byteData = byteBuffer17;
        java.lang.String str19 = response1.contentType();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test20951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20951");
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
        java.lang.String str23 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry25 = response1.scanHeaders("");
        java.net.HttpURLConnection httpURLConnection26 = null;
        org.jsoup.helper.HttpConnection.Response response27 = null;
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response27);
        org.jsoup.Connection.Request request29 = null;
        response28.req = request29;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry32 = response28.scanHeaders("hi!");
        org.jsoup.Connection.Response response35 = response28.cookie("hi!", "");
        java.lang.String str36 = response28.statusMessage();
        org.jsoup.Connection.Request request37 = response28.req;
        java.net.URL uRL38 = response28.url();
        java.lang.String str39 = response28.contentType();
        response28.contentType = "hi!";
        java.net.URL uRL42 = response28.url();
        org.jsoup.Connection.Response response44 = response28.removeHeader("hi!");
        org.jsoup.Connection.Response response46 = response28.removeHeader("hi!");
        java.nio.ByteBuffer byteBuffer47 = null;
        response28.byteData = byteBuffer47;
        java.lang.String str49 = response28.charset;
        java.lang.String str50 = response28.charset();
        boolean boolean51 = response28.executed;
        java.lang.String str52 = response28.contentType();
        java.lang.String str53 = response28.charset();
        org.jsoup.Connection.Response response56 = response28.cookie("Location", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection26, response56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(strEntry25);
        org.junit.Assert.assertNull(strEntry32);
        org.junit.Assert.assertNotNull(response35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(request37);
        org.junit.Assert.assertNull(uRL38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(uRL42);
        org.junit.Assert.assertNotNull(response44);
        org.junit.Assert.assertNotNull(response46);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(response56);
    }

    @Test
    public void test20952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20952");
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
        response1.numRedirects = (short) -1;
        java.lang.String str19 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.headers();
        boolean boolean22 = response1.hasHeader("hi!");
        int int23 = response1.statusCode;
        org.jsoup.Connection.Response response25 = response1.removeHeader("Location");
        response1.executed = true;
        java.net.URL uRL28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response29 = response1.url(uRL28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(response25);
    }

    @Test
    public void test20953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20953");
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
        java.lang.String str24 = response1.charset();
        response1.statusCode = (short) 0;
        response1.statusCode = (byte) 0;
        java.lang.String str29 = response1.statusMessage;
        boolean boolean31 = response1.hasHeader("Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test20954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20954");
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
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = response24.hasHeaderWithValue("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test20955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20955");
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
        response16.executed = false;
        java.lang.String str20 = response16.getHeaderCaseInsensitive("Location");
        java.lang.String str21 = response16.charset;
        response16.statusMessage = "";
        java.net.HttpURLConnection httpURLConnection24 = null;
        org.jsoup.helper.HttpConnection.Response response25 = null;
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response25);
        org.jsoup.Connection.Response response29 = response26.header("hi!", "");
        response26.charset = "";
        response26.statusMessage = "";
        java.lang.String str35 = response26.getHeaderCaseInsensitive("");
        boolean boolean36 = response26.executed;
        int int37 = response26.numRedirects;
        java.nio.ByteBuffer byteBuffer38 = response26.byteData;
        java.lang.String str40 = response26.header("");
        response26.numRedirects = (byte) 100;
        java.util.Map<java.lang.String, java.lang.String> strMap43 = response26.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry45 = response26.scanHeaders("Location");
        org.jsoup.Connection.Request request46 = response26.req;
        // The following exception was thrown during execution in test generation
        try {
            response16.setupFromConnection(httpURLConnection24, (org.jsoup.Connection.Response) response26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(byteBuffer38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNull(strEntry45);
        org.junit.Assert.assertNull(request46);
    }

    @Test
    public void test20956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20956");
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
        java.lang.String str17 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response1.url(uRL20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test20957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20957");
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
        response1.statusCode = 35;
        java.lang.String str24 = response1.statusMessage;
        boolean boolean27 = response1.hasHeaderWithValue("hi!", "Location");
        org.jsoup.Connection.Response response30 = response1.cookie("Location", "Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(response30);
    }

    @Test
    public void test20958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20958");
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
        java.nio.ByteBuffer byteBuffer19 = null;
        response1.byteData = byteBuffer19;
        boolean boolean23 = response1.hasHeaderWithValue("Location", "");
        int int24 = response1.statusCode();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test20959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20959");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        response1.executed = true;
        org.jsoup.Connection.Method method11 = response1.method();
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        java.lang.String str14 = response1.statusMessage();
        java.lang.String str15 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("hi!");
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strEntry17);
    }

    @Test
    public void test20960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20960");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        org.jsoup.Connection.Response response11 = response1.cookie("Location", "Location");
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        response1.executed = false;
        response1.statusMessage = "Location";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test20961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20961");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        org.jsoup.Connection.Request request12 = response1.req;
        org.jsoup.Connection.Method method13 = response1.method();
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.net.HttpURLConnection httpURLConnection15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.Connection.Request request18 = null;
        response17.req = request18;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response17.scanHeaders("hi!");
        org.jsoup.Connection.Response response24 = response17.cookie("hi!", "");
        java.lang.String str26 = response17.getHeaderCaseInsensitive("Location");
        java.lang.String str27 = response17.charset();
        response17.statusCode = 0;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection15, (org.jsoup.Connection.Response) response17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(strEntry21);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test20962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20962");
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
        org.jsoup.Connection.Response response20 = response1.cookie("hi!", "");
        response1.statusCode = 97;
        java.lang.String str23 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = response1.headers();
        java.net.URL uRL25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response26 = response1.url(uRL25);
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
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test20963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20963");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.Connection.Response response14 = response1.header("Location", "Location");
        java.lang.String str15 = response1.statusMessage();
        boolean boolean16 = response1.executed;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test20964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20964");
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
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap31 = response1.cookies();
        java.nio.ByteBuffer byteBuffer32 = response1.byteData;
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
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNull(byteBuffer32);
    }

    @Test
    public void test20965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20965");
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
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusCode = (short) 0;
        java.lang.String str21 = response1.statusMessage();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test20966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20966");
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
        java.lang.String str19 = response2.cookie("Location");
        response2.contentType = "hi!";
        org.jsoup.Connection.Response response23 = response2.removeCookie("Location");
        int int24 = response2.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response25 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Location" + "'", str19, "Location");
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test20967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20967");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        java.lang.String str11 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str13 = response1.cookie("Location");
        java.lang.String str14 = response1.contentType;
        response1.statusMessage = "";
        response1.statusMessage = "";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test20968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20968");
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
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        response1.statusMessage = "hi!";
        java.lang.String str16 = response1.statusMessage();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test20969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20969");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        response1.statusCode = 0;
        java.lang.String str12 = response1.cookie("hi!");
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.Connection.Response response18 = response15.header("hi!", "");
        org.jsoup.Connection.Request request19 = null;
        response15.req = request19;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry22 = response15.scanHeaders("Location");
        boolean boolean25 = response15.hasHeaderWithValue("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = response15.headers();
        java.nio.ByteBuffer byteBuffer27 = response15.byteData;
        int int28 = response15.numRedirects;
        response15.numRedirects = (short) 0;
        response15.statusCode = '4';
        java.nio.ByteBuffer byteBuffer33 = response15.byteData;
        response15.statusMessage = "";
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(strEntry22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(byteBuffer33);
    }

    @Test
    public void test20970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20970");
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
        response1.statusMessage = "hi!";
        boolean boolean25 = response1.hasHeaderWithValue("hi!", "hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test20971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20971");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        int int11 = response1.statusCode();
        response1.numRedirects = '4';
        java.lang.String str15 = response1.getHeaderCaseInsensitive("hi!");
        response1.charset = "";
        int int18 = response1.statusCode;
        int int19 = response1.statusCode();
        java.lang.Class<?> wildcardClass20 = response1.getClass();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test20972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20972");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        org.jsoup.Connection.Method method7 = response1.method();
        response1.charset = "";
        java.net.URL uRL10 = response1.url();
        boolean boolean13 = response1.hasHeaderWithValue("Location", "hi!");
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        boolean boolean16 = response1.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test20973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20973");
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
        int int23 = response1.numRedirects;
        int int24 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry26 = response1.scanHeaders("");
        boolean boolean27 = response1.executed;
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(strEntry26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test20974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20974");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer2 = null;
        response1.byteData = byteBuffer2;
        int int4 = response1.statusCode;
        boolean boolean7 = response1.hasHeaderWithValue("hi!", "Location");
        java.lang.String str8 = response1.statusMessage();
        response1.contentType = "Location";
        java.net.URL uRL11 = response1.url();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test20975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20975");
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
        response1.statusCode = '#';
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry22 = response1.scanHeaders("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(strEntry18);
        org.junit.Assert.assertNull(strEntry22);
    }

    @Test
    public void test20976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20976");
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
        int int23 = response22.numRedirects;
        response22.executed = true;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test20977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20977");
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
        org.jsoup.Connection.Method method20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response1.method(method20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
    public void test20978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20978");
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
        int int18 = response1.statusCode;
        response1.contentType = "";
        java.lang.String str22 = response1.header("Location");
        java.lang.String str23 = response1.charset;
        java.lang.String str24 = response1.statusMessage();
        org.jsoup.Connection.Response response26 = response1.removeHeader("Location");
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer28 = null;
        response1.byteData = byteBuffer28;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(response26);
    }

    @Test
    public void test20979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20979");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.contentType();
        org.jsoup.Connection.Response response10 = response1.removeHeader("Location");
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test20980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20980");
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
        response1.numRedirects = 10;
        org.jsoup.Connection.Request request20 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(request20);
    }

    @Test
    public void test20981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20981");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.contentType();
        org.jsoup.Connection.Response response10 = response1.removeHeader("Location");
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(byteBuffer11);
    }

    @Test
    public void test20982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20982");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.header("");
        int int11 = response1.statusCode;
        java.lang.String str12 = response1.contentType;
        response1.executed = false;
        java.lang.String str15 = response1.contentType;
        response1.charset = "hi!";
        response1.contentType = "Location";
        java.lang.String str21 = response1.getHeaderCaseInsensitive("");
        java.lang.String str22 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document23 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test20983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20983");
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
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response1.scanHeaders("Location");
        response1.executed = true;
        response1.contentType = "";
        java.lang.String str27 = response1.cookie("hi!");
        boolean boolean30 = response1.hasHeaderWithValue("hi!", "");
        int int31 = response1.statusCode();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(strEntry21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test20984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20984");
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
        response1.charset = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        java.lang.String str19 = response1.cookie("hi!");
        response1.contentType = "hi!";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Location" + "'", str12, "Location");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test20985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20985");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        java.lang.String str13 = response1.charset();
        java.lang.String str14 = response1.statusMessage();
        response1.charset = "hi!";
        java.lang.String str17 = response1.charset;
        java.lang.String str18 = response1.contentType();
        java.lang.String str19 = response1.statusMessage;
        boolean boolean21 = response1.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test20986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20986");
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
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request19 = response18.req;
        int int20 = response18.statusCode();
        response18.contentType = "hi!";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(request19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test20987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20987");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        response1.statusMessage = "hi!";
        response1.charset = "Location";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test20988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20988");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.charset();
        java.lang.String str8 = response1.charset();
        java.lang.String str10 = response1.header("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test20989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20989");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        java.lang.String str11 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str12 = response1.charset();
        boolean boolean15 = response1.hasHeaderWithValue("Location", "Location");
        response1.contentType = "Location";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strEntry19);
    }

    @Test
    public void test20990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20990");
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
        org.jsoup.Connection.Method method19 = response18.method();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test20991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20991");
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
        java.net.URL uRL19 = response1.url();
        response1.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document22 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(uRL19);
    }

    @Test
    public void test20992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20992");
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
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        org.jsoup.Connection.Response response17 = response1.removeHeader("hi!");
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test20993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20993");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL8 = response1.url();
        boolean boolean11 = response1.hasHeaderWithValue("Location", "Location");
        java.net.URL uRL12 = response1.url();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test20994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20994");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        int int12 = response1.statusCode;
        org.jsoup.Connection.Request request13 = response1.req;
        response1.statusCode = (byte) -1;
        int int16 = response1.statusCode();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test20995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20995");
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
        boolean boolean21 = response1.hasHeader("hi!");
        response1.charset = "";
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test20996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20996");
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
        int int11 = response1.numRedirects;
        org.jsoup.Connection.Request request12 = response1.req;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(request12);
    }

    @Test
    public void test20997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20997");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        boolean boolean14 = response1.hasCookie("hi!");
        java.lang.String str15 = response1.statusMessage;
        response1.numRedirects = (byte) 100;
        java.lang.String str18 = response1.contentType;
        boolean boolean20 = response1.hasCookie("Location");
        int int21 = response1.numRedirects;
        java.lang.String str22 = response1.statusMessage;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test20998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20998");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        java.lang.String str10 = response1.contentType;
        response1.statusCode = (short) 1;
        response1.charset = "Location";
        java.lang.String str15 = response1.statusMessage;
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        response1.executed = false;
        org.jsoup.Connection.Response response21 = response1.removeCookie("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test20999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20999");
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
        boolean boolean21 = response1.hasHeader("hi!");
        java.lang.String str22 = response1.charset;
        java.lang.String str23 = response1.statusMessage();
        java.lang.String str24 = response1.contentType();
        org.jsoup.Connection.Response response26 = response1.removeCookie("Location");
        java.lang.String str27 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer28 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document29 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(byteBuffer28);
    }

    @Test
    public void test21000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test21000");
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
        response1.numRedirects = (byte) -1;
        java.lang.String str20 = response1.statusMessage();
        org.jsoup.Connection.Method method21 = response1.method();
        java.net.HttpURLConnection httpURLConnection22 = null;
        org.jsoup.helper.HttpConnection.Response response23 = null;
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.Connection.Response response27 = response24.header("hi!", "");
        java.lang.String str29 = response24.getHeaderCaseInsensitive("");
        response24.executed = false;
        org.jsoup.Connection.Response response34 = response24.header("Location", "");
        int int35 = response24.statusCode;
        java.lang.String str36 = response24.charset();
        java.lang.String str37 = response24.statusMessage();
        org.jsoup.Connection.Request request38 = null;
        response24.req = request38;
        int int40 = response24.statusCode();
        java.nio.ByteBuffer byteBuffer41 = response24.byteData;
        java.lang.String str43 = response24.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection22, (org.jsoup.Connection.Response) response24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(byteBuffer41);
        org.junit.Assert.assertNull(str43);
    }
}
