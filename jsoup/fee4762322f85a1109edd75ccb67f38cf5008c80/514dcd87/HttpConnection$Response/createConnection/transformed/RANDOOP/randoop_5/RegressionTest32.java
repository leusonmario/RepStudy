import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest32 {

    public static boolean debug = false;

    @Test
    public void test16001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16001");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        response1.numRedirects = 0;
        int int12 = response1.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.lang.String str15 = response1.contentType();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16002");
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
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        int int19 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray20 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test16003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16003");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.contentType = "";
        int int7 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.statusCode = (short) -1;
        response1.numRedirects = (short) 1;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteBuffer8);
    }

    @Test
    public void test16004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16004");
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
        java.lang.String str17 = response1.contentType();
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test16005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16005");
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
        java.lang.String str15 = response1.charset;
        java.lang.String str17 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method19 = response18.method();
        org.jsoup.Connection.Response response21 = response18.removeCookie("hi!");
        java.lang.String str23 = response18.getHeaderCaseInsensitive("");
        java.lang.String str24 = response18.charset();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test16006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16006");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.lang.String str4 = response1.header("hi!");
        int int5 = response1.statusCode();
        response1.charset = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        int int9 = response1.statusCode;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test16007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16007");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        response1.executed = false;
        response1.contentType = "";
        response1.statusCode = 0;
        org.jsoup.Connection.Method method14 = response1.method();
        boolean boolean16 = response1.hasHeader("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test16008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16008");
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
        java.lang.String str23 = response1.statusMessage;
        org.jsoup.Connection.Request request24 = null;
        response1.req = request24;
        java.lang.String str26 = response1.contentType;
        java.lang.String str27 = response1.charset;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test16009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16009");
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
        java.lang.String str16 = response1.statusMessage;
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test16010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16010");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        int int9 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int11 = response1.numRedirects;
        int int12 = response1.statusCode();
        boolean boolean13 = response1.executed;
        org.jsoup.Connection.Request request14 = response1.req;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(byteBuffer15);
    }

    @Test
    public void test16011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16011");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType;
        java.lang.String str4 = response1.cookie("hi!");
        response1.statusMessage = "";
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        java.lang.Class<?> wildcardClass9 = response1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test16012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16012");
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
        java.lang.String str21 = response1.contentType();
        boolean boolean24 = response1.hasHeaderWithValue("hi!", "");
        java.nio.ByteBuffer byteBuffer25 = null;
        response1.byteData = byteBuffer25;
        org.jsoup.Connection.Request request27 = null;
        response1.req = request27;
        java.lang.String str29 = response1.statusMessage();
        org.jsoup.Connection.Response response31 = response1.removeCookie("hi!");
        org.jsoup.Connection.Request request32 = response1.req;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertNull(request32);
    }

    @Test
    public void test16013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16013");
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
        java.lang.String str18 = response1.getHeaderCaseInsensitive("hi!");
        response1.statusCode = 100;
        java.lang.String str21 = response1.contentType();
        java.nio.ByteBuffer byteBuffer22 = response1.byteData;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(byteBuffer22);
    }

    @Test
    public void test16014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16014");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        int int11 = response1.numRedirects;
        java.lang.String str12 = response1.contentType();
        boolean boolean15 = response1.hasHeaderWithValue("hi!", "");
        java.lang.String str16 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        org.jsoup.Connection.Response response19 = response1.removeHeader("hi!");
        java.lang.String str20 = response1.charset();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test16015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16015");
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
        java.lang.String str16 = response1.contentType();
        java.lang.String str17 = response1.charset;
        response1.executed = true;
        java.lang.String str20 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer21 = response1.byteData;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(byteBuffer21);
    }

    @Test
    public void test16016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16016");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        response1.charset = "hi!";
        java.lang.String str6 = response1.statusMessage();
        int int7 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test16017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16017");
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
        org.jsoup.Connection.Response response21 = response1.cookie("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.headers();
        response1.statusMessage = "hi!";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test16018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16018");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str10 = response1.charset;
        java.lang.String str11 = response1.charset;
        java.lang.String str12 = response1.contentType();
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        response1.statusMessage = "";
        response1.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(byteBuffer13);
    }

    @Test
    public void test16019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16019");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        java.lang.String str7 = response1.statusMessage;
        java.lang.String str8 = response1.statusMessage;
        org.jsoup.Connection.Response response11 = response1.cookie("hi!", "hi!");
        org.jsoup.Connection.Method method12 = response1.method();
        boolean boolean13 = response1.executed;
        java.lang.String str14 = response1.charset();
        java.lang.String str15 = response1.charset();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16020");
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
        org.jsoup.Connection.Response response14 = response1.removeHeader("hi!");
        int int15 = response1.statusCode;
        java.lang.String str17 = response1.getHeaderCaseInsensitive("hi!");
        int int18 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        response19.charset = "hi!";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test16021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16021");
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
        org.jsoup.Connection.Response response15 = response1.removeCookie("hi!");
        response1.charset = "hi!";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test16022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16022");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.contentType = "";
        int int7 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        response1.statusCode = 20;
        java.lang.String str13 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response18 = response1.header("hi!", "hi!");
        response1.charset = "";
        response1.statusCode = (short) 1;
        java.net.URL uRL23 = response1.url();
        java.nio.ByteBuffer byteBuffer24 = response1.byteData;
        java.lang.String str25 = response1.charset();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(byteBuffer24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test16023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16023");
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
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        java.lang.String str16 = response1.getHeaderCaseInsensitive("hi!");
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        java.lang.String str18 = response1.contentType();
        java.lang.String str20 = response1.header("hi!");
        org.jsoup.Connection.Request request21 = null;
        response1.req = request21;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test16024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16024");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.contentType = "";
        int int7 = response1.statusCode();
        java.lang.String str9 = response1.cookie("hi!");
        java.lang.String str10 = response1.charset;
        java.lang.String str11 = response1.contentType();
        response1.numRedirects = 0;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test16025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16025");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Request request3 = null;
        response1.req = request3;
        java.nio.ByteBuffer byteBuffer5 = response1.byteData;
        int int6 = response1.statusCode;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        int int9 = response1.numRedirects;
        response1.numRedirects = 'a';
        response1.statusMessage = "";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test16026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16026");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        boolean boolean7 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        java.lang.String str11 = response1.statusMessage();
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        response14.statusMessage = "";
        java.lang.String str17 = response14.contentType();
        boolean boolean18 = response14.executed;
        org.jsoup.Connection.Response response20 = response14.removeCookie("hi!");
        java.lang.String str21 = response14.charset();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response14);
        response14.contentType = "hi!";
        org.jsoup.Connection.Request request25 = null;
        response14.req = request25;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry28 = response14.scanHeaders("hi!");
        java.lang.String str29 = response14.statusMessage;
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry32 = response30.scanHeaders("");
        int int33 = response30.numRedirects;
        response30.charset = "";
        java.util.Map<java.lang.String, java.lang.String> strMap36 = response30.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap37 = response30.headers();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection12, (org.jsoup.Connection.Response) response30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(strEntry28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(strEntry32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(strMap37);
    }

    @Test
    public void test16027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16027");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.executed = false;
        response1.contentType = "hi!";
        java.net.URL uRL9 = response1.url();
        response1.executed = true;
        response1.statusMessage = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test16028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16028");
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
        java.lang.String str19 = response1.statusMessage();
        org.jsoup.Connection.Response response22 = response1.cookie("hi!", "");
        org.jsoup.Connection.Response response24 = response1.removeCookie("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(response24);
    }

    @Test
    public void test16029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16029");
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
        response1.statusMessage = "hi!";
        java.lang.String str17 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document18 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test16030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16030");
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
        org.jsoup.Connection.Response response20 = response1.removeCookie("hi!");
        response1.numRedirects = 'a';
        response1.executed = false;
        java.nio.ByteBuffer byteBuffer25 = null;
        response1.byteData = byteBuffer25;
        response1.statusCode = 35;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test16031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16031");
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
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        java.lang.String str16 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response18.headers();
        java.net.HttpURLConnection httpURLConnection20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = null;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response21);
        response22.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap25 = response22.headers();
        org.jsoup.Connection.Method method26 = response22.method();
        java.nio.ByteBuffer byteBuffer27 = null;
        response22.byteData = byteBuffer27;
        java.lang.String str29 = response22.statusMessage();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry31 = response22.scanHeaders("");
        response22.statusCode = 10;
        org.jsoup.Connection.Response response35 = response22.removeCookie("hi!");
        org.jsoup.Connection.Response response37 = response22.removeHeader("hi!");
        java.lang.String str38 = response22.statusMessage();
        response22.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap41 = response22.cookies();
        // The following exception was thrown during execution in test generation
        try {
            response18.setupFromConnection(httpURLConnection20, (org.jsoup.Connection.Response) response22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(strEntry31);
        org.junit.Assert.assertNotNull(response35);
        org.junit.Assert.assertNotNull(response37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strMap41);
    }

    @Test
    public void test16032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16032");
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
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        java.nio.ByteBuffer byteBuffer15 = null;
        response1.byteData = byteBuffer15;
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test16033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16033");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer2 = null;
        response1.byteData = byteBuffer2;
        java.lang.String str5 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        int int7 = response1.numRedirects;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test16034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16034");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        int int9 = response1.statusCode;
        int int10 = response1.statusCode();
        response1.contentType = "";
        int int13 = response1.statusCode;
        java.lang.String str14 = response1.statusMessage;
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test16035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16035");
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
        java.lang.String str16 = response1.contentType();
        java.net.URL uRL17 = response1.url();
        response1.executed = false;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.headers();
        java.lang.String str21 = response1.contentType();
        java.lang.String str22 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response1.removeCookie("");
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test16036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16036");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        response1.executed = false;
        java.lang.String str10 = response1.header("hi!");
        java.lang.String str11 = response1.charset();
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        java.net.URL uRL13 = response1.url();
        boolean boolean15 = response1.hasCookie("hi!");
        response1.executed = false;
        org.jsoup.Connection.Response response20 = response1.cookie("hi!", "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test16037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16037");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.statusMessage;
        java.lang.String str7 = response1.statusMessage;
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response1.url(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test16038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16038");
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
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.cookies();
        boolean boolean20 = response1.hasCookie("hi!");
        org.jsoup.Connection.Request request21 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(request21);
    }

    @Test
    public void test16039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16039");
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
        java.lang.String str14 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Request request15 = response1.req;
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.method(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(request15);
    }

    @Test
    public void test16040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16040");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str10 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        response1.charset = "hi!";
        java.net.URL uRL15 = response1.url();
        java.lang.String str16 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = response1.hasHeaderWithValue("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test16041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16041");
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
        java.lang.String str22 = response1.contentType;
        response1.statusMessage = "hi!";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test16042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16042");
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
        response1.charset = "hi!";
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test16043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16043");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.contentType = "";
        int int7 = response1.statusCode();
        int int8 = response1.numRedirects;
        boolean boolean9 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        response11.statusCode = 0;
        boolean boolean14 = response11.executed;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16044");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "");
        java.lang.String str10 = response1.charset();
        int int11 = response1.numRedirects;
        org.jsoup.Connection.Method method12 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test16045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16045");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        java.lang.String str12 = response1.contentType;
        int int13 = response1.numRedirects;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test16046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16046");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.lang.String str7 = response1.charset;
        int int8 = response1.numRedirects;
        java.lang.String str9 = response1.charset;
        response1.statusMessage = "hi!";
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("");
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(strEntry15);
    }

    @Test
    public void test16047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16047");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        org.jsoup.Connection.Response response11 = response1.header("hi!", "hi!");
        response1.contentType = "";
        response1.contentType = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("");
        java.lang.String str19 = response1.header("");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry24 = response22.scanHeaders("hi!");
        boolean boolean27 = response22.hasHeaderWithValue("hi!", "");
        java.lang.String str28 = response22.charset();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(strEntry24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test16048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16048");
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
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.cookies();
        java.lang.String str20 = response1.header("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test16049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16049");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        int int7 = response1.numRedirects;
        boolean boolean8 = response1.executed;
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        java.lang.String str11 = response1.charset();
        boolean boolean12 = response1.executed;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test16050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16050");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.executed = false;
        org.jsoup.Connection.Request request7 = response1.req;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        response1.charset = "hi!";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test16051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16051");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.contentType = "";
        int int7 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        response1.statusCode = 20;
        response1.numRedirects = (byte) 100;
        int int15 = response1.statusCode();
        int int16 = response1.numRedirects;
        org.jsoup.Connection.Response response18 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request19 = response1.req;
        java.lang.String str20 = response1.charset;
        org.jsoup.Connection.Response response22 = response1.removeHeader("hi!");
        java.net.URL uRL23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response1.url(uRL23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(request19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test16052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16052");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        boolean boolean8 = response1.hasHeader("hi!");
        int int9 = response1.statusCode;
        java.lang.String str10 = response1.statusMessage;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test16053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16053");
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
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        java.lang.String str20 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry22 = response1.scanHeaders("");
        boolean boolean24 = response1.hasHeader("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(strEntry22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test16054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16054");
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
        boolean boolean18 = response1.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer19 = response1.byteData;
        response1.statusMessage = "hi!";
        java.lang.String str23 = response1.cookie("hi!");
        java.lang.String str25 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method26 = response1.method();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(byteBuffer19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(method26);
    }

    @Test
    public void test16055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16055");
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
        java.lang.String str15 = response1.charset;
        response1.statusMessage = "";
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        java.net.URL uRL20 = response1.url();
        java.lang.String str21 = response1.contentType();
        java.lang.String str22 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test16056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16056");
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
        java.lang.String str20 = response1.header("");
        org.jsoup.Connection.Method method21 = response1.method();
        org.jsoup.Connection.Request request22 = null;
        response1.req = request22;
        java.lang.String str24 = response1.statusMessage;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test16057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16057");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        int int7 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        response1.charset = "hi!";
        boolean boolean17 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        response18.contentType = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test16058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16058");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Request request3 = null;
        response1.req = request3;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test16059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16059");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        response1.contentType = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        response1.numRedirects = (byte) 10;
        java.lang.String str16 = response1.statusMessage();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test16060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16060");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        int int11 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL13 = response12.url();
        java.lang.String str14 = response12.contentType();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test16061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16061");
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
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        response1.statusMessage = "";
        response1.charset = "";
        boolean boolean27 = response1.executed;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test16062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16062");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        java.lang.String str10 = response1.statusMessage;
        response1.statusCode = (byte) 1;
        boolean boolean13 = response1.executed;
        int int14 = response1.statusCode();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test16063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16063");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Request request3 = null;
        response1.req = request3;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        org.jsoup.Connection.Response response8 = response1.header("hi!", "hi!");
        java.lang.Class<?> wildcardClass9 = response8.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test16064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16064");
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
        java.lang.String str16 = response1.header("hi!");
        java.lang.String str17 = response1.contentType();
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        java.net.HttpURLConnection httpURLConnection19 = null;
        org.jsoup.helper.HttpConnection.Response response20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        response21.statusMessage = "";
        java.lang.String str24 = response21.contentType();
        boolean boolean25 = response21.executed;
        org.jsoup.Connection.Response response27 = response21.removeCookie("hi!");
        java.lang.String str28 = response21.charset();
        org.jsoup.Connection.Method method29 = response21.method();
        java.lang.String str30 = response21.statusMessage;
        org.jsoup.Connection.Request request31 = response21.req;
        response21.numRedirects = (byte) 0;
        response21.statusCode = (-1);
        response21.executed = true;
        int int38 = response21.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection19, (org.jsoup.Connection.Response) response21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(byteBuffer18);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(method29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(request31);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test16065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16065");
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
        boolean boolean15 = response1.hasHeaderWithValue("hi!", "hi!");
        java.lang.String str16 = response1.charset;
        int int17 = response1.numRedirects;
        java.lang.String str19 = response1.cookie("hi!");
        int int20 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test16066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16066");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        int int9 = response1.numRedirects;
        int int10 = response1.statusCode;
        java.lang.String str11 = response1.contentType;
        java.lang.String str12 = response1.statusMessage();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test16067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16067");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage;
        java.lang.String str9 = response1.statusMessage;
        java.lang.String str11 = response1.header("hi!");
        java.lang.String str12 = response1.contentType();
        java.lang.String str13 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        java.net.URL uRL15 = response1.url();
        org.jsoup.Connection.Response response18 = response1.cookie("hi!", "");
        response1.executed = false;
        int int21 = response1.numRedirects;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test16068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16068");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.contentType();
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response15 = response1.cookie("hi!", "hi!");
        response1.charset = "";
        java.lang.String str18 = response1.contentType;
        java.lang.String str19 = response1.statusMessage();
        org.jsoup.Connection.Request request20 = null;
        response1.req = request20;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test16069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16069");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.lang.String str7 = response1.contentType();
        response1.numRedirects = (short) 0;
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        org.jsoup.Connection.Request request12 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test16070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16070");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.header("");
        response1.contentType = "hi!";
        int int13 = response1.statusCode;
        response1.executed = false;
        java.lang.String str17 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str20 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test16071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16071");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.lang.String str9 = response1.statusMessage();
        java.net.URL uRL10 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test16072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16072");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        int int7 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        response1.statusMessage = "hi!";
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        java.lang.String str15 = response1.statusMessage;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test16073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16073");
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
        org.jsoup.Connection.Request request13 = null;
        response2.req = request13;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response2.scanHeaders("hi!");
        java.lang.String str17 = response2.statusMessage;
        boolean boolean19 = response2.hasHeader("hi!");
        response2.executed = true;
        org.jsoup.Connection.Response response24 = response2.header("hi!", "");
        org.jsoup.Connection.Request request25 = response2.req;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response26 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(request25);
    }

    @Test
    public void test16074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16074");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.contentType = "";
        java.lang.String str7 = response1.contentType();
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        java.net.URL uRL11 = response1.url();
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response1.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(byteBuffer12);
    }

    @Test
    public void test16075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16075");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        response1.numRedirects = 0;
        boolean boolean12 = response1.executed;
        response1.charset = "";
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test16076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16076");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        org.jsoup.Connection.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response1.method(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test16077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16077");
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
        java.lang.Class<?> wildcardClass17 = response1.getClass();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test16078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16078");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        response1.statusMessage = "";
        java.net.URL uRL9 = response1.url();
        int int10 = response1.numRedirects;
        java.net.URL uRL11 = response1.url();
        response1.numRedirects = (short) 10;
        boolean boolean16 = response1.hasHeaderWithValue("hi!", "");
        java.net.HttpURLConnection httpURLConnection17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        response19.statusMessage = "";
        java.lang.String str22 = response19.contentType();
        boolean boolean23 = response19.executed;
        org.jsoup.Connection.Response response25 = response19.removeCookie("hi!");
        java.lang.String str26 = response19.charset();
        java.lang.String str27 = response19.statusMessage;
        response19.statusMessage = "hi!";
        java.lang.String str30 = response19.contentType();
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
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test16079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16079");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        org.jsoup.Connection.Response response11 = response1.header("hi!", "hi!");
        response1.contentType = "";
        response1.contentType = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("");
        java.lang.String str19 = response1.header("");
        response1.contentType = "";
        java.nio.ByteBuffer byteBuffer22 = response1.byteData;
        response1.contentType = "";
        response1.executed = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(byteBuffer22);
    }

    @Test
    public void test16080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16080");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        java.lang.String str9 = response1.statusMessage;
        java.lang.String str10 = response1.charset();
        java.lang.String str11 = response1.contentType();
        response1.statusCode = 1;
        java.lang.String str14 = response1.charset;
        java.nio.ByteBuffer byteBuffer15 = null;
        response1.byteData = byteBuffer15;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test16081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16081");
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
        response1.charset = "hi!";
        response1.contentType = "hi!";
        org.jsoup.Connection.Response response25 = response1.header("hi!", "hi!");
        response1.statusCode = 'a';
        java.lang.String str29 = response1.header("");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test16082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16082");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        response1.charset = "";
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str10 = response1.statusMessage();
        java.lang.String str12 = response1.header("hi!");
        java.lang.String str13 = response1.statusMessage;
        java.lang.String str14 = response1.statusMessage();
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test16083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16083");
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
        java.lang.String str14 = response1.statusMessage;
        java.lang.String str15 = response1.contentType();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16084");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        response1.charset = "";
        java.lang.String str9 = response1.contentType();
        java.lang.String str11 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test16085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16085");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.lang.String str7 = response1.contentType();
        response1.numRedirects = (short) 0;
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        int int16 = response1.statusCode;
        int int17 = response1.statusCode;
        java.lang.String str18 = response1.statusMessage();
        response1.charset = "";
        boolean boolean22 = response1.hasCookie("hi!");
        org.jsoup.Connection.Method method23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response1.method(method23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test16086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16086");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.statusMessage();
        response1.statusMessage = "";
        int int12 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.method(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test16087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16087");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.contentType;
        response1.contentType = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test16088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16088");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Request request3 = null;
        response1.req = request3;
        java.nio.ByteBuffer byteBuffer5 = response1.byteData;
        int int6 = response1.statusCode();
        response1.executed = true;
        java.lang.String str10 = response1.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL12 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test16089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16089");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        response1.charset = "";
        response1.executed = false;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("");
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test16090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16090");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        org.jsoup.Connection.Response response11 = response1.header("hi!", "hi!");
        response1.contentType = "";
        response1.contentType = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("");
        java.lang.String str19 = response1.header("");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean24 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer25 = null;
        response1.byteData = byteBuffer25;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test16091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16091");
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
        int int18 = response1.statusCode;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test16092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16092");
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
        java.lang.String str17 = response1.statusMessage();
        org.jsoup.Connection.Request request18 = response1.req;
        org.jsoup.Connection.Request request19 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        java.lang.String str22 = response1.getHeaderCaseInsensitive("");
        response1.contentType = "";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(request18);
        org.junit.Assert.assertNull(request19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test16093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16093");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        java.lang.String str9 = response1.statusMessage;
        int int10 = response1.numRedirects;
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        java.lang.String str14 = response1.statusMessage;
        java.lang.String str15 = response1.contentType();
        org.jsoup.Connection.Response response17 = response1.removeHeader("hi!");
        java.lang.String str19 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str20 = response1.contentType;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test16094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16094");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        org.jsoup.Connection.Request request10 = response1.req;
        response1.statusMessage = "hi!";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(request10);
    }

    @Test
    public void test16095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16095");
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
        java.net.URL uRL20 = response1.url();
        int int21 = response1.statusCode;
        org.jsoup.Connection.Response response24 = response1.cookie("hi!", "hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry26 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap27 = response1.headers();
        response1.charset = "hi!";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(strEntry26);
        org.junit.Assert.assertNotNull(strMap27);
    }

    @Test
    public void test16096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16096");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        response1.executed = false;
        java.lang.String str9 = response1.statusMessage;
        org.jsoup.Connection.Request request10 = response1.req;
        response1.statusMessage = "";
        boolean boolean13 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Request request17 = response1.req;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(request17);
    }

    @Test
    public void test16097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16097");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        response1.contentType = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        java.lang.String str13 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.lang.String str16 = response14.charset();
        java.lang.String str17 = response14.charset();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test16098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16098");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        int int10 = response1.statusCode;
        int int11 = response1.statusCode;
        java.lang.String str12 = response1.statusMessage();
        response1.statusCode = 0;
        java.lang.String str16 = response1.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test16099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16099");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.contentType = "";
        int int7 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        response1.statusCode = 20;
        response1.numRedirects = (byte) 100;
        java.net.URL uRL15 = response1.url();
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response1.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test16100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16100");
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
        org.jsoup.Connection.Request request13 = response1.req;
        java.lang.String str14 = response1.contentType();
        int int15 = response1.statusCode;
        org.jsoup.Connection.Response response18 = response1.header("hi!", "");
        response1.contentType = "hi!";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test16101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16101");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        java.lang.String str9 = response1.statusMessage;
        int int10 = response1.numRedirects;
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        response1.charset = "";
        java.lang.String str16 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test16102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16102");
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
        java.lang.String str11 = response1.contentType();
        java.lang.String str13 = response1.header("hi!");
        response1.executed = false;
        response1.contentType = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        org.jsoup.Connection.Request request20 = response1.req;
        boolean boolean22 = response1.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer23 = null;
        response1.byteData = byteBuffer23;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test16103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16103");
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
        java.lang.String str14 = response1.cookie("hi!");
        java.lang.String str15 = response1.statusMessage;
        boolean boolean18 = response1.hasHeaderWithValue("hi!", "");
        response1.charset = "hi!";
        java.lang.String str21 = response1.charset;
        org.jsoup.Connection.Request request22 = response1.req;
        int int23 = response1.numRedirects;
        org.jsoup.Connection.Request request24 = null;
        response1.req = request24;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(request22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test16104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16104");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        java.lang.String str10 = response1.statusMessage;
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        org.jsoup.Connection.Response response14 = response1.removeHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        response1.numRedirects = 1;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test16105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16105");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.contentType = "";
        int int7 = response1.statusCode();
        java.lang.String str9 = response1.cookie("hi!");
        org.jsoup.Connection.Method method10 = response1.method();
        java.lang.String str12 = response1.header("");
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(byteBuffer13);
    }

    @Test
    public void test16106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16106");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        org.jsoup.Connection.Response response11 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Response response14 = response1.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response18 = response15.cookie("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = response15.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test16107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16107");
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
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        java.lang.String str17 = response1.contentType();
        response1.charset = "hi!";
        java.net.URL uRL20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response1.url(uRL20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test16108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16108");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        int int7 = response1.statusCode();
        response1.statusMessage = "";
        boolean boolean10 = response1.executed;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test16109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16109");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Request request3 = null;
        response1.req = request3;
        java.nio.ByteBuffer byteBuffer5 = response1.byteData;
        int int6 = response1.statusCode;
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test16110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16110");
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
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.cookies();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test16111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16111");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        response1.charset = "hi!";
        java.lang.String str7 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str9 = response1.getHeaderCaseInsensitive("");
        boolean boolean11 = response1.hasCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        response1.statusCode = (byte) 0;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test16112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16112");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        response1.statusMessage = "hi!";
        int int6 = response1.statusCode();
        int int7 = response1.numRedirects;
        java.lang.String str8 = response1.contentType();
        response1.contentType = "";
        org.jsoup.Connection.Request request11 = response1.req;
        int int12 = response1.statusCode;
        response1.statusMessage = "hi!";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test16113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16113");
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
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.cookies();
        java.nio.ByteBuffer byteBuffer19 = null;
        response1.byteData = byteBuffer19;
        response1.numRedirects = (short) 100;
        org.jsoup.Connection.Response response24 = response1.removeHeader("hi!");
        response1.numRedirects = 35;
        int int27 = response1.statusCode();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test16114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16114");
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
        java.lang.String str18 = response1.statusMessage();
        response1.contentType = "hi!";
        org.jsoup.Connection.Method method21 = response1.method();
        java.lang.String str23 = response1.getHeaderCaseInsensitive("");
        int int24 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry26 = response1.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request28 = null;
        response27.req = request28;
        boolean boolean31 = response27.hasCookie("hi!");
        java.lang.Class<?> wildcardClass32 = response27.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(strEntry26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test16115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16115");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        response1.numRedirects = 0;
        org.jsoup.Connection.Request request10 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        response1.executed = false;
        java.lang.String str16 = response1.charset;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test16116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16116");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response11 = response1.cookie("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        java.lang.String str13 = response1.charset();
        boolean boolean14 = response1.executed;
        java.lang.String str15 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        response1.executed = false;
        java.lang.String str22 = response1.statusMessage;
        org.jsoup.Connection.Response response24 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response27 = response1.cookie("hi!", "");
        response1.statusMessage = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap30 = response1.headers();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNotNull(strMap30);
    }

    @Test
    public void test16117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16117");
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
        org.jsoup.Connection.Response response20 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request21 = response1.req;
        response1.executed = false;
        java.nio.ByteBuffer byteBuffer24 = response1.byteData;
        org.jsoup.Connection.Request request25 = response1.req;
        response1.contentType = "";
        org.jsoup.Connection.Method method28 = response1.method();
        java.lang.String str29 = response1.charset;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(request21);
        org.junit.Assert.assertNull(byteBuffer24);
        org.junit.Assert.assertNull(request25);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test16118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16118");
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
        java.lang.String str16 = response1.contentType();
        response1.contentType = "";
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry22 = response1.scanHeaders("");
        response1.numRedirects = 10;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strEntry22);
    }

    @Test
    public void test16119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16119");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.executed = false;
        response1.statusMessage = "";
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        int int13 = response1.statusCode();
        java.lang.String str15 = response1.cookie("hi!");
        org.jsoup.Connection.Method method16 = response1.method();
        java.net.URL uRL17 = response1.url();
        response1.numRedirects = 1;
        boolean boolean21 = response1.hasHeader("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test16120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16120");
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
        boolean boolean14 = response1.hasHeader("hi!");
        response1.executed = false;
        response1.statusMessage = "";
        response1.executed = false;
        int int21 = response1.statusCode;
        java.net.HttpURLConnection httpURLConnection22 = null;
        org.jsoup.helper.HttpConnection.Response response23 = null;
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response23);
        response24.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap27 = response24.headers();
        org.jsoup.Connection.Method method28 = response24.method();
        int int29 = response24.statusCode();
        boolean boolean31 = response24.hasHeader("hi!");
        response24.contentType = "hi!";
        java.lang.String str34 = response24.contentType;
        java.lang.String str35 = response24.statusMessage();
        java.lang.String str36 = response24.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection22, (org.jsoup.Connection.Response) response24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test16121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16121");
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
        int int19 = response1.numRedirects;
        response1.executed = false;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry23 = response1.scanHeaders("");
        response1.executed = true;
        java.nio.ByteBuffer byteBuffer26 = response1.byteData;
        org.jsoup.Connection.Request request27 = null;
        response1.req = request27;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(strEntry23);
        org.junit.Assert.assertNull(byteBuffer26);
    }

    @Test
    public void test16122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16122");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        response1.statusMessage = "hi!";
        int int6 = response1.statusCode();
        int int7 = response1.statusCode();
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Method method9 = response1.method();
        java.lang.String str10 = response1.contentType;
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        boolean boolean15 = response1.hasHeaderWithValue("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test16123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16123");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        org.jsoup.Connection.Request request6 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        int int8 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        int int11 = response1.statusCode();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test16124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16124");
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
        org.jsoup.Connection.Response response20 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request21 = response1.req;
        response1.executed = false;
        java.nio.ByteBuffer byteBuffer24 = response1.byteData;
        org.jsoup.Connection.Request request25 = response1.req;
        response1.charset = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(request21);
        org.junit.Assert.assertNull(byteBuffer24);
        org.junit.Assert.assertNull(request25);
    }

    @Test
    public void test16125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16125");
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
        java.lang.String str15 = response1.charset;
        java.lang.String str17 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean21 = response18.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response25 = response22.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test16126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16126");
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
        java.lang.String str17 = response1.header("");
        int int18 = response1.statusCode;
        org.jsoup.Connection.Response response20 = response1.removeHeader("hi!");
        int int21 = response1.statusCode();
        org.jsoup.Connection.Response response24 = response1.cookie("hi!", "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(response24);
    }

    @Test
    public void test16127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16127");
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
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        java.lang.String str16 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer19 = response18.byteData;
        java.lang.String str21 = response18.header("hi!");
        response18.contentType = "";
        boolean boolean24 = response18.executed;
        java.lang.String str25 = response18.statusMessage;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(byteBuffer19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test16128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16128");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        java.lang.String str10 = response1.statusMessage;
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        org.jsoup.Connection.Response response14 = response1.removeHeader("hi!");
        java.nio.ByteBuffer byteBuffer15 = null;
        response1.byteData = byteBuffer15;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("");
        response1.contentType = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(strEntry18);
    }

    @Test
    public void test16129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16129");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        int int12 = response1.statusCode();
        java.lang.String str13 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int15 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(byteBuffer16);
    }

    @Test
    public void test16130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16130");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        response9.executed = true;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.net.URL uRL13 = response9.url();
        response9.executed = false;
        org.jsoup.Connection.Response response17 = response9.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response9.cookies();
        java.lang.String str19 = response9.contentType;
        java.lang.String str20 = response9.charset();
        java.net.HttpURLConnection httpURLConnection21 = null;
        org.jsoup.helper.HttpConnection.Response response22 = null;
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response22);
        response23.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap26 = response23.headers();
        org.jsoup.Connection.Method method27 = response23.method();
        java.nio.ByteBuffer byteBuffer28 = null;
        response23.byteData = byteBuffer28;
        java.lang.String str31 = response23.getHeaderCaseInsensitive("hi!");
        java.nio.ByteBuffer byteBuffer32 = null;
        response23.byteData = byteBuffer32;
        java.lang.String str34 = response23.statusMessage();
        java.lang.String str35 = response23.contentType();
        boolean boolean38 = response23.hasHeaderWithValue("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            response9.setupFromConnection(httpURLConnection21, (org.jsoup.Connection.Response) response23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test16131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16131");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        response1.executed = false;
        java.lang.String str10 = response1.statusMessage;
        response1.statusCode = 32;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test16132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16132");
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
        java.lang.String str15 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.cookies();
        java.lang.String str17 = response1.charset;
        boolean boolean19 = response1.hasCookie("hi!");
        java.lang.String str21 = response1.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray22 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test16133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16133");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        java.lang.String str9 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response12 = response1.removeCookie("hi!");
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        org.jsoup.Connection.Request request15 = response1.req;
        response1.contentType = "hi!";
        response1.statusMessage = "hi!";
        java.net.HttpURLConnection httpURLConnection20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = null;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response21);
        response22.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap25 = response22.headers();
        org.jsoup.Connection.Method method26 = response22.method();
        java.nio.ByteBuffer byteBuffer27 = null;
        response22.byteData = byteBuffer27;
        java.lang.String str29 = response22.statusMessage();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry31 = response22.scanHeaders("");
        response22.statusCode = 10;
        org.jsoup.Connection.Response response35 = response22.removeCookie("hi!");
        java.lang.String str37 = response22.cookie("hi!");
        org.jsoup.Connection.Response response39 = response22.removeHeader("hi!");
        boolean boolean42 = response22.hasHeaderWithValue("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer43 = null;
        response22.byteData = byteBuffer43;
        org.jsoup.Connection.Response response47 = response22.cookie("hi!", "hi!");
        org.jsoup.Connection.Response response50 = response22.header("hi!", "hi!");
        java.lang.String str51 = response22.contentType;
        java.lang.String str52 = response22.statusMessage();
        org.jsoup.Connection.Method method53 = response22.method();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection20, (org.jsoup.Connection.Response) response22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(strEntry31);
        org.junit.Assert.assertNotNull(response35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(response39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(response47);
        org.junit.Assert.assertNotNull(response50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(method53);
    }

    @Test
    public void test16134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16134");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType;
        org.jsoup.Connection.Request request3 = response1.req;
        java.lang.String str5 = response1.cookie("hi!");
        org.jsoup.Connection.Method method6 = response1.method();
        response1.contentType = "hi!";
        response1.charset = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
    }

    @Test
    public void test16135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16135");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        org.jsoup.Connection.Request request6 = response1.req;
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        java.lang.String str11 = response1.statusMessage();
        response1.numRedirects = 0;
        response1.numRedirects = 52;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test16136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16136");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.contentType = "";
        int int7 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        response1.statusCode = 20;
        response1.statusCode = (byte) 0;
        boolean boolean16 = response1.hasCookie("hi!");
        java.lang.String str17 = response1.charset;
        response1.statusCode = (short) 1;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test16137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16137");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response9 = response1.removeHeader("hi!");
        response1.statusCode = (short) -1;
        org.jsoup.Connection.Response response14 = response1.header("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test16138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16138");
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
        response1.numRedirects = '4';
        int int24 = response1.numRedirects;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(request21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
    }

    @Test
    public void test16139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16139");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        response1.statusCode = 10;
        org.jsoup.Connection.Request request11 = response1.req;
        int int12 = response1.statusCode;
        java.lang.String str14 = response1.header("");
        java.lang.String str15 = response1.contentType();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16140");
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
        java.lang.String str13 = response1.contentType;
        response1.statusCode = (byte) 10;
        java.lang.String str16 = response1.charset();
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(byteBuffer17);
    }

    @Test
    public void test16141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16141");
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
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        java.lang.String str16 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int18 = response1.numRedirects;
        boolean boolean19 = response1.executed;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test16142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16142");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        org.jsoup.Connection.Response response11 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Response response14 = response1.header("hi!", "");
        org.jsoup.Connection.Method method15 = response1.method();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test16143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16143");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        java.lang.String str9 = response1.statusMessage;
        int int10 = response1.numRedirects;
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        java.lang.String str14 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("");
        java.lang.String str18 = response1.header("");
        org.jsoup.Connection.Response response21 = response1.header("hi!", "hi!");
        java.net.URL uRL22 = response1.url();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(uRL22);
    }

    @Test
    public void test16144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16144");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        response1.contentType = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        response1.numRedirects = (byte) 10;
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.headers();
        boolean boolean20 = response1.hasCookie("hi!");
        org.jsoup.Connection.Request request21 = response1.req;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(request21);
    }

    @Test
    public void test16145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16145");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        org.jsoup.Connection.Response response11 = response1.header("hi!", "hi!");
        response1.contentType = "";
        response1.contentType = "";
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        org.jsoup.Connection.Method method18 = response1.method();
        boolean boolean20 = response1.hasCookie("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test16146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16146");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        java.lang.String str9 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response12 = response1.removeCookie("hi!");
        boolean boolean14 = response1.hasCookie("hi!");
        java.lang.String str15 = response1.contentType();
        int int16 = response1.statusCode();
        int int17 = response1.statusCode();
        boolean boolean18 = response1.executed;
        java.lang.String str19 = response1.statusMessage();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test16147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16147");
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
        java.lang.String str20 = response1.statusMessage;
        int int21 = response1.statusCode;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response1);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test16148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16148");
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
        java.lang.String str13 = response1.charset;
        response1.statusMessage = "hi!";
        boolean boolean16 = response1.executed;
        org.jsoup.Connection.Response response19 = response1.cookie("hi!", "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test16149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16149");
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
        org.jsoup.Connection.Method method15 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.cookies();
        org.jsoup.Connection.Response response19 = response1.header("hi!", "");
        java.lang.String str20 = response1.charset();
        java.lang.String str22 = response1.header("");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test16150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16150");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.executed = false;
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        response1.executed = true;
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response15.cookies();
        response15.statusCode = 1;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response15.scanHeaders("");
        java.lang.String str22 = response15.getHeaderCaseInsensitive("");
        response15.statusMessage = "";
        int int25 = response15.statusCode();
        java.nio.ByteBuffer byteBuffer26 = null;
        response15.byteData = byteBuffer26;
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response15);
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(strEntry20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test16151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16151");
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
        response1.charset = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("");
        org.jsoup.Connection.Request request19 = response1.req;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNull(request19);
    }

    @Test
    public void test16152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16152");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage();
        int int9 = response1.statusCode();
        boolean boolean12 = response1.hasHeaderWithValue("hi!", "hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test16153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16153");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.lang.String str6 = response1.charset;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test16154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16154");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        response1.statusMessage = "";
        java.net.URL uRL9 = response1.url();
        java.lang.String str10 = response1.charset;
        response1.charset = "";
        java.lang.String str13 = response1.contentType();
        boolean boolean14 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16155");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage();
        java.lang.String str9 = response1.statusMessage;
        response1.statusCode = (short) 100;
        response1.contentType = "";
        java.lang.String str14 = response1.charset();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test16156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16156");
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
        org.jsoup.Connection.Response response17 = response1.removeCookie("hi!");
        java.lang.String str19 = response1.getHeaderCaseInsensitive("hi!");
        boolean boolean20 = response1.executed;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test16157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16157");
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
        boolean boolean17 = response1.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.Connection.Request request18 = response1.req;
        org.jsoup.Connection.Method method19 = response1.method();
        org.jsoup.Connection.Request request20 = null;
        response1.req = request20;
        boolean boolean22 = response1.executed;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(request18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test16158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16158");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        response1.executed = false;
        java.lang.String str9 = response1.statusMessage;
        org.jsoup.Connection.Request request10 = response1.req;
        response1.statusMessage = "";
        boolean boolean13 = response1.executed;
        java.lang.String str14 = response1.charset();
        response1.statusMessage = "hi!";
        int int17 = response1.statusCode;
        int int18 = response1.numRedirects;
        java.lang.String str19 = response1.charset();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test16159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16159");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        java.lang.String str5 = response2.contentType();
        response2.contentType = "";
        int int8 = response2.statusCode();
        java.nio.ByteBuffer byteBuffer9 = response2.byteData;
        org.jsoup.Connection.Response response11 = response2.removeCookie("hi!");
        response2.statusCode = 20;
        response2.numRedirects = (byte) 100;
        int int16 = response2.statusCode();
        java.lang.String str17 = response2.charset;
        response2.contentType = "hi!";
        java.lang.String str20 = response2.contentType;
        response2.charset = "hi!";
        response2.charset = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response25 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test16160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16160");
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
        java.lang.String str15 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.headers();
        boolean boolean20 = response1.hasCookie("hi!");
        java.lang.String str21 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test16161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16161");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.contentType;
        java.lang.String str7 = response1.charset;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test16162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16162");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        int int11 = response1.numRedirects;
        java.lang.String str12 = response1.contentType();
        java.lang.String str13 = response1.contentType;
        boolean boolean15 = response1.hasHeader("hi!");
        java.lang.String str16 = response1.charset;
        boolean boolean18 = response1.hasCookie("hi!");
        int int19 = response1.statusCode();
        java.lang.String str20 = response1.charset;
        org.jsoup.Connection.Request request21 = response1.req;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(request21);
    }

    @Test
    public void test16163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16163");
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
        java.lang.String str11 = response1.contentType();
        java.lang.String str13 = response1.header("hi!");
        response1.executed = false;
        response1.contentType = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        org.jsoup.Connection.Request request20 = response1.req;
        java.lang.String str22 = response1.header("");
        java.lang.String str23 = response1.charset;
        response1.charset = "";
        org.jsoup.Connection.Response response27 = response1.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response30 = response1.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(response27);
    }

    @Test
    public void test16164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16164");
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
        java.lang.String str19 = response1.getHeaderCaseInsensitive("");
        java.lang.String str20 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test16165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16165");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str10 = response1.charset;
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.charset = "hi!";
        java.lang.String str16 = response1.contentType();
        java.lang.String str17 = response1.statusMessage;
        org.jsoup.Connection.Request request18 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(request18);
    }

    @Test
    public void test16166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16166");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        response1.charset = "";
        java.lang.String str9 = response1.contentType();
        boolean boolean10 = response1.executed;
        response1.executed = true;
        java.lang.String str13 = response1.contentType();
        org.jsoup.Connection.Method method14 = response1.method();
        boolean boolean16 = response1.hasHeader("hi!");
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test16167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16167");
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
        boolean boolean18 = response1.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer19 = response1.byteData;
        java.lang.String str21 = response1.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(byteBuffer19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test16168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16168");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.contentType = "";
        int int7 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        response1.statusCode = 20;
        java.lang.String str13 = response1.contentType;
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int17 = response1.statusCode;
        org.jsoup.Connection.Response response19 = response1.removeHeader("hi!");
        org.jsoup.Connection.Method method20 = response1.method();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20 + "'", int17 == 20);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(method20);
    }

    @Test
    public void test16169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16169");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        response1.charset = "";
        org.jsoup.Connection.Method method12 = response1.method();
        response1.contentType = "";
        int int15 = response1.statusCode;
        java.lang.String str16 = response1.contentType;
        java.lang.String str17 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        java.lang.String str19 = response1.charset;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(byteBuffer18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test16170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16170");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.lang.String str8 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        response1.executed = true;
        java.lang.String str14 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer16 = response15.byteData;
        boolean boolean17 = response15.executed;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test16171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16171");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        org.jsoup.Connection.Method method9 = response1.method();
        java.lang.String str11 = response1.header("hi!");
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        response1.statusCode = (short) 0;
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(byteBuffer12);
    }

    @Test
    public void test16172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16172");
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
        java.lang.String str23 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap24 = response1.headers();
        java.lang.String str25 = response1.contentType();
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
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test16173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16173");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        int int8 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        java.lang.String str12 = response1.cookie("hi!");
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        boolean boolean17 = response1.hasHeaderWithValue("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document18 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test16174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16174");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.contentType();
        java.lang.String str7 = response1.statusMessage();
        java.lang.String str8 = response1.statusMessage();
        java.lang.String str9 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response16 = response1.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test16175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16175");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.charset();
        java.net.URL uRL9 = response1.url();
        java.lang.String str10 = response1.statusMessage();
        boolean boolean13 = response1.hasHeaderWithValue("hi!", "");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test16176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16176");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        response1.charset = "";
        java.lang.String str9 = response1.contentType();
        boolean boolean10 = response1.executed;
        org.jsoup.Connection.Response response13 = response1.header("hi!", "hi!");
        java.lang.String str14 = response1.statusMessage;
        response1.numRedirects = (short) 100;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test16177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16177");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Request request3 = null;
        response1.req = request3;
        int int5 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method7 = response6.method();
        java.lang.String str8 = response6.contentType;
        java.lang.String str9 = response6.statusMessage();
        response6.charset = "hi!";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test16178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16178");
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
        org.jsoup.Connection.Method method18 = response1.method();
        java.lang.String str20 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response1.cookies();
        org.jsoup.Connection.Response response24 = response1.cookie("hi!", "");
        boolean boolean25 = response1.executed;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test16179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16179");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        response9.executed = true;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        boolean boolean13 = response12.executed;
        org.jsoup.Connection.Request request14 = response12.req;
        java.lang.String str15 = response12.contentType();
        org.jsoup.Connection.Response response17 = response12.removeCookie("hi!");
        java.net.URL uRL18 = response12.url();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(uRL18);
    }

    @Test
    public void test16180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16180");
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
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.lang.String str15 = response1.charset;
        java.net.URL uRL16 = response1.url();
        response1.numRedirects = 0;
        response1.charset = "hi!";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test16181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16181");
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
        java.lang.String str12 = response1.contentType();
        int int13 = response1.statusCode;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test16182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16182");
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
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("");
        java.lang.String str16 = response1.statusMessage;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test16183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16183");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str10 = response1.charset;
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str14 = response1.contentType;
        java.lang.String str16 = response1.header("");
        java.lang.String str18 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str19 = response1.contentType();
        org.jsoup.Connection.Request request20 = response1.req;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(request20);
    }

    @Test
    public void test16184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16184");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        java.lang.String str7 = response1.statusMessage;
        int int8 = response1.numRedirects;
        response1.charset = "hi!";
        int int11 = response1.numRedirects;
        java.lang.String str12 = response1.statusMessage();
        int int13 = response1.statusCode;
        java.lang.String str14 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test16185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16185");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        java.lang.String str11 = response1.contentType;
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        response1.statusMessage = "";
        response1.statusMessage = "";
        int int18 = response1.numRedirects;
        java.lang.String str20 = response1.header("");
        org.jsoup.Connection.Method method21 = response1.method();
        java.lang.String str22 = response1.statusMessage();
        response1.contentType = "hi!";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test16186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16186");
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
        int int12 = response1.statusCode;
        response1.numRedirects = ' ';
        java.lang.String str16 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response19 = response1.header("hi!", "");
        response1.statusMessage = "";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test16187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16187");
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
        org.jsoup.Connection.Method method16 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test16188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16188");
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
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        response1.numRedirects = 100;
        boolean boolean22 = response1.hasCookie("hi!");
        response1.statusCode = 'a';
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response26 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test16189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16189");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        response1.contentType = "";
        int int11 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        int int15 = response1.numRedirects;
        org.jsoup.Connection.Response response18 = response1.header("hi!", "");
        int int19 = response1.statusCode();
        boolean boolean21 = response1.hasCookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry23 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strEntry23);
    }

    @Test
    public void test16190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16190");
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
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str19 = response1.statusMessage;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test16191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16191");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        response1.charset = "";
        org.jsoup.Connection.Method method12 = response1.method();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int14 = response1.statusCode();
        java.lang.String str15 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test16192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16192");
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
        boolean boolean21 = response1.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.Connection.Response response24 = response1.cookie("hi!", "");
        java.net.URL uRL25 = response1.url();
        org.jsoup.Connection.Method method26 = response1.method();
        int int27 = response1.statusCode();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test16193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16193");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        org.jsoup.Connection.Request request6 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "hi!");
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        java.lang.String str13 = response1.charset();
        java.lang.String str14 = response1.contentType;
        boolean boolean16 = response1.hasCookie("hi!");
        response1.numRedirects = 100;
        java.lang.String str19 = response1.statusMessage;
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test16194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16194");
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
        response1.executed = true;
        org.jsoup.Connection.Method method15 = response1.method();
        org.jsoup.Connection.Response response17 = response1.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test16195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16195");
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
        java.lang.String str16 = response1.contentType();
        response1.contentType = "";
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry22 = response1.scanHeaders("");
        int int23 = response1.numRedirects;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strEntry22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test16196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16196");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        java.lang.String str11 = response1.charset();
        java.lang.String str12 = response1.statusMessage;
        response1.contentType = "hi!";
        response1.charset = "";
        org.jsoup.Connection.Response response19 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.nio.ByteBuffer byteBuffer22 = response1.byteData;
        org.jsoup.Connection.Response response24 = response1.removeCookie("hi!");
        java.lang.String str26 = response1.getHeaderCaseInsensitive("hi!");
        int int27 = response1.statusCode();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(byteBuffer22);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test16197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16197");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage;
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Request request11 = response1.req;
        org.jsoup.Connection.Response response13 = response1.removeCookie("hi!");
        java.lang.String str14 = response1.contentType();
        response1.statusMessage = "";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test16198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16198");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.lang.String str7 = response1.contentType();
        response1.numRedirects = (short) 0;
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response17 = response1.cookie("hi!", "");
        java.lang.String str19 = response1.getHeaderCaseInsensitive("");
        java.lang.String str21 = response1.header("hi!");
        response1.contentType = "hi!";
        org.jsoup.Connection.Request request24 = null;
        response1.req = request24;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test16199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16199");
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
        response1.charset = "hi!";
        response1.contentType = "hi!";
        org.jsoup.Connection.Method method23 = response1.method();
        response1.contentType = "hi!";
        response1.contentType = "";
        java.lang.String str29 = response1.header("hi!");
        response1.statusMessage = "";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test16200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16200");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.contentType = "";
        java.lang.String str12 = response1.cookie("hi!");
        org.jsoup.Connection.Method method13 = response1.method();
        response1.charset = "hi!";
        int int16 = response1.statusCode;
        boolean boolean18 = response1.hasHeader("hi!");
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.url(uRL19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test16201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16201");
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
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        org.jsoup.Connection.Request request21 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNull(request21);
    }

    @Test
    public void test16202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16202");
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
        java.lang.String str19 = response1.getHeaderCaseInsensitive("");
        response1.numRedirects = 0;
        response1.charset = "";
        java.lang.String str25 = response1.getHeaderCaseInsensitive("");
        response1.charset = "hi!";
        java.net.HttpURLConnection httpURLConnection28 = null;
        org.jsoup.helper.HttpConnection.Response response29 = null;
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response29);
        response30.statusMessage = "";
        java.lang.String str33 = response30.contentType();
        boolean boolean34 = response30.executed;
        org.jsoup.Connection.Response response36 = response30.removeCookie("hi!");
        java.lang.String str37 = response30.charset();
        org.jsoup.Connection.Method method38 = response30.method();
        response30.charset = "";
        org.jsoup.Connection.Method method41 = response30.method();
        org.jsoup.helper.HttpConnection.Response response42 = new org.jsoup.helper.HttpConnection.Response(response30);
        org.jsoup.Connection.Response response44 = response30.removeHeader("hi!");
        java.lang.String str45 = response30.charset;
        java.lang.String str46 = response30.charset();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection28, (org.jsoup.Connection.Response) response30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(response36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(method38);
        org.junit.Assert.assertNull(method41);
        org.junit.Assert.assertNotNull(response44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test16203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16203");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        org.jsoup.Connection.Request request6 = response1.req;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.contentType();
        response1.statusCode = (-1);
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        java.lang.String str13 = response1.statusMessage();
        org.jsoup.Connection.Response response15 = response1.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        java.lang.String str18 = response1.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test16204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16204");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response2.headers();
        org.jsoup.Connection.Method method6 = response2.method();
        int int7 = response2.statusCode();
        response2.statusMessage = "";
        java.net.URL uRL10 = response2.url();
        int int11 = response2.numRedirects;
        java.net.URL uRL12 = response2.url();
        java.lang.String str13 = response2.statusMessage;
        response2.statusCode = (byte) 0;
        int int16 = response2.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test16205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16205");
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
        java.lang.String str12 = response1.contentType;
        response1.executed = true;
        java.net.URL uRL15 = response1.url();
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.method(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test16206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16206");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        java.lang.String str9 = response1.statusMessage;
        int int10 = response1.numRedirects;
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        response1.charset = "";
        int int16 = response1.statusCode();
        org.jsoup.Connection.Method method17 = response1.method();
        int int18 = response1.statusCode();
        org.jsoup.Connection.Method method19 = response1.method();
        response1.charset = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response1.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test16207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16207");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str10 = response1.charset;
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response13.cookies();
        response13.charset = "hi!";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test16208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16208");
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
        java.lang.String str11 = response1.contentType;
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.lang.String str14 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test16209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16209");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        int int10 = response1.statusCode;
        response1.statusCode = (short) 10;
        response1.statusCode = (byte) -1;
        response1.charset = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test16210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16210");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.contentType = "";
        int int7 = response1.statusCode();
        java.lang.String str9 = response1.header("");
        java.lang.String str11 = response1.cookie("hi!");
        java.lang.String str13 = response1.getHeaderCaseInsensitive("");
        response1.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str17 = response16.charset();
        java.lang.String str18 = response16.contentType;
        response16.contentType = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test16211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16211");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        java.lang.String str5 = response2.contentType();
        boolean boolean6 = response2.executed;
        org.jsoup.Connection.Response response8 = response2.removeCookie("hi!");
        java.lang.String str9 = response2.charset();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str11 = response2.charset;
        response2.statusMessage = "hi!";
        org.jsoup.Connection.Method method14 = response2.method();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.nio.ByteBuffer byteBuffer16 = response2.byteData;
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(byteBuffer16);
    }

    @Test
    public void test16212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16212");
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
        java.lang.String str16 = response1.contentType;
        boolean boolean18 = response1.hasHeader("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test16213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16213");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType;
        org.jsoup.Connection.Request request3 = response1.req;
        response1.numRedirects = 0;
        response1.statusMessage = "";
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        response1.executed = false;
        response1.charset = "hi!";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test16214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16214");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int3 = response2.numRedirects;
        org.jsoup.Connection.Response response5 = response2.removeHeader("hi!");
        int int6 = response2.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response2.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response2.cookies();
        org.jsoup.Connection.Response response12 = response2.header("hi!", "hi!");
        response2.contentType = "";
        response2.contentType = "";
        java.lang.String str17 = response2.charset;
        response2.numRedirects = 35;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test16215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16215");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        int int9 = response1.numRedirects;
        int int10 = response1.statusCode();
        java.lang.String str11 = response1.charset;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test16216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16216");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        int int7 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        int int10 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test16217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16217");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str10 = response1.statusMessage();
        int int11 = response1.numRedirects;
        java.lang.String str12 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test16218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16218");
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
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.lang.String str16 = response1.cookie("hi!");
        java.net.URL uRL17 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test16219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16219");
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
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        java.lang.String str20 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method21 = response1.method();
        boolean boolean22 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response1.cookies();
        java.lang.String str24 = response1.contentType;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test16220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16220");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        java.lang.String str9 = response1.charset();
        int int10 = response1.statusCode;
        response1.contentType = "";
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        boolean boolean16 = response1.hasCookie("hi!");
        java.net.URL uRL17 = response1.url();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("hi!");
        java.lang.String str20 = response1.statusMessage();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test16221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16221");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        response1.statusMessage = "hi!";
        int int6 = response1.statusCode();
        int int7 = response1.numRedirects;
        java.lang.String str8 = response1.contentType;
        response1.charset = "hi!";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test16222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16222");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage;
        boolean boolean11 = response1.hasCookie("hi!");
        java.lang.String str13 = response1.cookie("hi!");
        java.lang.String str14 = response1.statusMessage();
        org.jsoup.Connection.Request request15 = response1.req;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str17 = response16.charset;
        response16.numRedirects = 32;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test16223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16223");
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
        java.lang.String str14 = response1.header("hi!");
        java.lang.String str15 = response1.contentType;
        java.net.URL uRL16 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test16224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16224");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        int int7 = response1.statusCode;
        response1.numRedirects = 10;
        java.lang.String str11 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str12 = response1.statusMessage();
        org.jsoup.Connection.Response response14 = response1.removeHeader("hi!");
        java.net.URL uRL15 = response1.url();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test16225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16225");
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
        java.lang.String str14 = response1.statusMessage();
        int int15 = response1.statusCode();
        java.lang.String str16 = response1.statusMessage;
        response1.statusMessage = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test16226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16226");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        int int10 = response1.statusCode();
        org.jsoup.Connection.Request request11 = response1.req;
        java.lang.String str12 = response1.contentType;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test16227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16227");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.charset = "hi!";
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str10 = response1.charset();
        boolean boolean13 = response1.hasHeaderWithValue("hi!", "");
        response1.contentType = "";
        int int16 = response1.numRedirects;
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test16228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16228");
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
        response1.numRedirects = (-1);
        boolean boolean19 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        response1.numRedirects = '4';
        java.net.URL uRL23 = response1.url();
        java.lang.String str24 = response1.statusMessage();
        org.jsoup.Connection.Method method25 = response1.method();
        java.lang.String str26 = response1.contentType;
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test16229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16229");
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
        java.lang.String str13 = response1.contentType;
        response1.contentType = "";
        response1.charset = "";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test16230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16230");
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
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.lang.String str15 = response1.charset;
        java.net.URL uRL16 = response1.url();
        java.lang.String str17 = response1.contentType();
        response1.numRedirects = (byte) 1;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test16231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16231");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        response1.statusMessage = "";
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str8 = response7.charset;
        java.net.URL uRL9 = response7.url();
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response7.method(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test16232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16232");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage;
        int int9 = response1.statusCode;
        org.jsoup.Connection.Request request10 = response1.req;
        java.lang.String str11 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response15 = response1.cookie("hi!", "");
        response1.statusCode = (byte) 10;
        java.lang.String str19 = response1.getHeaderCaseInsensitive("");
        java.lang.String str21 = response1.getHeaderCaseInsensitive("");
        java.lang.String str22 = response1.contentType;
        java.lang.String str23 = response1.statusMessage;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test16233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16233");
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
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.cookies();
        java.nio.ByteBuffer byteBuffer19 = null;
        response1.byteData = byteBuffer19;
        java.lang.String str22 = response1.cookie("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test16234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16234");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        response1.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response11.scanHeaders("hi!");
        response11.charset = "hi!";
        boolean boolean16 = response11.executed;
        java.nio.ByteBuffer byteBuffer17 = response11.byteData;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(byteBuffer17);
    }

    @Test
    public void test16235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16235");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        response1.charset = "";
        org.jsoup.Connection.Method method12 = response1.method();
        int int13 = response1.statusCode;
        java.net.URL uRL14 = response1.url();
        int int15 = response1.numRedirects;
        java.lang.String str16 = response1.contentType;
        response1.executed = true;
        boolean boolean19 = response1.executed;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test16236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16236");
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
        java.lang.String str14 = response1.contentType();
        org.jsoup.Connection.Response response16 = response1.removeCookie("hi!");
        org.jsoup.Connection.Request request17 = response1.req;
        response1.charset = "";
        java.lang.String str20 = response1.contentType();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test16237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16237");
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
        java.lang.String str16 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test16238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16238");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.header("");
        response1.contentType = "hi!";
        response1.contentType = "hi!";
        boolean boolean16 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test16239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16239");
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
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        response1.executed = true;
        response1.executed = false;
        boolean boolean18 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str21 = response19.header("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test16240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16240");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        int int9 = response1.statusCode;
        java.lang.String str10 = response1.statusMessage();
        response1.contentType = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test16241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16241");
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
        response1.executed = true;
        org.jsoup.Connection.Request request19 = response1.req;
        response1.numRedirects = 0;
        java.nio.ByteBuffer byteBuffer22 = null;
        response1.byteData = byteBuffer22;
        org.jsoup.Connection.Response response26 = response1.header("hi!", "hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(request19);
        org.junit.Assert.assertNotNull(response26);
    }

    @Test
    public void test16242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16242");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        int int9 = response1.statusCode;
        java.lang.String str10 = response1.statusMessage();
        boolean boolean11 = response1.executed;
        org.jsoup.Connection.Request request12 = response1.req;
        boolean boolean13 = response1.executed;
        java.lang.String str14 = response1.contentType;
        java.lang.String str15 = response1.contentType;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16243");
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
        org.jsoup.Connection.Response response14 = response1.removeHeader("hi!");
        java.lang.String str15 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        response1.executed = false;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(byteBuffer18);
    }

    @Test
    public void test16244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16244");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        response1.statusMessage = "hi!";
        int int6 = response1.statusCode();
        int int7 = response1.numRedirects;
        java.lang.String str8 = response1.contentType();
        response1.contentType = "";
        java.lang.String str11 = response1.contentType();
        int int12 = response1.statusCode();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test16245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16245");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.contentType = "";
        int int7 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.lang.String str9 = response1.statusMessage;
        response1.contentType = "";
        int int12 = response1.statusCode();
        response1.statusMessage = "hi!";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test16246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16246");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        response1.statusMessage = "hi!";
        int int6 = response1.statusCode();
        int int7 = response1.numRedirects;
        java.lang.String str8 = response1.contentType();
        response1.contentType = "";
        java.lang.String str11 = response1.statusMessage;
        org.jsoup.Connection.Response response14 = response1.cookie("hi!", "hi!");
        boolean boolean16 = response1.hasHeader("hi!");
        java.lang.String str18 = response1.header("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test16247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16247");
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
        response1.executed = false;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.cookies();
        boolean boolean19 = response1.executed;
        java.lang.String str20 = response1.statusMessage;
        java.lang.Class<?> wildcardClass21 = response1.getClass();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test16248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16248");
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
        java.lang.String str20 = response1.statusMessage;
        java.lang.String str21 = response1.contentType();
        java.lang.String str22 = response1.charset;
        org.jsoup.Connection.Request request23 = response1.req;
        response1.statusMessage = "";
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(request23);
    }

    @Test
    public void test16249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16249");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        java.lang.String str11 = response1.charset();
        java.lang.String str12 = response1.statusMessage;
        response1.contentType = "hi!";
        java.lang.String str16 = response1.header("");
        java.lang.String str17 = response1.contentType;
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
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test16250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16250");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str10 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.headers();
        java.lang.Class<?> wildcardClass21 = response1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test16251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16251");
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
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test16252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16252");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        response1.executed = false;
        java.lang.String str10 = response1.header("hi!");
        java.lang.String str11 = response1.charset();
        java.lang.String str12 = response1.statusMessage;
        int int13 = response1.numRedirects;
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        org.jsoup.Connection.Response response18 = response1.cookie("hi!", "");
        response1.numRedirects = 0;
        java.lang.String str21 = response1.contentType();
        response1.charset = "hi!";
        java.lang.String str24 = response1.charset();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test16253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16253");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response9.cookies();
        java.lang.String str11 = response9.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response9.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response9.cookies();
        java.lang.String str15 = response9.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document16 = response9.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16254");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        int int9 = response1.statusCode;
        java.lang.String str10 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        java.lang.String str12 = response1.statusMessage();
        java.lang.String str13 = response1.charset();
        org.jsoup.Connection.Response response16 = response1.header("hi!", "");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test16255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16255");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.contentType = "";
        int int7 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        response1.statusCode = 20;
        java.lang.String str13 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response18 = response1.header("hi!", "hi!");
        response1.executed = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test16256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16256");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.lang.String str7 = response1.charset;
        boolean boolean8 = response1.executed;
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        java.lang.String str11 = response1.charset;
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test16257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16257");
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
        org.jsoup.Connection.Request request15 = response1.req;
        int int16 = response1.numRedirects;
        org.jsoup.Connection.Response response19 = response1.header("hi!", "");
        java.lang.String str20 = response1.charset();
        org.jsoup.Connection.Method method21 = response1.method();
        java.lang.String str22 = response1.charset();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test16258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16258");
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
        java.lang.String str18 = response17.charset;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.Connection.Request request20 = null;
        response17.req = request20;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test16259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16259");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        response1.charset = "";
        java.lang.String str9 = response1.contentType();
        java.lang.String str11 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request12 = response1.req;
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        java.lang.String str14 = response1.statusMessage;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test16260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16260");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        response1.charset = "";
        java.lang.String str9 = response1.charset;
        java.lang.String str10 = response1.contentType();
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        int int13 = response1.statusCode();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test16261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16261");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType;
        int int3 = response1.statusCode;
        boolean boolean6 = response1.hasHeaderWithValue("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int9 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        java.lang.String str11 = response1.contentType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test16262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16262");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        response1.numRedirects = 0;
        int int12 = response1.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        java.lang.String str14 = response1.charset;
        java.net.URL uRL15 = response1.url();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        response16.statusMessage = "";
        java.lang.String str19 = response16.statusMessage();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test16263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16263");
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
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        response1.contentType = "";
        org.jsoup.Connection.Request request20 = response1.req;
        int int21 = response1.numRedirects;
        org.jsoup.Connection.Method method22 = response1.method();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(method22);
    }

    @Test
    public void test16264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16264");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        java.lang.String str9 = response1.statusMessage;
        int int10 = response1.numRedirects;
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        java.lang.String str14 = response1.contentType();
        boolean boolean15 = response1.executed;
        response1.statusCode = (short) -1;
        response1.contentType = "hi!";
        org.jsoup.Connection.Response response22 = response1.cookie("hi!", "hi!");
        java.lang.String str23 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request25 = null;
        response1.req = request25;
        java.lang.String str28 = response1.header("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test16265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16265");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response2.headers();
        org.jsoup.Connection.Method method6 = response2.method();
        java.nio.ByteBuffer byteBuffer7 = null;
        response2.byteData = byteBuffer7;
        java.lang.String str9 = response2.statusMessage;
        int int10 = response2.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response2.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response2.scanHeaders("");
        java.lang.String str15 = response2.statusMessage();
        java.lang.String str16 = response2.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response2.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response2.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(strEntry19);
    }

    @Test
    public void test16266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16266");
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
        response1.contentType = "hi!";
        java.lang.String str16 = response1.header("hi!");
        boolean boolean17 = response1.executed;
        org.jsoup.Connection.Request request18 = null;
        response1.req = request18;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test16267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16267");
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
        response1.charset = "hi!";
        java.net.URL uRL16 = response1.url();
        java.lang.String str17 = response1.charset();
        int int18 = response1.numRedirects;
        boolean boolean19 = response1.executed;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test16268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16268");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        org.jsoup.Connection.Response response11 = response1.header("hi!", "hi!");
        response1.executed = false;
        boolean boolean15 = response1.hasCookie("hi!");
        java.lang.String str16 = response1.statusMessage;
        int int17 = response1.statusCode;
        response1.contentType = "";
        java.lang.String str21 = response1.header("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        org.jsoup.Connection.Method method23 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response25 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(method23);
    }

    @Test
    public void test16269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16269");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.lang.String str7 = response1.charset;
        int int8 = response1.numRedirects;
        int int9 = response1.numRedirects;
        java.lang.String str10 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test16270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16270");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage;
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        java.lang.String str11 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str17 = response16.contentType;
        java.lang.String str18 = response16.contentType;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test16271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16271");
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
        response1.executed = true;
        org.jsoup.Connection.Request request19 = response1.req;
        java.lang.String str20 = response1.contentType;
        java.lang.String str21 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        response1.statusCode = 'a';
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(request19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test16272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16272");
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
        boolean boolean17 = response1.executed;
        java.lang.String str18 = response1.contentType;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test16273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16273");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response11 = response1.cookie("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        java.lang.String str13 = response1.charset();
        response1.charset = "";
        response1.executed = true;
        org.jsoup.Connection.Request request18 = null;
        response1.req = request18;
        java.lang.String str20 = response1.statusMessage();
        response1.charset = "";
        response1.charset = "";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test16274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16274");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.net.URL uRL6 = response1.url();
        java.lang.String str7 = response1.contentType();
        org.jsoup.Connection.Response response9 = response1.removeCookie("hi!");
        java.lang.String str10 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test16275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16275");
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
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        java.lang.String str16 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str19 = response17.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Request request20 = response17.req;
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response17.cookies();
        java.lang.String str22 = response17.charset();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test16276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16276");
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
        response1.statusCode = (-1);
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response1.headers();
        response1.numRedirects = (short) 10;
        boolean boolean25 = response1.hasCookie("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test16277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16277");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        int int7 = response1.statusCode;
        int int8 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        java.lang.String str10 = response1.contentType;
        response1.statusCode = (byte) 1;
        int int13 = response1.statusCode;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test16278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16278");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response2.headers();
        org.jsoup.Connection.Method method6 = response2.method();
        java.nio.ByteBuffer byteBuffer7 = null;
        response2.byteData = byteBuffer7;
        java.lang.String str9 = response2.statusMessage;
        int int10 = response2.statusCode;
        org.jsoup.Connection.Request request11 = response2.req;
        org.jsoup.Connection.Request request12 = null;
        response2.req = request12;
        org.jsoup.Connection.Request request14 = null;
        response2.req = request14;
        java.lang.String str16 = response2.charset;
        java.lang.String str17 = response2.charset;
        org.jsoup.Connection.Method method18 = response2.method();
        java.lang.String str19 = response2.contentType;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.executed = false;
        java.lang.String str24 = response2.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response25 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test16279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16279");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        java.lang.String str5 = response2.contentType();
        boolean boolean6 = response2.executed;
        org.jsoup.Connection.Response response8 = response2.removeCookie("hi!");
        java.lang.String str9 = response2.charset();
        java.lang.String str10 = response2.statusMessage;
        java.lang.String str11 = response2.charset();
        java.lang.String str13 = response2.getHeaderCaseInsensitive("hi!");
        java.lang.String str14 = response2.charset;
        int int15 = response2.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test16280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16280");
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
        response1.executed = true;
        response1.statusMessage = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry22 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response24 = response1.removeHeader("hi!");
        java.lang.String str25 = response1.charset;
        org.jsoup.Connection.Response response27 = response1.removeCookie("hi!");
        org.jsoup.Connection.Method method28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response29 = response1.method(method28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(strEntry22);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(response27);
    }

    @Test
    public void test16281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16281");
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
        java.lang.String str19 = response1.header("");
        java.lang.String str20 = response1.contentType;
        org.jsoup.Connection.Request request21 = response1.req;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response22);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(request21);
    }

    @Test
    public void test16282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16282");
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
        int int13 = response1.statusCode();
        boolean boolean14 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16283");
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
        response1.charset = "hi!";
        java.net.URL uRL16 = response1.url();
        response1.charset = "";
        org.jsoup.Connection.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.method(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test16284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16284");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        org.jsoup.Connection.Response response14 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("hi!");
        boolean boolean17 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
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
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test16285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16285");
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
        java.lang.String str11 = response1.contentType();
        java.lang.String str13 = response1.header("hi!");
        response1.executed = false;
        response1.contentType = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        org.jsoup.Connection.Request request20 = response1.req;
        java.lang.String str21 = response1.contentType;
        java.lang.String str22 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document23 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test16286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16286");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        response1.charset = "";
        org.jsoup.Connection.Method method12 = response1.method();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str14 = response1.statusMessage();
        org.jsoup.Connection.Method method15 = response1.method();
        java.lang.String str17 = response1.header("");
        java.lang.String str19 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str23 = response21.header("hi!");
        java.lang.String str24 = response21.charset();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test16287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16287");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        response1.statusMessage = "hi!";
        int int6 = response1.statusCode();
        int int7 = response1.numRedirects;
        java.lang.String str8 = response1.contentType;
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        java.lang.String str13 = response1.contentType;
        java.lang.String str14 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test16288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16288");
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
        java.lang.String str13 = response1.contentType();
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        boolean boolean17 = response1.executed;
        java.lang.String str19 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test16289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16289");
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
        boolean boolean15 = response1.hasHeader("hi!");
        int int16 = response1.statusCode();
        java.lang.String str17 = response1.contentType();
        org.jsoup.Connection.Response response19 = response1.removeHeader("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test16290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16290");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        org.jsoup.Connection.Request request6 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "hi!");
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        java.lang.String str13 = response1.charset();
        org.jsoup.Connection.Response response15 = response1.removeCookie("hi!");
        response1.executed = false;
        java.lang.String str19 = response1.cookie("hi!");
        java.lang.String str20 = response1.statusMessage();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test16291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16291");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        org.jsoup.Connection.Method method7 = response1.method();
        response1.charset = "hi!";
        java.lang.String str10 = response1.statusMessage;
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        response1.statusMessage = "hi!";
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test16292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16292");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        boolean boolean11 = response1.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(strEntry14);
    }

    @Test
    public void test16293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16293");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        response1.charset = "";
        org.jsoup.Connection.Method method12 = response1.method();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int14 = response13.numRedirects;
        java.lang.String str15 = response13.charset();
        java.lang.String str16 = response13.statusMessage;
        response13.contentType = "hi!";
        java.net.URL uRL19 = response13.url();
        java.lang.String str20 = response13.contentType();
        java.net.URL uRL21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response13.url(uRL21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test16294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16294");
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
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        int int15 = response1.statusCode;
        response1.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str19 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray20 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test16295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16295");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset;
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str15 = response14.contentType();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16296");
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
        org.jsoup.Connection.Response response20 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request21 = response1.req;
        response1.numRedirects = '4';
        boolean boolean25 = response1.hasHeader("hi!");
        org.jsoup.Connection.Method method26 = response1.method();
        response1.contentType = "";
        response1.charset = "hi!";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(request21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(method26);
    }

    @Test
    public void test16297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16297");
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
        response1.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response14.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test16298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16298");
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
        java.lang.String str19 = response1.header("");
        int int20 = response1.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response1.cookies();
        java.lang.String str22 = response1.statusMessage;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test16299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16299");
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
        boolean boolean21 = response1.hasHeaderWithValue("hi!", "hi!");
        int int22 = response1.statusCode();
        java.lang.String str24 = response1.header("hi!");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = response25.headers();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strMap26);
    }

    @Test
    public void test16300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16300");
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
        int int19 = response1.statusCode;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test16301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16301");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        int int12 = response1.statusCode();
        java.lang.String str13 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int15 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        java.lang.String str17 = response1.contentType();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test16302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16302");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        java.lang.String str5 = response2.contentType();
        boolean boolean6 = response2.executed;
        org.jsoup.Connection.Response response8 = response2.removeCookie("hi!");
        java.lang.String str9 = response2.charset();
        org.jsoup.Connection.Method method10 = response2.method();
        java.lang.String str11 = response2.statusMessage;
        java.nio.ByteBuffer byteBuffer12 = null;
        response2.byteData = byteBuffer12;
        response2.numRedirects = (byte) 100;
        java.lang.String str16 = response2.statusMessage;
        java.lang.String str17 = response2.contentType();
        java.lang.String str18 = response2.statusMessage;
        java.lang.String str19 = response2.contentType;
        java.lang.String str20 = response2.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response21 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test16303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16303");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        java.lang.String str11 = response1.charset();
        java.lang.String str12 = response1.statusMessage;
        response1.contentType = "hi!";
        response1.charset = "";
        org.jsoup.Connection.Response response19 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.nio.ByteBuffer byteBuffer22 = response1.byteData;
        org.jsoup.Connection.Response response24 = response1.removeCookie("hi!");
        java.lang.String str25 = response1.charset;
        java.lang.String str26 = response1.contentType();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(byteBuffer22);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test16304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16304");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.lang.String str8 = response1.statusMessage;
        org.jsoup.Connection.Method method9 = response1.method();
        int int10 = response1.numRedirects;
        java.lang.String str11 = response1.statusMessage();
        java.lang.String str12 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test16305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16305");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        response1.contentType = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("");
        java.lang.String str16 = response1.contentType();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test16306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16306");
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
        org.jsoup.Connection.Response response23 = response1.removeCookie("hi!");
        java.lang.Class<?> wildcardClass24 = response1.getClass();
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
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test16307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16307");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Request request3 = null;
        response1.req = request3;
        java.nio.ByteBuffer byteBuffer5 = response1.byteData;
        int int6 = response1.statusCode;
        response1.statusMessage = "";
        boolean boolean9 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str12 = response11.contentType();
        java.lang.String str13 = response11.statusMessage;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test16308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16308");
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
        java.lang.String str13 = response1.statusMessage;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.lang.String str16 = response1.cookie("hi!");
        java.lang.String str18 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response21 = response1.cookie("hi!", "hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test16309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16309");
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
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        org.jsoup.Connection.Request request15 = response1.req;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request17 = response1.req;
        int int18 = response1.statusCode;
        response1.executed = true;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test16310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16310");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        java.lang.String str9 = response1.statusMessage;
        java.lang.String str10 = response1.charset();
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str13 = response1.charset;
        response1.executed = false;
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test16311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16311");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        response1.charset = "hi!";
        java.lang.String str7 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str9 = response1.getHeaderCaseInsensitive("");
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.lang.String str12 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test16312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16312");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.contentType = "";
        java.lang.String str12 = response1.cookie("hi!");
        org.jsoup.Connection.Method method13 = response1.method();
        response1.charset = "hi!";
        int int16 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(byteBuffer17);
    }

    @Test
    public void test16313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16313");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        int int7 = response1.statusCode;
        response1.numRedirects = 10;
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        response14.statusMessage = "";
        org.jsoup.Connection.Response response19 = response14.cookie("hi!", "");
        java.lang.String str20 = response14.charset;
        int int21 = response14.numRedirects;
        int int22 = response14.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response14.cookies();
        response14.statusCode = 20;
        boolean boolean26 = response14.executed;
        boolean boolean27 = response14.executed;
        org.jsoup.Connection.Response response29 = response14.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection12, response29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(response29);
    }

    @Test
    public void test16314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16314");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        response1.statusMessage = "hi!";
        java.net.URL uRL6 = response1.url();
        response1.charset = "hi!";
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        response1.executed = true;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.headers();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test16315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16315");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.lang.String str7 = response1.contentType();
        org.jsoup.Connection.Method method8 = response1.method();
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response12 = response1.header("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.headers();
        java.lang.String str14 = response1.statusMessage();
        int int15 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(strEntry17);
    }

    @Test
    public void test16316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16316");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("");
        org.jsoup.Connection.Response response12 = response1.cookie("hi!", "hi!");
        int int13 = response1.numRedirects;
        response1.numRedirects = ' ';
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        response1.statusMessage = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test16317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16317");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test16318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16318");
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
        java.net.HttpURLConnection httpURLConnection20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = null;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response21);
        response22.statusMessage = "";
        java.lang.String str25 = response22.contentType();
        boolean boolean26 = response22.executed;
        org.jsoup.Connection.Response response28 = response22.removeCookie("hi!");
        java.lang.String str29 = response22.charset();
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response22);
        response22.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap33 = response22.headers();
        response22.charset = "";
        int int36 = response22.statusCode;
        org.jsoup.Connection.Method method37 = response22.method();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection20, (org.jsoup.Connection.Response) response22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(byteBuffer18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(method37);
    }

    @Test
    public void test16319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16319");
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
        java.net.URL uRL11 = response1.url();
        int int12 = response1.numRedirects;
        java.lang.String str13 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(strEntry16);
    }

    @Test
    public void test16320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16320");
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
        java.lang.String str21 = response1.contentType();
        response1.contentType = "";
        response1.executed = false;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test16321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16321");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.lang.String str7 = response1.contentType();
        int int8 = response1.numRedirects;
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response12 = response1.removeCookie("hi!");
        int int13 = response1.statusCode;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test16322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16322");
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
        response1.charset = "";
        response1.executed = false;
        boolean boolean20 = response1.executed;
        response1.executed = false;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test16323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16323");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.Connection.Response response11 = response1.header("hi!", "");
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.net.URL uRL15 = response1.url();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test16324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16324");
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
        java.lang.String str19 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        org.jsoup.Connection.Request request21 = response1.req;
        int int22 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response25 = response1.cookie("", "hi!");
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
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(request21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test16325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16325");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        int int10 = response1.statusCode();
        org.jsoup.Connection.Request request11 = response1.req;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(strEntry13);
    }

    @Test
    public void test16326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16326");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        org.jsoup.Connection.Request request6 = response1.req;
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        int int10 = response1.statusCode;
        response1.contentType = "";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test16327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16327");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType;
        int int3 = response1.statusCode();
        java.lang.String str4 = response1.charset;
        java.nio.ByteBuffer byteBuffer5 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("");
        boolean boolean10 = response1.hasHeaderWithValue("hi!", "");
        int int11 = response1.statusCode();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test16328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16328");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.lang.String str9 = response1.statusMessage;
        response1.charset = "";
        int int12 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.cookies();
        response1.executed = false;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response1.scanHeaders("");
        java.lang.String str21 = response1.statusMessage();
        java.net.URL uRL22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.url(uRL22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(strEntry20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test16329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16329");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        response1.contentType = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        response1.numRedirects = '4';
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        org.jsoup.Connection.Response response17 = response1.removeCookie("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test16330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16330");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        response1.executed = false;
        java.lang.String str9 = response1.statusMessage;
        int int10 = response1.statusCode;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request12 = null;
        response11.req = request12;
        response11.statusCode = (short) 0;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test16331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16331");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response9 = response1.removeHeader("hi!");
        response1.statusCode = (short) -1;
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        int int14 = response1.numRedirects;
        response1.executed = false;
        int int17 = response1.statusCode;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test16332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16332");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage;
        int int9 = response1.statusCode;
        org.jsoup.Connection.Request request10 = response1.req;
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        org.jsoup.Connection.Request request13 = response1.req;
        java.lang.String str14 = response1.contentType;
        response1.executed = false;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test16333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16333");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.lang.String str7 = response1.contentType();
        response1.numRedirects = (short) 0;
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        org.jsoup.Connection.Response response15 = response1.header("hi!", "");
        java.lang.String str17 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test16334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16334");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        org.jsoup.Connection.Request request7 = response1.req;
        java.lang.String str8 = response1.contentType;
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        int int11 = response1.numRedirects;
        boolean boolean13 = response1.hasCookie("hi!");
        org.jsoup.Connection.Response response15 = response1.removeCookie("hi!");
        response1.statusCode = 20;
        response1.contentType = "hi!";
        java.lang.String str20 = response1.contentType;
        response1.contentType = "";
        java.lang.String str23 = response1.contentType();
        java.net.HttpURLConnection httpURLConnection24 = null;
        org.jsoup.helper.HttpConnection.Response response25 = null;
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response25);
        response26.statusMessage = "";
        java.lang.String str29 = response26.contentType();
        response26.contentType = "";
        int int32 = response26.statusCode();
        java.nio.ByteBuffer byteBuffer33 = response26.byteData;
        java.nio.ByteBuffer byteBuffer34 = null;
        response26.byteData = byteBuffer34;
        java.util.Map<java.lang.String, java.lang.String> strMap36 = response26.cookies();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection24, (org.jsoup.Connection.Response) response26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(byteBuffer33);
        org.junit.Assert.assertNotNull(strMap36);
    }

    @Test
    public void test16335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16335");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        boolean boolean8 = response1.executed;
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        org.jsoup.Connection.Request request11 = response1.req;
        java.lang.String str13 = response1.header("hi!");
        int int14 = response1.numRedirects;
        response1.charset = "";
        java.lang.String str17 = response1.statusMessage;
        java.lang.String str18 = response1.charset();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test16336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16336");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        java.lang.String str5 = response1.contentType();
        java.lang.String str6 = response1.charset();
        response1.statusCode = (-1);
        boolean boolean9 = response1.executed;
        org.jsoup.Connection.Method method10 = response1.method();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test16337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16337");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.lang.String str7 = response1.contentType();
        response1.statusCode = '#';
        response1.statusCode = 100;
        response1.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strEntry15);
    }

    @Test
    public void test16338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16338");
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
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response14.cookies();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test16339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16339");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        java.lang.String str10 = response1.header("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        int int15 = response1.statusCode;
        java.lang.String str16 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method19 = response18.method();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test16340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16340");
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
        java.net.URL uRL21 = response1.url();
        org.jsoup.Connection.Response response24 = response1.header("hi!", "");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNotNull(response24);
    }

    @Test
    public void test16341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16341");
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
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        org.jsoup.Connection.Request request23 = response1.req;
        java.lang.String str25 = response1.getHeaderCaseInsensitive("");
        java.lang.String str27 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response30 = response1.header("hi!", "hi!");
        response1.numRedirects = 0;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document33 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(request23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(response30);
    }

    @Test
    public void test16342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16342");
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
        org.jsoup.Connection.Response response20 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request21 = response1.req;
        response1.executed = false;
        java.nio.ByteBuffer byteBuffer24 = response1.byteData;
        org.jsoup.Connection.Request request25 = response1.req;
        org.jsoup.Connection.Method method26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response27 = response1.method(method26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(request21);
        org.junit.Assert.assertNull(byteBuffer24);
        org.junit.Assert.assertNull(request25);
    }

    @Test
    public void test16343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16343");
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
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("");
        java.lang.String str19 = response1.charset;
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        org.jsoup.Connection.Method method22 = response1.method();
        java.net.URL uRL23 = response1.url();
        org.jsoup.Connection.Request request24 = null;
        response1.req = request24;
        response1.numRedirects = 32;
        java.lang.String str29 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test16344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16344");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.lang.String str7 = response1.contentType();
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str10 = response1.header("");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str13 = response1.header("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test16345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16345");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.contentType = "";
        java.lang.String str12 = response1.cookie("hi!");
        org.jsoup.Connection.Request request13 = response1.req;
        org.jsoup.Connection.Request request14 = response1.req;
        java.lang.String str15 = response1.statusMessage();
        response1.statusCode = (-1);
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
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test16346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16346");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        response1.statusMessage = "";
        java.net.URL uRL9 = response1.url();
        int int10 = response1.numRedirects;
        int int11 = response1.statusCode;
        boolean boolean14 = response1.hasHeaderWithValue("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        java.lang.Class<?> wildcardClass16 = response1.getClass();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test16347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16347");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.lang.String str8 = response1.statusMessage;
        org.jsoup.Connection.Method method9 = response1.method();
        java.lang.String str10 = response1.contentType();
        int int11 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test16348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16348");
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
        org.jsoup.Connection.Response response20 = response1.cookie("hi!", "hi!");
        org.jsoup.Connection.Request request21 = null;
        response1.req = request21;
        response1.numRedirects = 52;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test16349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16349");
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
        java.net.URL uRL15 = response1.url();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Request request18 = response1.req;
        boolean boolean19 = response1.executed;
        java.lang.String str20 = response1.statusMessage();
        response1.charset = "";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertNull(request18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test16350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16350");
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
        java.lang.String str14 = response1.header("hi!");
        response1.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test16351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16351");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        int int11 = response1.numRedirects;
        java.lang.String str12 = response1.contentType();
        java.lang.String str13 = response1.contentType;
        boolean boolean15 = response1.hasHeader("hi!");
        java.lang.String str16 = response1.contentType;
        org.jsoup.Connection.Response response18 = response1.removeCookie("hi!");
        java.nio.ByteBuffer byteBuffer19 = null;
        response1.byteData = byteBuffer19;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test16352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16352");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method10 = response1.method();
        org.jsoup.Connection.Method method11 = response1.method();
        java.lang.String str12 = response1.statusMessage;
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        java.lang.String str15 = response1.statusMessage;
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.method(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test16353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16353");
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
        boolean boolean16 = response1.executed;
        response1.numRedirects = 'a';
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test16354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16354");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.executed;
        java.lang.String str12 = response1.charset();
        java.lang.String str14 = response1.getHeaderCaseInsensitive("");
        response1.statusCode = (byte) 10;
        response1.statusMessage = "hi!";
        response1.charset = "hi!";
        int int21 = response1.statusCode;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test16355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16355");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response11 = response1.cookie("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        java.lang.String str13 = response1.charset();
        boolean boolean14 = response1.executed;
        java.lang.String str15 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        response1.executed = false;
        java.lang.String str22 = response1.statusMessage;
        org.jsoup.Connection.Response response25 = response1.cookie("hi!", "hi!");
        org.jsoup.Connection.Method method26 = response1.method();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNull(method26);
    }

    @Test
    public void test16356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16356");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.lang.String str7 = response1.contentType();
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str10 = response1.header("");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int12 = response11.numRedirects;
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response11.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test16357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16357");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.contentType = "hi!";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("hi!");
        java.lang.String str16 = response1.statusMessage;
        boolean boolean18 = response1.hasHeader("hi!");
        java.net.URL uRL19 = response1.url();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(uRL19);
    }

    @Test
    public void test16358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16358");
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
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.lang.String str15 = response1.statusMessage();
        org.jsoup.Connection.Method method16 = response1.method();
        java.net.URL uRL17 = response1.url();
        org.jsoup.Connection.Request request18 = response1.req;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(request18);
    }

    @Test
    public void test16359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16359");
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
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str17 = response1.header("");
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
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test16360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16360");
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
        response1.statusMessage = "hi!";
        boolean boolean20 = response1.executed;
        java.lang.String str21 = response1.statusMessage();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test16361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16361");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        response1.statusMessage = "hi!";
        int int6 = response1.statusCode();
        int int7 = response1.numRedirects;
        java.lang.String str8 = response1.contentType;
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        java.lang.String str13 = response1.contentType;
        java.lang.String str14 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test16362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16362");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.lang.String str7 = response1.contentType();
        response1.numRedirects = (short) 0;
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        int int12 = response1.numRedirects;
        response1.numRedirects = '4';
        java.lang.String str16 = response1.header("hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test16363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16363");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        java.lang.String str11 = response1.charset();
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        response1.statusCode = (byte) 100;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test16364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16364");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.lang.String str7 = response1.contentType();
        response1.numRedirects = (short) 0;
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.lang.String str12 = response1.contentType();
        int int13 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("hi!");
        response1.contentType = "hi!";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(strEntry16);
    }

    @Test
    public void test16365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16365");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        java.lang.String str9 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response12 = response1.removeCookie("hi!");
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        org.jsoup.Connection.Request request15 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.cookies();
        response1.numRedirects = (short) 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test16366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16366");
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
        response1.charset = "hi!";
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.method(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test16367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16367");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        boolean boolean8 = response1.hasHeader("hi!");
        int int9 = response1.statusCode;
        int int10 = response1.statusCode();
        org.jsoup.Connection.Response response12 = response1.removeCookie("hi!");
        boolean boolean13 = response1.executed;
        int int14 = response1.statusCode();
        java.lang.String str15 = response1.statusMessage();
        int int16 = response1.numRedirects;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test16368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16368");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.net.HttpURLConnection httpURLConnection9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        response11.statusMessage = "";
        java.lang.String str14 = response11.contentType();
        response11.executed = false;
        org.jsoup.Connection.Request request17 = response11.req;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response11.cookies();
        java.lang.String str20 = response11.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection9, (org.jsoup.Connection.Response) response11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test16369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16369");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.lang.String str8 = response1.statusMessage;
        org.jsoup.Connection.Method method9 = response1.method();
        java.lang.String str10 = response1.contentType();
        response1.executed = true;
        response1.numRedirects = 100;
        java.net.URL uRL15 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test16370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16370");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        response1.contentType = "";
        java.net.URL uRL11 = response1.url();
        java.lang.String str13 = response1.header("");
        java.lang.String str14 = response1.contentType();
        java.lang.String str16 = response1.cookie("hi!");
        java.lang.String str18 = response1.getHeaderCaseInsensitive("hi!");
        boolean boolean19 = response1.executed;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test16371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16371");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.numRedirects;
        java.net.URL uRL6 = response1.url();
        boolean boolean8 = response1.hasHeader("hi!");
        response1.charset = "hi!";
        int int11 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.method(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strEntry13);
    }

    @Test
    public void test16372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16372");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        org.jsoup.Connection.Response response11 = response1.header("hi!", "hi!");
        response1.executed = false;
        boolean boolean15 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        response1.charset = "";
        org.jsoup.Connection.Request request20 = response1.req;
        response1.charset = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertNull(request20);
    }

    @Test
    public void test16373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16373");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        java.lang.String str9 = response1.charset();
        int int10 = response1.statusCode;
        response1.contentType = "";
        response1.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        response15.executed = true;
        response15.numRedirects = (short) 1;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = response15.hasHeaderWithValue("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test16374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16374");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.net.URL uRL6 = response1.url();
        response1.contentType = "hi!";
        java.lang.String str9 = response1.statusMessage;
        response1.executed = true;
        int int12 = response1.numRedirects;
        org.jsoup.Connection.Response response14 = response1.removeCookie("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test16375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16375");
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
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        java.lang.String str23 = response1.statusMessage;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test16376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16376");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.lang.String str8 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        response1.executed = true;
        java.lang.String str14 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str16 = response1.charset;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test16377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16377");
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
        org.jsoup.Connection.Request request13 = response1.req;
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.method(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(request13);
    }

    @Test
    public void test16378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16378");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean9 = response6.hasHeaderWithValue("hi!", "hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response6.scanHeaders("hi!");
        response6.numRedirects = 0;
        java.lang.String str14 = response6.contentType();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test16379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16379");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset;
        response1.contentType = "hi!";
        java.net.URL uRL12 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test16380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16380");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        response1.charset = "";
        org.jsoup.Connection.Method method12 = response1.method();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int14 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean18 = response1.hasHeaderWithValue("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response1.scanHeaders("");
        org.jsoup.Connection.Request request21 = response1.req;
        java.lang.String str22 = response1.charset;
        java.lang.String str24 = response1.header("hi!");
        int int25 = response1.numRedirects;
        java.net.URL uRL26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response27 = response1.url(uRL26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(strEntry20);
        org.junit.Assert.assertNull(request21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test16381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16381");
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
        response1.executed = false;
        org.jsoup.Connection.Response response22 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Request request23 = null;
        response1.req = request23;
        int int25 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer26 = null;
        response1.byteData = byteBuffer26;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test16382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16382");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.lang.String str7 = response1.charset;
        boolean boolean8 = response1.executed;
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        java.lang.String str12 = response1.getHeaderCaseInsensitive("");
        java.lang.String str13 = response1.statusMessage();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(strEntry15);
    }

    @Test
    public void test16383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16383");
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
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response15 = response1.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response19 = response16.header("hi!", "hi!");
        response16.executed = true;
        java.lang.String str23 = response16.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = response16.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test16384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16384");
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
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        boolean boolean18 = response1.executed;
        java.net.URL uRL19 = response1.url();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(uRL19);
    }

    @Test
    public void test16385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16385");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        java.lang.String str10 = response1.statusMessage;
        response1.statusCode = (byte) 1;
        org.jsoup.Connection.Method method13 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(strEntry15);
    }

    @Test
    public void test16386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16386");
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
        response1.executed = true;
        response1.statusMessage = "";
        boolean boolean21 = response1.executed;
        java.lang.String str23 = response1.header("");
        response1.statusCode = (short) 0;
        java.net.URL uRL26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response27 = response1.url(uRL26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test16387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16387");
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
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.lang.String str15 = response1.charset;
        java.lang.String str16 = response1.contentType();
        java.lang.String str18 = response1.getHeaderCaseInsensitive("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response1.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = response1.hasHeaderWithValue("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(strEntry20);
    }

    @Test
    public void test16388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16388");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.contentType();
        java.lang.String str11 = response1.statusMessage;
        int int12 = response1.numRedirects;
        boolean boolean13 = response1.executed;
        response1.statusCode = (byte) 10;
        int int16 = response1.statusCode();
        java.lang.String str17 = response1.contentType();
        java.lang.String str18 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test16389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16389");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.executed = false;
        response1.statusMessage = "";
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        int int13 = response1.statusCode();
        java.lang.String str15 = response1.cookie("hi!");
        java.lang.String str17 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str19 = response1.header("");
        int int20 = response1.statusCode();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test16390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16390");
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
        org.jsoup.Connection.Response response16 = response1.removeCookie("hi!");
        java.lang.String str17 = response1.contentType();
        java.lang.String str18 = response1.contentType;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test16391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16391");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        org.jsoup.Connection.Request request6 = response1.req;
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        org.jsoup.Connection.Method method10 = response1.method();
        java.lang.String str12 = response1.getHeaderCaseInsensitive("");
        java.lang.String str13 = response1.charset;
        boolean boolean16 = response1.hasHeaderWithValue("hi!", "hi!");
        java.lang.String str17 = response1.statusMessage();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test16392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16392");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        response1.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int11 = response1.statusCode;
        response1.statusCode = (byte) 0;
        boolean boolean14 = response1.executed;
        java.lang.String str15 = response1.contentType;
        response1.charset = "";
        org.jsoup.Connection.Response response20 = response1.cookie("hi!", "hi!");
        java.lang.String str21 = response1.charset();
        response1.charset = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test16393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16393");
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
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        org.jsoup.Connection.Request request19 = response1.req;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.charset = "";
        response1.charset = "hi!";
        int int25 = response1.numRedirects;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(byteBuffer18);
        org.junit.Assert.assertNull(request19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test16394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16394");
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
        org.jsoup.Connection.Request request13 = response1.req;
        response1.numRedirects = '4';
        response1.executed = false;
        org.jsoup.Connection.Request request18 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = response1.bodyAsBytes();
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
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(request18);
    }

    @Test
    public void test16395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16395");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.lang.String str7 = response1.charset;
        int int8 = response1.numRedirects;
        java.lang.String str9 = response1.charset;
        org.jsoup.Connection.Response response12 = response1.cookie("hi!", "hi!");
        boolean boolean15 = response1.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.Connection.Response response17 = response1.removeHeader("hi!");
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test16396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16396");
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
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        response1.executed = false;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response17.headers();
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response17.url(uRL19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test16397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16397");
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
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response15 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.method(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test16398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16398");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        response1.charset = "";
        org.jsoup.Connection.Method method12 = response1.method();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int14 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean18 = response1.hasHeaderWithValue("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.headers();
        java.lang.String str20 = response1.statusMessage;
        java.net.URL uRL21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response1.url(uRL21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test16399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16399");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Request request3 = null;
        response1.req = request3;
        java.nio.ByteBuffer byteBuffer5 = response1.byteData;
        int int6 = response1.statusCode;
        response1.statusMessage = "";
        boolean boolean9 = response1.executed;
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        int int11 = response1.numRedirects;
        org.jsoup.Connection.Response response13 = response1.removeCookie("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test16400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16400");
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
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        boolean boolean17 = response1.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL19 = response1.url();
        java.lang.String str20 = response1.contentType;
        response1.executed = true;
        java.lang.String str23 = response1.charset();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test16401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16401");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test16402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16402");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        response1.numRedirects = (-1);
        java.net.URL uRL6 = response1.url();
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        java.lang.String str9 = response1.charset();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test16403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16403");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        response1.executed = false;
        java.lang.String str9 = response1.charset;
        java.lang.String str10 = response1.contentType();
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        boolean boolean15 = response1.hasHeaderWithValue("hi!", "");
        int int16 = response1.statusCode();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test16404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16404");
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
        response1.numRedirects = (byte) 0;
        response1.statusCode = (-1);
        java.lang.String str16 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("hi!");
        response1.contentType = "hi!";
        boolean boolean21 = response1.executed;
        int int22 = response1.numRedirects;
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
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test16405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16405");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.lang.String str4 = response1.header("hi!");
        int int5 = response1.statusCode();
        response1.charset = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        int int9 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test16406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16406");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        int int10 = response1.statusCode;
        int int11 = response1.statusCode;
        java.lang.String str12 = response1.statusMessage();
        response1.statusCode = 0;
        response1.contentType = "";
        org.jsoup.Connection.Response response19 = response1.cookie("hi!", "hi!");
        org.jsoup.Connection.Response response21 = response1.removeHeader("hi!");
        response1.statusMessage = "";
        org.jsoup.Connection.Request request24 = null;
        response1.req = request24;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test16407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16407");
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
        java.lang.String str18 = response1.cookie("hi!");
        java.lang.String str19 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response20.url(uRL21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test16408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16408");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        int int9 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int11 = response1.numRedirects;
        int int12 = response1.statusCode();
        int int13 = response1.statusCode();
        org.jsoup.Connection.Method method14 = response1.method();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test16409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16409");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        int int7 = response1.statusCode;
        response1.numRedirects = 10;
        response1.contentType = "";
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        org.jsoup.Connection.Request request13 = response1.req;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test16410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16410");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.contentType();
        java.lang.String str11 = response1.cookie("hi!");
        java.lang.String str13 = response1.cookie("hi!");
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        java.lang.String str16 = response1.statusMessage();
        org.jsoup.Connection.Request request17 = response1.req;
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(request17);
    }

    @Test
    public void test16411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16411");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        response1.executed = false;
        java.lang.String str10 = response1.header("hi!");
        java.lang.String str11 = response1.charset();
        java.lang.String str12 = response1.statusMessage;
        int int13 = response1.numRedirects;
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        org.jsoup.Connection.Response response18 = response1.cookie("hi!", "");
        response1.numRedirects = 0;
        java.lang.String str21 = response1.contentType();
        response1.charset = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document24 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test16412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16412");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response11 = response1.cookie("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("");
        int int15 = response1.statusCode();
        java.lang.String str16 = response1.contentType();
        java.lang.String str17 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test16413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16413");
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
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer20 = response1.byteData;
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
        org.junit.Assert.assertNull(byteBuffer20);
    }

    @Test
    public void test16414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16414");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        int int7 = response1.statusCode;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str10 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test16415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16415");
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
        int int17 = response1.statusCode;
        org.jsoup.Connection.Request request18 = response1.req;
        java.lang.String str20 = response1.header("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(request18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test16416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16416");
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
        org.jsoup.Connection.Response response18 = response1.header("hi!", "hi!");
        java.lang.String str19 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
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
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test16417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16417");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        java.lang.String str7 = response1.statusMessage;
        java.lang.String str8 = response1.statusMessage;
        org.jsoup.Connection.Response response11 = response1.cookie("hi!", "hi!");
        org.jsoup.Connection.Method method12 = response1.method();
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test16418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16418");
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
        java.lang.String str17 = response1.statusMessage();
        org.jsoup.Connection.Method method18 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        java.nio.ByteBuffer byteBuffer20 = response1.byteData;
        response1.statusCode = (-1);
        org.jsoup.Connection.Method method23 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(byteBuffer20);
        org.junit.Assert.assertNull(method23);
    }

    @Test
    public void test16419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16419");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType;
        int int3 = response1.statusCode;
        boolean boolean6 = response1.hasHeaderWithValue("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int9 = response1.statusCode();
        response1.charset = "hi!";
        java.lang.String str12 = response1.contentType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test16420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16420");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        java.lang.String str5 = response2.contentType();
        boolean boolean6 = response2.executed;
        org.jsoup.Connection.Response response8 = response2.removeCookie("hi!");
        java.lang.String str9 = response2.charset();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str11 = response2.charset;
        response2.statusMessage = "hi!";
        org.jsoup.Connection.Method method14 = response2.method();
        response2.executed = true;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response2.headers();
        java.lang.String str18 = response2.contentType;
        java.net.URL uRL19 = response2.url();
        java.lang.String str21 = response2.getHeaderCaseInsensitive("");
        response2.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response24 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test16421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16421");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        response1.statusMessage = "hi!";
        int int6 = response1.statusCode();
        int int7 = response1.numRedirects;
        java.lang.String str8 = response1.contentType();
        response1.contentType = "";
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean15 = response13.hasCookie("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test16422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16422");
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
        java.nio.ByteBuffer byteBuffer19 = null;
        response1.byteData = byteBuffer19;
        java.lang.String str21 = response1.charset;
        response1.numRedirects = 10;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test16423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16423");
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
        int int14 = response1.statusCode;
        int int15 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test16424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16424");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        response1.charset = "";
        java.lang.String str9 = response1.contentType();
        java.lang.String str11 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request12 = response1.req;
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNull(byteBuffer13);
    }

    @Test
    public void test16425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16425");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        response1.charset = "";
        org.jsoup.Connection.Method method12 = response1.method();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        response13.executed = false;
        org.jsoup.Connection.Response response18 = response13.cookie("hi!", "hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response13.scanHeaders("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(strEntry20);
    }

    @Test
    public void test16426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16426");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        java.lang.String str5 = response2.contentType();
        boolean boolean6 = response2.executed;
        org.jsoup.Connection.Response response8 = response2.removeCookie("hi!");
        java.lang.String str9 = response2.charset();
        org.jsoup.Connection.Method method10 = response2.method();
        response2.charset = "";
        java.lang.String str13 = response2.charset();
        java.net.URL uRL14 = response2.url();
        java.lang.String str15 = response2.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response2.scanHeaders("hi!");
        int int18 = response2.numRedirects;
        boolean boolean20 = response2.hasHeader("hi!");
        org.jsoup.Connection.Method method21 = response2.method();
        org.jsoup.Connection.Response response24 = response2.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response25 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(response24);
    }

    @Test
    public void test16427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16427");
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
        response1.statusMessage = "hi!";
        response1.contentType = "hi!";
        java.lang.String str17 = response1.statusMessage();
        java.lang.String str18 = response1.charset;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test16428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16428");
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
        boolean boolean20 = response1.executed;
        response1.statusCode = (short) 10;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response25 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test16429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16429");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        boolean boolean7 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        response1.executed = false;
        response1.contentType = "";
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test16430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16430");
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
        org.jsoup.Connection.Request request13 = response1.req;
        java.lang.String str14 = response1.contentType;
        int int15 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test16431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16431");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType;
        org.jsoup.Connection.Request request3 = response1.req;
        java.lang.String str5 = response1.cookie("hi!");
        boolean boolean7 = response1.hasCookie("hi!");
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test16432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16432");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        java.lang.String str7 = response1.cookie("hi!");
        response1.executed = false;
        int int10 = response1.numRedirects;
        org.jsoup.Connection.Response response13 = response1.cookie("hi!", "");
        java.lang.String str14 = response1.charset();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test16433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16433");
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
        response1.numRedirects = (short) 10;
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test16434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16434");
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
        int int19 = response1.numRedirects;
        org.jsoup.Connection.Method method20 = response1.method();
        boolean boolean21 = response1.executed;
        java.lang.String str23 = response1.header("hi!");
        response1.executed = false;
        java.lang.String str26 = response1.statusMessage;
        response1.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry30 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(strEntry30);
    }

    @Test
    public void test16435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16435");
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
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response15 = response1.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str17 = response1.statusMessage();
        java.lang.String str18 = response1.statusMessage();
        response1.statusCode = 10;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test16436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16436");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("");
        boolean boolean12 = response1.hasHeaderWithValue("hi!", "");
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        response1.numRedirects = '#';
        java.lang.String str17 = response1.header("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test16437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16437");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str7 = response6.contentType;
        response6.numRedirects = (short) 1;
        java.lang.String str10 = response6.contentType();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test16438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16438");
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
        java.lang.String str10 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test16439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16439");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response11 = response1.cookie("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        java.lang.String str13 = response1.charset();
        boolean boolean14 = response1.executed;
        java.lang.String str15 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        response1.executed = false;
        java.lang.String str22 = response1.statusMessage;
        org.jsoup.Connection.Response response24 = response1.removeCookie("hi!");
        response1.statusCode = (short) 100;
        response1.statusMessage = "hi!";
        boolean boolean30 = response1.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response32 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test16440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16440");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage;
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        java.lang.String str11 = response1.statusMessage;
        java.lang.String str12 = response1.charset();
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        response1.charset = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test16441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16441");
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
        boolean boolean15 = response1.hasHeader("hi!");
        response1.contentType = "";
        response1.numRedirects = 100;
        org.jsoup.Connection.Request request20 = null;
        response1.req = request20;
        org.jsoup.Connection.Request request22 = response1.req;
        response1.contentType = "";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(request22);
    }

    @Test
    public void test16442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16442");
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
        response1.statusCode = 20;
        org.jsoup.Connection.Method method19 = response1.method();
        java.nio.ByteBuffer byteBuffer20 = response1.byteData;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(byteBuffer20);
    }

    @Test
    public void test16443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16443");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.executed;
        java.lang.String str12 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        boolean boolean18 = response1.hasHeaderWithValue("hi!", "hi!");
        response1.charset = "hi!";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test16444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16444");
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
        boolean boolean20 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.Connection.Request request21 = null;
        response1.req = request21;
        response1.numRedirects = 10;
        java.lang.String str25 = response1.statusMessage;
        response1.statusMessage = "";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test16445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16445");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        response1.executed = false;
        java.lang.String str10 = response1.header("hi!");
        java.lang.String str11 = response1.charset();
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        java.net.URL uRL13 = response1.url();
        response1.statusCode = (byte) 100;
        org.jsoup.Connection.Response response17 = response1.removeHeader("hi!");
        boolean boolean20 = response1.hasHeaderWithValue("hi!", "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test16446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16446");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset;
        int int7 = response1.statusCode();
        java.net.URL uRL8 = response1.url();
        java.lang.String str9 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test16447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16447");
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
        int int19 = response1.statusCode();
        response1.contentType = "hi!";
        org.jsoup.Connection.Method method22 = response1.method();
        java.lang.String str24 = response1.getHeaderCaseInsensitive("hi!");
        boolean boolean26 = response1.hasHeader("hi!");
        java.net.URL uRL27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response28 = response1.url(uRL27);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test16448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16448");
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
        boolean boolean18 = response1.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer19 = response1.byteData;
        java.lang.String str20 = response1.charset;
        java.lang.String str21 = response1.contentType();
        int int22 = response1.statusCode;
        java.lang.String str23 = response1.charset();
        java.lang.String str24 = response1.contentType();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(byteBuffer19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test16449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16449");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.contentType();
        response1.contentType = "hi!";
        int int9 = response1.statusCode;
        boolean boolean11 = response1.hasCookie("hi!");
        org.jsoup.Connection.Request request12 = response1.req;
        java.lang.String str13 = response1.charset();
        response1.charset = "";
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.executed = true;
        java.net.URL uRL19 = response1.url();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL19);
    }

    @Test
    public void test16450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16450");
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
        java.lang.String str18 = response1.header("");
        response1.statusCode = (short) 100;
        java.lang.Class<?> wildcardClass21 = response1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test16451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16451");
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
        boolean boolean22 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry25 = response1.scanHeaders("");
        response1.contentType = "hi!";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(strEntry25);
    }

    @Test
    public void test16452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16452");
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
        java.lang.String str18 = response1.cookie("hi!");
        java.lang.String str19 = response1.contentType();
        java.lang.String str21 = response1.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test16453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16453");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType;
        int int3 = response1.statusCode();
        java.lang.String str4 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean9 = response1.hasCookie("hi!");
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response1.method(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test16454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16454");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage;
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "hi!");
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        java.net.URL uRL15 = response1.url();
        org.jsoup.Connection.Response response18 = response1.header("hi!", "hi!");
        response1.statusMessage = "hi!";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test16455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16455");
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
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        java.lang.String str20 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str21 = response1.statusMessage;
        boolean boolean23 = response1.hasCookie("hi!");
        java.lang.String str25 = response1.header("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test16456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16456");
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
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        boolean boolean17 = response1.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response21 = response18.header("hi!", "hi!");
        int int22 = response18.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray23 = response18.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test16457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16457");
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
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        java.lang.String str20 = response1.header("hi!");
        java.lang.String str21 = response1.statusMessage;
        org.jsoup.Connection.Method method22 = response1.method();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(method22);
    }

    @Test
    public void test16458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16458");
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
        java.lang.String str17 = response1.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test16459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16459");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        java.lang.String str9 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response12 = response1.removeCookie("hi!");
        boolean boolean14 = response1.hasCookie("hi!");
        java.lang.String str15 = response1.contentType();
        int int16 = response1.statusCode();
        int int17 = response1.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.cookies();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test16460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16460");
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
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response13.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response13.headers();
        response13.executed = false;
        org.jsoup.Connection.Request request19 = response13.req;
        java.lang.String str20 = response13.contentType();
        boolean boolean22 = response13.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray23 = response13.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(request19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test16461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16461");
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
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        java.lang.String str14 = response1.contentType();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test16462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16462");
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
        response1.numRedirects = (byte) 0;
        response1.statusCode = (-1);
        java.lang.String str16 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("hi!");
        response1.contentType = "hi!";
        response1.charset = "hi!";
        java.lang.String str23 = response1.charset;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test16463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16463");
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
        response1.executed = true;
        org.jsoup.Connection.Request request19 = response1.req;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response1.scanHeaders("");
        boolean boolean24 = response1.hasHeaderWithValue("hi!", "");
        int int25 = response1.statusCode;
        org.jsoup.Connection.Method method26 = response1.method();
        int int27 = response1.numRedirects;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(request19);
        org.junit.Assert.assertNull(strEntry21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test16464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16464");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        int int4 = response1.numRedirects;
        org.jsoup.Connection.Request request5 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(request5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test16465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16465");
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
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.headers();
        java.nio.ByteBuffer byteBuffer20 = response1.byteData;
        java.lang.String str21 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(byteBuffer20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test16466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16466");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        response1.contentType = "";
        org.jsoup.Connection.Request request10 = response1.req;
        org.jsoup.Connection.Response response13 = response1.cookie("hi!", "hi!");
        java.lang.String str14 = response1.contentType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test16467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16467");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        response1.statusMessage = "hi!";
        int int6 = response1.statusCode();
        org.jsoup.Connection.Response response8 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(strEntry10);
    }

    @Test
    public void test16468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16468");
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
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.cookies();
        response1.numRedirects = (byte) -1;
        java.lang.String str20 = response1.contentType();
        boolean boolean22 = response1.hasCookie("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test16469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16469");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.contentType = "";
        int int7 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        response1.statusCode = 20;
        java.lang.String str13 = response1.contentType;
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request17 = null;
        response16.req = request17;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test16470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16470");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        response1.numRedirects = 0;
        boolean boolean12 = response1.executed;
        java.lang.String str13 = response1.charset;
        java.lang.Class<?> wildcardClass14 = response1.getClass();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test16471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16471");
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
        java.lang.String str15 = response13.header("hi!");
        int int16 = response13.statusCode();
        java.nio.ByteBuffer byteBuffer17 = response13.byteData;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(byteBuffer17);
    }

    @Test
    public void test16472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16472");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean11 = response1.executed;
        java.lang.String str12 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test16473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16473");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        response1.executed = false;
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        org.jsoup.Connection.Method method10 = response1.method();
        java.lang.String str12 = response1.header("");
        response1.charset = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test16474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16474");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        boolean boolean8 = response1.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        response1.numRedirects = (short) 100;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test16475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16475");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        java.lang.String str9 = response1.charset();
        int int10 = response1.statusCode;
        java.lang.String str11 = response1.contentType();
        int int12 = response1.statusCode();
        org.jsoup.Connection.Request request13 = response1.req;
        java.net.URL uRL14 = response1.url();
        java.net.URL uRL15 = response1.url();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test16476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16476");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.lang.String str7 = response1.contentType();
        org.jsoup.Connection.Method method8 = response1.method();
        java.net.URL uRL9 = response1.url();
        response1.contentType = "hi!";
        java.lang.String str13 = response1.cookie("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test16477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16477");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        response1.executed = false;
        response1.executed = true;
        org.jsoup.Connection.Response response9 = response1.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer11 = null;
        response10.byteData = byteBuffer11;
        java.lang.String str13 = response10.charset;
        int int14 = response10.statusCode();
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test16478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16478");
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
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        response1.executed = false;
        response1.charset = "hi!";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test16479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16479");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.contentType = "";
        int int7 = response1.statusCode();
        java.lang.String str9 = response1.header("");
        java.lang.String str11 = response1.cookie("hi!");
        java.lang.String str13 = response1.getHeaderCaseInsensitive("");
        response1.statusMessage = "";
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        java.net.URL uRL18 = response1.url();
        java.nio.ByteBuffer byteBuffer19 = null;
        response1.byteData = byteBuffer19;
        response1.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL18);
    }

    @Test
    public void test16480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16480");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        java.lang.String str9 = response1.charset();
        int int10 = response1.statusCode;
        response1.contentType = "";
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        response1.contentType = "hi!";
        java.lang.String str17 = response1.contentType;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test16481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16481");
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
        org.jsoup.Connection.Method method16 = response1.method();
        response1.contentType = "";
        java.lang.String str19 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response1.scanHeaders("");
        org.jsoup.Connection.Response response24 = response1.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response25);
        java.util.Map<java.lang.String, java.lang.String> strMap27 = response25.cookies();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(strEntry21);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNotNull(strMap27);
    }

    @Test
    public void test16482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16482");
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
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response15 = response1.header("hi!", "hi!");
        java.lang.String str16 = response1.contentType;
        java.lang.String str17 = response1.charset();
        java.net.URL uRL18 = response1.url();
        boolean boolean21 = response1.hasHeaderWithValue("hi!", "hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test16483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16483");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.numRedirects;
        java.net.URL uRL6 = response1.url();
        boolean boolean8 = response1.hasHeader("hi!");
        response1.charset = "hi!";
        int int11 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        org.jsoup.Connection.Response response16 = response1.cookie("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test16484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16484");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        java.lang.String str9 = response1.statusMessage;
        java.lang.String str10 = response1.charset();
        java.lang.String str11 = response1.contentType();
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        java.lang.String str14 = response1.statusMessage;
        java.lang.String str15 = response1.contentType;
        int int16 = response1.statusCode;
        org.jsoup.Connection.Method method17 = response1.method();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test16485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16485");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        org.jsoup.Connection.Response response11 = response1.header("hi!", "hi!");
        response1.executed = false;
        boolean boolean15 = response1.hasCookie("hi!");
        java.lang.String str16 = response1.statusMessage;
        java.nio.ByteBuffer byteBuffer17 = null;
        response1.byteData = byteBuffer17;
        boolean boolean19 = response1.executed;
        java.lang.String str20 = response1.contentType;
        boolean boolean21 = response1.executed;
        response1.executed = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test16486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16486");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        response1.numRedirects = 0;
        int int12 = response1.statusCode();
        java.lang.String str14 = response1.cookie("hi!");
        java.lang.String str15 = response1.contentType;
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        java.lang.String str18 = response1.charset();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test16487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16487");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType;
        int int3 = response1.statusCode();
        java.lang.String str4 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean8 = response7.executed;
        java.lang.String str9 = response7.contentType;
        java.nio.ByteBuffer byteBuffer10 = null;
        response7.byteData = byteBuffer10;
        response7.executed = true;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test16488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16488");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        boolean boolean8 = response1.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        response1.numRedirects = (short) 100;
        java.lang.String str13 = response1.contentType();
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        boolean boolean17 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.headers();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test16489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16489");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        int int11 = response1.numRedirects;
        java.lang.String str12 = response1.contentType();
        java.lang.String str13 = response1.contentType;
        boolean boolean15 = response1.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        boolean boolean17 = response1.executed;
        org.jsoup.Connection.Method method18 = response1.method();
        java.lang.String str19 = response1.charset;
        response1.contentType = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test16490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16490");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        java.lang.String str8 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test16491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16491");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response1.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test16492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16492");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "");
        java.lang.String str10 = response1.contentType;
        org.jsoup.Connection.Response response12 = response1.removeCookie("hi!");
        java.lang.String str13 = response1.statusMessage;
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test16493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16493");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        response1.numRedirects = 0;
        boolean boolean12 = response1.executed;
        java.lang.String str13 = response1.charset;
        response1.charset = "hi!";
        java.lang.String str16 = response1.statusMessage;
        java.lang.String str17 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer19 = response18.byteData;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(byteBuffer19);
    }

    @Test
    public void test16494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16494");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        org.jsoup.Connection.Response response14 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.Connection.Response response18 = response1.removeCookie("hi!");
        org.jsoup.Connection.Method method19 = response1.method();
        java.net.URL uRL20 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = response1.hasHeader("");
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
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(uRL20);
    }

    @Test
    public void test16495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16495");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        java.lang.String str9 = response1.statusMessage;
        int int10 = response1.numRedirects;
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        response1.charset = "";
        response1.contentType = "";
        int int18 = response1.statusCode;
        java.lang.Class<?> wildcardClass19 = response1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test16496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16496");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Request request3 = null;
        response1.req = request3;
        boolean boolean6 = response1.hasHeader("hi!");
        response1.contentType = "";
        response1.numRedirects = (short) 1;
        java.lang.String str11 = response1.contentType;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test16497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16497");
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
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        java.lang.String str17 = response1.contentType();
        response1.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request21 = null;
        response20.req = request21;
        java.lang.String str24 = response20.cookie("hi!");
        response20.numRedirects = (byte) 10;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test16498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16498");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage;
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        java.lang.String str11 = response1.statusMessage();
        org.jsoup.Connection.Method method12 = response1.method();
        org.jsoup.Connection.Response response14 = response1.removeCookie("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test16499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16499");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        java.lang.String str5 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test16500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16500");
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
        java.lang.String str17 = response2.cookie("hi!");
        org.jsoup.Connection.Response response19 = response2.removeHeader("hi!");
        boolean boolean22 = response2.hasHeaderWithValue("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer23 = null;
        response2.byteData = byteBuffer23;
        response2.contentType = "hi!";
        java.net.URL uRL27 = response2.url();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = response2.headers();
        org.jsoup.Connection.Method method29 = response2.method();
        int int30 = response2.numRedirects;
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response2);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response32 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(uRL27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(method29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }
}

