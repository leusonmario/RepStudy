import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest40 {

    public static boolean debug = false;

    @Test
    public void test20001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20001");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        response1.charset = "";
        response1.statusCode = ' ';
        java.net.URL uRL14 = response1.url();
        java.lang.String str15 = response1.contentType();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test20002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20002");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        org.jsoup.Connection.Response response12 = response1.cookie("hi!", "hi!");
        org.jsoup.Connection.Request request13 = response1.req;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        org.jsoup.Connection.Response response16 = response1.removeCookie("hi!");
        response1.numRedirects = (short) 1;
        java.lang.Class<?> wildcardClass19 = response1.getClass();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test20003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20003");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.charset;
        org.jsoup.Connection.Request request5 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        java.lang.String str7 = response1.statusMessage;
        boolean boolean9 = response1.hasCookie("");
        java.lang.String str10 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(request5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test20004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20004");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        java.lang.String str3 = response1.contentType;
        response1.executed = false;
        org.jsoup.Connection.Response response7 = response1.removeCookie("");
        int int8 = response1.statusCode();
        boolean boolean9 = response1.executed;
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test20005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20005");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        boolean boolean10 = response1.hasCookie("hi!");
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        java.lang.String str13 = response1.charset;
        boolean boolean15 = response1.hasCookie("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test20006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20006");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        response1.statusMessage = "";
        java.lang.String str15 = response1.charset();
        boolean boolean16 = response1.executed;
        boolean boolean18 = response1.hasCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        java.lang.String str20 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test20007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20007");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        boolean boolean6 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        response1.statusCode = (short) 10;
        int int10 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test20008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20008");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        boolean boolean6 = response1.hasCookie("");
        int int7 = response1.statusCode;
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.contentType();
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test20009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20009");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        int int5 = response1.statusCode();
        java.net.URL uRL6 = response1.url();
        boolean boolean8 = response1.hasHeader("hi!");
        org.jsoup.Connection.Response response11 = response1.header("hi!", "");
        response1.statusMessage = "";
        boolean boolean15 = response1.hasHeader("hi!");
        org.jsoup.Connection.Method method16 = response1.method();
        java.lang.String str17 = response1.contentType();
        java.lang.String str19 = response1.getHeaderCaseInsensitive("");
        java.net.URL uRL20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response1.url(uRL20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test20010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20010");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        response1.charset = "";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.lang.String str15 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        java.lang.String str17 = response1.contentType;
        org.jsoup.Connection.Response response20 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method21 = response1.method();
        boolean boolean23 = response1.hasCookie("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test20011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20011");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response8 = response1.removeHeader("hi!");
        response1.contentType = "";
        int int11 = response1.numRedirects;
        java.lang.String str12 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        org.jsoup.Connection.Response response17 = response1.removeCookie("hi!");
        java.lang.String str18 = response1.charset();
        java.lang.String str19 = response1.contentType();
        boolean boolean21 = response1.hasCookie("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test20012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20012");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        boolean boolean6 = response1.hasCookie("");
        int int7 = response1.statusCode;
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.contentType();
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        java.lang.String str13 = response1.cookie("hi!");
        response1.statusMessage = "";
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str19 = response1.charset();
        java.lang.String str20 = response1.charset();
        java.nio.ByteBuffer byteBuffer21 = response1.byteData;
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(byteBuffer21);
    }

    @Test
    public void test20013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20013");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        response1.charset = "";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.lang.String str15 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        response1.numRedirects = 35;
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        org.jsoup.Connection.Request request21 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.headers();
        java.nio.ByteBuffer byteBuffer23 = response1.byteData;
        org.jsoup.Connection.Method method24 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry26 = response1.scanHeaders("hi!");
        java.lang.String str27 = response1.statusMessage();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertNull(request21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(byteBuffer23);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNull(strEntry26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test20014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20014");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        int int5 = response1.statusCode();
        java.lang.String str6 = response1.contentType;
        response1.statusMessage = "";
        java.lang.String str10 = response1.cookie("hi!");
        java.lang.String str12 = response1.cookie("hi!");
        java.lang.String str14 = response1.getHeaderCaseInsensitive("");
        int int15 = response1.numRedirects;
        java.lang.String str16 = response1.charset();
        int int17 = response1.statusCode;
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test20015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20015");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.lang.String str10 = response1.cookie("");
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.statusMessage();
        java.lang.String str14 = response1.cookie("");
        org.jsoup.Connection.Request request15 = response1.req;
        java.lang.String str17 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        response18.statusCode = 52;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test20016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20016");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str10 = response1.statusMessage();
        java.net.URL uRL11 = response1.url();
        org.jsoup.Connection.Method method12 = response1.method();
        boolean boolean14 = response1.hasCookie("hi!");
        org.jsoup.Connection.Response response16 = response1.removeCookie("");
        int int17 = response1.numRedirects;
        java.lang.String str18 = response1.charset();
        int int19 = response1.statusCode;
        java.lang.String str20 = response1.contentType;
        org.jsoup.Connection.Response response23 = response1.header("hi!", "");
        java.lang.String str25 = response1.header("");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test20017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20017");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        response1.charset = "";
        org.jsoup.Connection.Response response12 = response1.removeCookie("hi!");
        int int13 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.lang.String str15 = response1.statusMessage;
        boolean boolean17 = response1.hasCookie("hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test20018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20018");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        int int5 = response1.statusCode();
        org.jsoup.Connection.Response response8 = response1.header("hi!", "");
        org.jsoup.Connection.Request request9 = response1.req;
        java.lang.String str10 = response1.contentType();
        boolean boolean11 = response1.executed;
        java.lang.String str12 = response1.statusMessage;
        java.lang.String str13 = response1.statusMessage();
        response1.executed = true;
        java.lang.String str17 = response1.header("hi!");
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test20019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20019");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        java.lang.String str13 = response1.statusMessage;
        java.lang.String str15 = response1.header("hi!");
        response1.contentType = "";
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test20020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20020");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.charset;
        org.jsoup.Connection.Request request5 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        java.lang.String str7 = response1.statusMessage;
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("");
        org.jsoup.Connection.Response response14 = response1.cookie("hi!", "hi!");
        java.lang.String str15 = response1.contentType();
        response1.executed = true;
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(request5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test20021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20021");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.net.URL uRL12 = response1.url();
        response1.statusMessage = "";
        java.lang.String str15 = response1.contentType;
        response1.executed = false;
        int int18 = response1.statusCode();
        org.jsoup.Connection.Request request19 = response1.req;
        java.nio.ByteBuffer byteBuffer20 = response1.byteData;
        java.lang.String str21 = response1.charset;
        java.lang.String str22 = response1.charset;
        response1.statusCode = (byte) 100;
        org.jsoup.Connection.Request request25 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap26 = response1.cookies();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(request19);
        org.junit.Assert.assertNull(byteBuffer20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(request25);
        org.junit.Assert.assertNotNull(strMap26);
    }

    @Test
    public void test20022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20022");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "hi!");
        boolean boolean11 = response1.executed;
        java.lang.String str13 = response1.cookie("");
        java.lang.String str14 = response1.statusMessage;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test20023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20023");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        java.lang.String str15 = response1.header("hi!");
        boolean boolean17 = response1.hasHeader("hi!");
        response1.executed = false;
        response1.charset = "";
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test20024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20024");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = response2.req;
        java.lang.String str5 = response2.cookie("hi!");
        java.lang.String str6 = response2.charset();
        int int7 = response2.statusCode;
        java.nio.ByteBuffer byteBuffer8 = response2.byteData;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        response9.numRedirects = 'a';
        java.lang.String str12 = response9.charset();
        response9.charset = "hi!";
        java.lang.String str15 = response9.statusMessage();
        boolean boolean17 = response9.hasHeader("hi!");
        java.lang.String str19 = response9.header("");
        java.lang.String str20 = response9.charset;
        java.nio.ByteBuffer byteBuffer21 = response9.byteData;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response22 = org.jsoup.helper.HttpConnection.Response.execute(request0, response9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(byteBuffer21);
    }

    @Test
    public void test20025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20025");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test20026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20026");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        org.jsoup.Connection.Response response8 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method9 = response1.method();
        org.jsoup.Connection.Request request10 = response1.req;
        response1.statusMessage = "";
        org.jsoup.Connection.Response response14 = response1.removeHeader("hi!");
        java.lang.String str16 = response1.header("");
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        boolean boolean18 = response1.executed;
        org.jsoup.Connection.Response response21 = response1.header("hi!", "");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test20027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20027");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusMessage = "";
        org.jsoup.Connection.Method method8 = response1.method();
        int int9 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.lang.String str13 = response1.cookie("hi!");
        int int14 = response1.statusCode;
        int int15 = response1.statusCode;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test20028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20028");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.lang.String str16 = response1.getHeaderCaseInsensitive("hi!");
        java.net.URL uRL17 = response1.url();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean20 = response18.hasHeader("hi!");
        org.jsoup.Connection.Method method21 = response18.method();
        java.lang.String str22 = response18.charset();
        boolean boolean24 = response18.hasCookie("hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test20029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20029");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("");
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Request request10 = response1.req;
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(byteBuffer11);
    }

    @Test
    public void test20030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20030");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        response1.contentType = "hi!";
        response1.numRedirects = (short) 0;
        java.lang.String str17 = response1.statusMessage;
        org.jsoup.Connection.Response response20 = response1.cookie("hi!", "");
        response1.contentType = "";
        response1.numRedirects = '4';
        java.util.Map<java.lang.String, java.lang.String> strMap25 = response1.headers();
        java.nio.ByteBuffer byteBuffer26 = null;
        response1.byteData = byteBuffer26;
        java.lang.Class<?> wildcardClass28 = response1.getClass();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test20031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20031");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.charset;
        org.jsoup.Connection.Request request5 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        response1.numRedirects = (byte) 1;
        org.jsoup.Connection.Response response11 = response1.cookie("hi!", "hi!");
        org.jsoup.Connection.Request request12 = response1.req;
        java.lang.String str13 = response1.charset();
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.method(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(request5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test20032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20032");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        response1.charset = "";
        response1.numRedirects = (-1);
        response1.contentType = "hi!";
        java.net.URL uRL17 = response1.url();
        response1.statusCode = (byte) 10;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response1.scanHeaders("hi!");
        java.net.HttpURLConnection httpURLConnection22 = null;
        org.jsoup.Connection.Response response23 = null;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection22, response23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(strEntry21);
    }

    @Test
    public void test20033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20033");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        java.lang.String str6 = response1.charset;
        response1.statusMessage = "";
        org.jsoup.Connection.Response response10 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        java.lang.String str14 = response1.cookie("hi!");
        boolean boolean15 = response1.executed;
        int int16 = response1.statusCode();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test20034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20034");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        java.lang.String str7 = response1.cookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.lang.String str9 = response1.statusMessage;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test20035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20035");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = response2.req;
        int int4 = response2.statusCode;
        response2.executed = false;
        response2.statusMessage = "hi!";
        org.jsoup.Connection.Response response10 = response2.removeCookie("");
        response2.charset = "";
        org.jsoup.Connection.Request request13 = null;
        response2.req = request13;
        response2.statusCode = ' ';
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response2.cookies();
        java.nio.ByteBuffer byteBuffer18 = response2.byteData;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str20 = response2.statusMessage();
        java.net.URL uRL21 = response2.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response22 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(byteBuffer18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(uRL21);
    }

    @Test
    public void test20036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20036");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Response response6 = response1.removeCookie("");
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        org.jsoup.Connection.Request request9 = response1.req;
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        int int12 = response1.statusCode();
        java.lang.String str13 = response1.contentType;
        response1.executed = true;
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test20037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20037");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        int int11 = response1.statusCode;
        java.net.URL uRL12 = response1.url();
        java.lang.String str13 = response1.contentType;
        int int14 = response1.numRedirects;
        response1.executed = false;
        java.net.URL uRL17 = response1.url();
        response1.statusCode = (short) 1;
        response1.statusMessage = "hi!";
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test20038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20038");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        java.lang.String str16 = response1.statusMessage();
        response1.executed = true;
        response1.contentType = "";
        org.jsoup.Connection.Request request21 = null;
        response1.req = request21;
        response1.contentType = "hi!";
        java.lang.String str26 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Request request27 = response1.req;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(request27);
    }

    @Test
    public void test20039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20039");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.net.URL uRL7 = response1.url();
        response1.numRedirects = '4';
        java.lang.String str11 = response1.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test20040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20040");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        response1.charset = "";
        response1.contentType = "";
        response1.charset = "hi!";
        response1.executed = true;
        boolean boolean19 = response1.hasHeader("hi!");
        int int20 = response1.statusCode;
        org.jsoup.Connection.Request request21 = null;
        response1.req = request21;
        java.lang.String str23 = response1.statusMessage();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test20041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20041");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        java.lang.String str11 = response1.contentType;
        response1.contentType = "hi!";
        int int14 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        boolean boolean16 = response1.executed;
        java.lang.String str17 = response1.contentType;
        response1.numRedirects = (-1);
        org.jsoup.Connection.Response response21 = response1.removeCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        int int23 = response1.statusCode;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test20042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20042");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        boolean boolean10 = response1.hasCookie("hi!");
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        response1.numRedirects = '#';
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        response1.numRedirects = (byte) -1;
        response1.statusMessage = "";
        boolean boolean21 = response1.hasCookie("hi!");
        response1.charset = "";
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test20043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20043");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        java.lang.String str12 = response1.header("");
        int int13 = response1.numRedirects;
        java.lang.String str15 = response1.getHeaderCaseInsensitive("hi!");
        response1.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str19 = response1.contentType();
        response1.contentType = "hi!";
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test20044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20044");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        java.net.URL uRL15 = response1.url();
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        java.lang.Class<?> wildcardClass18 = response1.getClass();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test20045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20045");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.net.URL uRL7 = response1.url();
        boolean boolean9 = response1.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int11 = response1.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test20046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20046");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response10.headers();
        response10.contentType = "";
        boolean boolean15 = response10.hasCookie("hi!");
        org.jsoup.Connection.Request request16 = null;
        response10.req = request16;
        org.jsoup.Connection.Request request18 = response10.req;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response10.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(request18);
    }

    @Test
    public void test20047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20047");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.contentType;
        java.lang.String str8 = response1.charset();
        java.lang.String str9 = response1.contentType;
        java.net.URL uRL10 = response1.url();
        int int11 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        java.lang.String str14 = response1.statusMessage();
        java.lang.String str16 = response1.header("");
        java.lang.String str17 = response1.statusMessage();
        java.lang.String str18 = response1.contentType;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test20048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20048");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        java.lang.String str7 = response1.getHeaderCaseInsensitive("");
        boolean boolean9 = response1.hasCookie("hi!");
        int int10 = response1.statusCode;
        boolean boolean11 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str13 = response12.charset;
        org.jsoup.Connection.Request request14 = null;
        response12.req = request14;
        java.lang.String str17 = response12.cookie("hi!");
        int int18 = response12.statusCode();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test20049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20049");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        java.lang.String str4 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        org.jsoup.Connection.Request request7 = response1.req;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("");
        response1.charset = "hi!";
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        java.lang.String str14 = response1.statusMessage();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test20050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20050");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        int int11 = response1.statusCode;
        java.net.URL uRL12 = response1.url();
        java.lang.String str13 = response1.contentType;
        int int14 = response1.numRedirects;
        int int15 = response1.statusCode;
        response1.charset = "hi!";
        java.lang.String str18 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response1.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test20051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20051");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        java.lang.String str11 = response1.statusMessage;
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response1.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test20052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20052");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        java.lang.String str15 = response1.header("hi!");
        boolean boolean17 = response1.hasHeader("hi!");
        java.lang.String str18 = response1.charset();
        boolean boolean20 = response1.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str22 = response1.statusMessage;
        org.jsoup.Connection.Response response24 = response1.removeCookie("hi!");
        java.lang.String str25 = response1.contentType();
        response1.numRedirects = (byte) 10;
        java.util.Map<java.lang.String, java.lang.String> strMap28 = response1.cookies();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(strMap28);
    }

    @Test
    public void test20053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20053");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = response2.req;
        java.lang.String str5 = response2.cookie("hi!");
        java.lang.String str6 = response2.charset();
        response2.statusMessage = "";
        response2.statusMessage = "";
        org.jsoup.Connection.Response response12 = response2.removeCookie("");
        org.jsoup.Connection.Request request13 = response2.req;
        boolean boolean14 = response2.executed;
        org.jsoup.Connection.Response response17 = response2.cookie("hi!", "hi!");
        boolean boolean19 = response2.hasCookie("");
        java.lang.String str20 = response2.charset();
        java.lang.String str22 = response2.header("");
        org.jsoup.Connection.Method method23 = response2.method();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response2);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response25 = org.jsoup.helper.HttpConnection.Response.execute(request0, response24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(method23);
    }

    @Test
    public void test20054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20054");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        int int12 = response1.statusCode;
        java.lang.String str13 = response1.contentType();
        org.jsoup.Connection.Response response16 = response1.cookie("hi!", "");
        org.jsoup.Connection.Method method17 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.headers();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test20055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20055");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        java.lang.String str15 = response1.header("hi!");
        boolean boolean17 = response1.hasHeader("hi!");
        java.lang.String str18 = response1.charset();
        boolean boolean20 = response1.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str22 = response1.statusMessage;
        org.jsoup.Connection.Request request23 = null;
        response1.req = request23;
        org.jsoup.Connection.Response response27 = response1.cookie("hi!", "");
        org.jsoup.Connection.Response response30 = response1.header("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry32 = response1.scanHeaders("");
        java.lang.String str33 = response1.contentType;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertNull(strEntry32);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test20056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20056");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str12 = response1.header("");
        java.lang.String str13 = response1.charset;
        response1.charset = "";
        java.lang.String str17 = response1.header("");
        java.lang.String str18 = response1.contentType();
        response1.executed = false;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test20057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20057");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.Connection.Method method5 = response1.method();
        response1.contentType = "";
        java.lang.String str8 = response1.contentType;
        org.jsoup.Connection.Response response10 = response1.removeHeader("hi!");
        java.lang.String str11 = response1.charset;
        java.lang.String str12 = response1.statusMessage();
        java.lang.String str13 = response1.charset();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test20058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20058");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        org.jsoup.Connection.Response response14 = response1.header("hi!", "");
        java.lang.String str16 = response1.header("");
        org.jsoup.Connection.Response response18 = response1.removeCookie("");
        response1.executed = true;
        org.jsoup.Connection.Response response23 = response1.cookie("hi!", "");
        org.jsoup.Connection.Request request24 = null;
        response1.req = request24;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test20059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20059");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        response10.statusMessage = "hi!";
        java.lang.String str13 = response10.statusMessage;
        java.nio.ByteBuffer byteBuffer14 = null;
        response10.byteData = byteBuffer14;
        int int16 = response10.numRedirects;
        response10.executed = true;
        org.jsoup.Connection.Response response21 = response10.cookie("hi!", "");
        response10.statusMessage = "";
        java.lang.String str24 = response10.charset;
        org.jsoup.Connection.Request request25 = null;
        response10.req = request25;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test20060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20060");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        response1.statusCode = 1;
        java.lang.String str14 = response1.header("");
        java.lang.String str15 = response1.statusMessage;
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        org.jsoup.Connection.Method method18 = response1.method();
        int int19 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer20 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response1.headers();
        int int22 = response1.statusCode();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(byteBuffer20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test20061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20061");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        boolean boolean10 = response1.hasCookie("hi!");
        boolean boolean12 = response1.hasCookie("hi!");
        org.jsoup.Connection.Response response15 = response1.header("hi!", "hi!");
        java.lang.String str16 = response1.charset;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test20062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20062");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        org.jsoup.Connection.Response response6 = response1.removeCookie("");
        response1.statusCode = 100;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        java.net.URL uRL10 = response1.url();
        org.jsoup.Connection.Response response13 = response1.cookie("hi!", "hi!");
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test20063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20063");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        response1.statusMessage = "";
        java.lang.String str15 = response1.charset();
        response1.executed = true;
        boolean boolean19 = response1.hasCookie("");
        java.lang.String str20 = response1.contentType;
        java.lang.String str21 = response1.statusMessage;
        response1.contentType = "hi!";
        java.lang.String str24 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry26 = response1.scanHeaders("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(strEntry26);
    }

    @Test
    public void test20064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20064");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        java.lang.String str15 = response1.cookie("");
        org.jsoup.Connection.Response response17 = response1.removeCookie("hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test20065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20065");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.charset;
        response1.numRedirects = (byte) -1;
        response1.executed = true;
        int int9 = response1.statusCode();
        java.lang.String str10 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        boolean boolean13 = response1.hasCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        org.jsoup.Connection.Response response16 = response1.removeHeader("hi!");
        java.lang.String str17 = response1.contentType;
        int int18 = response1.statusCode;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test20066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20066");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.numRedirects = (byte) 1;
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        response1.statusMessage = "";
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test20067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20067");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str12 = response1.header("");
        int int13 = response1.numRedirects;
        int int14 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer15 = null;
        response1.byteData = byteBuffer15;
        org.jsoup.Connection.Response response19 = response1.header("hi!", "hi!");
        java.lang.Class<?> wildcardClass20 = response1.getClass();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test20068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20068");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        response1.charset = "";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.lang.String str15 = response1.contentType;
        java.lang.String str17 = response1.cookie("");
        java.lang.String str18 = response1.charset();
        org.jsoup.Connection.Method method19 = response1.method();
        boolean boolean20 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test20069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20069");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.statusMessage();
        java.lang.String str14 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        java.net.URL uRL16 = response1.url();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer19 = response1.byteData;
        response1.contentType = "hi!";
        boolean boolean23 = response1.hasCookie("");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test20070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20070");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        response1.statusMessage = "";
        java.lang.String str15 = response1.charset();
        java.lang.String str16 = response1.contentType();
        java.lang.String str18 = response1.cookie("hi!");
        java.lang.String str20 = response1.getHeaderCaseInsensitive("");
        int int21 = response1.statusCode;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test20071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20071");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.Connection.Response response10 = response1.removeCookie("");
        int int11 = response1.numRedirects;
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.lang.String str14 = response1.contentType;
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        org.jsoup.Connection.Response response19 = response1.header("hi!", "");
        java.net.HttpURLConnection httpURLConnection20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = null;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response21);
        response22.statusMessage = "";
        org.jsoup.Connection.Method method25 = response22.method();
        java.nio.ByteBuffer byteBuffer26 = null;
        response22.byteData = byteBuffer26;
        java.lang.String str29 = response22.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry31 = response22.scanHeaders("");
        java.lang.String str32 = response22.charset();
        org.jsoup.Connection.Request request33 = response22.req;
        java.lang.String str34 = response22.charset();
        boolean boolean36 = response22.hasCookie("");
        response22.executed = false;
        java.nio.ByteBuffer byteBuffer39 = response22.byteData;
        int int40 = response22.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection20, (org.jsoup.Connection.Response) response22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(strEntry31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(request33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(byteBuffer39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test20072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20072");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusCode = (byte) 100;
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.charset();
        response1.executed = true;
        org.jsoup.Connection.Response response14 = response1.cookie("hi!", "");
        response1.executed = true;
        int int17 = response1.statusCode;
        boolean boolean18 = response1.executed;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test20073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20073");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean6 = response1.hasCookie("");
        java.lang.String str7 = response1.contentType();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test20074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20074");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.net.URL uRL7 = response1.url();
        int int8 = response1.numRedirects;
        response1.statusCode = 10;
        response1.statusMessage = "";
        response1.statusCode = 97;
        java.net.URL uRL15 = response1.url();
        response1.executed = false;
        java.net.URL uRL18 = response1.url();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(uRL18);
    }

    @Test
    public void test20075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20075");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response5.headers();
        java.lang.String str7 = response5.contentType;
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test20076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20076");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.contentType();
        boolean boolean5 = response1.hasHeader("hi!");
        org.jsoup.Connection.Method method6 = response1.method();
        int int7 = response1.numRedirects;
        java.lang.String str8 = response1.contentType();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test20077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20077");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        java.lang.String str6 = response1.charset;
        java.lang.String str7 = response1.statusMessage();
        boolean boolean9 = response1.hasCookie("hi!");
        response1.charset = "hi!";
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        org.jsoup.Connection.Response response15 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(strEntry17);
    }

    @Test
    public void test20078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20078");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = response2.req;
        int int4 = response2.statusCode;
        int int5 = response2.statusCode;
        boolean boolean7 = response2.hasCookie("hi!");
        boolean boolean9 = response2.hasCookie("hi!");
        java.lang.String str10 = response2.contentType;
        java.lang.String str11 = response2.statusMessage;
        java.lang.String str13 = response2.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test20079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20079");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Response response8 = response1.header("hi!", "");
        boolean boolean10 = response1.hasHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        response1.charset = "";
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test20080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20080");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        java.lang.String str13 = response1.contentType();
        int int14 = response1.statusCode();
        int int15 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test20081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20081");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        response1.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("");
        response1.statusCode = 0;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response22 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response25 = response1.cookie("hi!", "hi!");
        int int26 = response1.statusCode();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNull(strEntry20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test20082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20082");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.contentType();
        boolean boolean5 = response1.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.charset = "";
        response1.contentType = "hi!";
        boolean boolean12 = response1.hasHeader("hi!");
        response1.contentType = "hi!";
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test20083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20083");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusCode = (byte) 100;
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        java.lang.String str10 = response1.contentType();
        boolean boolean11 = response1.executed;
        org.jsoup.Connection.Method method12 = response1.method();
        response1.executed = true;
        int int15 = response1.statusCode;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test20084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20084");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusCode = (byte) 100;
        org.jsoup.Connection.Request request8 = response1.req;
        response1.contentType = "";
        response1.statusMessage = "";
        response1.statusCode = 32;
        org.jsoup.Connection.Method method15 = response1.method();
        response1.statusMessage = "";
        boolean boolean18 = response1.executed;
        response1.charset = "hi!";
        java.lang.String str22 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str23 = response1.charset();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test20085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20085");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        int int4 = response1.statusCode;
        response1.executed = false;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        java.lang.String str8 = response1.statusMessage();
        boolean boolean10 = response1.hasCookie("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test20086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20086");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        java.lang.String str13 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        response1.statusCode = (byte) 0;
        java.net.URL uRL17 = response1.url();
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(byteBuffer18);
    }

    @Test
    public void test20087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20087");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        response1.executed = false;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        response1.statusMessage = "hi!";
        java.lang.String str18 = response1.contentType();
        java.lang.String str19 = response1.charset();
        int int20 = response1.numRedirects;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test20088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20088");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str11 = response1.charset();
        java.lang.String str12 = response1.charset;
        org.jsoup.Connection.Response response14 = response1.removeCookie("hi!");
        int int15 = response1.numRedirects;
        java.lang.String str16 = response1.contentType;
        response1.statusMessage = "";
        java.lang.String str19 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response1.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(strEntry21);
    }

    @Test
    public void test20089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20089");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        response1.statusMessage = "";
        java.lang.String str15 = response1.charset();
        java.lang.String str16 = response1.contentType();
        boolean boolean18 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        java.lang.String str20 = response1.charset();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test20090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20090");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusMessage = "";
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "hi!";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(strEntry15);
    }

    @Test
    public void test20091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20091");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        int int4 = response1.numRedirects;
        java.lang.String str6 = response1.header("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("");
        response1.charset = "";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(strEntry9);
    }

    @Test
    public void test20092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20092");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        java.lang.String str3 = response1.contentType;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean7 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        java.lang.String str9 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        java.lang.String str13 = response1.contentType;
        int int14 = response1.statusCode;
        java.lang.String str16 = response1.header("hi!");
        org.jsoup.Connection.Request request17 = response1.req;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(request17);
    }

    @Test
    public void test20093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20093");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        org.jsoup.Connection.Method method5 = response2.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response2.byteData = byteBuffer6;
        org.jsoup.Connection.Request request8 = null;
        response2.req = request8;
        java.net.URL uRL10 = response2.url();
        org.jsoup.Connection.Response response12 = response2.removeCookie("");
        java.lang.String str13 = response2.charset();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusCode = (byte) 1;
        boolean boolean17 = response2.executed;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test20094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20094");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        int int11 = response1.statusCode;
        java.net.URL uRL12 = response1.url();
        java.lang.String str13 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        java.lang.String str15 = response1.statusMessage();
        java.lang.String str17 = response1.header("hi!");
        org.jsoup.Connection.Request request18 = response1.req;
        java.lang.String str19 = response1.charset;
        java.lang.String str20 = response1.statusMessage();
        java.lang.String str21 = response1.contentType();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(request18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test20095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20095");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        response1.charset = "";
        response1.contentType = "";
        response1.charset = "hi!";
        int int16 = response1.numRedirects;
        response1.contentType = "";
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test20096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20096");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        response1.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("");
        response1.statusCode = 0;
        org.jsoup.Connection.Method method19 = response1.method();
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        org.jsoup.Connection.Method method22 = response1.method();
        org.jsoup.Connection.Request request23 = response1.req;
        java.lang.String str24 = response1.statusMessage;
        boolean boolean25 = response1.executed;
        java.net.HttpURLConnection httpURLConnection26 = null;
        org.jsoup.Connection.Response response27 = null;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection26, response27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(request23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test20097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20097");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.contentType();
        boolean boolean5 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("");
        int int10 = response1.numRedirects;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test20098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20098");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        org.jsoup.Connection.Response response18 = response1.cookie("hi!", "");
        java.lang.String str19 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test20099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20099");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        java.lang.String str7 = response1.statusMessage;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str11 = response1.header("hi!");
        response1.statusMessage = "";
        java.lang.String str14 = response1.charset;
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        response1.charset = "hi!";
        java.lang.String str20 = response1.statusMessage;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test20100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20100");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        int int4 = response1.statusCode;
        response1.executed = false;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        response1.statusCode = 100;
        boolean boolean11 = response1.hasCookie("hi!");
        org.jsoup.Connection.Method method12 = response1.method();
        java.lang.String str13 = response1.statusMessage;
        java.lang.String str14 = response1.charset;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test20101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20101");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        org.jsoup.Connection.Response response7 = response1.removeCookie("");
        java.lang.String str9 = response1.header("hi!");
        boolean boolean11 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        java.lang.String str14 = response1.getHeaderCaseInsensitive("");
        int int15 = response1.statusCode;
        java.lang.String str16 = response1.contentType;
        java.net.URL uRL17 = response1.url();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test20102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20102");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.statusMessage();
        java.net.URL uRL14 = response1.url();
        java.lang.String str15 = response1.charset;
        java.net.URL uRL16 = response1.url();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str18 = response17.statusMessage;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test20103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20103");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        response1.statusCode = '#';
        response1.statusCode = (short) 1;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str13 = response12.contentType();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test20104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20104");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusMessage = "";
        response1.statusMessage = "";
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        org.jsoup.Connection.Request request12 = response1.req;
        org.jsoup.Connection.Response response15 = response1.header("hi!", "hi!");
        java.lang.String str17 = response1.cookie("");
        java.lang.String str18 = response1.charset();
        java.nio.ByteBuffer byteBuffer19 = response1.byteData;
        boolean boolean20 = response1.executed;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test20105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20105");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        response1.contentType = "hi!";
        boolean boolean15 = response1.executed;
        response1.executed = true;
        int int18 = response1.statusCode;
        java.net.URL uRL19 = response1.url();
        response1.statusCode = (byte) 0;
        java.lang.String str22 = response1.charset();
        int int23 = response1.statusCode;
        boolean boolean24 = response1.executed;
        java.lang.String str25 = response1.statusMessage();
        response1.statusCode = (byte) 0;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry29 = response1.scanHeaders("");
        java.lang.String str30 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap31 = response1.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap32 = response1.cookies();
        java.net.URL uRL33 = response1.url();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(strEntry29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(uRL33);
    }

    @Test
    public void test20106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20106");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.net.URL uRL7 = response1.url();
        boolean boolean9 = response1.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer12 = response11.byteData;
        java.lang.String str13 = response11.statusMessage;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test20107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20107");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        boolean boolean6 = response1.hasHeader("hi!");
        java.lang.String str7 = response1.contentType;
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.charset;
        java.lang.String str10 = response1.statusMessage;
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test20108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20108");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        boolean boolean6 = response1.hasCookie("");
        response1.executed = true;
        int int9 = response1.statusCode();
        java.lang.String str10 = response1.charset();
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.statusMessage;
        java.lang.String str13 = response1.statusMessage;
        java.lang.String str14 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test20109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20109");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.lang.String str16 = response1.getHeaderCaseInsensitive("hi!");
        java.net.URL uRL17 = response1.url();
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test20110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20110");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        java.lang.String str7 = response1.cookie("");
        java.lang.String str9 = response1.cookie("hi!");
        org.jsoup.Connection.Response response12 = response1.cookie("hi!", "");
        boolean boolean14 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response15.scanHeaders("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(strEntry17);
    }

    @Test
    public void test20111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20111");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        int int11 = response1.statusCode;
        java.net.URL uRL12 = response1.url();
        java.lang.String str13 = response1.contentType;
        int int14 = response1.numRedirects;
        int int15 = response1.statusCode;
        org.jsoup.Connection.Request request16 = response1.req;
        int int17 = response1.numRedirects;
        java.lang.String str18 = response1.contentType;
        java.lang.String str19 = response1.statusMessage();
        java.lang.String str21 = response1.header("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test20112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20112");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.lang.String str9 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        response1.numRedirects = (short) 0;
        response1.contentType = "";
        int int16 = response1.statusCode();
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        org.jsoup.Connection.Response response21 = response1.cookie("hi!", "hi!");
        java.lang.String str23 = response1.header("");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test20113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20113");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        org.jsoup.Connection.Method method5 = response2.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response2.byteData = byteBuffer6;
        boolean boolean9 = response2.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer10 = response2.byteData;
        java.lang.String str12 = response2.cookie("");
        java.lang.String str13 = response2.charset;
        java.lang.String str14 = response2.statusMessage();
        java.net.URL uRL15 = response2.url();
        java.lang.String str16 = response2.charset;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str19 = response2.cookie("hi!");
        response2.numRedirects = (byte) -1;
        java.lang.String str22 = response2.contentType;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response23 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test20114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20114");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.lang.String str9 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        response1.charset = "hi!";
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        int int14 = response1.numRedirects;
        org.jsoup.Connection.Request request15 = response1.req;
        java.lang.String str16 = response1.contentType;
        java.lang.String str17 = response1.statusMessage();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test20115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20115");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        response1.statusCode = (byte) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request13 = response1.req;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        java.lang.String str17 = response1.charset;
        java.lang.String str18 = response1.contentType();
        java.lang.String str19 = response1.charset;
        java.lang.String str21 = response1.getHeaderCaseInsensitive("hi!");
        response1.numRedirects = 97;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test20116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20116");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        org.jsoup.Connection.Response response11 = response1.cookie("hi!", "hi!");
        response1.numRedirects = (short) 10;
        java.lang.String str14 = response1.statusMessage();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test20117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20117");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.lang.String str9 = response1.contentType();
        boolean boolean10 = response1.executed;
        org.jsoup.Connection.Response response12 = response1.removeCookie("");
        org.jsoup.Connection.Request request13 = response1.req;
        java.lang.String str14 = response1.contentType();
        java.lang.String str16 = response1.cookie("");
        int int17 = response1.numRedirects;
        org.jsoup.Connection.Response response20 = response1.header("hi!", "hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test20118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20118");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str11 = response1.contentType();
        org.jsoup.Connection.Response response13 = response1.removeCookie("hi!");
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        response1.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean19 = response18.executed;
        response18.contentType = "hi!";
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test20119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20119");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        response1.statusMessage = "";
        boolean boolean8 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str10 = response9.contentType;
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test20120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20120");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        int int4 = response1.statusCode;
        boolean boolean6 = response1.hasCookie("hi!");
        boolean boolean8 = response1.hasCookie("hi!");
        boolean boolean10 = response1.hasCookie("hi!");
        java.net.URL uRL11 = response1.url();
        java.net.URL uRL12 = response1.url();
        response1.statusCode = 0;
        int int15 = response1.statusCode();
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        response1.statusMessage = "";
        org.jsoup.Connection.Response response23 = response1.cookie("hi!", "");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(byteBuffer18);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test20121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20121");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.contentType;
        java.lang.String str8 = response1.charset();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str12 = response11.contentType;
        response11.charset = "";
        java.lang.String str15 = response11.charset;
        response11.statusMessage = "hi!";
        java.lang.String str18 = response11.statusMessage;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test20122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20122");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        response1.contentType = "hi!";
        java.lang.String str10 = response1.charset();
        java.lang.String str11 = response1.charset;
        response1.executed = false;
        int int14 = response1.statusCode;
        boolean boolean16 = response1.hasCookie("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test20123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20123");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.charset;
        java.lang.String str5 = response1.statusMessage;
        response1.statusCode = (byte) 10;
        org.jsoup.Connection.Method method8 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method8);
    }

    @Test
    public void test20124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20124");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        java.net.URL uRL11 = response1.url();
        java.lang.Class<?> wildcardClass12 = response1.getClass();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test20125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20125");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        int int5 = response1.statusCode();
        java.lang.String str6 = response1.contentType();
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        response1.charset = "";
        response1.statusCode = (byte) -1;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response13.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test20126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20126");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        org.jsoup.Connection.Method method11 = response1.method();
        int int12 = response1.statusCode();
        int int13 = response1.statusCode();
        response1.executed = false;
        java.lang.String str16 = response1.charset();
        org.jsoup.Connection.Response response18 = response1.removeCookie("hi!");
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test20127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20127");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        response1.statusCode = (byte) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        org.jsoup.Connection.Request request11 = response1.req;
        org.jsoup.Connection.Request request12 = response1.req;
        java.lang.String str13 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        int int15 = response1.numRedirects;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test20128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20128");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        response1.charset = "";
        org.jsoup.Connection.Response response12 = response1.removeCookie("hi!");
        int int13 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        org.jsoup.Connection.Method method16 = response1.method();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test20129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20129");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Response response8 = response1.header("hi!", "");
        boolean boolean10 = response1.hasHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        java.nio.ByteBuffer byteBuffer15 = null;
        response1.byteData = byteBuffer15;
        java.lang.String str17 = response1.statusMessage();
        response1.statusCode = 0;
        response1.numRedirects = '4';
        java.lang.String str23 = response1.header("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test20130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20130");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        boolean boolean6 = response1.hasCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        response1.numRedirects = (byte) -1;
        boolean boolean13 = response1.hasHeader("hi!");
        java.lang.String str15 = response1.cookie("");
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        java.lang.String str18 = response1.statusMessage();
        boolean boolean20 = response1.hasCookie("hi!");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test20131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20131");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        response1.charset = "";
        java.net.URL uRL11 = response1.url();
        response1.charset = "hi!";
        response1.executed = false;
        response1.numRedirects = (byte) 10;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        response1.executed = false;
        response1.charset = "";
        boolean boolean25 = response1.hasCookie("hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test20132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20132");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.contentType();
        boolean boolean5 = response1.hasHeader("hi!");
        org.jsoup.Connection.Method method6 = response1.method();
        response1.statusMessage = "";
        response1.statusCode = ' ';
        java.lang.String str11 = response1.charset;
        response1.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = response14.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test20133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20133");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        java.lang.String str16 = response1.statusMessage();
        response1.executed = true;
        response1.contentType = "";
        org.jsoup.Connection.Method method21 = response1.method();
        response1.statusCode = '#';
        java.nio.ByteBuffer byteBuffer24 = null;
        response1.byteData = byteBuffer24;
        response1.statusMessage = "hi!";
        java.nio.ByteBuffer byteBuffer28 = response1.byteData;
        org.jsoup.Connection.Request request29 = response1.req;
        org.jsoup.Connection.Response response31 = response1.removeCookie("");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(byteBuffer28);
        org.junit.Assert.assertNull(request29);
        org.junit.Assert.assertNotNull(response31);
    }

    @Test
    public void test20134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20134");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str11 = response1.charset();
        java.lang.String str12 = response1.charset;
        org.jsoup.Connection.Response response14 = response1.removeCookie("hi!");
        int int15 = response1.numRedirects;
        java.lang.String str16 = response1.contentType;
        response1.statusMessage = "";
        java.lang.String str19 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response1.scanHeaders("");
        response1.charset = "hi!";
        java.nio.ByteBuffer byteBuffer24 = null;
        response1.byteData = byteBuffer24;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(strEntry21);
    }

    @Test
    public void test20135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20135");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.statusMessage();
        java.lang.String str15 = response1.cookie("hi!");
        java.lang.String str16 = response1.charset();
        org.jsoup.Connection.Response response18 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response20 = response1.removeCookie("");
        java.lang.String str22 = response1.cookie("");
        java.lang.String str23 = response1.contentType();
        response1.numRedirects = 32;
        org.jsoup.Connection.Request request26 = response1.req;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(request26);
    }

    @Test
    public void test20136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20136");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        java.lang.String str3 = response1.contentType;
        java.nio.ByteBuffer byteBuffer4 = response1.byteData;
        int int5 = response1.numRedirects;
        java.lang.String str6 = response1.contentType();
        java.net.HttpURLConnection httpURLConnection7 = null;
        org.jsoup.Connection.Response response8 = null;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection7, response8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test20137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20137");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.net.URL uRL12 = response1.url();
        response1.statusMessage = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("");
        response1.statusCode = '4';
        java.lang.String str19 = response1.contentType;
        org.jsoup.Connection.Request request20 = response1.req;
        java.lang.String str21 = response1.statusMessage;
        boolean boolean23 = response1.hasHeader("hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test20138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20138");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.statusMessage();
        java.net.URL uRL14 = response1.url();
        java.lang.String str16 = response1.cookie("");
        int int17 = response1.numRedirects;
        java.lang.String str18 = response1.charset;
        java.net.HttpURLConnection httpURLConnection19 = null;
        org.jsoup.helper.HttpConnection.Response response20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        response21.statusMessage = "";
        java.net.URL uRL24 = response21.url();
        int int25 = response21.statusCode();
        org.jsoup.Connection.Response response28 = response21.header("hi!", "");
        org.jsoup.Connection.Request request29 = response21.req;
        java.lang.String str30 = response21.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap31 = response21.cookies();
        org.jsoup.Connection.Response response34 = response21.header("hi!", "");
        java.lang.String str35 = response21.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap36 = response21.headers();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection19, (org.jsoup.Connection.Response) response21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNull(request29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(strMap36);
    }

    @Test
    public void test20139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20139");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        response8.numRedirects = 'a';
        java.lang.String str11 = response8.charset();
        response8.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response8.headers();
        response8.numRedirects = (short) 100;
        java.lang.String str18 = response8.header("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test20140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20140");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.statusMessage = "";
        org.jsoup.Connection.Method method13 = response1.method();
        java.lang.String str15 = response1.getHeaderCaseInsensitive("");
        java.lang.String str16 = response1.contentType();
        java.lang.String str17 = response1.charset;
        java.lang.String str18 = response1.statusMessage();
        response1.numRedirects = 52;
        response1.contentType = "";
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test20141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20141");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.charset;
        response1.numRedirects = (byte) -1;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        org.jsoup.Connection.Response response10 = response1.removeCookie("");
        java.net.URL uRL11 = response1.url();
        java.net.URL uRL12 = response1.url();
        java.lang.String str14 = response1.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test20142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20142");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        response1.statusMessage = "";
        response1.numRedirects = (byte) 100;
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        org.jsoup.Connection.Response response12 = response1.removeCookie("");
        response1.statusCode = 1;
        int int15 = response1.numRedirects;
        boolean boolean17 = response1.hasCookie("");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test20143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20143");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str5 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method6 = response1.method();
        int int7 = response1.numRedirects;
        response1.numRedirects = 1;
        java.lang.String str10 = response1.statusMessage;
        java.lang.String str11 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test20144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20144");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        response1.statusCode = 1;
        java.lang.String str14 = response1.header("");
        java.net.HttpURLConnection httpURLConnection15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        response17.statusMessage = "";
        org.jsoup.Connection.Method method20 = response17.method();
        org.jsoup.Connection.Method method21 = response17.method();
        org.jsoup.Connection.Response response23 = response17.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection15, (org.jsoup.Connection.Response) response17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test20145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20145");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        int int4 = response1.numRedirects;
        java.lang.String str6 = response1.header("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response12 = response1.header("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("hi!");
        java.lang.String str16 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str17 = response1.statusMessage();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(strEntry14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test20146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20146");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        org.jsoup.Connection.Response response10 = response1.removeCookie("");
        response1.charset = "hi!";
        java.lang.String str13 = response1.statusMessage();
        int int14 = response1.statusCode();
        org.jsoup.Connection.Response response16 = response1.removeHeader("hi!");
        response1.statusCode = '4';
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test20147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20147");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        boolean boolean12 = response1.hasHeader("hi!");
        org.jsoup.Connection.Method method13 = response1.method();
        org.jsoup.Connection.Request request14 = response1.req;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(request14);
    }

    @Test
    public void test20148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20148");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        org.jsoup.Connection.Method method15 = response1.method();
        response1.statusCode = (short) 100;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test20149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20149");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        java.lang.String str9 = response1.cookie("");
        org.jsoup.Connection.Method method10 = response1.method();
        int int11 = response1.statusCode();
        java.lang.String str12 = response1.statusMessage;
        int int13 = response1.numRedirects;
        org.jsoup.Connection.Request request14 = response1.req;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int16 = response1.statusCode;
        java.lang.String str18 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        int int20 = response1.numRedirects;
        org.jsoup.Connection.Response response23 = response1.header("hi!", "");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test20150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20150");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        org.jsoup.Connection.Request request4 = response1.req;
        boolean boolean6 = response1.hasCookie("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = strEntry8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(request4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strEntry8);
    }

    @Test
    public void test20151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20151");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        org.jsoup.Connection.Response response14 = response1.header("hi!", "");
        java.lang.String str16 = response1.header("");
        org.jsoup.Connection.Response response18 = response1.removeCookie("");
        response1.executed = false;
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response1.cookies();
        org.jsoup.Connection.Method method22 = response1.method();
        int int23 = response1.numRedirects;
        int int24 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap25 = response1.headers();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(strMap25);
    }

    @Test
    public void test20152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20152");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str14 = response1.cookie("");
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        java.lang.String str16 = response1.contentType;
        int int17 = response1.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.headers();
        int int20 = response1.statusCode();
        response1.executed = false;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test20153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20153");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        int int12 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        java.net.URL uRL16 = response1.url();
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        java.lang.String str20 = response1.getHeaderCaseInsensitive("");
        java.lang.String str21 = response1.charset;
        int int22 = response1.numRedirects;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test20154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20154");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        boolean boolean15 = response1.executed;
        java.lang.String str17 = response1.getHeaderCaseInsensitive("");
        response1.statusCode = (short) 100;
        java.lang.String str21 = response1.cookie("hi!");
        response1.contentType = "hi!";
        int int24 = response1.numRedirects;
        response1.contentType = "hi!";
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test20155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20155");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.contentType();
        boolean boolean5 = response1.hasHeader("hi!");
        org.jsoup.Connection.Method method6 = response1.method();
        response1.statusMessage = "";
        java.lang.String str9 = response1.charset;
        java.lang.String str11 = response1.cookie("");
        boolean boolean13 = response1.hasCookie("");
        int int14 = response1.statusCode();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test20156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20156");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        org.jsoup.Connection.Response response14 = response1.header("hi!", "");
        java.lang.String str16 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str18 = response1.cookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        int int20 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test20157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20157");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "");
        boolean boolean18 = response1.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int20 = response1.statusCode();
        response1.statusCode = (-1);
        int int23 = response1.statusCode();
        java.lang.String str25 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test20158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20158");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.lang.String str10 = response1.cookie("");
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        java.lang.String str13 = response1.statusMessage;
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        java.lang.String str18 = response1.statusMessage;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test20159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20159");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        int int10 = response1.statusCode;
        java.lang.String str12 = response1.header("");
        java.net.URL uRL13 = response1.url();
        org.jsoup.Connection.Response response16 = response1.cookie("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str19 = response1.getHeaderCaseInsensitive("");
        boolean boolean21 = response1.hasCookie("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test20160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20160");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        java.lang.String str15 = response1.cookie("");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test20161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20161");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        int int13 = response1.statusCode;
        java.lang.String str15 = response1.header("");
        java.net.URL uRL16 = response1.url();
        int int17 = response1.numRedirects;
        org.jsoup.Connection.Method method18 = response1.method();
        org.jsoup.Connection.Request request19 = response1.req;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(request19);
    }

    @Test
    public void test20162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20162");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        java.lang.String str13 = response1.statusMessage;
        response1.numRedirects = (-1);
        int int16 = response1.statusCode();
        response1.executed = false;
        int int19 = response1.statusCode;
        int int20 = response1.numRedirects;
        response1.numRedirects = (short) -1;
        boolean boolean24 = response1.hasHeader("hi!");
        boolean boolean26 = response1.hasHeader("hi!");
        java.lang.String str27 = response1.charset;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test20163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20163");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.statusMessage;
        org.jsoup.Connection.Response response6 = response1.removeCookie("");
        int int7 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        boolean boolean9 = response1.executed;
        boolean boolean11 = response1.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response1.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test20164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20164");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusCode = (byte) 100;
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        java.lang.String str10 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test20165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20165");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        response1.charset = "";
        response1.contentType = "hi!";
        java.lang.String str14 = response1.getHeaderCaseInsensitive("");
        java.lang.String str15 = response1.contentType;
        response1.statusCode = (short) 1;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str19 = response18.contentType;
        boolean boolean20 = response18.executed;
        java.lang.String str21 = response18.charset;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test20166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20166");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str7 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer9 = null;
        response8.byteData = byteBuffer9;
        java.nio.ByteBuffer byteBuffer11 = null;
        response8.byteData = byteBuffer11;
        response8.charset = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response8.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test20167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20167");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        int int11 = response1.statusCode;
        java.lang.String str12 = response1.statusMessage;
        boolean boolean14 = response1.hasCookie("");
        int int15 = response1.numRedirects;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test20168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20168");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        response1.charset = "";
        org.jsoup.Connection.Response response12 = response1.removeCookie("hi!");
        int int13 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str19 = response1.getHeaderCaseInsensitive("hi!");
        response1.executed = true;
        response1.contentType = "hi!";
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test20169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20169");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        java.lang.String str13 = response1.statusMessage;
        response1.numRedirects = (-1);
        response1.charset = "hi!";
        response1.statusCode = '#';
        response1.charset = "hi!";
        response1.statusCode = 100;
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test20170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20170");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        java.lang.String str7 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method8 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        boolean boolean10 = response1.executed;
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        response1.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("hi!");
        java.lang.String str17 = response1.contentType();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test20171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20171");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        int int5 = response1.statusCode();
        org.jsoup.Connection.Response response8 = response1.header("hi!", "");
        org.jsoup.Connection.Request request9 = response1.req;
        java.lang.String str10 = response1.contentType();
        boolean boolean11 = response1.executed;
        response1.charset = "hi!";
        org.jsoup.Connection.Response response16 = response1.header("hi!", "");
        int int17 = response1.statusCode;
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test20172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20172");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.lang.String str9 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        response1.numRedirects = 1;
        java.lang.String str13 = response1.charset;
        org.jsoup.Connection.Response response15 = response1.removeCookie("");
        java.lang.String str16 = response1.charset();
        response1.numRedirects = 32;
        boolean boolean20 = response1.hasHeader("hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test20173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20173");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str7 = response5.getHeaderCaseInsensitive("");
        java.lang.String str9 = response5.header("hi!");
        int int10 = response5.statusCode();
        org.jsoup.Connection.Response response12 = response5.removeCookie("hi!");
        response5.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response5);
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test20174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20174");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test20175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20175");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        boolean boolean9 = response1.executed;
        response1.executed = false;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        response1.charset = "hi!";
        response1.statusMessage = "";
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test20176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20176");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        response1.statusMessage = "";
        java.lang.String str15 = response1.charset();
        boolean boolean16 = response1.executed;
        boolean boolean18 = response1.hasCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        java.nio.ByteBuffer byteBuffer20 = response1.byteData;
        java.nio.ByteBuffer byteBuffer21 = null;
        response1.byteData = byteBuffer21;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(byteBuffer20);
    }

    @Test
    public void test20177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20177");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.Connection.Response response10 = response1.removeCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        response1.statusMessage = "";
        java.net.URL uRL14 = response1.url();
        java.lang.String str15 = response1.statusMessage();
        org.jsoup.Connection.Request request16 = response1.req;
        response1.statusCode = (byte) 1;
        response1.statusCode = (byte) 0;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(request16);
    }

    @Test
    public void test20178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20178");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        java.lang.String str9 = response1.cookie("");
        org.jsoup.Connection.Method method10 = response1.method();
        int int11 = response1.statusCode();
        java.lang.String str12 = response1.statusMessage;
        int int13 = response1.numRedirects;
        org.jsoup.Connection.Request request14 = response1.req;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int16 = response1.statusCode;
        java.lang.String str18 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        response1.numRedirects = '4';
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test20179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20179");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        org.jsoup.Connection.Method method12 = response1.method();
        org.jsoup.Connection.Response response14 = response1.removeCookie("");
        java.lang.String str15 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        boolean boolean17 = response1.executed;
        java.lang.String str19 = response1.cookie("");
        org.jsoup.Connection.Response response21 = response1.removeCookie("");
        java.lang.String str22 = response1.contentType();
        boolean boolean24 = response1.hasHeader("hi!");
        java.net.URL uRL25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response26 = response1.url(uRL25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test20180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20180");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        response1.contentType = "";
        response1.charset = "";
        java.lang.String str16 = response1.statusMessage();
        org.jsoup.Connection.Response response19 = response1.header("hi!", "");
        response1.numRedirects = (short) 1;
        org.jsoup.Connection.Response response23 = response1.removeCookie("hi!");
        java.lang.String str25 = response1.cookie("hi!");
        org.jsoup.Connection.Response response27 = response1.removeHeader("hi!");
        int int28 = response1.numRedirects;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test20181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20181");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        java.lang.String str15 = response1.header("hi!");
        boolean boolean17 = response1.hasHeader("hi!");
        java.lang.String str18 = response1.charset();
        boolean boolean20 = response1.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str22 = response1.statusMessage;
        org.jsoup.Connection.Request request23 = null;
        response1.req = request23;
        org.jsoup.Connection.Request request25 = null;
        response1.req = request25;
        java.lang.String str27 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test20182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20182");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        java.lang.String str13 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        java.lang.String str15 = response1.charset;
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        response1.numRedirects = 10;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test20183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20183");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Response response8 = response1.header("hi!", "");
        boolean boolean10 = response1.hasHeader("hi!");
        response1.statusCode = (short) -1;
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        java.lang.String str16 = response1.header("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test20184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20184");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        java.lang.String str12 = response1.header("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test20185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20185");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.statusMessage;
        java.lang.String str10 = response1.statusMessage();
        response1.executed = false;
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        java.lang.String str15 = response1.statusMessage();
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.url(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test20186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20186");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        response1.statusCode = (byte) 0;
        boolean boolean11 = response1.hasCookie("");
        response1.charset = "hi!";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strEntry15);
    }

    @Test
    public void test20187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20187");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        boolean boolean6 = response1.hasCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        java.lang.String str9 = response1.header("hi!");
        response1.executed = false;
        org.jsoup.Connection.Request request12 = response1.req;
        java.lang.String str14 = response1.header("hi!");
        java.lang.String str16 = response1.header("");
        org.jsoup.Connection.Request request17 = response1.req;
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(request17);
    }

    @Test
    public void test20188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20188");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        response1.statusCode = (byte) 0;
        boolean boolean11 = response1.hasCookie("");
        java.lang.String str13 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        response1.contentType = "";
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test20189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20189");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.numRedirects = (byte) 1;
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        java.lang.String str15 = response1.charset();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("hi!");
        java.net.URL uRL18 = response1.url();
        java.lang.String str19 = response1.statusMessage();
        java.lang.String str20 = response1.charset();
        response1.charset = "";
        org.jsoup.Connection.Method method23 = response1.method();
        org.jsoup.Connection.Request request24 = response1.req;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(request24);
    }

    @Test
    public void test20190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20190");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.contentType;
        java.lang.String str8 = response1.charset();
        java.net.URL uRL9 = response1.url();
        response1.statusCode = (short) -1;
        int int12 = response1.statusCode();
        int int13 = response1.numRedirects;
        java.lang.String str14 = response1.charset;
        java.lang.String str16 = response1.cookie("");
        org.jsoup.Connection.Response response19 = response1.cookie("hi!", "hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test20191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20191");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        java.lang.String str13 = response1.statusMessage;
        response1.numRedirects = (-1);
        int int16 = response1.statusCode();
        response1.executed = false;
        java.lang.String str19 = response1.contentType;
        org.jsoup.Connection.Method method20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response1.method(method20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test20192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20192");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        response1.charset = "";
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        response1.contentType = "";
        response1.charset = "";
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test20193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20193");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.contentType;
        response1.charset = "hi!";
        org.jsoup.Connection.Response response12 = response1.header("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test20194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20194");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Method method4 = response1.method();
        int int5 = response1.statusCode();
        response1.executed = true;
        java.net.HttpURLConnection httpURLConnection8 = null;
        org.jsoup.helper.HttpConnection.Response response9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.Connection.Request request11 = response10.req;
        java.lang.String str13 = response10.cookie("hi!");
        java.lang.String str14 = response10.charset();
        int int15 = response10.statusCode;
        java.nio.ByteBuffer byteBuffer16 = response10.byteData;
        org.jsoup.Connection.Method method17 = response10.method();
        org.jsoup.Connection.Request request18 = null;
        response10.req = request18;
        response10.numRedirects = 0;
        java.lang.String str22 = response10.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response10.headers();
        java.lang.String str24 = response10.charset;
        org.jsoup.Connection.Request request25 = null;
        response10.req = request25;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection8, (org.jsoup.Connection.Response) response10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test20195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20195");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        response1.contentType = "hi!";
        boolean boolean15 = response1.executed;
        response1.executed = true;
        int int18 = response1.statusCode;
        java.net.URL uRL19 = response1.url();
        response1.statusCode = (byte) 0;
        java.lang.String str22 = response1.charset();
        int int23 = response1.statusCode;
        org.jsoup.Connection.Request request24 = null;
        response1.req = request24;
        response1.statusMessage = "hi!";
        response1.contentType = "";
        response1.numRedirects = (-1);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test20196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20196");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Method method13 = response1.method();
        java.lang.String str15 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str16 = response1.statusMessage;
        org.jsoup.Connection.Response response18 = response1.removeCookie("");
        org.jsoup.Connection.Response response20 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response22 = response1.removeCookie("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test20197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20197");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str10 = response1.statusMessage();
        java.net.URL uRL11 = response1.url();
        org.jsoup.Connection.Method method12 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(strEntry14);
    }

    @Test
    public void test20198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20198");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        int int4 = response1.numRedirects;
        java.lang.String str6 = response1.header("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        org.jsoup.Connection.Method method8 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        boolean boolean12 = response1.hasCookie("hi!");
        org.jsoup.Connection.Request request13 = response1.req;
        java.lang.String str15 = response1.getHeaderCaseInsensitive("");
        java.lang.String str17 = response1.header("");
        int int18 = response1.statusCode();
        org.jsoup.Connection.Request request19 = response1.req;
        org.jsoup.Connection.Request request20 = response1.req;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(request19);
        org.junit.Assert.assertNull(request20);
    }

    @Test
    public void test20199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20199");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.contentType();
        boolean boolean5 = response1.hasHeader("hi!");
        org.jsoup.Connection.Method method6 = response1.method();
        java.lang.String str7 = response1.charset();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("");
        int int10 = response1.statusCode;
        response1.charset = "hi!";
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test20200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20200");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response4 = response2.removeHeader("hi!");
        java.lang.String str5 = response2.contentType();
        org.jsoup.Connection.Response response7 = response2.removeCookie("");
        java.lang.String str8 = response2.contentType;
        java.lang.String str10 = response2.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request11 = null;
        response2.req = request11;
        java.net.URL uRL13 = response2.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test20201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20201");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        boolean boolean9 = response1.executed;
        java.lang.String str11 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str12 = response1.statusMessage();
        response1.statusCode = 0;
        response1.numRedirects = 52;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test20202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20202");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        java.lang.String str15 = response1.header("hi!");
        boolean boolean17 = response1.hasHeader("hi!");
        java.lang.String str18 = response1.charset();
        boolean boolean20 = response1.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str22 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response1.cookies();
        boolean boolean25 = response1.hasHeader("hi!");
        java.net.URL uRL26 = response1.url();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(uRL26);
    }

    @Test
    public void test20203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20203");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        response1.statusCode = (byte) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        org.jsoup.Connection.Request request11 = response1.req;
        org.jsoup.Connection.Request request12 = response1.req;
        java.lang.String str13 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.contentType = "hi!";
        response1.numRedirects = (byte) 10;
        java.lang.String str20 = response1.header("");
        java.lang.String str22 = response1.cookie("");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test20204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20204");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        java.lang.String str9 = response1.statusMessage();
        response1.statusCode = (short) 100;
        int int12 = response1.numRedirects;
        java.lang.String str14 = response1.header("");
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        response1.numRedirects = (short) -1;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test20205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20205");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str10 = response1.statusMessage();
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test20206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20206");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        response1.executed = false;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        response1.statusMessage = "hi!";
        boolean boolean19 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        org.jsoup.Connection.Method method21 = response1.method();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(method21);
    }

    @Test
    public void test20207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20207");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        response1.charset = "";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.lang.String str15 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean18 = response17.executed;
        boolean boolean20 = response17.hasHeader("hi!");
        int int21 = response17.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray22 = response17.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test20208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20208");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        boolean boolean6 = response1.hasCookie("");
        java.net.URL uRL7 = response1.url();
        java.lang.String str8 = response1.contentType();
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        java.lang.String str11 = response1.statusMessage;
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test20209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20209");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        int int5 = response1.statusCode();
        java.net.URL uRL6 = response1.url();
        boolean boolean8 = response1.hasHeader("hi!");
        org.jsoup.Connection.Response response11 = response1.header("hi!", "");
        response1.statusMessage = "";
        boolean boolean15 = response1.hasCookie("");
        java.lang.String str16 = response1.charset();
        org.jsoup.Connection.Response response19 = response1.cookie("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.lang.String str23 = response1.getHeaderCaseInsensitive("");
        java.net.URL uRL24 = response1.url();
        boolean boolean25 = response1.executed;
        java.lang.String str26 = response1.contentType;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test20210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20210");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset;
        response1.statusMessage = "hi!";
        java.lang.String str7 = response1.charset;
        response1.statusMessage = "hi!";
        java.lang.String str11 = response1.header("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test20211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20211");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        response1.contentType = "hi!";
        boolean boolean15 = response1.hasHeader("hi!");
        boolean boolean17 = response1.hasCookie("hi!");
        org.jsoup.Connection.Request request18 = response1.req;
        java.lang.String str19 = response1.statusMessage();
        boolean boolean21 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean24 = response22.hasCookie("hi!");
        org.jsoup.Connection.Request request25 = null;
        response22.req = request25;
        java.lang.String str27 = response22.statusMessage();
        java.nio.ByteBuffer byteBuffer28 = null;
        response22.byteData = byteBuffer28;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(request18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test20212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20212");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        org.jsoup.Connection.Method method5 = response2.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response2.byteData = byteBuffer6;
        java.lang.String str9 = response2.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response2.scanHeaders("");
        java.lang.String str12 = response2.charset();
        java.lang.String str13 = response2.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response2.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str17 = response2.contentType;
        java.lang.String str18 = response2.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test20213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20213");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusMessage = "";
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.charset;
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        java.lang.String str16 = response1.statusMessage;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test20214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20214");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        boolean boolean8 = response1.hasHeader("hi!");
        org.jsoup.Connection.Method method9 = response1.method();
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        boolean boolean12 = response1.hasCookie("hi!");
        int int13 = response1.statusCode;
        java.lang.String str14 = response1.charset();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test20215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20215");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        response10.statusMessage = "hi!";
        java.lang.String str14 = response10.header("hi!");
        response10.statusMessage = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test20216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20216");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        java.lang.String str9 = response1.statusMessage();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test20217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20217");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        response1.statusMessage = "";
        java.lang.String str15 = response1.charset();
        response1.executed = true;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.headers();
        response1.statusCode = 0;
        response1.charset = "hi!";
        java.lang.String str23 = response1.contentType;
        response1.charset = "";
        org.jsoup.Connection.Response response27 = response1.removeCookie("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(response27);
    }

    @Test
    public void test20218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20218");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str10 = response1.getHeaderCaseInsensitive("hi!");
        int int11 = response1.statusCode();
        response1.charset = "";
        int int14 = response1.numRedirects;
        java.lang.String str16 = response1.getHeaderCaseInsensitive("hi!");
        int int17 = response1.numRedirects;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test20219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20219");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.lang.String str9 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        java.lang.String str13 = response1.statusMessage;
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        org.jsoup.Connection.Response response18 = response1.cookie("hi!", "hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response1.scanHeaders("");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(strEntry20);
    }

    @Test
    public void test20220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20220");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        response1.statusMessage = "";
        java.lang.String str15 = response1.charset();
        response1.contentType = "";
        boolean boolean19 = response1.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.nio.ByteBuffer byteBuffer22 = null;
        response1.byteData = byteBuffer22;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response26 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test20221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20221");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        response1.statusCode = (byte) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request13 = response1.req;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.lang.String str15 = response1.contentType;
        java.lang.String str16 = response1.charset;
        org.jsoup.Connection.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.method(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test20222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20222");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str11 = response1.charset();
        java.lang.String str12 = response1.charset;
        org.jsoup.Connection.Response response14 = response1.removeCookie("hi!");
        int int15 = response1.numRedirects;
        java.lang.String str16 = response1.contentType;
        response1.statusMessage = "";
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        java.nio.ByteBuffer byteBuffer21 = null;
        response1.byteData = byteBuffer21;
        response1.contentType = "";
        java.lang.String str26 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test20223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20223");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.statusMessage();
        response1.executed = false;
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response16 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("");
        org.jsoup.Connection.Response response20 = response1.removeCookie("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test20224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20224");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        response1.statusCode = (byte) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request13 = response1.req;
        org.jsoup.Connection.Request request14 = response1.req;
        org.jsoup.Connection.Method method15 = response1.method();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request17 = null;
        response16.req = request17;
        org.jsoup.Connection.Response response21 = response16.header("hi!", "");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test20225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20225");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        response1.charset = "";
        org.jsoup.Connection.Response response12 = response1.removeCookie("hi!");
        int int13 = response1.statusCode();
        java.lang.String str14 = response1.contentType;
        response1.executed = false;
        int int17 = response1.statusCode;
        int int18 = response1.statusCode;
        int int19 = response1.statusCode();
        boolean boolean21 = response1.hasCookie("hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test20226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20226");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        boolean boolean6 = response1.hasCookie("");
        response1.executed = true;
        int int9 = response1.statusCode();
        java.lang.String str10 = response1.charset();
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.statusMessage();
        response1.charset = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test20227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20227");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.contentType;
        java.lang.String str8 = response1.charset();
        java.net.URL uRL9 = response1.url();
        response1.statusCode = (short) -1;
        int int12 = response1.statusCode();
        int int13 = response1.numRedirects;
        java.lang.String str14 = response1.charset;
        java.lang.String str16 = response1.cookie("");
        java.lang.String str18 = response1.cookie("");
        org.jsoup.Connection.Response response21 = response1.header("hi!", "hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test20228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20228");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        int int9 = response1.statusCode;
        java.net.URL uRL10 = response1.url();
        org.jsoup.Connection.Method method11 = response1.method();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test20229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20229");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        java.lang.String str11 = response1.contentType;
        java.net.URL uRL12 = response1.url();
        java.net.URL uRL13 = response1.url();
        response1.numRedirects = ' ';
        java.lang.String str16 = response1.charset;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test20230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20230");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        response1.contentType = "hi!";
        java.lang.String str10 = response1.charset();
        java.lang.String str11 = response1.charset;
        response1.executed = false;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request15 = response14.req;
        boolean boolean16 = response14.executed;
        java.lang.String str18 = response14.getHeaderCaseInsensitive("hi!");
        java.lang.String str19 = response14.statusMessage();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test20231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20231");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        org.jsoup.Connection.Response response6 = response1.removeCookie("");
        response1.statusCode = 100;
        boolean boolean9 = response1.executed;
        response1.statusCode = (short) -1;
        response1.numRedirects = (byte) 10;
        java.net.URL uRL14 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        java.lang.String str17 = response1.getHeaderCaseInsensitive("");
        response1.charset = "";
        java.net.URL uRL20 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document21 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(uRL20);
    }

    @Test
    public void test20232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20232");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str15 = response1.cookie("");
        java.lang.String str17 = response1.header("");
        response1.charset = "hi!";
        org.jsoup.Connection.Response response21 = response1.removeCookie("");
        boolean boolean23 = response1.hasCookie("");
        response1.executed = false;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test20233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20233");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        org.jsoup.Connection.Response response7 = response1.removeCookie("");
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        org.jsoup.Connection.Request request13 = response1.req;
        org.jsoup.Connection.Request request14 = response1.req;
        boolean boolean16 = response1.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test20234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20234");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str14 = response1.cookie("");
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        java.lang.String str16 = response1.contentType;
        response1.charset = "hi!";
        java.lang.String str20 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method21 = response1.method();
        java.lang.String str22 = response1.charset();
        java.lang.String str23 = response1.charset();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test20235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20235");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        response1.charset = "hi!";
        int int9 = response1.numRedirects;
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        response1.executed = true;
        int int14 = response1.statusCode();
        java.lang.String str15 = response1.contentType();
        org.jsoup.Connection.Request request16 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        response1.numRedirects = 100;
        java.lang.String str20 = response1.charset();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test20236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20236");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        org.jsoup.Connection.Method method11 = response1.method();
        int int12 = response1.statusCode();
        java.lang.Class<?> wildcardClass13 = response1.getClass();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test20237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20237");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusMessage = "";
        response1.statusMessage = "";
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        org.jsoup.Connection.Request request12 = response1.req;
        response1.statusMessage = "hi!";
        int int15 = response1.numRedirects;
        java.lang.String str16 = response1.contentType();
        response1.numRedirects = 32;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test20238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20238");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.statusMessage();
        response1.executed = false;
        org.jsoup.Connection.Method method12 = response1.method();
        boolean boolean14 = response1.hasCookie("");
        int int15 = response1.statusCode();
        response1.contentType = "hi!";
        org.jsoup.Connection.Request request18 = null;
        response1.req = request18;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test20239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20239");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        org.jsoup.Connection.Response response8 = response1.header("hi!", "hi!");
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Method method10 = response1.method();
        boolean boolean12 = response1.hasCookie("");
        org.jsoup.Connection.Request request13 = response1.req;
        java.lang.String str14 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        java.lang.Class<?> wildcardClass16 = strMap15.getClass();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test20240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20240");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.statusMessage();
        response1.executed = false;
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        response1.charset = "hi!";
        org.jsoup.Connection.Response response18 = response1.header("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document20 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test20241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20241");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        java.nio.ByteBuffer byteBuffer5 = response1.byteData;
        java.lang.String str6 = response1.statusMessage;
        java.lang.String str8 = response1.cookie("");
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test20242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20242");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str7 = response1.charset();
        boolean boolean9 = response1.hasHeader("hi!");
        java.lang.String str11 = response1.cookie("");
        java.net.URL uRL12 = response1.url();
        int int13 = response1.numRedirects;
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test20243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20243");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.lang.String str9 = response1.header("hi!");
        java.lang.String str10 = response1.statusMessage();
        int int11 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str14 = response1.statusMessage;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test20244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20244");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        org.jsoup.Connection.Method method12 = response1.method();
        response1.statusMessage = "hi!";
        java.lang.String str15 = response1.charset;
        java.lang.String str17 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method18 = response1.method();
        int int19 = response1.statusCode;
        org.jsoup.Connection.Request request20 = null;
        response1.req = request20;
        int int22 = response1.numRedirects;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test20245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20245");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.charset;
        response1.numRedirects = (byte) -1;
        response1.executed = true;
        int int9 = response1.statusCode();
        java.lang.String str10 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        boolean boolean13 = response1.hasCookie("");
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        response1.executed = true;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.contentType = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test20246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20246");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        java.lang.String str7 = response1.statusMessage;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str11 = response1.header("hi!");
        response1.statusMessage = "";
        response1.statusCode = 'a';
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("hi!");
        response1.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        response20.charset = "";
        response20.executed = true;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strEntry17);
    }

    @Test
    public void test20247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20247");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        java.lang.String str11 = response1.header("");
        java.lang.String str12 = response1.contentType;
        boolean boolean13 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.lang.String str16 = response1.header("hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test20248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20248");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        boolean boolean6 = response1.hasCookie("");
        int int7 = response1.statusCode;
        org.jsoup.Connection.Request request8 = response1.req;
        org.jsoup.Connection.Request request9 = response1.req;
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.lang.String str15 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer17 = null;
        response1.byteData = byteBuffer17;
        java.lang.String str19 = response1.charset;
        boolean boolean21 = response1.hasHeader("hi!");
        response1.numRedirects = 0;
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test20249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20249");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.net.URL uRL14 = response1.url();
        int int15 = response1.statusCode;
        org.jsoup.Connection.Method method16 = response1.method();
        java.lang.String str17 = response1.statusMessage;
        org.jsoup.Connection.Request request18 = null;
        response1.req = request18;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test20250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20250");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.statusMessage();
        java.lang.String str14 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        java.lang.String str16 = response1.contentType();
        java.lang.String str17 = response1.statusMessage();
        org.jsoup.Connection.Method method18 = response1.method();
        int int19 = response1.statusCode();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test20251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20251");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        java.net.URL uRL15 = response1.url();
        response1.numRedirects = (short) -1;
        int int18 = response1.statusCode();
        response1.executed = true;
        boolean boolean22 = response1.hasCookie("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test20252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20252");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Request request8 = response1.req;
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.header("");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test20253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20253");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        java.lang.String str3 = response1.contentType;
        response1.executed = false;
        response1.statusMessage = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        java.lang.String str10 = response1.cookie("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test20254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20254");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        java.lang.String str16 = response1.statusMessage();
        response1.charset = "";
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean23 = response1.hasCookie("");
        java.net.URL uRL24 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(uRL24);
    }

    @Test
    public void test20255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20255");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        int int4 = response1.statusCode;
        boolean boolean6 = response1.hasCookie("hi!");
        boolean boolean8 = response1.hasCookie("hi!");
        boolean boolean10 = response1.hasCookie("hi!");
        java.net.URL uRL11 = response1.url();
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str16 = response1.statusMessage;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test20256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20256");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        java.lang.String str11 = response1.contentType;
        response1.contentType = "hi!";
        int int14 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        boolean boolean17 = response1.hasHeader("hi!");
        boolean boolean19 = response1.hasCookie("");
        response1.charset = "";
        org.jsoup.Connection.Response response24 = response1.header("hi!", "");
        java.lang.String str25 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = response1.cookies();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strMap26);
    }

    @Test
    public void test20257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20257");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        org.jsoup.Connection.Response response10 = response1.removeCookie("");
        response1.charset = "hi!";
        java.lang.String str13 = response1.statusMessage();
        int int14 = response1.statusCode();
        org.jsoup.Connection.Response response16 = response1.removeHeader("hi!");
        response1.statusCode = '4';
        response1.statusMessage = "";
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test20258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20258");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        response1.charset = "";
        java.lang.String str14 = response1.charset;
        java.net.URL uRL15 = response1.url();
        org.jsoup.Connection.Response response17 = response1.removeCookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response21 = response1.removeCookie("");
        response1.statusMessage = "hi!";
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test20259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20259");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        org.jsoup.Connection.Response response6 = response1.removeCookie("");
        response1.charset = "hi!";
        org.jsoup.Connection.Response response10 = response1.removeCookie("");
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test20260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20260");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.statusMessage();
        java.lang.String str14 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        java.lang.String str16 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str19 = response18.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response18.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test20261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20261");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.statusMessage;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response8 = response1.removeHeader("hi!");
        response1.statusCode = 35;
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test20262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20262");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str11 = response1.charset();
        org.jsoup.Connection.Request request12 = response1.req;
        java.lang.String str13 = response1.charset();
        boolean boolean15 = response1.hasCookie("");
        response1.executed = false;
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        int int19 = response1.statusCode;
        response1.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL23 = response1.url();
        int int24 = response1.statusCode;
        int int25 = response1.statusCode();
        java.lang.String str26 = response1.statusMessage;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test20263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20263");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.statusMessage;
        org.jsoup.Connection.Response response6 = response1.removeCookie("");
        int int7 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        java.lang.String str10 = response1.contentType;
        java.lang.String str12 = response1.cookie("hi!");
        boolean boolean14 = response1.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test20264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20264");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request16 = response1.req;
        java.lang.String str18 = response1.cookie("hi!");
        org.jsoup.Connection.Response response20 = response1.removeHeader("hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test20265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20265");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("");
        java.lang.String str6 = response1.cookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        java.lang.String str8 = response1.charset();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test20266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20266");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str14 = response1.cookie("");
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        java.lang.String str16 = response1.contentType;
        int int17 = response1.statusCode();
        org.jsoup.Connection.Request request18 = null;
        response1.req = request18;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response1.scanHeaders("");
        org.jsoup.Connection.Request request22 = response1.req;
        int int23 = response1.statusCode();
        org.jsoup.Connection.Method method24 = response1.method();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry21);
        org.junit.Assert.assertNull(request22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(method24);
    }

    @Test
    public void test20267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20267");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        response1.charset = "";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.lang.String str15 = response1.statusMessage();
        int int16 = response1.statusCode;
        java.lang.String str18 = response1.header("");
        response1.executed = true;
        java.nio.ByteBuffer byteBuffer21 = null;
        response1.byteData = byteBuffer21;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response1.cookies();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test20268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20268");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        int int12 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response19 = response16.cookie("hi!", "");
        java.lang.String str20 = response16.statusMessage;
        java.lang.String str21 = response16.contentType;
        org.jsoup.Connection.Request request22 = response16.req;
        boolean boolean24 = response16.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer25 = response16.byteData;
        java.lang.String str26 = response16.statusMessage();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry28 = response16.scanHeaders("hi!");
        int int29 = response16.statusCode;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(request22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(byteBuffer25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(strEntry28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test20269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20269");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.lang.String str9 = response1.header("hi!");
        java.lang.String str10 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        int int12 = response1.numRedirects;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test20270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20270");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        response1.statusCode = (byte) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str13 = response1.charset();
        response1.numRedirects = ' ';
        response1.charset = "";
        java.lang.String str18 = response1.statusMessage();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(strEntry20);
    }

    @Test
    public void test20271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20271");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        java.lang.String str12 = response1.statusMessage;
        response1.statusMessage = "";
        org.jsoup.Connection.Request request15 = response1.req;
        boolean boolean17 = response1.hasCookie("hi!");
        response1.statusMessage = "";
        org.jsoup.Connection.Response response21 = response1.removeCookie("hi!");
        java.lang.String str22 = response1.charset;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test20272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20272");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        int int5 = response1.statusCode();
        response1.statusCode = 32;
        response1.executed = false;
        java.lang.String str10 = response1.contentType;
        int int11 = response1.statusCode();
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        int int14 = response1.statusCode;
        response1.charset = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test20273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20273");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.lang.String str9 = response1.contentType;
        response1.numRedirects = (short) 0;
        java.lang.String str12 = response1.statusMessage();
        java.lang.String str14 = response1.header("hi!");
        int int15 = response1.numRedirects;
        boolean boolean16 = response1.executed;
        int int17 = response1.statusCode();
        java.lang.String str19 = response1.cookie("");
        java.net.URL uRL20 = response1.url();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(uRL20);
    }

    @Test
    public void test20274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20274");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        java.lang.String str3 = response1.contentType;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response6.cookies();
        org.jsoup.Connection.Request request8 = response6.req;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(request8);
    }

    @Test
    public void test20275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20275");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        boolean boolean15 = response1.executed;
        java.lang.String str16 = response1.contentType();
        int int17 = response1.statusCode();
        int int18 = response1.statusCode();
        java.lang.String str20 = response1.cookie("");
        java.lang.String str22 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        java.nio.ByteBuffer byteBuffer25 = null;
        response1.byteData = byteBuffer25;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test20276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20276");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str11 = response1.charset();
        java.lang.String str12 = response1.charset;
        org.jsoup.Connection.Response response14 = response1.removeCookie("hi!");
        response1.executed = false;
        boolean boolean18 = response1.hasCookie("hi!");
        response1.contentType = "";
        boolean boolean22 = response1.hasCookie("");
        java.lang.String str24 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method25 = response1.method();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(method25);
    }

    @Test
    public void test20277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20277");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        response1.executed = true;
        org.jsoup.Connection.Response response16 = response1.removeCookie("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("hi!");
        response1.charset = "";
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str23 = response1.header("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test20278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20278");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Request request8 = response1.req;
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        response1.statusCode = (short) 100;
        response1.statusCode = (byte) 0;
        java.net.URL uRL14 = response1.url();
        boolean boolean15 = response1.executed;
        java.lang.Class<?> wildcardClass16 = response1.getClass();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test20279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20279");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        response1.statusMessage = "";
        java.net.URL uRL5 = response1.url();
        java.lang.String str6 = response1.contentType;
        response1.numRedirects = (byte) -1;
        java.lang.String str9 = response1.statusMessage();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(strEntry11);
    }

    @Test
    public void test20280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20280");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        response1.charset = "";
        response1.numRedirects = (-1);
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        int int20 = response1.numRedirects;
        java.lang.String str21 = response1.charset();
        java.lang.Class<?> wildcardClass22 = response1.getClass();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test20281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20281");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        response1.charset = "";
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.cookies();
        response1.numRedirects = 0;
        org.jsoup.Connection.Method method20 = response1.method();
        java.net.HttpURLConnection httpURLConnection21 = null;
        org.jsoup.helper.HttpConnection.Response response22 = null;
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response22);
        int int24 = response23.numRedirects;
        java.lang.String str25 = response23.contentType;
        org.jsoup.Connection.Request request26 = null;
        response23.req = request26;
        response23.numRedirects = 100;
        java.nio.ByteBuffer byteBuffer30 = response23.byteData;
        response23.statusMessage = "hi!";
        java.lang.String str33 = response23.statusMessage;
        java.lang.String str35 = response23.header("hi!");
        java.lang.String str36 = response23.contentType;
        boolean boolean37 = response23.executed;
        int int38 = response23.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection21, (org.jsoup.Connection.Response) response23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(byteBuffer30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
    }

    @Test
    public void test20282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20282");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        org.jsoup.Connection.Response response6 = response1.removeCookie("");
        response1.statusCode = 100;
        java.lang.String str10 = response1.cookie("");
        java.lang.String str12 = response1.cookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.headers();
        java.lang.String str15 = response1.header("");
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.headers();
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test20283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20283");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response8 = response1.removeHeader("hi!");
        response1.contentType = "";
        int int11 = response1.numRedirects;
        java.lang.String str12 = response1.contentType;
        response1.numRedirects = 'a';
        response1.statusMessage = "hi!";
        java.lang.String str18 = response1.header("");
        response1.contentType = "hi!";
        org.jsoup.Connection.Method method21 = response1.method();
        java.lang.String str22 = response1.charset();
        java.net.URL uRL23 = response1.url();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry25 = response1.scanHeaders("");
        java.net.HttpURLConnection httpURLConnection26 = null;
        org.jsoup.helper.HttpConnection.Response response27 = null;
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response27);
        response28.statusMessage = "";
        org.jsoup.Connection.Method method31 = response28.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry33 = response28.scanHeaders("hi!");
        java.lang.String str34 = response28.contentType;
        java.lang.String str35 = response28.charset();
        java.net.URL uRL36 = response28.url();
        response28.statusCode = (short) -1;
        int int39 = response28.statusCode();
        int int40 = response28.numRedirects;
        java.lang.String str41 = response28.charset;
        org.jsoup.Connection.Response response43 = response28.removeHeader("hi!");
        response28.executed = false;
        int int46 = response28.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection26, (org.jsoup.Connection.Response) response28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(strEntry25);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNull(strEntry33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(uRL36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(response43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test20284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20284");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        org.jsoup.Connection.Method method7 = response1.method();
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        org.jsoup.Connection.Method method14 = response1.method();
        java.lang.String str16 = response1.header("");
        java.lang.String str17 = response1.charset;
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test20285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20285");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.Connection.Response response10 = response1.removeCookie("");
        int int11 = response1.numRedirects;
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        int int14 = response1.statusCode();
        java.lang.String str15 = response1.contentType();
        org.jsoup.Connection.Method method16 = response1.method();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test20286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20286");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        int int4 = response1.statusCode;
        boolean boolean6 = response1.hasCookie("hi!");
        boolean boolean8 = response1.hasCookie("hi!");
        boolean boolean10 = response1.hasCookie("hi!");
        java.net.URL uRL11 = response1.url();
        java.lang.String str13 = response1.cookie("");
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        response1.executed = false;
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        java.lang.String str19 = response1.statusMessage;
        boolean boolean20 = response1.executed;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(byteBuffer18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test20287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20287");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        int int12 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response19 = response16.cookie("hi!", "");
        java.lang.String str20 = response16.statusMessage;
        java.lang.String str21 = response16.contentType;
        boolean boolean23 = response16.hasHeader("hi!");
        java.lang.String str24 = response16.contentType;
        java.lang.String str26 = response16.getHeaderCaseInsensitive("");
        response16.contentType = "";
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test20288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20288");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str12 = response1.header("");
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        java.lang.String str15 = response1.getHeaderCaseInsensitive("hi!");
        boolean boolean17 = response1.hasHeader("hi!");
        response1.executed = true;
        java.lang.String str20 = response1.charset;
        int int21 = response1.statusCode();
        boolean boolean23 = response1.hasCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap24 = response1.cookies();
        java.lang.String str25 = response1.charset();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test20289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20289");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        response1.statusMessage = "";
        java.lang.String str15 = response1.charset();
        response1.executed = true;
        java.lang.String str19 = response1.header("hi!");
        int int20 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer21 = response1.byteData;
        response1.charset = "hi!";
        response1.contentType = "";
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(byteBuffer21);
    }

    @Test
    public void test20290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20290");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        org.jsoup.Connection.Response response7 = response1.removeCookie("");
        java.lang.String str9 = response1.header("hi!");
        boolean boolean11 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        java.lang.String str14 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response17 = response1.header("hi!", "");
        java.lang.String str18 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str21 = response1.header("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test20291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20291");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        java.lang.String str12 = response1.contentType;
        java.lang.String str14 = response1.cookie("");
        java.lang.String str15 = response1.statusMessage;
        java.lang.String str17 = response1.header("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test20292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20292");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusMessage = "";
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.contentType;
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        int int11 = response1.statusCode;
        int int12 = response1.statusCode();
        java.lang.String str14 = response1.cookie("");
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(byteBuffer15);
    }

    @Test
    public void test20293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20293");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        response1.statusCode = (byte) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        java.lang.String str11 = response1.contentType;
        response1.executed = false;
        boolean boolean14 = response1.executed;
        response1.contentType = "hi!";
        int int17 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test20294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20294");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusMessage = "";
        org.jsoup.Connection.Method method8 = response1.method();
        int int9 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        java.lang.String str13 = response1.statusMessage();
        java.lang.String str15 = response1.cookie("");
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        java.lang.String str18 = response1.contentType;
        java.lang.String str19 = response1.statusMessage;
        java.lang.String str21 = response1.header("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document22 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test20295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20295");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.lang.String str9 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        java.lang.String str12 = response1.getHeaderCaseInsensitive("");
        java.lang.String str13 = response1.statusMessage;
        java.lang.String str14 = response1.contentType;
        boolean boolean16 = response1.hasHeader("hi!");
        response1.numRedirects = 2;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test20296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20296");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        response1.statusCode = (byte) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request13 = response1.req;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        int int17 = response1.statusCode;
        org.jsoup.Connection.Response response19 = response1.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        org.jsoup.Connection.Method method21 = response1.method();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(method21);
    }

    @Test
    public void test20297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20297");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        java.lang.String str13 = response1.statusMessage;
        response1.numRedirects = (-1);
        int int16 = response1.statusCode();
        response1.executed = false;
        response1.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry22 = response1.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.charset = "";
        int int26 = response1.statusCode();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(strEntry22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test20298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20298");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Method method6 = response1.method();
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response11 = response1.cookie("hi!", "");
        response1.statusCode = ' ';
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test20299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20299");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("hi!");
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        java.lang.String str8 = response1.contentType;
        response1.numRedirects = (byte) -1;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test20300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20300");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        response1.contentType = "hi!";
        boolean boolean15 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response18 = response1.removeCookie("");
        int int19 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray20 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test20301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20301");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        java.lang.String str11 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        boolean boolean14 = response1.hasCookie("");
        java.nio.ByteBuffer byteBuffer15 = null;
        response1.byteData = byteBuffer15;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test20302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20302");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        java.lang.String str11 = response1.contentType;
        java.net.URL uRL12 = response1.url();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test20303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20303");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        response1.contentType = "hi!";
        boolean boolean15 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response18 = response1.removeCookie("");
        int int19 = response1.statusCode();
        org.jsoup.Connection.Response response22 = response1.cookie("hi!", "");
        java.lang.String str23 = response1.contentType;
        org.jsoup.Connection.Request request24 = response1.req;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry26 = response1.scanHeaders("");
        response1.contentType = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry30 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(request24);
        org.junit.Assert.assertNull(strEntry26);
        org.junit.Assert.assertNull(strEntry30);
    }

    @Test
    public void test20304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20304");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.executed = false;
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        org.jsoup.Connection.Request request15 = response1.req;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(request15);
    }

    @Test
    public void test20305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20305");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        java.lang.String str15 = response1.header("hi!");
        boolean boolean17 = response1.hasHeader("hi!");
        java.lang.String str18 = response1.charset();
        boolean boolean20 = response1.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str22 = response1.statusMessage;
        org.jsoup.Connection.Response response24 = response1.removeCookie("hi!");
        java.lang.String str25 = response1.contentType();
        java.net.URL uRL26 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response29 = response1.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(uRL26);
    }

    @Test
    public void test20306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20306");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        java.lang.String str7 = response1.statusMessage;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str11 = response1.header("hi!");
        response1.statusMessage = "";
        java.lang.String str14 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str16 = response15.charset;
        response15.contentType = "";
        java.nio.ByteBuffer byteBuffer19 = response15.byteData;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(byteBuffer19);
    }

    @Test
    public void test20307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20307");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str12 = response1.header("");
        int int13 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        response1.charset = "";
        response1.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        java.lang.String str21 = response1.contentType();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test20308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20308");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusCode = (byte) 100;
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        java.lang.String str11 = response1.header("");
        response1.statusMessage = "hi!";
        java.lang.String str15 = response1.header("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test20309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20309");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        response1.contentType = "hi!";
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        int int13 = response1.statusCode();
        java.lang.String str15 = response1.header("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test20310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20310");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.lang.String str9 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        java.lang.String str13 = response1.statusMessage;
        java.lang.Class<?> wildcardClass14 = response1.getClass();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test20311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20311");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        java.lang.String str10 = response1.contentType;
        org.jsoup.Connection.Response response13 = response1.cookie("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer15 = null;
        response14.byteData = byteBuffer15;
        boolean boolean18 = response14.hasCookie("");
        response14.executed = false;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry22 = response14.scanHeaders("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(strEntry22);
    }

    @Test
    public void test20312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20312");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.Connection.Response response10 = response1.removeCookie("");
        int int11 = response1.numRedirects;
        response1.statusMessage = "hi!";
        java.lang.String str14 = response1.statusMessage();
        java.lang.String str16 = response1.header("");
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        org.jsoup.Connection.Response response22 = response1.header("hi!", "");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test20313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20313");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        org.jsoup.Connection.Method method12 = response1.method();
        org.jsoup.Connection.Response response14 = response1.removeCookie("");
        java.lang.String str15 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        boolean boolean17 = response1.executed;
        java.lang.String str19 = response1.cookie("");
        java.lang.String str20 = response1.statusMessage();
        response1.statusMessage = "hi!";
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test20314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20314");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        int int9 = response1.statusCode;
        java.lang.String str10 = response1.charset();
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test20315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20315");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        java.lang.String str13 = response1.statusMessage;
        int int14 = response1.statusCode();
        java.lang.String str16 = response1.getHeaderCaseInsensitive("hi!");
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(byteBuffer17);
    }

    @Test
    public void test20316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20316");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        int int7 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.Connection.Response response11 = response1.header("hi!", "hi!");
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.contentType;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test20317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20317");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.lang.String str9 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        response1.charset = "hi!";
        java.lang.String str13 = response1.statusMessage();
        java.lang.String str14 = response1.contentType();
        response1.contentType = "hi!";
        java.net.URL uRL17 = response1.url();
        int int18 = response1.numRedirects;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test20318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20318");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str11 = response1.contentType;
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        org.jsoup.Connection.Method method14 = response1.method();
        response1.charset = "hi!";
        java.lang.Class<?> wildcardClass17 = response1.getClass();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test20319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20319");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        java.lang.String str12 = response1.header("");
        int int13 = response1.numRedirects;
        java.net.HttpURLConnection httpURLConnection14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        response16.statusMessage = "";
        java.net.URL uRL19 = response16.url();
        int int20 = response16.statusCode();
        org.jsoup.Connection.Response response23 = response16.header("hi!", "");
        org.jsoup.Connection.Request request24 = response16.req;
        java.lang.String str25 = response16.contentType();
        boolean boolean26 = response16.executed;
        response16.charset = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap29 = response16.headers();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection14, (org.jsoup.Connection.Response) response16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(request24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strMap29);
    }

    @Test
    public void test20320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20320");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        java.lang.String str15 = response1.header("hi!");
        boolean boolean17 = response1.hasHeader("hi!");
        int int18 = response1.statusCode();
        response1.statusMessage = "";
        org.jsoup.Connection.Request request21 = response1.req;
        boolean boolean22 = response1.executed;
        java.lang.Class<?> wildcardClass23 = response1.getClass();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(request21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test20321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20321");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        boolean boolean11 = response1.hasCookie("");
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        java.lang.String str15 = response1.cookie("hi!");
        int int16 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.cookies();
        boolean boolean18 = response1.executed;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test20322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20322");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        java.lang.String str16 = response1.statusMessage();
        response1.statusMessage = "";
        java.nio.ByteBuffer byteBuffer19 = null;
        response1.byteData = byteBuffer19;
        org.jsoup.Connection.Request request21 = response1.req;
        org.jsoup.Connection.Response response24 = response1.cookie("hi!", "");
        org.jsoup.Connection.Method method25 = response1.method();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(request21);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(method25);
    }

    @Test
    public void test20323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20323");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Response response8 = response1.header("hi!", "");
        boolean boolean10 = response1.hasHeader("hi!");
        response1.statusCode = (short) -1;
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        response1.charset = "";
        response1.statusMessage = "";
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(byteBuffer15);
    }

    @Test
    public void test20324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20324");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        response1.numRedirects = (short) 100;
        boolean boolean8 = response1.hasCookie("");
        int int9 = response1.statusCode;
        response1.executed = false;
        java.lang.String str12 = response1.contentType();
        response1.statusCode = 1;
        response1.charset = "";
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.cookies();
        java.lang.String str18 = response1.statusMessage();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test20325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20325");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.Connection.Response response10 = response1.removeCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        java.lang.String str16 = response1.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int18 = response17.numRedirects;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test20326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20326");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        java.lang.String str4 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        java.lang.String str7 = response1.charset();
        boolean boolean9 = response1.hasCookie("");
        org.jsoup.Connection.Response response12 = response1.header("hi!", "");
        response1.statusMessage = "";
        org.jsoup.Connection.Response response16 = response1.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test20327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20327");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        java.lang.String str6 = response1.charset;
        response1.statusMessage = "";
        org.jsoup.Connection.Response response10 = response1.removeHeader("hi!");
        boolean boolean11 = response1.executed;
        response1.charset = "";
        int int14 = response1.statusCode();
        org.jsoup.Connection.Response response17 = response1.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int19 = response1.numRedirects;
        org.jsoup.Connection.Response response21 = response1.removeHeader("hi!");
        java.nio.ByteBuffer byteBuffer22 = response1.byteData;
        java.lang.Class<?> wildcardClass23 = response1.getClass();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(byteBuffer22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test20328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20328");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        org.jsoup.Connection.Method method7 = response1.method();
        int int8 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean10 = response9.executed;
        java.lang.String str11 = response9.statusMessage;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test20329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20329");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        int int12 = response1.numRedirects;
        java.lang.String str14 = response1.header("hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test20330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20330");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.lang.String str9 = response1.statusMessage();
        java.net.URL uRL10 = response1.url();
        org.jsoup.Connection.Response response12 = response1.removeCookie("hi!");
        org.jsoup.Connection.Method method13 = response1.method();
        java.lang.String str14 = response1.contentType();
        boolean boolean16 = response1.hasCookie("");
        java.lang.String str18 = response1.cookie("");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test20331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20331");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        response1.statusMessage = "";
        java.lang.String str15 = response1.charset();
        response1.executed = true;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.headers();
        response1.statusCode = 0;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test20332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20332");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        java.lang.String str3 = response1.contentType;
        java.nio.ByteBuffer byteBuffer4 = response1.byteData;
        java.lang.String str6 = response1.header("");
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        response1.statusCode = (byte) 0;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer12 = response11.byteData;
        java.lang.String str13 = response11.contentType();
        boolean boolean14 = response11.executed;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test20333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20333");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Response response12 = response1.cookie("hi!", "");
        response1.numRedirects = 1;
        int int15 = response1.numRedirects;
        response1.statusMessage = "";
        java.lang.String str19 = response1.header("hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test20334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20334");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        int int15 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("");
        int int18 = response1.statusCode;
        boolean boolean20 = response1.hasCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response1.cookies();
        java.lang.String str22 = response1.statusMessage;
        boolean boolean24 = response1.hasHeader("hi!");
        int int25 = response1.numRedirects;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test20335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20335");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        org.jsoup.Connection.Response response6 = response1.removeCookie("");
        response1.statusCode = 100;
        boolean boolean9 = response1.executed;
        response1.statusCode = (short) -1;
        response1.numRedirects = (byte) 10;
        java.net.URL uRL14 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        int int16 = response1.numRedirects;
        java.lang.String str18 = response1.getHeaderCaseInsensitive("");
        java.nio.ByteBuffer byteBuffer19 = null;
        response1.byteData = byteBuffer19;
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test20336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20336");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        response1.charset = "";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.lang.String str15 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        response1.numRedirects = 35;
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        response1.numRedirects = (short) 100;
        org.jsoup.Connection.Request request23 = null;
        response1.req = request23;
        org.jsoup.Connection.Request request25 = null;
        response1.req = request25;
        java.lang.String str27 = response1.charset;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test20337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20337");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.numRedirects = (byte) 1;
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        org.jsoup.Connection.Response response16 = response1.removeHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        java.lang.String str19 = response1.getHeaderCaseInsensitive("");
        java.lang.String str20 = response1.statusMessage();
        response1.numRedirects = '#';
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test20338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20338");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Method method6 = response1.method();
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response11 = response1.cookie("hi!", "");
        boolean boolean13 = response1.hasCookie("hi!");
        boolean boolean15 = response1.hasHeader("hi!");
        java.lang.String str16 = response1.charset;
        java.lang.String str17 = response1.charset;
        response1.charset = "hi!";
        response1.executed = false;
        response1.statusCode = 1;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test20339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20339");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        int int11 = response1.statusCode;
        java.net.URL uRL12 = response1.url();
        boolean boolean14 = response1.hasCookie("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("hi!");
        java.lang.String str17 = response1.charset();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test20340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20340");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.contentType();
        boolean boolean5 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.charset();
        java.lang.String str9 = response1.charset;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test20341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20341");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        response1.charset = "";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.lang.String str15 = response1.statusMessage();
        int int16 = response1.statusCode;
        java.lang.String str18 = response1.header("");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean21 = response19.hasHeader("hi!");
        java.net.URL uRL22 = response19.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = uRL22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(uRL22);
    }

    @Test
    public void test20342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20342");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        java.lang.String str15 = response1.header("hi!");
        boolean boolean17 = response1.hasHeader("hi!");
        java.lang.String str18 = response1.charset();
        boolean boolean20 = response1.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str22 = response1.statusMessage;
        org.jsoup.Connection.Response response24 = response1.removeCookie("hi!");
        java.lang.String str25 = response1.contentType();
        java.net.URL uRL26 = response1.url();
        org.jsoup.Connection.Request request27 = response1.req;
        java.lang.String str29 = response1.cookie("");
        java.lang.String str30 = response1.statusMessage();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNull(request27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test20343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20343");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        int int4 = response1.numRedirects;
        java.lang.String str6 = response1.header("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("hi!");
        java.lang.String str12 = response1.contentType();
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test20344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20344");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        int int9 = response1.statusCode;
        response1.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int13 = response12.statusCode;
        org.jsoup.Connection.Response response15 = response12.removeCookie("hi!");
        boolean boolean17 = response12.hasHeader("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test20345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20345");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        boolean boolean9 = response1.hasHeader("hi!");
        response1.executed = true;
        boolean boolean13 = response1.hasCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        int int15 = response1.numRedirects;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test20346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20346");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        response1.statusCode = (byte) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        java.lang.String str13 = response1.statusMessage;
        int int14 = response1.statusCode();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test20347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20347");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        boolean boolean6 = response1.hasCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        boolean boolean9 = response1.hasCookie("");
        java.lang.String str10 = response1.contentType();
        int int11 = response1.numRedirects;
        java.lang.String str13 = response1.header("hi!");
        int int14 = response1.numRedirects;
        int int15 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.cookies();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test20348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20348");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        java.lang.String str4 = response1.contentType;
        java.lang.String str5 = response1.charset;
        java.lang.String str6 = response1.charset;
        java.lang.String str7 = response1.charset();
        response1.statusCode = (short) -1;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test20349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20349");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.Connection.Response response10 = response1.removeCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        response1.statusMessage = "";
        java.net.URL uRL14 = response1.url();
        java.lang.String str15 = response1.statusMessage();
        int int16 = response1.numRedirects;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test20350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20350");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.headers();
        response1.contentType = "";
        java.lang.String str8 = response1.contentType();
        int int9 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int11 = response10.statusCode();
        int int12 = response10.numRedirects;
        java.lang.String str14 = response10.cookie("hi!");
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response10.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test20351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20351");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.lang.String str9 = response1.contentType;
        java.lang.String str11 = response1.getHeaderCaseInsensitive("");
        boolean boolean12 = response1.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("");
        org.jsoup.Connection.Response response17 = response1.cookie("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.cookies();
        java.lang.String str19 = response1.statusMessage();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test20352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20352");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str14 = response1.cookie("");
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        response1.statusMessage = "";
        java.net.HttpURLConnection httpURLConnection19 = null;
        org.jsoup.helper.HttpConnection.Response response20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.Connection.Request request22 = response21.req;
        int int23 = response21.statusCode;
        response21.executed = false;
        response21.statusMessage = "hi!";
        org.jsoup.Connection.Response response29 = response21.removeCookie("");
        response21.charset = "";
        response21.statusCode = 1;
        java.util.Map<java.lang.String, java.lang.String> strMap34 = response21.headers();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection19, (org.jsoup.Connection.Response) response21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(request22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNotNull(strMap34);
    }

    @Test
    public void test20353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20353");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        org.jsoup.Connection.Response response10 = response1.removeCookie("");
        org.jsoup.Connection.Request request11 = response1.req;
        java.lang.String str13 = response1.cookie("hi!");
        java.lang.String str15 = response1.header("");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.cookies();
        int int17 = response1.statusCode();
        response1.statusCode = ' ';
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test20354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20354");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        response1.contentType = "hi!";
        int int10 = response1.statusCode();
        int int11 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.numRedirects = 1;
        java.lang.String str17 = response1.charset;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test20355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20355");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        boolean boolean6 = response1.hasCookie("");
        int int7 = response1.statusCode;
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.contentType();
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        java.lang.String str13 = response1.cookie("hi!");
        response1.statusMessage = "";
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test20356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20356");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.statusMessage = "";
        org.jsoup.Connection.Method method13 = response1.method();
        java.lang.String str15 = response1.getHeaderCaseInsensitive("");
        java.lang.String str16 = response1.contentType();
        java.lang.String str17 = response1.charset;
        java.lang.String str18 = response1.statusMessage();
        org.jsoup.Connection.Method method19 = response1.method();
        org.jsoup.Connection.Response response21 = response1.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean24 = response1.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray25 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test20357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20357");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        java.lang.String str15 = response1.header("hi!");
        boolean boolean17 = response1.hasHeader("hi!");
        java.lang.String str18 = response1.charset();
        boolean boolean20 = response1.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str22 = response1.statusMessage;
        org.jsoup.Connection.Request request23 = null;
        response1.req = request23;
        org.jsoup.Connection.Response response27 = response1.cookie("hi!", "");
        response1.statusCode = 1;
        java.lang.String str30 = response1.statusMessage();
        java.lang.String str31 = response1.statusMessage();
        int int32 = response1.statusCode;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test20358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20358");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        response1.executed = false;
        response1.contentType = "hi!";
        java.lang.String str9 = response1.statusMessage;
        java.lang.String str11 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str12 = response1.statusMessage();
        response1.contentType = "hi!";
        java.net.HttpURLConnection httpURLConnection15 = null;
        org.jsoup.Connection.Response response16 = null;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection15, response16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test20359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20359");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Method method6 = response1.method();
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str9 = response1.contentType;
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        int int12 = response1.statusCode;
        int int13 = response1.statusCode();
        org.jsoup.Connection.Method method14 = response1.method();
        java.lang.String str15 = response1.contentType();
        org.jsoup.Connection.Response response18 = response1.cookie("hi!", "hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test20360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20360");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        org.jsoup.Connection.Response response7 = response1.removeCookie("");
        java.net.URL uRL8 = response1.url();
        org.jsoup.Connection.Request request9 = response1.req;
        int int10 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        response1.statusCode = '4';
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test20361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20361");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        response1.statusCode = '#';
        response1.statusCode = (short) 1;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response12.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(byteBuffer7);
    }

    @Test
    public void test20362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20362");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Request request8 = response1.req;
        org.jsoup.Connection.Request request9 = response1.req;
        java.lang.String str10 = response1.contentType;
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test20363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20363");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("");
        response1.numRedirects = 35;
        response1.numRedirects = (byte) 1;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        org.jsoup.Connection.Request request13 = response1.req;
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(request13);
    }

    @Test
    public void test20364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20364");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusMessage = "";
        response1.statusMessage = "";
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        int int12 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Method method15 = response1.method();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test20365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20365");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        int int5 = response1.statusCode();
        response1.statusCode = 32;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.contentType;
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        java.lang.String str13 = response1.charset;
        response1.charset = "hi!";
        java.net.URL uRL16 = response1.url();
        org.jsoup.Connection.Request request17 = response1.req;
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(request17);
    }

    @Test
    public void test20366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20366");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        java.lang.String str4 = response1.contentType;
        java.lang.String str5 = response1.charset;
        java.lang.String str6 = response1.charset;
        java.lang.String str7 = response1.contentType();
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        response1.charset = "hi!";
        java.lang.String str13 = response1.getHeaderCaseInsensitive("hi!");
        response1.charset = "hi!";
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test20367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20367");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str11 = response1.charset();
        java.lang.String str12 = response1.charset;
        org.jsoup.Connection.Response response14 = response1.removeCookie("hi!");
        response1.numRedirects = (byte) -1;
        int int17 = response1.statusCode;
        java.lang.String str18 = response1.contentType;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test20368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20368");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        boolean boolean15 = response1.executed;
        java.lang.String str16 = response1.contentType();
        java.lang.String str17 = response1.charset();
        java.lang.String str19 = response1.getHeaderCaseInsensitive("hi!");
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.lang.String str22 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = response23.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test20369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20369");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        int int5 = response1.statusCode();
        org.jsoup.Connection.Response response8 = response1.header("hi!", "");
        org.jsoup.Connection.Request request9 = response1.req;
        java.lang.String str10 = response1.contentType();
        boolean boolean11 = response1.executed;
        response1.charset = "hi!";
        java.lang.String str14 = response1.statusMessage();
        java.lang.String str16 = response1.header("");
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test20370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20370");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        java.lang.String str16 = response1.statusMessage();
        response1.executed = true;
        response1.contentType = "";
        org.jsoup.Connection.Method method21 = response1.method();
        response1.statusCode = '#';
        java.nio.ByteBuffer byteBuffer24 = null;
        response1.byteData = byteBuffer24;
        response1.statusMessage = "hi!";
        java.nio.ByteBuffer byteBuffer28 = response1.byteData;
        java.lang.String str30 = response1.getHeaderCaseInsensitive("");
        java.lang.String str32 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(byteBuffer28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test20371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20371");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        response1.charset = "";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.lang.String str15 = response1.statusMessage();
        int int16 = response1.statusCode;
        java.lang.String str18 = response1.header("");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusCode = (byte) -1;
        java.net.URL uRL22 = response1.url();
        org.jsoup.Connection.Request request23 = null;
        response1.req = request23;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(uRL22);
    }

    @Test
    public void test20372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20372");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str12 = response1.header("");
        int int13 = response1.numRedirects;
        response1.contentType = "";
        java.lang.String str16 = response1.contentType;
        java.lang.String str17 = response1.charset();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test20373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20373");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.statusMessage();
        java.lang.String str14 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        java.net.URL uRL16 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test20374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20374");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.lang.String str10 = response1.cookie("");
        java.net.URL uRL11 = response1.url();
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        int int14 = response1.statusCode;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test20375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20375");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        org.jsoup.Connection.Method method5 = response2.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response2.scanHeaders("hi!");
        java.lang.String str8 = response2.contentType;
        java.lang.String str9 = response2.charset();
        java.nio.ByteBuffer byteBuffer10 = null;
        response2.byteData = byteBuffer10;
        java.net.URL uRL12 = response2.url();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response2.cookies();
        int int14 = response2.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test20376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20376");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        int int7 = response1.statusCode;
        java.lang.String str8 = response1.charset;
        java.lang.String str9 = response1.contentType;
        java.lang.String str10 = response1.contentType;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test20377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20377");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        java.lang.String str7 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method8 = response1.method();
        boolean boolean9 = response1.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("hi!");
        response1.statusMessage = "";
        int int14 = response1.statusCode;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test20378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20378");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        response10.statusMessage = "hi!";
        java.lang.String str13 = response10.statusMessage;
        java.nio.ByteBuffer byteBuffer14 = null;
        response10.byteData = byteBuffer14;
        int int16 = response10.numRedirects;
        response10.executed = true;
        java.lang.String str19 = response10.charset;
        java.lang.String str21 = response10.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = response10.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test20379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20379");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        response1.charset = "";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        response1.statusCode = ' ';
        int int16 = response1.statusCode();
        response1.numRedirects = '#';
        java.lang.String str19 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test20380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20380");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        org.jsoup.Connection.Method method5 = response2.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response2.byteData = byteBuffer6;
        java.nio.ByteBuffer byteBuffer8 = null;
        response2.byteData = byteBuffer8;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response2.scanHeaders("");
        java.lang.String str12 = response2.contentType;
        org.jsoup.Connection.Response response14 = response2.removeHeader("hi!");
        org.jsoup.Connection.Method method15 = response2.method();
        java.net.URL uRL16 = response2.url();
        org.jsoup.Connection.Request request17 = null;
        response2.req = request17;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test20381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20381");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        int int7 = response1.statusCode;
        java.lang.String str8 = response1.statusMessage();
        response1.charset = "hi!";
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        int int13 = response1.statusCode();
        org.jsoup.Connection.Response response15 = response1.removeCookie("");
        java.lang.String str16 = response1.charset();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test20382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20382");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = response2.req;
        int int4 = response2.statusCode;
        response2.executed = false;
        org.jsoup.Connection.Response response9 = response2.header("hi!", "hi!");
        java.net.URL uRL10 = response2.url();
        org.jsoup.Connection.Method method11 = response2.method();
        boolean boolean13 = response2.hasCookie("hi!");
        java.lang.String str15 = response2.cookie("");
        response2.numRedirects = (byte) 1;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test20383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20383");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "";
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        response1.statusCode = 100;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer13 = response12.byteData;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(byteBuffer13);
    }

    @Test
    public void test20384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20384");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        response1.contentType = "hi!";
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.statusMessage;
        response1.statusMessage = "hi!";
        response1.executed = true;
        org.jsoup.Connection.Request request17 = response1.req;
        java.lang.String str19 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test20385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20385");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        response1.numRedirects = (short) 100;
        boolean boolean8 = response1.hasCookie("");
        org.jsoup.Connection.Method method9 = response1.method();
        org.jsoup.Connection.Request request10 = response1.req;
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        org.jsoup.Connection.Request request12 = response1.req;
        response1.statusMessage = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(request12);
    }

    @Test
    public void test20386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20386");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        response1.numRedirects = (short) 100;
        boolean boolean8 = response1.hasCookie("");
        int int9 = response1.statusCode;
        boolean boolean11 = response1.hasHeader("hi!");
        response1.statusCode = (-1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test20387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20387");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        response1.charset = "";
        response1.contentType = "hi!";
        java.lang.String str14 = response1.getHeaderCaseInsensitive("");
        java.lang.String str15 = response1.contentType;
        response1.numRedirects = (short) 10;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.cookies();
        java.nio.ByteBuffer byteBuffer19 = null;
        response1.byteData = byteBuffer19;
        response1.contentType = "";
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test20388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20388");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusCode = (byte) 100;
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        int int10 = response1.numRedirects;
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        response1.contentType = "";
        response1.statusMessage = "hi!";
        response1.numRedirects = (short) 100;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test20389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20389");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.statusMessage();
        java.net.URL uRL14 = response1.url();
        java.lang.String str16 = response1.cookie("");
        int int17 = response1.numRedirects;
        java.lang.String str18 = response1.charset;
        java.net.URL uRL19 = response1.url();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(uRL19);
    }

    @Test
    public void test20390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20390");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.statusMessage;
        int int10 = response1.statusCode;
        response1.statusMessage = "";
        java.lang.String str13 = response1.charset();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test20391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20391");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.net.URL uRL12 = response1.url();
        java.lang.String str14 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        java.net.URL uRL19 = response1.url();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL19);
    }

    @Test
    public void test20392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20392");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        boolean boolean6 = response1.hasCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        java.lang.String str8 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        java.lang.String str12 = response1.contentType();
        org.jsoup.Connection.Response response15 = response1.header("hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = response1.getClass();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test20393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20393");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        java.lang.String str9 = response1.cookie("");
        org.jsoup.Connection.Method method10 = response1.method();
        int int11 = response1.statusCode();
        java.lang.String str12 = response1.statusMessage;
        int int13 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        boolean boolean16 = response1.hasHeader("hi!");
        response1.statusMessage = "";
        response1.statusCode = 0;
        response1.charset = "hi!";
        response1.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document26 = response25.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test20394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20394");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        int int7 = response1.statusCode;
        response1.numRedirects = (byte) -1;
        int int10 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test20395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20395");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        boolean boolean8 = response1.hasCookie("");
        org.jsoup.Connection.Request request9 = response1.req;
        response1.contentType = "";
        java.lang.String str12 = response1.contentType();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test20396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20396");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        int int7 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        int int9 = response1.statusCode();
        int int10 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        boolean boolean13 = response1.hasCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.net.URL uRL15 = response1.url();
        java.lang.String str16 = response1.contentType();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test20397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20397");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        int int12 = response1.statusCode;
        java.lang.String str13 = response1.contentType();
        java.lang.String str14 = response1.contentType();
        org.jsoup.Connection.Response response17 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request22 = null;
        response21.req = request22;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test20398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20398");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        response1.contentType = "hi!";
        boolean boolean15 = response1.hasHeader("hi!");
        int int16 = response1.statusCode();
        int int17 = response1.statusCode;
        java.lang.String str18 = response1.statusMessage();
        java.lang.String str19 = response1.charset();
        response1.contentType = "hi!";
        int int22 = response1.numRedirects;
        java.lang.String str23 = response1.charset;
        java.nio.ByteBuffer byteBuffer24 = null;
        response1.byteData = byteBuffer24;
        java.lang.String str26 = response1.statusMessage();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test20399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20399");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        response1.charset = "";
        response1.contentType = "hi!";
        java.lang.String str14 = response1.getHeaderCaseInsensitive("");
        java.lang.String str15 = response1.contentType;
        java.lang.String str16 = response1.statusMessage;
        response1.statusCode = (byte) 100;
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        java.net.URL uRL21 = response1.url();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(uRL21);
    }

    @Test
    public void test20400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20400");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        java.net.URL uRL5 = response2.url();
        org.jsoup.Connection.Response response7 = response2.removeCookie("");
        response2.statusCode = 100;
        boolean boolean10 = response2.executed;
        response2.statusCode = (short) -1;
        response2.numRedirects = (byte) 10;
        org.jsoup.Connection.Response response17 = response2.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test20401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20401");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        int int9 = response1.statusCode;
        response1.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int13 = response12.statusCode;
        java.lang.String str14 = response12.contentType;
        response12.statusCode = (-1);
        response12.statusCode = 0;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test20402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20402");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        response15.charset = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response15.headers();
        java.lang.String str20 = response15.header("");
        java.nio.ByteBuffer byteBuffer21 = null;
        response15.byteData = byteBuffer21;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response25 = response15.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test20403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20403");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        response1.statusCode = '4';
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        int int12 = response1.statusCode();
        response1.numRedirects = (short) 0;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test20404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20404");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        response1.statusMessage = "";
        java.net.URL uRL5 = response1.url();
        java.lang.String str6 = response1.contentType();
        boolean boolean8 = response1.hasCookie("hi!");
        int int9 = response1.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test20405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20405");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.statusMessage();
        java.net.URL uRL14 = response1.url();
        org.jsoup.Connection.Request request15 = response1.req;
        response1.contentType = "";
        org.jsoup.Connection.Response response19 = response1.removeCookie("hi!");
        response1.executed = false;
        java.lang.String str22 = response1.contentType();
        response1.executed = false;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test20406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20406");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        response1.numRedirects = (short) 100;
        boolean boolean8 = response1.hasCookie("");
        int int9 = response1.statusCode;
        int int10 = response1.numRedirects;
        int int11 = response1.statusCode();
        org.jsoup.Connection.Response response13 = response1.removeCookie("");
        int int14 = response1.statusCode;
        java.lang.String str15 = response1.contentType;
        org.jsoup.Connection.Response response17 = response1.removeHeader("hi!");
        response1.contentType = "hi!";
        java.lang.String str21 = response1.header("hi!");
        org.jsoup.Connection.Method method22 = response1.method();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(method22);
    }

    @Test
    public void test20407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20407");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        int int5 = response1.statusCode();
        response1.statusCode = 32;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.contentType;
        response1.charset = "";
        int int13 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        response1.statusMessage = "";
        response1.contentType = "hi!";
        org.jsoup.Connection.Method method19 = response1.method();
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test20408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20408");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusMessage = "";
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Response response11 = response1.cookie("hi!", "hi!");
        int int12 = response1.statusCode();
        java.lang.String str14 = response1.cookie("");
        org.jsoup.Connection.Response response16 = response1.removeCookie("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str20 = response1.statusMessage();
        java.lang.String str21 = response1.charset;
        java.lang.String str22 = response1.statusMessage;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test20409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20409");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str7 = response1.charset();
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        org.jsoup.Connection.Response response13 = response1.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test20410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20410");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.net.URL uRL7 = response1.url();
        boolean boolean9 = response1.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str11 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(byteBuffer13);
    }

    @Test
    public void test20411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20411");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusMessage = "";
        org.jsoup.Connection.Method method8 = response1.method();
        int int9 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        response1.executed = true;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(strEntry19);
    }

    @Test
    public void test20412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20412");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        java.lang.String str7 = response1.statusMessage;
        boolean boolean8 = response1.executed;
        java.net.URL uRL9 = response1.url();
        java.lang.String str10 = response1.contentType();
        java.lang.String str11 = response1.contentType();
        java.lang.String str13 = response1.cookie("");
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        boolean boolean16 = response1.executed;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test20413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20413");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        response1.statusMessage = "";
        java.lang.String str7 = response1.charset;
        java.lang.String str8 = response1.contentType;
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test20414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20414");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        response1.charset = "";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.lang.String str15 = response1.statusMessage();
        response1.numRedirects = (byte) 0;
        response1.charset = "hi!";
        org.jsoup.Connection.Response response21 = response1.removeCookie("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test20415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20415");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        response1.numRedirects = (short) 100;
        boolean boolean8 = response1.hasCookie("");
        int int9 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        org.jsoup.Connection.Method method11 = response1.method();
        response1.charset = "hi!";
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.lang.String str16 = response1.cookie("");
        java.net.URL uRL17 = response1.url();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test20416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20416");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        org.jsoup.Connection.Response response8 = response1.header("hi!", "hi!");
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Method method10 = response1.method();
        int int11 = response1.statusCode;
        java.net.URL uRL12 = response1.url();
        boolean boolean13 = response1.executed;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test20417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20417");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        response1.contentType = "";
        java.lang.String str14 = response1.contentType;
        int int15 = response1.numRedirects;
        java.lang.String str16 = response1.charset();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test20418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20418");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str5 = response1.header("");
        int int6 = response1.statusCode();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test20419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20419");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str12 = response1.header("");
        response1.numRedirects = (short) 0;
        response1.numRedirects = 52;
        boolean boolean18 = response1.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test20420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20420");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str12 = response1.header("");
        response1.numRedirects = (short) 0;
        java.lang.String str16 = response1.cookie("hi!");
        org.jsoup.Connection.Response response18 = response1.removeHeader("hi!");
        java.lang.String str20 = response1.cookie("");
        java.lang.String str22 = response1.getHeaderCaseInsensitive("");
        response1.charset = "";
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test20421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20421");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusMessage = "";
        response1.numRedirects = (short) 10;
        java.lang.String str10 = response1.statusMessage();
        java.lang.String str12 = response1.getHeaderCaseInsensitive("");
        java.lang.String str13 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test20422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20422");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        response1.charset = "";
        response1.contentType = "hi!";
        java.lang.String str14 = response1.getHeaderCaseInsensitive("");
        java.lang.String str15 = response1.contentType;
        response1.numRedirects = (short) 10;
        java.lang.String str18 = response1.statusMessage;
        java.net.URL uRL19 = response1.url();
        java.lang.String str20 = response1.charset;
        response1.statusCode = 35;
        java.lang.String str23 = response1.statusMessage();
        response1.statusCode = 35;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test20423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20423");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        int int7 = response1.statusCode;
        response1.numRedirects = (byte) -1;
        response1.statusMessage = "";
        java.lang.String str13 = response1.getHeaderCaseInsensitive("hi!");
        int int14 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test20424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20424");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Method method6 = response1.method();
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        int int8 = response1.statusCode;
        int int9 = response1.numRedirects;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test20425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20425");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        java.lang.String str11 = response1.statusMessage();
        int int12 = response1.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        java.lang.String str15 = response1.cookie("hi!");
        java.lang.String str16 = response1.contentType;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test20426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20426");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        int int5 = response1.statusCode();
        response1.statusCode = 32;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.contentType;
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        java.lang.String str14 = response1.cookie("hi!");
        org.jsoup.Connection.Response response16 = response1.removeCookie("hi!");
        java.lang.String str17 = response1.statusMessage;
        java.lang.String str18 = response1.charset();
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test20427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20427");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        response1.charset = "";
        response1.contentType = "hi!";
        java.lang.String str14 = response1.getHeaderCaseInsensitive("");
        java.lang.String str16 = response1.cookie("");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int18 = response1.statusCode();
        java.lang.String str19 = response1.contentType();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test20428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20428");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        response1.charset = "hi!";
        int int9 = response1.numRedirects;
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        response1.executed = true;
        int int14 = response1.statusCode();
        java.lang.String str15 = response1.contentType();
        org.jsoup.Connection.Response response17 = response1.removeCookie("");
        response1.numRedirects = (byte) -1;
        int int20 = response1.statusCode();
        java.lang.Class<?> wildcardClass21 = response1.getClass();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test20429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20429");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method7 = response1.method();
        java.lang.String str9 = response1.header("hi!");
        java.lang.String str11 = response1.cookie("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test20430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20430");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        java.lang.String str7 = response1.statusMessage;
        boolean boolean8 = response1.executed;
        java.net.URL uRL9 = response1.url();
        java.lang.String str11 = response1.getHeaderCaseInsensitive("");
        response1.numRedirects = (-1);
        java.lang.String str14 = response1.charset();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("hi!");
        java.lang.String str17 = response1.statusMessage();
        boolean boolean19 = response1.hasCookie("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test20431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20431");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        response1.charset = "";
        response1.contentType = "hi!";
        java.lang.String str14 = response1.getHeaderCaseInsensitive("");
        java.lang.String str15 = response1.contentType;
        response1.numRedirects = (short) 10;
        response1.charset = "hi!";
        java.lang.String str21 = response1.cookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        int int23 = response1.numRedirects;
        response1.executed = true;
        org.jsoup.Connection.Method method26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response27 = response1.method(method26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test20432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20432");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str11 = response1.charset();
        java.lang.String str12 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean16 = response1.executed;
        response1.executed = false;
        org.jsoup.Connection.Method method19 = response1.method();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        response20.numRedirects = 35;
        response20.statusCode = (short) 10;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test20433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20433");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        response1.charset = "";
        response1.numRedirects = (-1);
        response1.contentType = "hi!";
        org.jsoup.Connection.Response response18 = response1.removeCookie("");
        java.nio.ByteBuffer byteBuffer19 = response1.byteData;
        java.nio.ByteBuffer byteBuffer20 = response1.byteData;
        response1.numRedirects = (short) 1;
        java.net.HttpURLConnection httpURLConnection23 = null;
        org.jsoup.helper.HttpConnection.Response response24 = null;
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response24);
        response25.statusMessage = "";
        org.jsoup.Connection.Method method28 = response25.method();
        java.nio.ByteBuffer byteBuffer29 = null;
        response25.byteData = byteBuffer29;
        boolean boolean32 = response25.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer33 = response25.byteData;
        java.lang.String str35 = response25.cookie("");
        int int36 = response25.statusCode;
        java.lang.String str37 = response25.contentType();
        java.lang.String str38 = response25.contentType();
        java.lang.String str40 = response25.cookie("hi!");
        org.jsoup.Connection.Response response43 = response25.header("hi!", "hi!");
        java.net.URL uRL44 = response25.url();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection23, (org.jsoup.Connection.Response) response25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(byteBuffer19);
        org.junit.Assert.assertNull(byteBuffer20);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(byteBuffer33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(response43);
        org.junit.Assert.assertNull(uRL44);
    }

    @Test
    public void test20434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20434");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        java.lang.String str11 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        int int13 = response1.numRedirects;
        response1.statusCode = 'a';
        int int16 = response1.statusCode;
        java.lang.String str17 = response1.contentType;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test20435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20435");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.statusMessage;
        org.jsoup.Connection.Response response6 = response1.removeCookie("");
        java.lang.String str7 = response1.contentType();
        int int8 = response1.statusCode;
        boolean boolean10 = response1.hasCookie("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test20436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20436");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusMessage = "";
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.contentType;
        boolean boolean11 = response1.hasCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        org.jsoup.Connection.Response response14 = response1.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test20437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20437");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.charset;
        org.jsoup.Connection.Request request5 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        java.lang.String str7 = response1.charset;
        int int8 = response1.statusCode();
        response1.executed = true;
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(request5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test20438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20438");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        java.lang.String str12 = response1.contentType;
        java.lang.String str14 = response1.cookie("");
        int int15 = response1.statusCode();
        boolean boolean16 = response1.executed;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test20439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20439");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response8 = response1.removeHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset();
        java.lang.String str13 = response1.charset;
        response1.contentType = "";
        response1.charset = "";
        boolean boolean18 = response1.executed;
        java.nio.ByteBuffer byteBuffer19 = response1.byteData;
        java.lang.String str20 = response1.contentType;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(byteBuffer19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test20440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20440");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response8 = response1.removeHeader("hi!");
        response1.contentType = "";
        org.jsoup.Connection.Method method11 = response1.method();
        response1.statusCode = (-1);
        org.jsoup.Connection.Response response15 = response1.removeCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test20441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20441");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.headers();
        response1.contentType = "";
        response1.numRedirects = '#';
        java.lang.String str10 = response1.charset();
        boolean boolean12 = response1.hasHeader("hi!");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test20442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20442");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        org.jsoup.Connection.Response response6 = response1.removeCookie("");
        org.jsoup.Connection.Method method7 = response1.method();
        java.lang.String str8 = response1.contentType;
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test20443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20443");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str11 = response1.contentType;
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        org.jsoup.Connection.Method method14 = response1.method();
        response1.charset = "hi!";
        java.lang.String str18 = response1.header("");
        java.lang.String str19 = response1.contentType();
        int int20 = response1.numRedirects;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test20444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20444");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        org.jsoup.Connection.Method method5 = response2.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response2.byteData = byteBuffer6;
        org.jsoup.Connection.Request request8 = null;
        response2.req = request8;
        java.net.URL uRL10 = response2.url();
        org.jsoup.Connection.Response response12 = response2.removeCookie("");
        java.lang.String str13 = response2.contentType;
        org.jsoup.Connection.Request request14 = response2.req;
        java.nio.ByteBuffer byteBuffer15 = response2.byteData;
        java.nio.ByteBuffer byteBuffer16 = response2.byteData;
        java.lang.String str17 = response2.statusMessage();
        response2.charset = "";
        java.nio.ByteBuffer byteBuffer20 = null;
        response2.byteData = byteBuffer20;
        response2.contentType = "hi!";
        java.lang.String str24 = response2.charset();
        org.jsoup.Connection.Method method25 = response2.method();
        org.jsoup.Connection.Response response27 = response2.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response28 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNotNull(response27);
    }

    @Test
    public void test20445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20445");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.Connection.Response response10 = response1.removeCookie("");
        int int11 = response1.numRedirects;
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.lang.String str14 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean16 = response15.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response15.headers();
        java.lang.String str18 = response15.contentType;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test20446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20446");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str5 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str6 = response1.statusMessage();
        org.jsoup.Connection.Method method7 = response1.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        response9.statusMessage = "";
        org.jsoup.Connection.Response response14 = response9.header("hi!", "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test20447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20447");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        response1.statusMessage = "";
        java.lang.String str15 = response1.charset();
        boolean boolean16 = response1.executed;
        boolean boolean18 = response1.hasCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        java.lang.String str20 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean22 = response21.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response21.headers();
        java.lang.String str25 = response21.cookie("");
        java.nio.ByteBuffer byteBuffer26 = response21.byteData;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(byteBuffer26);
    }

    @Test
    public void test20448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20448");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        response1.statusMessage = "";
        java.lang.String str15 = response1.charset();
        boolean boolean16 = response1.executed;
        java.net.URL uRL17 = response1.url();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str20 = response1.header("hi!");
        boolean boolean22 = response1.hasCookie("");
        int int23 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test20449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20449");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Method method6 = response1.method();
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response11 = response1.cookie("hi!", "");
        response1.numRedirects = (short) 100;
        org.jsoup.Connection.Method method14 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test20450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20450");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str14 = response1.cookie("");
        response1.executed = false;
        org.jsoup.Connection.Method method17 = response1.method();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test20451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20451");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        java.lang.String str11 = response1.statusMessage();
        java.lang.String str13 = response1.header("");
        java.lang.String str14 = response1.charset();
        java.lang.String str15 = response1.charset;
        org.jsoup.Connection.Request request16 = response1.req;
        java.lang.String str18 = response1.getHeaderCaseInsensitive("hi!");
        boolean boolean20 = response1.hasCookie("hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test20452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20452");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        response1.charset = "";
        java.lang.String str12 = response1.cookie("");
        int int13 = response1.statusCode();
        java.lang.String str14 = response1.statusMessage;
        java.lang.String str15 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        org.jsoup.Connection.Response response18 = response1.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request20 = null;
        response19.req = request20;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test20453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20453");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        int int4 = response1.statusCode;
        response1.executed = false;
        java.lang.Class<?> wildcardClass7 = response1.getClass();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test20454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20454");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str11 = response1.contentType;
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        org.jsoup.Connection.Method method14 = response1.method();
        response1.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str21 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test20455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20455");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        int int10 = response1.statusCode;
        java.lang.String str12 = response1.header("");
        java.net.URL uRL13 = response1.url();
        java.lang.String str14 = response1.contentType;
        response1.executed = false;
        java.lang.String str18 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str19 = response1.statusMessage();
        java.lang.String str21 = response1.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test20456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20456");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.nio.ByteBuffer byteBuffer15 = null;
        response1.byteData = byteBuffer15;
        org.jsoup.Connection.Response response19 = response1.header("hi!", "hi!");
        java.lang.String str20 = response1.charset;
        java.lang.String str21 = response1.contentType();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test20457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20457");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.lang.String str10 = response1.cookie("hi!");
        response1.statusMessage = "hi!";
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test20458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20458");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "");
        boolean boolean18 = response1.hasHeader("hi!");
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Method method21 = response1.method();
        boolean boolean23 = response1.hasCookie("hi!");
        org.jsoup.Connection.Response response25 = response1.removeCookie("hi!");
        org.jsoup.Connection.Request request26 = response1.req;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNull(request26);
    }

    @Test
    public void test20459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20459");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        response1.executed = false;
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        int int10 = response1.numRedirects;
        int int11 = response1.statusCode();
        org.jsoup.Connection.Response response14 = response1.cookie("hi!", "hi!");
        response1.executed = false;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.cookies();
        response1.charset = "";
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test20460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20460");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        response1.charset = "";
        org.jsoup.Connection.Response response12 = response1.removeCookie("hi!");
        int int13 = response1.statusCode();
        java.lang.String str14 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        int int16 = response1.statusCode();
        java.lang.String str17 = response1.statusMessage;
        boolean boolean19 = response1.hasCookie("");
        org.jsoup.Connection.Response response21 = response1.removeCookie("");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test20461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20461");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str12 = response1.header("");
        int int13 = response1.numRedirects;
        int int14 = response1.numRedirects;
        org.jsoup.Connection.Response response16 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        boolean boolean19 = response1.executed;
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.lang.String str22 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response25 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test20462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20462");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.Connection.Response response10 = response1.removeCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        response1.statusMessage = "";
        java.net.URL uRL14 = response1.url();
        java.lang.String str15 = response1.statusMessage();
        org.jsoup.Connection.Request request16 = response1.req;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response17.method(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(request16);
    }

    @Test
    public void test20463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20463");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        response1.statusCode = '#';
        response1.statusCode = (short) 1;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response14 = response1.removeCookie("");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test20464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20464");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.statusMessage();
        java.lang.String str15 = response1.cookie("hi!");
        java.lang.String str16 = response1.statusMessage;
        boolean boolean17 = response1.executed;
        boolean boolean19 = response1.hasCookie("");
        java.lang.String str20 = response1.charset();
        boolean boolean22 = response1.hasCookie("");
        org.jsoup.Connection.Request request23 = response1.req;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(request23);
    }

    @Test
    public void test20465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20465");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str10 = response1.statusMessage();
        java.lang.String str12 = response1.getHeaderCaseInsensitive("");
        int int13 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(byteBuffer14);
    }

    @Test
    public void test20466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20466");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Method method6 = response1.method();
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        int int8 = response1.statusCode;
        java.lang.String str9 = response1.charset();
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        response1.statusCode = (-1);
        org.jsoup.Connection.Response response14 = response1.removeCookie("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test20467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20467");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        int int5 = response1.statusCode();
        response1.statusCode = 32;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.contentType;
        int int11 = response1.statusCode();
        int int12 = response1.statusCode();
        org.jsoup.Connection.Response response15 = response1.header("hi!", "hi!");
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test20468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20468");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        response1.charset = "";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        response1.statusCode = ' ';
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.cookies();
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusCode = ' ';
        response1.executed = true;
        java.lang.String str23 = response1.charset();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test20469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20469");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        response1.statusMessage = "";
        java.lang.String str15 = response1.charset();
        boolean boolean16 = response1.executed;
        java.net.URL uRL17 = response1.url();
        org.jsoup.Connection.Method method18 = response1.method();
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry22 = response1.scanHeaders("");
        response1.statusCode = 52;
        java.util.Map<java.lang.String, java.lang.String> strMap25 = response1.headers();
        java.net.HttpURLConnection httpURLConnection26 = null;
        org.jsoup.helper.HttpConnection.Response response27 = null;
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response27);
        response28.statusMessage = "";
        org.jsoup.Connection.Method method31 = response28.method();
        java.nio.ByteBuffer byteBuffer32 = null;
        response28.byteData = byteBuffer32;
        org.jsoup.Connection.Request request34 = null;
        response28.req = request34;
        java.net.URL uRL36 = response28.url();
        org.jsoup.Connection.Response response38 = response28.removeCookie("");
        java.lang.String str39 = response28.contentType;
        org.jsoup.Connection.Request request40 = response28.req;
        java.lang.String str42 = response28.header("hi!");
        boolean boolean44 = response28.hasHeader("hi!");
        java.lang.String str45 = response28.charset();
        boolean boolean47 = response28.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response48 = new org.jsoup.helper.HttpConnection.Response(response28);
        java.lang.String str49 = response48.statusMessage;
        boolean boolean50 = response48.executed;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection26, (org.jsoup.Connection.Response) response48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(strEntry22);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNull(uRL36);
        org.junit.Assert.assertNotNull(response38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(request40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test20470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20470");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.charset();
        java.lang.String str14 = response1.header("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("");
        java.net.URL uRL17 = response1.url();
        org.jsoup.Connection.Response response19 = response1.removeHeader("hi!");
        java.lang.String str20 = response1.charset;
        java.net.URL uRL21 = response1.url();
        int int22 = response1.statusCode();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test20471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20471");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        boolean boolean6 = response1.hasCookie("");
        int int7 = response1.statusCode;
        org.jsoup.Connection.Request request8 = response1.req;
        org.jsoup.Connection.Request request9 = response1.req;
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.lang.String str15 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str18 = response1.cookie("hi!");
        org.jsoup.Connection.Response response20 = response1.removeCookie("");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test20472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20472");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        response1.charset = "";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        org.jsoup.Connection.Response response16 = response1.removeCookie("hi!");
        response1.charset = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        int int20 = response1.numRedirects;
        java.lang.String str21 = response1.statusMessage();
        org.jsoup.Connection.Request request22 = response1.req;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(request22);
    }

    @Test
    public void test20473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20473");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        response1.charset = "hi!";
        response1.statusMessage = "";
        response1.statusCode = 'a';
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test20474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20474");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        java.lang.String str7 = response1.statusMessage;
        boolean boolean8 = response1.executed;
        response1.statusCode = 1;
        int int11 = response1.statusCode();
        boolean boolean13 = response1.hasCookie("");
        int int14 = response1.statusCode();
        response1.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("");
        org.jsoup.Connection.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.method(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(strEntry18);
    }

    @Test
    public void test20475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20475");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.statusMessage = "";
        org.jsoup.Connection.Method method13 = response1.method();
        java.lang.String str15 = response1.getHeaderCaseInsensitive("");
        java.lang.String str16 = response1.contentType();
        java.lang.String str17 = response1.charset;
        java.lang.String str18 = response1.statusMessage();
        org.jsoup.Connection.Method method19 = response1.method();
        org.jsoup.Connection.Response response21 = response1.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response25 = response22.cookie("hi!", "hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(response25);
    }

    @Test
    public void test20476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20476");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.charset;
        org.jsoup.Connection.Request request5 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        java.lang.String str7 = response1.charset;
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        java.lang.String str10 = response1.charset;
        org.jsoup.Connection.Method method11 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(request5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test20477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20477");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        org.jsoup.Connection.Method method13 = response1.method();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test20478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20478");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        java.lang.String str7 = response1.getHeaderCaseInsensitive("");
        boolean boolean9 = response1.hasCookie("hi!");
        int int10 = response1.statusCode;
        int int11 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request13 = response1.req;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(request13);
    }

    @Test
    public void test20479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20479");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        int int11 = response1.statusCode;
        java.net.URL uRL12 = response1.url();
        java.lang.String str14 = response1.header("");
        java.lang.String str15 = response1.statusMessage;
        int int16 = response1.numRedirects;
        java.lang.String str18 = response1.header("");
        org.jsoup.Connection.Response response20 = response1.removeCookie("hi!");
        java.lang.String str21 = response1.charset();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test20480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20480");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        int int5 = response1.statusCode();
        java.net.URL uRL6 = response1.url();
        org.jsoup.Connection.Request request7 = response1.req;
        response1.contentType = "";
        response1.numRedirects = 'a';
        response1.numRedirects = 10;
        java.net.URL uRL14 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        java.lang.String str19 = response1.cookie("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test20481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20481");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Response response12 = response1.cookie("hi!", "");
        response1.numRedirects = 1;
        java.lang.String str15 = response1.contentType();
        java.lang.String str16 = response1.charset;
        org.jsoup.Connection.Request request17 = response1.req;
        org.jsoup.Connection.Response response19 = response1.removeHeader("hi!");
        java.lang.String str21 = response1.cookie("");
        boolean boolean23 = response1.hasCookie("");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test20482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20482");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusCode = (byte) 100;
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        java.lang.String str11 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Request request12 = response1.req;
        java.lang.String str13 = response1.contentType;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test20483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20483");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.Connection.Response response10 = response1.removeCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        response1.numRedirects = (-1);
        response1.charset = "";
        response1.statusCode = 32;
        org.jsoup.Connection.Method method21 = response1.method();
        response1.charset = "hi!";
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(method21);
    }

    @Test
    public void test20484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20484");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        boolean boolean15 = response1.executed;
        java.lang.String str16 = response1.contentType();
        int int17 = response1.statusCode();
        int int18 = response1.statusCode();
        java.net.URL uRL19 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document20 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(uRL19);
    }

    @Test
    public void test20485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20485");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str10 = response1.statusMessage;
        int int11 = response1.numRedirects;
        java.lang.String str12 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test20486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20486");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "");
        boolean boolean18 = response1.hasHeader("hi!");
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Method method21 = response1.method();
        java.lang.String str22 = response1.statusMessage();
        response1.statusMessage = "";
        response1.statusCode = 100;
        org.jsoup.Connection.Request request27 = response1.req;
        java.nio.ByteBuffer byteBuffer28 = response1.byteData;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(request27);
        org.junit.Assert.assertNull(byteBuffer28);
    }

    @Test
    public void test20487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20487");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        response1.charset = "";
        response1.numRedirects = (-1);
        response1.contentType = "hi!";
        java.lang.String str17 = response1.contentType();
        java.lang.String str19 = response1.cookie("");
        java.nio.ByteBuffer byteBuffer20 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response23 = response21.removeCookie("");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(byteBuffer20);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test20488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20488");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = response2.req;
        int int4 = response2.statusCode;
        response2.executed = false;
        response2.statusMessage = "hi!";
        org.jsoup.Connection.Response response10 = response2.removeCookie("");
        org.jsoup.Connection.Response response12 = response2.removeHeader("hi!");
        java.lang.String str13 = response2.contentType;
        java.lang.String str15 = response2.header("");
        boolean boolean17 = response2.hasCookie("");
        java.lang.String str18 = response2.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test20489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20489");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.charset;
        response1.numRedirects = (byte) -1;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        org.jsoup.Connection.Response response10 = response1.removeCookie("");
        org.jsoup.Connection.Response response13 = response1.cookie("hi!", "hi!");
        java.lang.String str15 = response1.header("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test20490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20490");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        int int5 = response1.statusCode();
        response1.statusCode = 32;
        response1.executed = false;
        java.lang.String str10 = response1.contentType;
        int int11 = response1.statusCode();
        boolean boolean13 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer15 = response14.byteData;
        response14.statusMessage = "";
        boolean boolean18 = response14.executed;
        org.jsoup.Connection.Request request19 = response14.req;
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(request19);
    }

    @Test
    public void test20491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20491");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusMessage = "";
        org.jsoup.Connection.Method method8 = response1.method();
        int int9 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("hi!");
        response1.statusCode = '#';
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        java.lang.String str20 = response1.cookie("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test20492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20492");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        boolean boolean15 = response1.executed;
        java.lang.String str16 = response1.contentType();
        java.lang.String str17 = response1.charset();
        java.lang.String str19 = response1.getHeaderCaseInsensitive("hi!");
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.lang.String str22 = response1.contentType;
        boolean boolean24 = response1.hasHeader("hi!");
        int int25 = response1.statusCode();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test20493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20493");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.Connection.Response response11 = null;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection10, response11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(byteBuffer9);
    }

    @Test
    public void test20494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20494");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean9 = response1.executed;
        java.lang.String str11 = response1.cookie("hi!");
        response1.executed = false;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer15 = response14.byteData;
        org.jsoup.Connection.Response response17 = response14.removeCookie("");
        java.lang.String str18 = response14.charset;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test20495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20495");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        java.net.URL uRL5 = response2.url();
        int int6 = response2.statusCode();
        org.jsoup.Connection.Response response9 = response2.header("hi!", "");
        org.jsoup.Connection.Request request10 = response2.req;
        java.lang.String str11 = response2.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response2.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response2.cookies();
        java.lang.String str15 = response2.getHeaderCaseInsensitive("hi!");
        response2.charset = "hi!";
        org.jsoup.Connection.Request request18 = response2.req;
        response2.statusMessage = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response21 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(request18);
    }

    @Test
    public void test20496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20496");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.net.URL uRL7 = response1.url();
        boolean boolean9 = response1.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "";
        response1.charset = "hi!";
        java.net.URL uRL15 = response1.url();
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.cookies();
        org.jsoup.Connection.Response response21 = response1.cookie("hi!", "");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test20497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20497");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.Connection.Response response10 = response1.removeCookie("");
        int int11 = response1.numRedirects;
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        response1.contentType = "hi!";
        int int16 = response1.statusCode;
        org.jsoup.Connection.Method method17 = response1.method();
        response1.statusMessage = "";
        boolean boolean21 = response1.hasCookie("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test20498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20498");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        org.jsoup.Connection.Request request4 = response1.req;
        java.lang.String str5 = response1.statusMessage;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(request4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test20499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20499");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.net.URL uRL12 = response1.url();
        response1.statusMessage = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("");
        response1.numRedirects = 'a';
        java.lang.String str19 = response1.charset();
        response1.charset = "";
        org.jsoup.Connection.Method method22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.method(method22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test20500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20500");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        response1.numRedirects = (short) 100;
        boolean boolean8 = response1.hasCookie("");
        int int9 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        java.lang.String str11 = response1.statusMessage();
        int int12 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        java.lang.String str16 = response1.contentType();
        org.jsoup.Connection.Method method17 = response1.method();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
    }
}
