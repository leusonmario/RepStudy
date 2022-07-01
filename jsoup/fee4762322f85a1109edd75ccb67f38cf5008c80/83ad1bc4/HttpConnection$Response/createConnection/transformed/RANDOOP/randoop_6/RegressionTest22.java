import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest22 {

    public static boolean debug = false;

    @Test
    public void test11001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11001");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.charset;
        response1.contentType = "hi!";
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        java.lang.String str12 = response1.cookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        int int14 = response1.numRedirects;
        java.lang.String str15 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test11002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11002");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        int int8 = response1.statusCode;
        int int9 = response1.statusCode;
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        response1.numRedirects = (short) -1;
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        java.lang.String str16 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        java.net.HttpURLConnection httpURLConnection20 = null;
        org.jsoup.Connection.Response response21 = null;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection20, response21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test11003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11003");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.charset = "";
        org.jsoup.Connection.Response response6 = response2.removeCookie("hi!");
        boolean boolean8 = response2.hasCookie("hi!");
        org.jsoup.Connection.Response response11 = response2.cookie("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test11004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11004");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        int int8 = response1.statusCode;
        int int9 = response1.statusCode;
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        response1.numRedirects = (short) -1;
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        java.lang.String str16 = response1.statusMessage();
        java.lang.String str17 = response1.contentType;
        java.lang.String str18 = response1.charset;
        java.lang.String str20 = response1.header("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response1.headers();
        java.lang.String str22 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document23 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test11005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11005");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.lang.String str5 = response1.charset();
        response1.charset = "";
        response1.numRedirects = (-1);
        response1.numRedirects = (short) 1;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        java.net.URL uRL14 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test11006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11006");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        java.net.URL uRL4 = response1.url();
        java.lang.String str5 = response1.statusMessage();
        java.lang.String str6 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.removeCookie("hi!");
        boolean boolean10 = response1.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11007");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.net.URL uRL5 = response1.url();
        response1.statusCode = (-1);
        boolean boolean9 = response1.hasHeader("hi!");
        response1.contentType = "hi!";
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.charset;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11008");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.lang.String str5 = response1.statusMessage();
        java.lang.String str6 = response1.charset();
        java.lang.String str7 = response1.contentType();
        java.net.URL uRL8 = response1.url();
        response1.statusCode = 10;
        int int11 = response1.numRedirects;
        response1.contentType = "hi!";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test11009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11009");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int3 = response2.statusCode;
        response2.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response2.cookies();
        boolean boolean8 = response2.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response2.headers();
        java.net.URL uRL10 = response2.url();
        java.lang.String str11 = response2.statusMessage;
        org.jsoup.Connection.Response response14 = response2.header("hi!", "");
        int int15 = response2.numRedirects;
        java.lang.String str16 = response2.charset;
        int int17 = response2.statusCode();
        java.lang.String str18 = response2.contentType;
        java.lang.String str19 = response2.contentType;
        org.jsoup.Connection.Response response21 = response2.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response22 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test11010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11010");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        java.net.URL uRL6 = response1.url();
        java.lang.String str7 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("");
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        int int12 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test11011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11011");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        response1.contentType = "hi!";
        java.lang.String str6 = response1.statusMessage;
        java.lang.String str7 = response1.contentType;
        response1.numRedirects = (short) 1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test11012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11012");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.net.URL uRL9 = response1.url();
        java.lang.String str10 = response1.statusMessage;
        org.jsoup.Connection.Response response13 = response1.header("hi!", "");
        int int14 = response1.statusCode();
        int int15 = response1.numRedirects;
        response1.statusCode = 97;
        int int18 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer19 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.headers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNull(byteBuffer19);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test11013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11013");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        java.net.URL uRL7 = response1.url();
        response1.numRedirects = (byte) -1;
        java.lang.String str10 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11014");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.charset;
        java.lang.String str7 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer9 = null;
        response8.byteData = byteBuffer9;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test11015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11015");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        int int8 = response1.statusCode;
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        java.lang.String str11 = response1.charset();
        int int12 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = response1.hasHeaderWithValue("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test11016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11016");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.lang.String str8 = response1.contentType();
        response1.statusMessage = "hi!";
        java.lang.String str12 = response1.header("");
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        response1.contentType = "";
        java.lang.String str18 = response1.header("");
        java.lang.Class<?> wildcardClass19 = response1.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test11017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11017");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.net.URL uRL9 = response1.url();
        java.lang.String str10 = response1.statusMessage;
        org.jsoup.Connection.Response response13 = response1.header("hi!", "");
        int int14 = response1.numRedirects;
        java.net.URL uRL15 = response1.url();
        int int16 = response1.numRedirects;
        org.jsoup.Connection.Response response19 = response1.header("hi!", "");
        boolean boolean21 = response1.hasHeader("hi!");
        java.lang.String str22 = response1.contentType;
        org.jsoup.Connection.Request request23 = null;
        response1.req = request23;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test11018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11018");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.lang.String str5 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        response1.numRedirects = (short) 0;
        java.lang.String str10 = response1.cookie("hi!");
        org.jsoup.Connection.Response response13 = response1.cookie("hi!", "hi!");
        response1.charset = "hi!";
        response1.statusMessage = "hi!";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        java.lang.String str20 = response1.statusMessage;
        java.nio.ByteBuffer byteBuffer21 = null;
        response1.byteData = byteBuffer21;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response1.cookies();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test11019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11019");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.lang.String str9 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("");
        java.lang.String str12 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11020");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        int int8 = response1.statusCode;
        int int9 = response1.statusCode;
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        response1.numRedirects = (short) -1;
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        java.lang.String str16 = response1.statusMessage();
        org.jsoup.Connection.Request request17 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = response1.hasHeaderWithValue("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(request17);
    }

    @Test
    public void test11021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11021");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.charset;
        response1.contentType = "hi!";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test11022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11022");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean9 = response1.hasHeaderWithValue("hi!", "hi!");
        java.lang.String str10 = response1.statusMessage();
        response1.statusMessage = "";
        java.lang.String str13 = response1.contentType;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11023");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.charset;
        boolean boolean11 = response1.executed;
        boolean boolean13 = response1.hasHeader("hi!");
        java.lang.String str15 = response1.header("hi!");
        boolean boolean17 = response1.hasCookie("hi!");
        java.lang.String str18 = response1.statusMessage;
        java.nio.ByteBuffer byteBuffer19 = null;
        response1.byteData = byteBuffer19;
        java.lang.String str22 = response1.header("hi!");
        response1.executed = true;
        response1.executed = false;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test11024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11024");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.charset();
        response1.statusMessage = "";
        boolean boolean14 = response1.hasHeader("hi!");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11025");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        java.nio.ByteBuffer byteBuffer6 = response1.byteData;
        boolean boolean8 = response1.hasHeader("hi!");
        java.lang.String str10 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str12 = response1.header("hi!");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11026");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        int int8 = response1.statusCode;
        int int9 = response1.statusCode;
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        response1.numRedirects = (short) -1;
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.cookies();
        java.lang.String str17 = response1.contentType();
        java.lang.String str19 = response1.cookie("hi!");
        response1.executed = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test11027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11027");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Request request6 = response1.req;
        org.jsoup.Connection.Response response9 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        java.net.URL uRL12 = response1.url();
        org.jsoup.Connection.Response response14 = response1.removeHeader("hi!");
        response1.numRedirects = 0;
        org.jsoup.Connection.Response response18 = response1.removeHeader("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test11028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11028");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.numRedirects = (short) 10;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        org.jsoup.Connection.Response response12 = response1.header("hi!", "");
        int int13 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        response1.statusMessage = "";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test11029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11029");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Request request7 = response1.req;
        java.lang.String str8 = response1.statusMessage;
        response1.statusMessage = "hi!";
        response1.statusMessage = "hi!";
        response1.numRedirects = 0;
        response1.executed = true;
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        java.lang.String str19 = response1.statusMessage;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test11030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11030");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.numRedirects = (short) 10;
        response1.contentType = "";
        java.lang.String str7 = response1.contentType();
        response1.charset = "hi!";
        java.lang.String str11 = response1.header("");
        response1.statusCode = (-1);
        java.lang.String str14 = response1.statusMessage;
        java.lang.String str15 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.headers();
        int int19 = response1.statusCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test11031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11031");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        java.net.URL uRL7 = response1.url();
        response1.charset = "hi!";
        org.jsoup.Connection.Response response11 = response1.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str13 = response12.statusMessage();
        org.jsoup.Connection.Response response16 = response12.header("hi!", "hi!");
        java.lang.String str17 = response12.statusMessage;
        java.lang.String str18 = response12.statusMessage;
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test11032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11032");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.numRedirects = (short) 10;
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Method method6 = response1.method();
        response1.statusMessage = "";
        org.jsoup.Connection.Request request9 = response1.req;
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        response1.executed = false;
        boolean boolean16 = response1.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.Connection.Request request17 = response1.req;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(request17);
    }

    @Test
    public void test11033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11033");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        int int7 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        org.jsoup.Connection.Request request9 = response1.req;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test11034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11034");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        java.lang.String str9 = response1.cookie("hi!");
        int int10 = response1.statusCode();
        org.jsoup.Connection.Request request11 = response1.req;
        response1.statusMessage = "hi!";
        boolean boolean14 = response1.executed;
        java.lang.String str16 = response1.header("hi!");
        response1.charset = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test11035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11035");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        java.net.URL uRL7 = response1.url();
        response1.charset = "hi!";
        boolean boolean10 = response1.executed;
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        java.lang.String str13 = response1.statusMessage;
        java.lang.String str14 = response1.charset;
        response1.charset = "hi!";
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test11036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11036");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.net.URL uRL5 = response1.url();
        response1.numRedirects = (byte) 1;
        response1.numRedirects = (short) 0;
        java.lang.String str10 = response1.statusMessage;
        java.lang.String str12 = response1.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11037");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        response1.contentType = "hi!";
        java.lang.String str9 = response1.cookie("hi!");
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Request request12 = response1.req;
        org.jsoup.Connection.Response response15 = response1.header("hi!", "");
        response1.executed = false;
        boolean boolean20 = response1.hasHeaderWithValue("hi!", "hi!");
        response1.statusCode = (short) 100;
        java.net.URL uRL23 = response1.url();
        java.lang.String str25 = response1.getHeaderCaseInsensitive("hi!");
        int int26 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test11038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11038");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.numRedirects = 10;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response12 = response1.cookie("hi!", "hi!");
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        int int15 = response1.numRedirects;
        java.net.URL uRL16 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test11039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11039");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (byte) 1;
        response1.executed = false;
        java.net.URL uRL6 = response1.url();
        java.lang.String str7 = response1.charset;
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        response1.statusCode = (-1);
        boolean boolean13 = response1.hasHeader("hi!");
        org.jsoup.Connection.Response response15 = response1.removeCookie("hi!");
        java.lang.Class<?> wildcardClass16 = response15.getClass();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11040");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.lang.String str8 = response1.contentType();
        response1.statusMessage = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        org.jsoup.Connection.Method method13 = response1.method();
        boolean boolean14 = response1.executed;
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        org.jsoup.Connection.Response response18 = response1.removeCookie("hi!");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test11041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11041");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        response1.contentType = "hi!";
        java.lang.String str9 = response1.cookie("hi!");
        java.lang.String str10 = response1.contentType();
        java.lang.String str11 = response1.contentType;
        int int12 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test11042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11042");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.numRedirects = (short) 10;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        org.jsoup.Connection.Response response12 = response1.header("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        response1.statusMessage = "hi!";
        response1.statusCode = 1;
        java.lang.String str19 = response1.getHeaderCaseInsensitive("");
        response1.numRedirects = (short) 10;
        java.lang.String str22 = response1.contentType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test11043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11043");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.lang.String str5 = response1.charset();
        response1.charset = "";
        org.jsoup.Connection.Response response9 = response1.removeHeader("hi!");
        response1.numRedirects = (byte) 10;
        response1.statusMessage = "hi!";
        java.lang.String str14 = response1.statusMessage();
        response1.charset = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test11044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11044");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "hi!");
        org.jsoup.Connection.Method method7 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = response1.hasHeaderWithValue("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test11045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11045");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.charset;
        boolean boolean11 = response1.executed;
        java.lang.String str12 = response1.statusMessage();
        org.jsoup.Connection.Response response15 = response1.header("hi!", "");
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test11046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11046");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        org.jsoup.Connection.Response response11 = response1.cookie("hi!", "");
        org.jsoup.Connection.Request request12 = response1.req;
        boolean boolean15 = response1.hasHeaderWithValue("hi!", "");
        java.lang.String str16 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test11047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11047");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.numRedirects = (short) 10;
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Method method6 = response1.method();
        response1.statusMessage = "";
        java.lang.String str10 = response1.cookie("hi!");
        java.lang.String str12 = response1.header("hi!");
        response1.numRedirects = 100;
        java.lang.String str15 = response1.contentType;
        response1.charset = "hi!";
        java.lang.String str18 = response1.contentType();
        java.lang.String str19 = response1.charset();
        java.lang.String str21 = response1.getHeaderCaseInsensitive("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test11048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11048");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.numRedirects = 10;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response12 = response1.cookie("hi!", "hi!");
        boolean boolean13 = response1.executed;
        java.lang.String str14 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        java.lang.String str16 = response1.statusMessage;
        int int17 = response1.statusCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test11049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11049");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.statusMessage();
        int int10 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test11050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11050");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        response1.contentType = "hi!";
        java.lang.String str9 = response1.cookie("hi!");
        response1.statusMessage = "hi!";
        java.lang.String str12 = response1.contentType();
        java.lang.String str13 = response1.charset();
        int int14 = response1.statusCode;
        java.lang.String str15 = response1.statusMessage;
        response1.numRedirects = (short) 100;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.headers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test11051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11051");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        response1.contentType = "hi!";
        java.lang.String str11 = response1.cookie("hi!");
        java.lang.String str12 = response1.statusMessage;
        java.lang.String str13 = response1.statusMessage();
        response1.numRedirects = 'a';
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11052");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.charset;
        java.lang.String str7 = response1.getHeaderCaseInsensitive("");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.lang.String str9 = response1.statusMessage();
        response1.executed = false;
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        response14.contentType = "hi!";
        org.jsoup.Connection.Method method17 = response14.method();
        response14.contentType = "hi!";
        java.net.URL uRL20 = response14.url();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response14.headers();
        boolean boolean24 = response14.hasHeaderWithValue("hi!", "");
        java.net.HttpURLConnection httpURLConnection25 = null;
        org.jsoup.helper.HttpConnection.Response response26 = null;
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response26);
        int int28 = response27.statusCode;
        java.lang.String str30 = response27.getHeaderCaseInsensitive("");
        response27.statusMessage = "hi!";
        java.lang.String str33 = response27.charset();
        org.jsoup.Connection.Response response36 = response27.cookie("hi!", "");
        org.jsoup.Connection.Request request37 = response27.req;
        boolean boolean38 = response27.executed;
        int int39 = response27.statusCode();
        org.jsoup.helper.HttpConnection.Response response40 = new org.jsoup.helper.HttpConnection.Response(response27);
        // The following exception was thrown during execution in test generation
        try {
            response14.setupFromConnection(httpURLConnection25, (org.jsoup.Connection.Response) response27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(response36);
        org.junit.Assert.assertNull(request37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test11053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11053");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.numRedirects = (short) 10;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        org.jsoup.Connection.Response response12 = response1.header("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        response1.statusMessage = "hi!";
        response1.statusCode = 1;
        java.lang.String str19 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Request request20 = null;
        response1.req = request20;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test11054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11054");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.charset;
        java.lang.String str6 = response1.statusMessage;
        java.lang.String str7 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test11055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11055");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        boolean boolean4 = response1.executed;
        response1.contentType = "hi!";
        boolean boolean7 = response1.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.net.URL uRL10 = response1.url();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test11056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11056");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        response1.numRedirects = 0;
        int int9 = response1.statusCode();
        response1.statusMessage = "hi!";
        response1.numRedirects = (short) 0;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        response1.statusMessage = "";
        java.lang.String str20 = response1.header("hi!");
        org.jsoup.Connection.Response response23 = response1.cookie("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test11057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11057");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.lang.String str5 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        org.jsoup.Connection.Response response12 = response1.removeCookie("hi!");
        java.lang.String str13 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str15 = response1.contentType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11058");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        int int6 = response1.numRedirects;
        java.lang.String str7 = response1.statusMessage();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("");
        response1.numRedirects = (short) 1;
        response1.executed = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strEntry9);
    }

    @Test
    public void test11059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11059");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        boolean boolean4 = response1.executed;
        response1.contentType = "hi!";
        java.lang.String str7 = response1.contentType;
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        org.jsoup.Connection.Method method10 = response1.method();
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        java.net.URL uRL14 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test11060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11060");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        org.jsoup.Connection.Method method3 = response1.method();
        int int4 = response1.statusCode();
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        java.lang.String str11 = response1.statusMessage;
        response1.executed = false;
        int int14 = response1.numRedirects;
        java.lang.String str15 = response1.statusMessage();
        int int16 = response1.statusCode();
        java.lang.String str17 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response1.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strEntry19);
    }

    @Test
    public void test11061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11061");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        java.net.URL uRL4 = response1.url();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.lang.String str9 = response1.cookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.lang.String str14 = response1.contentType();
        boolean boolean17 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.Connection.Response response20 = response1.header("hi!", "hi!");
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test11062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11062");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        response1.contentType = "hi!";
        java.lang.String str6 = response1.statusMessage;
        java.lang.String str7 = response1.contentType;
        response1.numRedirects = (short) 1;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        org.jsoup.Connection.Response response14 = response1.header("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test11063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11063");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.numRedirects = (short) 10;
        boolean boolean5 = response1.executed;
        java.net.URL uRL6 = response1.url();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Response response12 = response1.header("hi!", "");
        response1.executed = false;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(byteBuffer15);
    }

    @Test
    public void test11064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11064");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.statusMessage();
        org.jsoup.Connection.Request request11 = response1.req;
        java.net.URL uRL12 = response1.url();
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.lang.String str16 = response1.header("");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test11065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11065");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        response1.contentType = "hi!";
        java.lang.String str9 = response1.cookie("hi!");
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        response1.statusCode = (byte) -1;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        response1.numRedirects = 97;
        response1.numRedirects = 97;
        java.nio.ByteBuffer byteBuffer21 = response1.byteData;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(byteBuffer21);
    }

    @Test
    public void test11066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11066");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.executed = false;
        int int8 = response1.statusCode();
        response1.statusCode = (byte) 1;
        java.lang.String str11 = response1.statusMessage();
        response1.statusMessage = "";
        int int14 = response1.statusCode();
        org.jsoup.Connection.Response response16 = response1.removeCookie("hi!");
        java.nio.ByteBuffer byteBuffer17 = null;
        response1.byteData = byteBuffer17;
        java.lang.String str19 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        java.lang.String str21 = response1.statusMessage;
        java.lang.String str23 = response1.cookie("hi!");
        org.jsoup.Connection.Response response25 = response1.removeCookie("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(response25);
    }

    @Test
    public void test11067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11067");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        java.lang.String str9 = response1.cookie("hi!");
        int int10 = response1.statusCode();
        org.jsoup.Connection.Request request11 = response1.req;
        response1.statusMessage = "hi!";
        response1.statusCode = (byte) 10;
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        response1.executed = true;
        java.nio.ByteBuffer byteBuffer20 = response1.byteData;
        org.jsoup.Connection.Response response23 = response1.header("hi!", "");
        java.lang.Class<?> wildcardClass24 = response1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(byteBuffer20);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test11068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11068");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.statusMessage();
        java.lang.String str12 = response1.cookie("hi!");
        java.lang.String str14 = response1.header("hi!");
        java.lang.String str15 = response1.statusMessage();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11069");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("");
        response1.charset = "";
        boolean boolean10 = response1.executed;
        int int11 = response1.numRedirects;
        int int12 = response1.statusCode;
        java.lang.String str13 = response1.charset;
        java.lang.String str15 = response1.header("");
        java.lang.String str16 = response1.charset;
        boolean boolean17 = response1.executed;
        java.net.URL uRL18 = response1.url();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(uRL18);
    }

    @Test
    public void test11070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11070");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        response1.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int9 = response1.numRedirects;
        response1.numRedirects = 0;
        response1.charset = "";
        java.lang.String str14 = response1.contentType();
        org.jsoup.Connection.Request request15 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(request15);
    }

    @Test
    public void test11071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11071");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        java.net.URL uRL11 = response1.url();
        org.jsoup.Connection.Request request12 = response1.req;
        response1.statusMessage = "";
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(request12);
    }

    @Test
    public void test11072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11072");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        org.jsoup.Connection.Method method6 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.lang.String str10 = response1.cookie("hi!");
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.headers();
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.method(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test11073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11073");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        org.jsoup.Connection.Method method3 = response1.method();
        int int4 = response1.statusCode();
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        response1.executed = false;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        java.lang.String str12 = response1.contentType();
        java.net.URL uRL13 = response1.url();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test11074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11074");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.lang.String str9 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        java.lang.String str13 = response1.statusMessage;
        java.lang.String str15 = response1.cookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response19 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response21 = response1.removeHeader("hi!");
        response1.contentType = "hi!";
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test11075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11075");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Request request6 = null;
        response1.req = request6;
        response1.contentType = "";
        java.lang.String str10 = response1.contentType;
        response1.charset = "hi!";
        java.net.URL uRL13 = response1.url();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test11076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11076");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.charset;
        java.lang.String str7 = response1.getHeaderCaseInsensitive("");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        int int9 = response1.statusCode();
        java.lang.String str10 = response1.charset;
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11077");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.net.URL uRL5 = response1.url();
        response1.numRedirects = (byte) 1;
        response1.numRedirects = (short) 0;
        response1.contentType = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("hi!");
        java.lang.String str15 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str16 = response1.charset;
        java.lang.String str17 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(strEntry19);
    }

    @Test
    public void test11078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11078");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("");
        response1.charset = "";
        response1.numRedirects = (byte) 1;
        int int12 = response1.numRedirects;
        java.lang.String str13 = response1.statusMessage;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11079");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        response1.contentType = "hi!";
        java.lang.String str9 = response1.cookie("hi!");
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        int int14 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str18 = response1.contentType();
        boolean boolean19 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11080");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.numRedirects = 10;
        response1.statusMessage = "hi!";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("hi!");
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test11081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11081");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.lang.String str5 = response1.getHeaderCaseInsensitive("");
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        org.jsoup.Connection.Response response9 = response1.removeCookie("hi!");
        java.lang.String str10 = response1.statusMessage;
        java.net.URL uRL11 = response1.url();
        response1.statusCode = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test11082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11082");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        org.jsoup.Connection.Method method6 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.lang.String str10 = response1.cookie("hi!");
        java.net.URL uRL11 = response1.url();
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.net.URL uRL14 = response1.url();
        java.lang.Class<?> wildcardClass15 = response1.getClass();
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11083");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode;
        java.lang.String str11 = response1.statusMessage;
        java.lang.String str12 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11084");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.numRedirects = 10;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response12 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("hi!");
        response1.numRedirects = (short) 10;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response17.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(strEntry14);
    }

    @Test
    public void test11085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11085");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.numRedirects = (short) 10;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        org.jsoup.Connection.Response response12 = response1.header("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        response1.statusMessage = "hi!";
        response1.statusCode = 1;
        java.lang.String str19 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Request request20 = null;
        response1.req = request20;
        java.lang.String str23 = response1.getHeaderCaseInsensitive("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test11086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11086");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        java.lang.String str9 = response1.cookie("hi!");
        java.lang.String str11 = response1.header("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        int int13 = response1.statusCode();
        org.jsoup.Connection.Request request14 = response1.req;
        response1.statusMessage = "";
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        java.lang.String str18 = response1.contentType;
        java.nio.ByteBuffer byteBuffer19 = null;
        response1.byteData = byteBuffer19;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test11087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11087");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        java.lang.String str7 = response1.charset;
        response1.executed = false;
        boolean boolean10 = response1.executed;
        response1.statusMessage = "";
        java.lang.String str13 = response1.statusMessage();
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document16 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test11088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11088");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        java.lang.String str9 = response1.charset;
        response1.numRedirects = 0;
        boolean boolean13 = response1.hasCookie("hi!");
        response1.statusCode = 52;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11089");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.lang.String str5 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        org.jsoup.Connection.Response response12 = response1.removeCookie("hi!");
        int int13 = response1.numRedirects;
        java.lang.String str14 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test11090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11090");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        org.jsoup.Connection.Method method6 = response1.method();
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        java.lang.String str9 = response1.contentType;
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        java.lang.String str12 = response1.statusMessage;
        int int13 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        response1.numRedirects = 0;
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test11091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11091");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.lang.String str9 = response1.cookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.headers();
        org.jsoup.Connection.Response response15 = response1.removeCookie("hi!");
        response1.statusMessage = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = response1.hasHeaderWithValue("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test11092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11092");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.statusMessage();
        org.jsoup.Connection.Method method6 = response1.method();
        boolean boolean9 = response1.hasHeaderWithValue("hi!", "hi!");
        java.lang.String str10 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11093");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        response1.statusMessage = "hi!";
        java.lang.String str7 = response1.charset();
        java.lang.String str9 = response1.cookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType();
        response1.statusMessage = "";
        int int15 = response1.numRedirects;
        int int16 = response1.numRedirects;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test11094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11094");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        java.net.URL uRL7 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        int int9 = response1.statusCode();
        java.lang.String str10 = response1.charset();
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        response13.statusCode = (short) 100;
        org.jsoup.Connection.Request request16 = null;
        response13.req = request16;
        org.jsoup.Connection.Method method18 = response13.method();
        response13.charset = "hi!";
        int int21 = response13.statusCode;
        java.lang.String str22 = response13.statusMessage();
        org.jsoup.Connection.Response response24 = response13.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection11, response24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(response24);
    }

    @Test
    public void test11095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11095");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        org.jsoup.Connection.Method method3 = response1.method();
        int int4 = response1.statusCode();
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        int int13 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test11096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11096");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        response1.contentType = "hi!";
        java.lang.String str9 = response1.cookie("hi!");
        response1.statusMessage = "hi!";
        java.lang.String str12 = response1.contentType;
        response1.contentType = "hi!";
        java.lang.String str16 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.cookies();
        java.lang.String str18 = response1.contentType();
        int int19 = response1.statusCode();
        java.lang.String str21 = response1.cookie("hi!");
        java.lang.String str23 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry25 = response1.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = response1.hasHeaderWithValue("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(strEntry25);
    }

    @Test
    public void test11097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11097");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        response1.contentType = "hi!";
        java.lang.String str9 = response1.cookie("hi!");
        response1.statusMessage = "hi!";
        java.lang.String str13 = response1.header("");
        java.lang.String str14 = response1.contentType;
        java.lang.String str15 = response1.statusMessage();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test11098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11098");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode;
        java.lang.String str6 = response1.charset;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        boolean boolean10 = response1.executed;
        java.lang.String str11 = response1.statusMessage();
        java.lang.String str12 = response1.contentType;
        java.net.URL uRL13 = response1.url();
        java.lang.String str14 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test11099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11099");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.executed = false;
        int int8 = response1.statusCode();
        response1.statusCode = (byte) 1;
        java.lang.String str11 = response1.charset();
        java.lang.String str13 = response1.header("hi!");
        org.jsoup.Connection.Response response16 = response1.header("hi!", "");
        org.jsoup.Connection.Response response19 = response1.cookie("hi!", "hi!");
        org.jsoup.Connection.Response response22 = response1.header("hi!", "hi!");
        java.lang.Class<?> wildcardClass23 = response1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test11100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11100");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        java.nio.ByteBuffer byteBuffer6 = response1.byteData;
        boolean boolean8 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        java.lang.String str10 = response1.statusMessage();
        java.net.URL uRL11 = response1.url();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test11101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11101");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        java.net.URL uRL4 = response1.url();
        java.lang.String str5 = response1.contentType();
        boolean boolean8 = response1.hasHeaderWithValue("hi!", "");
        java.lang.String str10 = response1.header("hi!");
        boolean boolean11 = response1.executed;
        java.net.URL uRL12 = response1.url();
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test11102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11102");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        boolean boolean4 = response1.executed;
        response1.contentType = "hi!";
        boolean boolean7 = response1.executed;
        boolean boolean9 = response1.hasHeader("hi!");
        java.lang.String str10 = response1.statusMessage();
        boolean boolean12 = response1.hasCookie("hi!");
        response1.statusCode = (short) -1;
        org.jsoup.Connection.Response response17 = response1.header("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test11103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11103");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.net.URL uRL9 = response1.url();
        java.lang.String str10 = response1.statusMessage;
        org.jsoup.Connection.Response response13 = response1.header("hi!", "");
        int int14 = response1.statusCode();
        response1.contentType = "hi!";
        boolean boolean19 = response1.hasHeaderWithValue("hi!", "hi!");
        boolean boolean22 = response1.hasHeaderWithValue("hi!", "");
        int int23 = response1.numRedirects;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test11104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11104");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        response1.numRedirects = 0;
        int int9 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        response1.statusMessage = "hi!";
        boolean boolean16 = response1.hasHeaderWithValue("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11105");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (byte) 1;
        boolean boolean5 = response1.hasCookie("hi!");
        int int6 = response1.statusCode();
        java.lang.String str7 = response1.charset();
        int int8 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        int int10 = response1.statusCode();
        java.lang.String str12 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test11106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11106");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        org.jsoup.Connection.Method method3 = response1.method();
        java.lang.String str5 = response1.getHeaderCaseInsensitive("hi!");
        response1.contentType = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test11107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11107");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.charset;
        response1.statusCode = (-1);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.headers();
        java.lang.String str14 = response1.contentType();
        response1.statusCode = '#';
        boolean boolean18 = response1.hasHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response1.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = response21.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(strEntry20);
    }

    @Test
    public void test11108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11108");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        response1.charset = "hi!";
        java.net.URL uRL10 = response1.url();
        boolean boolean12 = response1.hasCookie("hi!");
        int int13 = response1.statusCode();
        java.lang.String str15 = response1.header("hi!");
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.method(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11109");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        org.jsoup.Connection.Method method6 = response1.method();
        response1.charset = "hi!";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        response1.numRedirects = (short) 10;
        java.lang.String str13 = response1.contentType();
        org.jsoup.Connection.Request request14 = response1.req;
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        java.lang.String str17 = response1.contentType;
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test11110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11110");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.charset;
        response1.contentType = "hi!";
        java.lang.String str9 = response1.header("hi!");
        response1.statusMessage = "";
        response1.statusCode = 1;
        response1.charset = "hi!";
        int int16 = response1.statusCode();
        org.jsoup.Connection.Method method17 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document18 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test11111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11111");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        org.jsoup.Connection.Method method3 = response1.method();
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        response1.contentType = "hi!";
        org.jsoup.Connection.Request request8 = response1.req;
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        response1.charset = "";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(strEntry12);
    }

    @Test
    public void test11112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11112");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        org.jsoup.Connection.Method method3 = response1.method();
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.nio.ByteBuffer byteBuffer6 = response1.byteData;
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test11113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11113");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        response1.statusMessage = "hi!";
        java.lang.String str7 = response1.charset();
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "");
        org.jsoup.Connection.Request request11 = response1.req;
        boolean boolean12 = response1.executed;
        int int13 = response1.statusCode();
        boolean boolean14 = response1.executed;
        java.lang.String str15 = response1.charset();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11114");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Request request6 = null;
        response1.req = request6;
        boolean boolean9 = response1.hasHeader("hi!");
        response1.charset = "hi!";
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        response1.numRedirects = (byte) 100;
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.cookies();
        org.jsoup.Connection.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.method(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test11115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11115");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        response1.executed = true;
        int int8 = response1.numRedirects;
        response1.statusMessage = "";
        int int11 = response1.numRedirects;
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test11116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11116");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.numRedirects = (short) 10;
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Method method6 = response1.method();
        boolean boolean7 = response1.executed;
        java.lang.String str8 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        int int10 = response1.statusCode;
        java.lang.String str11 = response1.contentType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test11117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11117");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        int int8 = response1.statusCode;
        int int9 = response1.statusCode;
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        response1.numRedirects = (short) -1;
        java.lang.String str14 = response1.contentType();
        java.net.URL uRL15 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        response1.charset = "";
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.url(uRL19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test11118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11118");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.numRedirects = (short) 10;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        org.jsoup.Connection.Request request6 = null;
        response1.req = request6;
        java.lang.String str8 = response1.statusMessage();
        java.lang.String str10 = response1.header("hi!");
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        response1.numRedirects = '4';
        java.lang.String str15 = response1.getHeaderCaseInsensitive("");
        java.lang.String str16 = response1.charset;
        java.lang.String str17 = response1.contentType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test11119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11119");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        org.jsoup.Connection.Method method3 = response1.method();
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.nio.ByteBuffer byteBuffer6 = response1.byteData;
        response1.statusMessage = "";
        boolean boolean9 = response1.executed;
        response1.contentType = "";
        java.lang.String str12 = response1.contentType();
        response1.contentType = "hi!";
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11120");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        org.jsoup.Connection.Method method6 = response1.method();
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        java.lang.String str9 = response1.contentType;
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        java.lang.String str12 = response1.statusMessage;
        java.lang.String str14 = response1.header("hi!");
        java.lang.String str15 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("");
        org.jsoup.Connection.Response response19 = response1.removeCookie("hi!");
        java.lang.Class<?> wildcardClass20 = response19.getClass();
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test11121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11121");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        response1.contentType = "hi!";
        java.lang.String str9 = response1.cookie("hi!");
        java.lang.String str10 = response1.contentType();
        java.lang.String str11 = response1.statusMessage;
        java.lang.String str12 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.headers();
        java.lang.String str15 = response1.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11122");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        java.lang.String str15 = response1.statusMessage;
        org.jsoup.Connection.Request request16 = response1.req;
        java.net.URL uRL17 = response1.url();
        response1.numRedirects = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test11123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11123");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        int int5 = response1.statusCode;
        response1.charset = "";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response11 = response8.cookie("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test11124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11124");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        response1.contentType = "hi!";
        java.lang.String str9 = response1.cookie("hi!");
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        org.jsoup.Connection.Request request14 = response1.req;
        int int15 = response1.numRedirects;
        boolean boolean17 = response1.hasHeader("hi!");
        response1.statusMessage = "";
        java.lang.String str21 = response1.getHeaderCaseInsensitive("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test11125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11125");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode;
        java.lang.String str6 = response1.charset;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Response response9 = response1.removeCookie("hi!");
        org.jsoup.Connection.Request request10 = response1.req;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean13 = response11.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response11.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11126");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11127");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        response1.contentType = "hi!";
        java.lang.String str11 = response1.cookie("hi!");
        java.lang.String str12 = response1.statusMessage;
        java.lang.String str13 = response1.statusMessage();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("");
        response1.numRedirects = (byte) 0;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strEntry15);
    }

    @Test
    public void test11128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11128");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        org.jsoup.Connection.Method method3 = response1.method();
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.nio.ByteBuffer byteBuffer6 = response1.byteData;
        response1.statusMessage = "";
        int int9 = response1.statusCode;
        java.lang.String str10 = response1.charset();
        org.jsoup.Connection.Method method11 = response1.method();
        response1.statusCode = (short) 10;
        boolean boolean14 = response1.executed;
        java.lang.String str16 = response1.cookie("hi!");
        org.jsoup.Connection.Request request17 = response1.req;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(request17);
    }

    @Test
    public void test11129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11129");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        java.nio.ByteBuffer byteBuffer6 = response1.byteData;
        boolean boolean8 = response1.hasHeader("hi!");
        int int9 = response1.statusCode();
        boolean boolean10 = response1.executed;
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        response1.statusCode = (-1);
        response1.numRedirects = 100;
        response1.contentType = "";
        response1.statusCode = (short) 1;
        java.lang.String str22 = response1.header("");
        java.net.URL uRL23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response1.url(uRL23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test11130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11130");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (byte) 1;
        response1.executed = false;
        int int6 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test11131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11131");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.net.URL uRL5 = response1.url();
        org.jsoup.Connection.Request request6 = response1.req;
        java.lang.String str7 = response1.charset();
        boolean boolean9 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        java.lang.String str12 = response1.cookie("hi!");
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        java.lang.String str14 = response1.charset();
        java.net.URL uRL15 = response1.url();
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        response1.statusMessage = "";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test11132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11132");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int3 = response2.statusCode;
        java.lang.String str4 = response2.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        java.lang.String str8 = response2.header("hi!");
        int int9 = response2.statusCode;
        int int10 = response2.statusCode;
        java.net.URL uRL11 = response2.url();
        response2.executed = true;
        response2.contentType = "hi!";
        response2.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test11133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11133");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        java.lang.String str5 = response1.getHeaderCaseInsensitive("hi!");
        boolean boolean7 = response1.hasHeader("hi!");
        response1.charset = "hi!";
        java.lang.String str10 = response1.statusMessage();
        response1.charset = "";
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str15 = response1.statusMessage();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11134");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        int int6 = response1.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        org.jsoup.Connection.Request request10 = response1.req;
        java.lang.String str11 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = response1.hasHeaderWithValue("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test11135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11135");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.net.URL uRL5 = response1.url();
        response1.numRedirects = (byte) 1;
        response1.numRedirects = (short) 0;
        java.lang.String str10 = response1.statusMessage;
        boolean boolean11 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        java.lang.String str16 = response1.cookie("hi!");
        java.lang.String str17 = response1.charset;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test11136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11136");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Request request6 = null;
        response1.req = request6;
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        java.net.URL uRL11 = response1.url();
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.lang.String str14 = response1.statusMessage();
        response1.statusCode = (short) 10;
        java.net.URL uRL17 = response1.url();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test11137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11137");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        int int8 = response1.statusCode;
        int int9 = response1.statusCode;
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        response1.numRedirects = (short) -1;
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        java.lang.String str16 = response1.statusMessage;
        response1.charset = "";
        org.jsoup.Connection.Response response20 = response1.removeCookie("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test11138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11138");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.lang.String str5 = response1.getHeaderCaseInsensitive("");
        boolean boolean6 = response1.executed;
        int int7 = response1.statusCode();
        response1.statusCode = '4';
        java.lang.Class<?> wildcardClass10 = response1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11139");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        org.jsoup.Connection.Method method3 = response1.method();
        int int4 = response1.statusCode();
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        response1.executed = true;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        boolean boolean12 = response1.hasHeaderWithValue("hi!", "");
        int int13 = response1.statusCode;
        java.lang.String str14 = response1.statusMessage;
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test11140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11140");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.executed = false;
        int int8 = response1.statusCode();
        response1.statusCode = (byte) 1;
        java.lang.String str11 = response1.statusMessage();
        java.lang.String str12 = response1.contentType();
        int int13 = response1.numRedirects;
        java.lang.String str14 = response1.contentType();
        java.lang.String str15 = response1.contentType();
        int int16 = response1.statusCode();
        java.lang.String str18 = response1.header("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test11141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11141");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        java.lang.String str6 = response1.statusMessage();
        java.net.URL uRL7 = response1.url();
        response1.statusMessage = "";
        response1.statusCode = ' ';
        java.lang.String str12 = response1.statusMessage();
        java.lang.String str13 = response1.charset();
        java.lang.Class<?> wildcardClass14 = response1.getClass();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11142");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        int int7 = response1.numRedirects;
        java.net.URL uRL8 = response1.url();
        response1.statusCode = 97;
        int int11 = response1.statusCode();
        java.lang.String str12 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response13.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11143");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.lang.String str9 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        java.lang.String str13 = response1.statusMessage;
        java.lang.String str14 = response1.statusMessage();
        java.lang.String str15 = response1.charset();
        java.lang.String str16 = response1.contentType();
        java.lang.String str17 = response1.charset();
        java.lang.String str18 = response1.charset();
        org.jsoup.Connection.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.method(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11144");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        java.net.URL uRL8 = response1.url();
        response1.statusMessage = "";
        java.lang.String str11 = response1.contentType();
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        java.lang.String str14 = response1.contentType;
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test11145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11145");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        org.jsoup.Connection.Method method3 = response1.method();
        int int4 = response1.statusCode();
        int int5 = response1.statusCode;
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Method method7 = response1.method();
        response1.numRedirects = 35;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test11146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11146");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasCookie("hi!");
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        java.lang.String str15 = response1.cookie("hi!");
        java.lang.String str16 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test11147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11147");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        org.jsoup.Connection.Method method3 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        int int6 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean9 = response1.hasHeader("hi!");
        java.lang.Class<?> wildcardClass10 = response1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11148");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.net.URL uRL9 = response1.url();
        java.lang.String str10 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        int int12 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("hi!");
        response1.contentType = "";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(strEntry14);
    }

    @Test
    public void test11149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11149");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        org.jsoup.Connection.Method method3 = response1.method();
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.nio.ByteBuffer byteBuffer6 = response1.byteData;
        response1.statusMessage = "";
        boolean boolean9 = response1.executed;
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        java.lang.String str12 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11150");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        org.jsoup.Connection.Method method3 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.getHeaderCaseInsensitive("hi!");
        int int8 = response1.numRedirects;
        int int9 = response1.statusCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test11151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11151");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.numRedirects = (short) 10;
        boolean boolean5 = response1.executed;
        java.net.URL uRL6 = response1.url();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str12 = response1.header("");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = response1.hasHeaderWithValue("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11152");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        java.net.URL uRL7 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        response1.contentType = "";
        java.lang.String str12 = response1.cookie("hi!");
        org.jsoup.Connection.Request request13 = response1.req;
        response1.contentType = "hi!";
        response1.executed = false;
        response1.numRedirects = 100;
        java.lang.String str20 = response1.contentType();
        java.nio.ByteBuffer byteBuffer21 = null;
        response1.byteData = byteBuffer21;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test11153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11153");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        java.lang.String str9 = response1.cookie("hi!");
        int int10 = response1.statusCode();
        java.lang.String str11 = response1.charset;
        response1.executed = false;
        response1.executed = true;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.cookies();
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        java.lang.String str19 = response1.header("");
        java.lang.String str20 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test11154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11154");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        org.jsoup.Connection.Method method3 = response1.method();
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.nio.ByteBuffer byteBuffer6 = response1.byteData;
        response1.statusMessage = "";
        int int9 = response1.numRedirects;
        java.net.URL uRL10 = response1.url();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test11155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11155");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.contentType;
        int int10 = response1.statusCode();
        response1.executed = false;
        java.lang.String str13 = response1.charset();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("hi!");
        response1.statusCode = (short) 100;
        response1.executed = false;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strEntry15);
    }

    @Test
    public void test11156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11156");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType();
        int int6 = response1.statusCode;
        int int7 = response1.statusCode;
        response1.statusCode = 'a';
        java.net.URL uRL10 = response1.url();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test11157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11157");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        java.lang.String str5 = response1.getHeaderCaseInsensitive("hi!");
        java.net.URL uRL6 = response1.url();
        org.jsoup.Connection.Request request7 = response1.req;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(request7);
    }

    @Test
    public void test11158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11158");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        int int6 = response1.statusCode();
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.lang.String str10 = response1.getHeaderCaseInsensitive("hi!");
        response1.charset = "hi!";
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11159");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.statusMessage();
        int int10 = response1.statusCode;
        response1.statusCode = (short) 1;
        java.net.URL uRL13 = response1.url();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test11160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11160");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.net.URL uRL9 = response1.url();
        java.lang.String str10 = response1.statusMessage;
        org.jsoup.Connection.Response response13 = response1.header("hi!", "");
        int int14 = response1.numRedirects;
        org.jsoup.Connection.Response response16 = response1.removeCookie("hi!");
        int int17 = response1.statusCode();
        org.jsoup.Connection.Method method18 = response1.method();
        org.jsoup.Connection.Method method19 = response1.method();
        boolean boolean21 = response1.hasHeader("hi!");
        org.jsoup.Connection.Request request22 = null;
        response1.req = request22;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document24 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test11161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11161");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.contentType;
        response1.statusMessage = "hi!";
        response1.numRedirects = 10;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test11162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11162");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.lang.String str9 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("");
        org.jsoup.Connection.Method method12 = response1.method();
        int int13 = response1.numRedirects;
        java.lang.String str14 = response1.statusMessage();
        java.net.HttpURLConnection httpURLConnection15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        int int18 = response17.statusCode;
        response17.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response17.cookies();
        org.jsoup.Connection.Method method22 = response17.method();
        response17.contentType = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection15, (org.jsoup.Connection.Response) response17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(method22);
    }

    @Test
    public void test11163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11163");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Request request10 = response1.req;
        response1.statusCode = (byte) 1;
        org.jsoup.Connection.Response response15 = response1.cookie("hi!", "");
        org.jsoup.Connection.Request request16 = response1.req;
        response1.charset = "hi!";
        response1.numRedirects = 97;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry22 = response1.scanHeaders("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertNull(strEntry22);
    }

    @Test
    public void test11164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11164");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int3 = response2.statusCode;
        java.lang.String str4 = response2.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        response2.numRedirects = 10;
        response2.statusMessage = "hi!";
        org.jsoup.Connection.Response response13 = response2.cookie("hi!", "hi!");
        boolean boolean14 = response2.executed;
        java.lang.String str15 = response2.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response2.cookies();
        response2.charset = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test11165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11165");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        org.jsoup.Connection.Response response5 = response1.header("hi!", "");
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        java.lang.String str9 = response1.contentType;
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        response12.statusCode = (short) 100;
        org.jsoup.Connection.Request request15 = null;
        response12.req = request15;
        org.jsoup.Connection.Method method17 = response12.method();
        response12.charset = "hi!";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response12.scanHeaders("hi!");
        response12.numRedirects = (short) 10;
        java.lang.String str24 = response12.contentType();
        org.jsoup.Connection.Request request25 = null;
        response12.req = request25;
        org.jsoup.Connection.Response response28 = response12.removeHeader("hi!");
        response12.numRedirects = (-1);
        java.lang.String str32 = response12.getHeaderCaseInsensitive("");
        boolean boolean35 = response12.hasHeaderWithValue("hi!", "");
        org.jsoup.Connection.Method method36 = response12.method();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(strEntry21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(method36);
    }

    @Test
    public void test11166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11166");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        response1.contentType = "hi!";
        java.lang.String str9 = response1.cookie("hi!");
        java.lang.String str10 = response1.contentType();
        java.lang.String str11 = response1.statusMessage;
        java.lang.String str12 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.headers();
        java.lang.String str15 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        org.jsoup.Connection.Method method17 = response1.method();
        response1.executed = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test11167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11167");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.net.URL uRL9 = response1.url();
        java.lang.String str10 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        int int12 = response1.numRedirects;
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        java.lang.String str15 = response1.contentType;
        response1.statusCode = (short) 10;
        int int18 = response1.statusCode;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test11168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11168");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "");
        java.lang.String str10 = response1.statusMessage;
        java.lang.String str11 = response1.charset;
        boolean boolean12 = response1.executed;
        org.jsoup.Connection.Response response14 = response1.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = response1.hasHeaderWithValue("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test11169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11169");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        boolean boolean4 = response1.executed;
        response1.contentType = "hi!";
        boolean boolean7 = response1.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        boolean boolean10 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response1.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11170");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        int int5 = response1.statusCode;
        response1.charset = "";
        java.net.HttpURLConnection httpURLConnection8 = null;
        org.jsoup.helper.HttpConnection.Response response9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        int int11 = response10.statusCode;
        response10.numRedirects = (short) 10;
        boolean boolean14 = response10.executed;
        java.net.URL uRL15 = response10.url();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response10.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response10.scanHeaders("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response10.scanHeaders("");
        java.lang.String str22 = response10.charset();
        int int23 = response10.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection8, (org.jsoup.Connection.Response) response10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNull(strEntry21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test11171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11171");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.net.URL uRL9 = response1.url();
        java.lang.String str10 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response11.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11172");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        boolean boolean4 = response1.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("hi!");
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        response1.charset = "";
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test11173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11173");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.numRedirects = (short) 10;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        response1.numRedirects = 0;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        int int13 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test11174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11174");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.lang.String str9 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("");
        int int12 = response1.numRedirects;
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        java.net.URL uRL15 = response1.url();
        response1.executed = false;
        org.jsoup.Connection.Method method18 = response1.method();
        response1.executed = false;
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(method18);
    }

    @Test
    public void test11175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11175");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.charset;
        boolean boolean11 = response1.executed;
        boolean boolean13 = response1.hasHeader("hi!");
        boolean boolean16 = response1.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.Connection.Response response19 = response1.header("hi!", "hi!");
        response1.contentType = "hi!";
        int int22 = response1.statusCode();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test11176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11176");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.charset;
        boolean boolean11 = response1.executed;
        boolean boolean13 = response1.hasHeader("hi!");
        boolean boolean16 = response1.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.Connection.Response response19 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        response1.contentType = "";
        java.lang.String str24 = response1.charset();
        org.jsoup.Connection.Method method25 = response1.method();
        java.lang.String str27 = response1.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test11177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11177");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("");
        response1.charset = "";
        boolean boolean10 = response1.executed;
        response1.executed = true;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11178");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (byte) 1;
        boolean boolean5 = response1.hasCookie("hi!");
        response1.executed = true;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test11179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11179");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.statusMessage();
        int int10 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str15 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean18 = response1.executed;
        response1.charset = "";
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test11180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11180");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (byte) 1;
        boolean boolean5 = response1.hasCookie("hi!");
        response1.executed = true;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        response1.statusMessage = "hi!";
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test11181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11181");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        int int7 = response1.numRedirects;
        response1.charset = "";
        java.lang.String str10 = response1.statusMessage;
        boolean boolean11 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test11182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11182");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        boolean boolean4 = response1.executed;
        response1.contentType = "hi!";
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.lang.String str9 = response1.contentType;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test11183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11183");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.numRedirects = (short) 10;
        response1.contentType = "";
        java.lang.String str7 = response1.contentType();
        response1.charset = "hi!";
        java.lang.String str11 = response1.header("");
        response1.charset = "hi!";
        int int14 = response1.numRedirects;
        int int15 = response1.statusCode;
        org.jsoup.Connection.Request request16 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.url(uRL18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test11184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11184");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.statusMessage();
        java.lang.String str11 = response1.contentType;
        java.lang.String str13 = response1.header("");
        java.lang.String str14 = response1.statusMessage;
        org.jsoup.Connection.Response response16 = response1.removeCookie("hi!");
        response1.numRedirects = (short) 100;
        org.jsoup.Connection.Response response21 = response1.header("hi!", "");
        int int22 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response1.headers();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test11185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11185");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.charset;
        java.lang.String str7 = response1.getHeaderCaseInsensitive("");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.lang.String str9 = response1.statusMessage();
        response1.executed = false;
        response1.numRedirects = 97;
        java.lang.String str14 = response1.statusMessage();
        boolean boolean15 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        org.jsoup.Connection.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.method(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test11186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11186");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.net.URL uRL9 = response1.url();
        java.lang.String str10 = response1.statusMessage;
        org.jsoup.Connection.Response response13 = response1.header("hi!", "");
        int int14 = response1.numRedirects;
        org.jsoup.Connection.Response response16 = response1.removeCookie("hi!");
        int int17 = response1.statusCode();
        org.jsoup.Connection.Method method18 = response1.method();
        org.jsoup.Connection.Method method19 = response1.method();
        boolean boolean21 = response1.hasHeader("hi!");
        int int22 = response1.numRedirects;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test11187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11187");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        int int8 = response1.statusCode;
        int int9 = response1.statusCode;
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        response1.numRedirects = (short) -1;
        java.lang.String str14 = response1.contentType();
        int int15 = response1.statusCode;
        java.lang.String str16 = response1.statusMessage();
        org.jsoup.Connection.Method method17 = response1.method();
        response1.statusMessage = "hi!";
        boolean boolean20 = response1.executed;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test11188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11188");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        boolean boolean4 = response1.executed;
        int int5 = response1.numRedirects;
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        java.lang.String str9 = response1.contentType;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test11189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11189");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("");
        response1.charset = "";
        boolean boolean10 = response1.executed;
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response1.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11190");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int10 = response1.numRedirects;
        java.lang.String str11 = response1.statusMessage;
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        boolean boolean13 = response1.executed;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11191");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.lang.String str5 = response1.statusMessage();
        response1.executed = true;
        java.lang.String str9 = response1.header("");
        java.lang.String str10 = response1.contentType();
        java.lang.String str12 = response1.header("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11192");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.Class<?> wildcardClass6 = response5.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test11193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11193");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        response1.numRedirects = 0;
        int int9 = response1.statusCode();
        response1.statusMessage = "hi!";
        response1.numRedirects = (short) 0;
        java.lang.String str15 = response1.cookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.cookies();
        java.lang.String str17 = response1.statusMessage();
        java.lang.String str18 = response1.contentType;
        java.lang.String str19 = response1.contentType();
        int int20 = response1.statusCode();
        response1.charset = "";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test11194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11194");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        int int6 = response1.statusCode;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        response1.executed = false;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(strEntry12);
    }

    @Test
    public void test11195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11195");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        response1.statusCode = (short) 100;
        response1.numRedirects = 97;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        int int13 = response1.numRedirects;
        java.net.URL uRL14 = response1.url();
        java.net.URL uRL15 = response1.url();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test11196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11196");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.contentType;
        int int10 = response1.statusCode();
        response1.executed = false;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        response1.statusMessage = "";
        org.jsoup.Connection.Method method16 = response1.method();
        response1.executed = false;
        int int19 = response1.numRedirects;
        boolean boolean20 = response1.executed;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test11197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11197");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.lang.String str11 = response1.statusMessage();
        response1.contentType = "";
        org.jsoup.Connection.Request request14 = response1.req;
        response1.contentType = "";
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(request14);
    }

    @Test
    public void test11198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11198");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.numRedirects = (short) 10;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        boolean boolean10 = response1.hasHeaderWithValue("hi!", "");
        java.lang.String str11 = response1.charset();
        java.lang.String str12 = response1.statusMessage();
        java.lang.String str13 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11199");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        response1.statusMessage = "hi!";
        java.lang.String str7 = response1.charset();
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "");
        java.lang.String str12 = response1.header("");
        org.jsoup.Connection.Response response15 = response1.cookie("hi!", "hi!");
        org.jsoup.Connection.Method method16 = response1.method();
        response1.executed = true;
        java.lang.String str19 = response1.statusMessage();
        boolean boolean20 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test11200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11200");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.lang.String str5 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        response1.numRedirects = (short) 0;
        java.lang.String str10 = response1.cookie("hi!");
        response1.statusMessage = "";
        int int13 = response1.statusCode;
        org.jsoup.Connection.Method method14 = response1.method();
        int int15 = response1.statusCode();
        org.jsoup.Connection.Response response18 = response1.header("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test11201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11201");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.contentType;
        int int10 = response1.statusCode();
        int int11 = response1.statusCode;
        java.lang.String str12 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11202");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "hi!");
        org.jsoup.Connection.Request request7 = response1.req;
        int int8 = response1.numRedirects;
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        java.lang.String str11 = response1.contentType;
        java.lang.String str12 = response1.contentType;
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test11203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11203");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test11204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11204");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType();
        java.lang.String str7 = response1.header("");
        response1.contentType = "hi!";
        java.lang.String str10 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        java.net.URL uRL12 = response1.url();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test11205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11205");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        java.lang.String str9 = response1.cookie("hi!");
        int int10 = response1.statusCode();
        org.jsoup.Connection.Response response12 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response15 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Response response17 = response1.removeHeader("hi!");
        java.lang.String str18 = response1.charset();
        int int19 = response1.statusCode();
        boolean boolean20 = response1.executed;
        java.lang.String str21 = response1.contentType;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test11206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11206");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        response1.statusMessage = "hi!";
        boolean boolean8 = response1.hasHeader("hi!");
        java.lang.String str9 = response1.charset;
        int int10 = response1.statusCode();
        java.lang.String str11 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test11207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11207");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        java.net.URL uRL8 = response1.url();
        org.jsoup.Connection.Response response10 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response12 = response1.removeCookie("hi!");
        response1.charset = "hi!";
        java.net.URL uRL15 = response1.url();
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test11208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11208");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        java.net.URL uRL4 = response1.url();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str7 = response1.contentType;
        response1.statusMessage = "";
        java.lang.String str11 = response1.cookie("hi!");
        org.jsoup.Connection.Method method12 = response1.method();
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test11209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11209");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode;
        java.lang.String str6 = response1.charset;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Response response9 = response1.removeCookie("hi!");
        int int10 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response14 = response1.header("hi!", "hi!");
        java.lang.String str16 = response1.header("");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test11210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11210");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        int int6 = response1.numRedirects;
        java.lang.String str7 = response1.charset;
        response1.statusMessage = "";
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        response1.contentType = "";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test11211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11211");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Request request6 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("");
        java.lang.String str10 = response1.charset;
        boolean boolean11 = response1.executed;
        java.lang.String str12 = response1.statusMessage;
        java.lang.String str13 = response1.contentType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11212");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        org.jsoup.Connection.Request request7 = response1.req;
        response1.executed = false;
        java.lang.String str11 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str12 = response1.contentType();
        response1.charset = "";
        org.jsoup.Connection.Response response17 = response1.cookie("hi!", "hi!");
        response1.statusMessage = "hi!";
        java.lang.String str20 = response1.charset;
        response1.contentType = "";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test11213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11213");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        java.lang.String str9 = response1.cookie("hi!");
        java.lang.String str11 = response1.header("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        int int13 = response1.statusCode();
        boolean boolean16 = response1.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.Connection.Request request17 = response1.req;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response18.url(uRL19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(request17);
    }

    @Test
    public void test11214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11214");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.charset;
        boolean boolean11 = response1.executed;
        java.lang.String str12 = response1.statusMessage();
        org.jsoup.Connection.Response response15 = response1.header("hi!", "");
        java.lang.String str16 = response1.contentType();
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        int int18 = response1.statusCode;
        int int19 = response1.numRedirects;
        response1.contentType = "hi!";
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test11215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11215");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        response1.statusMessage = "";
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test11216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11216");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        java.lang.String str9 = response1.cookie("hi!");
        int int10 = response1.statusCode();
        java.lang.String str11 = response1.charset;
        response1.executed = false;
        response1.executed = true;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.cookies();
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        response1.statusMessage = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response1.scanHeaders("");
        response1.contentType = "";
        response1.executed = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertNull(strEntry21);
    }

    @Test
    public void test11217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11217");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.net.URL uRL9 = response1.url();
        java.lang.String str10 = response1.statusMessage;
        org.jsoup.Connection.Response response13 = response1.header("hi!", "");
        int int14 = response1.numRedirects;
        java.net.URL uRL15 = response1.url();
        java.lang.String str16 = response1.statusMessage();
        response1.contentType = "";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test11218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11218");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.statusMessage();
        int int10 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL14 = response13.url();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test11219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11219");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        boolean boolean4 = response1.executed;
        response1.contentType = "hi!";
        java.lang.String str7 = response1.contentType;
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        org.jsoup.Connection.Method method10 = response1.method();
        boolean boolean13 = response1.hasHeaderWithValue("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.nio.ByteBuffer byteBuffer15 = null;
        response1.byteData = byteBuffer15;
        int int17 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test11220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11220");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.executed = false;
        int int8 = response1.statusCode();
        response1.statusCode = (byte) 1;
        java.lang.String str11 = response1.charset();
        java.lang.String str13 = response1.header("hi!");
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        response1.charset = "hi!";
        org.jsoup.Connection.Response response19 = response1.header("hi!", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test11221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11221");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "hi!");
        org.jsoup.Connection.Request request7 = response1.req;
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        int int10 = response1.statusCode;
        java.lang.String str11 = response1.contentType();
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test11222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11222");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Request request7 = response1.req;
        java.lang.String str8 = response1.statusMessage;
        response1.statusMessage = "hi!";
        response1.statusMessage = "hi!";
        boolean boolean14 = response1.hasHeader("hi!");
        org.jsoup.Connection.Request request15 = response1.req;
        response1.contentType = "";
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        org.jsoup.Connection.Request request20 = response1.req;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNull(request20);
    }

    @Test
    public void test11223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11223");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        org.jsoup.Connection.Method method3 = response1.method();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        response4.numRedirects = '#';
        int int7 = response4.statusCode;
        java.lang.String str9 = response4.getHeaderCaseInsensitive("");
        java.lang.String str10 = response4.contentType();
        java.net.URL uRL11 = response4.url();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test11224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11224");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        response1.numRedirects = 0;
        int int9 = response1.statusCode();
        response1.statusMessage = "hi!";
        response1.numRedirects = (short) 0;
        java.lang.String str15 = response1.cookie("hi!");
        java.lang.String str16 = response1.charset;
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        boolean boolean21 = response1.hasHeaderWithValue("hi!", "");
        java.nio.ByteBuffer byteBuffer22 = null;
        response1.byteData = byteBuffer22;
        java.net.URL uRL24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response25 = response1.url(uRL24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test11225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11225");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.numRedirects = (short) 10;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        org.jsoup.Connection.Response response12 = response1.header("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        response1.statusMessage = "hi!";
        response1.statusCode = 1;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response21 = response18.cookie("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test11226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11226");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.charset;
        boolean boolean11 = response1.executed;
        boolean boolean13 = response1.hasHeader("hi!");
        boolean boolean16 = response1.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.Connection.Response response19 = response1.header("hi!", "hi!");
        boolean boolean20 = response1.executed;
        java.nio.ByteBuffer byteBuffer21 = response1.byteData;
        java.nio.ByteBuffer byteBuffer22 = response1.byteData;
        java.lang.String str23 = response1.contentType();
        java.lang.String str24 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(byteBuffer21);
        org.junit.Assert.assertNull(byteBuffer22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test11227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11227");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Request request6 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("");
        boolean boolean10 = response1.executed;
        int int11 = response1.statusCode();
        java.lang.String str13 = response1.header("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        java.lang.String str17 = response1.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test11228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11228");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (byte) 1;
        org.jsoup.Connection.Request request4 = response1.req;
        response1.executed = true;
        response1.charset = "";
        java.lang.String str9 = response1.contentType();
        org.jsoup.Connection.Method method10 = response1.method();
        java.lang.String str11 = response1.charset;
        response1.executed = true;
        java.lang.String str14 = response1.charset;
        org.junit.Assert.assertNull(request4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11229");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.lang.String str11 = response1.statusMessage();
        java.lang.String str13 = response1.getHeaderCaseInsensitive("");
        java.lang.String str14 = response1.contentType();
        response1.charset = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.cookies();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test11230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11230");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.lang.String str5 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        response1.numRedirects = (short) 0;
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "hi!");
        java.lang.String str12 = response1.charset;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11231");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.lang.String str5 = response1.charset();
        response1.charset = "";
        org.jsoup.Connection.Response response9 = response1.removeHeader("hi!");
        java.lang.String str10 = response1.contentType;
        response1.charset = "";
        int int13 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test11232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11232");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.net.URL uRL9 = response1.url();
        java.lang.String str10 = response1.statusMessage;
        org.jsoup.Connection.Response response13 = response1.header("hi!", "");
        int int14 = response1.numRedirects;
        org.jsoup.Connection.Response response16 = response1.removeCookie("hi!");
        java.lang.String str17 = response1.contentType;
        response1.executed = true;
        org.jsoup.Connection.Response response21 = response1.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = response1.hasHeaderWithValue("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test11233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11233");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        org.jsoup.Connection.Method method3 = response1.method();
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.nio.ByteBuffer byteBuffer6 = response1.byteData;
        response1.statusMessage = "";
        int int9 = response1.numRedirects;
        java.net.URL uRL10 = response1.url();
        response1.charset = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test11234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11234");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.net.URL uRL5 = response1.url();
        org.jsoup.Connection.Request request6 = response1.req;
        java.lang.String str8 = response1.header("");
        response1.statusCode = (byte) 100;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test11235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11235");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.net.URL uRL9 = response1.url();
        java.lang.String str10 = response1.statusMessage;
        org.jsoup.Connection.Response response13 = response1.header("hi!", "");
        int int14 = response1.numRedirects;
        org.jsoup.Connection.Response response16 = response1.removeCookie("hi!");
        int int17 = response1.statusCode();
        org.jsoup.Connection.Method method18 = response1.method();
        org.jsoup.Connection.Method method19 = response1.method();
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test11236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11236");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.net.URL uRL9 = response1.url();
        java.lang.String str10 = response1.statusMessage;
        org.jsoup.Connection.Response response13 = response1.header("hi!", "");
        org.jsoup.Connection.Request request14 = response1.req;
        response1.statusMessage = "hi!";
        java.lang.String str18 = response1.getHeaderCaseInsensitive("");
        java.lang.String str20 = response1.header("hi!");
        int int21 = response1.numRedirects;
        java.lang.String str22 = response1.statusMessage;
        java.net.URL uRL23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response1.url(uRL23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test11237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11237");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        boolean boolean4 = response1.executed;
        response1.contentType = "hi!";
        java.lang.String str7 = response1.contentType;
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        org.jsoup.Connection.Method method10 = response1.method();
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        java.net.URL uRL14 = response1.url();
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test11238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11238");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        response1.contentType = "hi!";
        java.lang.String str11 = response1.cookie("hi!");
        java.lang.String str12 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("hi!");
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strEntry14);
    }

    @Test
    public void test11239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11239");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        boolean boolean8 = response1.executed;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test11240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11240");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.contentType;
        int int10 = response1.statusCode();
        response1.charset = "";
        response1.statusCode = 10;
        response1.statusCode = 0;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test11241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11241");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (byte) 1;
        org.jsoup.Connection.Request request4 = response1.req;
        java.lang.String str6 = response1.header("hi!");
        response1.contentType = "";
        java.lang.String str9 = response1.charset;
        java.lang.String str11 = response1.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(request4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test11242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11242");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        java.nio.ByteBuffer byteBuffer6 = response1.byteData;
        boolean boolean8 = response1.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(byteBuffer13);
    }

    @Test
    public void test11243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11243");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "hi!");
        org.jsoup.Connection.Request request7 = response1.req;
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        java.lang.String str10 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        boolean boolean14 = response1.hasHeaderWithValue("hi!", "hi!");
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11244");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        java.net.URL uRL4 = response1.url();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.lang.String str9 = response1.cookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        int int14 = response1.numRedirects;
        int int15 = response1.statusCode();
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test11245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11245");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str9 = response1.header("hi!");
        java.lang.String str10 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11246");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Request request6 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("");
        boolean boolean10 = response1.executed;
        int int11 = response1.numRedirects;
        org.jsoup.Connection.Method method12 = response1.method();
        response1.statusCode = 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test11247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11247");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        org.jsoup.Connection.Response response5 = response1.header("hi!", "");
        int int6 = response1.statusCode;
        org.jsoup.Connection.Response response8 = response1.removeHeader("hi!");
        response1.numRedirects = 10;
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        response1.executed = false;
        org.jsoup.Connection.Request request15 = response1.req;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("hi!");
        int int18 = response1.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test11248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11248");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (byte) 1;
        boolean boolean5 = response1.hasCookie("hi!");
        response1.executed = true;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.lang.String str9 = response1.contentType();
        response1.statusMessage = "hi!";
        java.lang.String str12 = response1.charset();
        int int13 = response1.numRedirects;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test11249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11249");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.lang.String str5 = response1.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test11250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11250");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.numRedirects = (short) 10;
        java.lang.String str5 = response1.charset;
        int int6 = response1.numRedirects;
        int int7 = response1.statusCode();
        boolean boolean10 = response1.hasHeaderWithValue("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11251");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        response1.statusMessage = "hi!";
        boolean boolean8 = response1.hasHeader("hi!");
        int int9 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        int int16 = response15.statusCode;
        response15.numRedirects = (short) 10;
        java.lang.String str19 = response15.statusMessage;
        org.jsoup.Connection.Method method20 = response15.method();
        boolean boolean21 = response15.executed;
        java.nio.ByteBuffer byteBuffer22 = response15.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response15.headers();
        response15.executed = false;
        java.lang.String str26 = response15.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(byteBuffer22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test11252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11252");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Request request6 = null;
        response1.req = request6;
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.net.URL uRL9 = response1.url();
        response1.numRedirects = (byte) 1;
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response1.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test11253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11253");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.lang.String str9 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        java.lang.String str13 = response1.statusMessage;
        java.lang.String str14 = response1.statusMessage();
        java.lang.String str15 = response1.charset();
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        org.jsoup.Connection.Request request19 = response1.req;
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(byteBuffer18);
        org.junit.Assert.assertNull(request19);
    }

    @Test
    public void test11254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11254");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer9 = null;
        response8.byteData = byteBuffer9;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str12 = response8.statusMessage;
        java.nio.ByteBuffer byteBuffer13 = null;
        response8.byteData = byteBuffer13;
        org.jsoup.Connection.Response response16 = response8.removeCookie("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test11255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11255");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        java.lang.String str5 = response1.getHeaderCaseInsensitive("hi!");
        boolean boolean7 = response1.hasHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("");
        org.jsoup.Connection.Response response12 = response1.header("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("hi!");
        response1.contentType = "hi!";
        java.lang.String str17 = response1.contentType;
        response1.statusMessage = "hi!";
        java.lang.String str20 = response1.charset;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(strEntry14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test11256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11256");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Request request6 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("");
        boolean boolean10 = response1.executed;
        int int11 = response1.statusCode();
        java.lang.String str12 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        boolean boolean14 = response1.executed;
        response1.statusCode = (short) -1;
        int int17 = response1.statusCode;
        response1.executed = false;
        boolean boolean21 = response1.hasCookie("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test11257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11257");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.charset;
        java.lang.String str7 = response1.getHeaderCaseInsensitive("");
        boolean boolean9 = response1.hasCookie("hi!");
        boolean boolean10 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response1.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11258");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.lang.String str10 = response1.getHeaderCaseInsensitive("hi!");
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11259");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.executed = false;
        int int8 = response1.statusCode();
        boolean boolean10 = response1.hasHeader("hi!");
        int int11 = response1.numRedirects;
        response1.charset = "hi!";
        java.net.URL uRL14 = response1.url();
        response1.executed = true;
        java.lang.String str17 = response1.charset();
        response1.statusMessage = "";
        java.lang.Class<?> wildcardClass20 = response1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test11260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11260");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        java.net.URL uRL7 = response1.url();
        response1.charset = "hi!";
        org.jsoup.Connection.Response response11 = response1.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.method(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test11261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11261");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.executed = false;
        int int8 = response1.statusCode();
        response1.statusCode = (byte) 1;
        java.lang.String str11 = response1.charset();
        java.lang.String str13 = response1.header("hi!");
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        org.jsoup.Connection.Response response17 = response1.header("hi!", "");
        java.lang.String str18 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response19.scanHeaders("hi!");
        java.net.URL uRL22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response19.url(uRL22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(strEntry21);
    }

    @Test
    public void test11262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11262");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method10 = response1.method();
        java.lang.String str11 = response1.charset();
        java.lang.String str12 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test11263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11263");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.net.URL uRL5 = response1.url();
        response1.numRedirects = (byte) 1;
        response1.statusCode = (-1);
        boolean boolean10 = response1.executed;
        org.jsoup.Connection.Method method11 = response1.method();
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test11264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11264");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        java.net.URL uRL7 = response1.url();
        response1.statusMessage = "hi!";
        response1.charset = "hi!";
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str16 = response1.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test11265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11265");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        int int8 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        java.lang.String str10 = response1.contentType();
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11266");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        int int7 = response1.numRedirects;
        response1.charset = "";
        response1.contentType = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("hi!");
        java.net.URL uRL14 = response1.url();
        response1.contentType = "";
        java.lang.String str17 = response1.charset;
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11267");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        response1.contentType = "hi!";
        java.lang.String str9 = response1.cookie("hi!");
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        int int14 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str18 = response1.contentType();
        boolean boolean19 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response1.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11268");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        org.jsoup.Connection.Response response7 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("");
        response1.statusCode = 10;
        java.lang.String str12 = response1.charset();
        response1.charset = "hi!";
        java.lang.String str15 = response1.contentType();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11269");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        java.net.URL uRL7 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        response1.contentType = "";
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        java.lang.String str13 = response1.charset;
        java.net.URL uRL14 = response1.url();
        int int15 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test11270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11270");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.numRedirects = (short) 10;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        org.jsoup.Connection.Response response12 = response1.header("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        response1.statusMessage = "hi!";
        response1.contentType = "";
        java.lang.String str18 = response1.charset;
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        java.lang.String str21 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document22 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test11271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11271");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.net.URL uRL9 = response1.url();
        java.lang.String str10 = response1.charset();
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("hi!");
        boolean boolean17 = response1.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(byteBuffer18);
    }

    @Test
    public void test11272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11272");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.executed = false;
        int int8 = response1.statusCode();
        response1.statusCode = (byte) 1;
        java.lang.String str11 = response1.charset();
        java.lang.String str13 = response1.header("hi!");
        java.lang.String str15 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11273");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        java.lang.String str7 = response1.charset;
        response1.executed = false;
        boolean boolean10 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        java.lang.String str12 = response1.contentType;
        java.lang.String str13 = response1.charset();
        java.lang.String str15 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11274");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        java.lang.String str8 = response1.header("");
        int int9 = response1.numRedirects;
        java.lang.String str10 = response1.statusMessage;
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11275");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = response2.req;
        java.nio.ByteBuffer byteBuffer4 = null;
        response2.byteData = byteBuffer4;
        org.jsoup.Connection.Response response8 = response2.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response2.scanHeaders("");
        response2.statusCode = 1;
        java.lang.String str14 = response2.header("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test11276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11276");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.lang.String str5 = response1.charset();
        response1.charset = "";
        int int8 = response1.statusCode;
        int int9 = response1.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        java.lang.String str11 = response1.statusMessage();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test11277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11277");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        response1.statusMessage = "hi!";
        boolean boolean8 = response1.hasHeader("hi!");
        java.lang.String str9 = response1.charset;
        org.jsoup.Connection.Response response12 = response1.header("hi!", "");
        java.lang.String str13 = response1.statusMessage;
        org.jsoup.Connection.Method method14 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test11278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11278");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.net.URL uRL6 = response1.url();
        int int7 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("");
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(strEntry11);
    }

    @Test
    public void test11279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11279");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.lang.String str5 = response1.charset();
        response1.charset = "";
        org.jsoup.Connection.Response response9 = response1.removeHeader("hi!");
        response1.numRedirects = (byte) 10;
        response1.statusMessage = "hi!";
        java.lang.String str14 = response1.charset();
        java.lang.String str15 = response1.statusMessage();
        response1.numRedirects = (short) 100;
        int int18 = response1.statusCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test11280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11280");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("");
        response1.charset = "";
        boolean boolean10 = response1.executed;
        org.jsoup.Connection.Response response12 = response1.removeCookie("hi!");
        org.jsoup.Connection.Request request13 = response1.req;
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        java.lang.String str16 = response1.charset();
        org.jsoup.Connection.Response response19 = response1.header("hi!", "");
        org.jsoup.Connection.Response response22 = response1.cookie("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response1.cookies();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test11281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11281");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        response1.charset = "hi!";
        int int13 = response1.statusCode();
        org.jsoup.Connection.Request request14 = response1.req;
        java.lang.String str15 = response1.contentType();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11282");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        response1.contentType = "hi!";
        java.lang.String str9 = response1.cookie("hi!");
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        response1.statusCode = (byte) -1;
        java.lang.String str17 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str18 = response1.charset;
        response1.statusCode = '4';
        java.nio.ByteBuffer byteBuffer21 = response1.byteData;
        org.jsoup.Connection.Request request22 = response1.req;
        int int23 = response1.statusCode();
        org.jsoup.Connection.Response response26 = response1.header("hi!", "");
        response1.contentType = "";
        java.lang.String str29 = response1.contentType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(byteBuffer21);
        org.junit.Assert.assertNull(request22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test11283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11283");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.statusMessage();
        java.net.URL uRL11 = response1.url();
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        response1.executed = true;
        response1.statusCode = (short) 100;
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.url(uRL17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(byteBuffer12);
    }

    @Test
    public void test11284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11284");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        java.lang.String str5 = response1.getHeaderCaseInsensitive("hi!");
        boolean boolean7 = response1.hasHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("");
        org.jsoup.Connection.Response response12 = response1.header("hi!", "");
        int int13 = response1.numRedirects;
        boolean boolean14 = response1.executed;
        boolean boolean15 = response1.executed;
        boolean boolean16 = response1.executed;
        org.jsoup.Connection.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.method(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11285");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        boolean boolean7 = response1.executed;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str10 = response1.charset;
        response1.statusCode = 0;
        org.jsoup.Connection.Method method13 = response1.method();
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test11286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11286");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.charset;
        org.jsoup.Connection.Method method11 = response1.method();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean13 = response1.executed;
        int int14 = response1.numRedirects;
        java.lang.String str15 = response1.contentType;
        java.lang.String str16 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test11287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11287");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.lang.String str5 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        java.lang.String str8 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str10 = response9.statusMessage;
        java.net.URL uRL11 = response9.url();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test11288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11288");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.charset;
        boolean boolean11 = response1.executed;
        boolean boolean13 = response1.hasHeader("hi!");
        java.lang.String str15 = response1.header("hi!");
        boolean boolean17 = response1.hasCookie("hi!");
        java.lang.String str18 = response1.statusMessage;
        java.nio.ByteBuffer byteBuffer19 = null;
        response1.byteData = byteBuffer19;
        java.lang.String str22 = response1.header("hi!");
        int int23 = response1.statusCode;
        org.jsoup.Connection.Request request24 = response1.req;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(request24);
    }

    @Test
    public void test11289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11289");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        response1.statusMessage = "hi!";
        java.lang.String str7 = response1.charset();
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "");
        org.jsoup.Connection.Response response13 = response1.cookie("hi!", "hi!");
        java.lang.String str14 = response1.contentType;
        int int15 = response1.numRedirects;
        int int16 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test11290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11290");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        java.lang.String str9 = response1.cookie("hi!");
        int int10 = response1.statusCode();
        java.lang.String str11 = response1.charset;
        response1.executed = false;
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        response1.executed = false;
        java.net.URL uRL18 = response1.url();
        org.jsoup.Connection.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.method(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL18);
    }

    @Test
    public void test11291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11291");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        org.jsoup.Connection.Method method6 = response1.method();
        response1.charset = "hi!";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        response1.numRedirects = (short) 10;
        java.lang.String str13 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        response1.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test11292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11292");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("");
        response1.charset = "";
        boolean boolean10 = response1.executed;
        int int11 = response1.numRedirects;
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response1.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test11293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11293");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.net.URL uRL5 = response1.url();
        org.jsoup.Connection.Request request6 = response1.req;
        java.lang.String str7 = response1.charset();
        boolean boolean9 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        java.lang.String str11 = response1.contentType;
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response1.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test11294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11294");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.statusMessage();
        org.jsoup.Connection.Request request11 = response1.req;
        int int12 = response1.statusCode;
        response1.charset = "";
        java.lang.String str16 = response1.header("");
        boolean boolean18 = response1.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test11295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11295");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        response1.contentType = "hi!";
        response1.statusCode = 10;
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test11296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11296");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.charset;
        boolean boolean11 = response1.executed;
        boolean boolean13 = response1.hasHeader("hi!");
        java.lang.String str15 = response1.header("hi!");
        java.lang.String str17 = response1.header("");
        int int18 = response1.statusCode;
        java.lang.String str19 = response1.statusMessage();
        java.lang.String str21 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test11297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11297");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasCookie("hi!");
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        java.lang.String str10 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response1.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11298");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType();
        java.lang.String str7 = response1.header("");
        boolean boolean9 = response1.hasHeader("hi!");
        java.lang.String str10 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11299");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        response1.numRedirects = 0;
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Request request6 = response1.req;
        boolean boolean8 = response1.hasHeader("hi!");
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11300");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.statusMessage();
        java.net.URL uRL11 = response1.url();
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        response1.executed = true;
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.cookies();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test11301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11301");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.net.URL uRL5 = response1.url();
        org.jsoup.Connection.Request request6 = response1.req;
        org.jsoup.Connection.Response response8 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method10 = response1.method();
        java.net.URL uRL11 = response1.url();
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        int int15 = response14.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response14.scanHeaders("hi!");
        java.net.URL uRL18 = response14.url();
        response14.numRedirects = (byte) 1;
        response14.statusCode = (-1);
        java.lang.String str23 = response14.statusMessage();
        int int24 = response14.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry26 = response14.scanHeaders("");
        java.lang.String str27 = response14.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection12, (org.jsoup.Connection.Response) response14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(strEntry26);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test11302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11302");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.lang.String str11 = response1.statusMessage();
        response1.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test11303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11303");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.charset;
        java.lang.String str7 = response1.getHeaderCaseInsensitive("");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        response1.charset = "";
        response1.contentType = "";
        response1.executed = false;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(byteBuffer8);
    }

    @Test
    public void test11304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11304");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.executed = false;
        int int8 = response1.statusCode();
        boolean boolean10 = response1.hasCookie("hi!");
        int int11 = response1.statusCode;
        java.net.URL uRL12 = response1.url();
        org.jsoup.Connection.Response response14 = response1.removeHeader("hi!");
        java.lang.String str15 = response1.charset();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11305");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.net.URL uRL5 = response1.url();
        java.lang.String str7 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = response1.hasHeaderWithValue("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
    }

    @Test
    public void test11306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11306");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        org.jsoup.Connection.Method method3 = response1.method();
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Method method6 = response1.method();
        response1.charset = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("hi!");
        boolean boolean12 = response1.hasHeader("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11307");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.charset;
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        org.jsoup.Connection.Method method8 = response1.method();
        boolean boolean9 = response1.executed;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test11308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11308");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        java.net.URL uRL4 = response1.url();
        java.lang.String str5 = response1.contentType();
        boolean boolean8 = response1.hasHeaderWithValue("hi!", "");
        response1.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method12 = response11.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response11.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test11309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11309");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.charset;
        java.lang.String str7 = response1.getHeaderCaseInsensitive("");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str10 = response1.charset;
        java.lang.String str11 = response1.contentType;
        java.lang.String str13 = response1.getHeaderCaseInsensitive("");
        response1.executed = true;
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.method(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11310");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        java.lang.String str7 = response1.charset;
        response1.executed = false;
        boolean boolean10 = response1.executed;
        boolean boolean11 = response1.executed;
        response1.statusMessage = "hi!";
        response1.executed = false;
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test11311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11311");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        java.lang.String str10 = response1.statusMessage;
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(strEntry14);
    }

    @Test
    public void test11312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11312");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.contentType;
        int int10 = response1.statusCode();
        response1.executed = false;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response17 = response1.header("hi!", "");
        int int18 = response1.numRedirects;
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.url(uRL19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test11313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11313");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        int int7 = response1.numRedirects;
        response1.charset = "";
        response1.contentType = "";
        boolean boolean13 = response1.hasHeader("hi!");
        java.lang.String str14 = response1.statusMessage;
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test11314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11314");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.lang.String str5 = response1.charset();
        response1.charset = "";
        org.jsoup.Connection.Response response9 = response1.removeHeader("hi!");
        response1.numRedirects = (byte) 10;
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.lang.String str14 = response1.charset;
        java.lang.String str15 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        java.lang.String str19 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test11315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11315");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        java.lang.String str9 = response1.cookie("hi!");
        int int10 = response1.statusCode();
        org.jsoup.Connection.Response response12 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response15 = response1.header("hi!", "hi!");
        int int16 = response1.statusCode();
        int int17 = response1.statusCode;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test11316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11316");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.numRedirects = (short) 10;
        boolean boolean5 = response1.executed;
        java.net.URL uRL6 = response1.url();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        int int11 = response1.statusCode();
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Request request14 = response1.req;
        boolean boolean15 = response1.executed;
        response1.statusMessage = "";
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test11317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11317");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.lang.String str7 = response1.statusMessage;
        response1.contentType = "";
        response1.charset = "";
        int int12 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.headers();
        response1.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test11318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11318");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.net.URL uRL9 = response1.url();
        java.lang.String str10 = response1.statusMessage;
        response1.executed = true;
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        response1.numRedirects = (short) 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test11319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11319");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        java.net.URL uRL7 = response1.url();
        response1.statusMessage = "hi!";
        java.lang.String str11 = response1.header("");
        response1.executed = true;
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test11320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11320");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        response1.contentType = "hi!";
        java.lang.String str11 = response1.cookie("hi!");
        java.lang.String str12 = response1.charset();
        response1.executed = true;
        java.lang.String str16 = response1.header("hi!");
        java.lang.String str17 = response1.contentType;
        response1.numRedirects = '#';
        int int20 = response1.statusCode();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test11321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11321");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.numRedirects = (short) 10;
        java.lang.String str5 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test11322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11322");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.numRedirects = (short) 10;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        response1.statusMessage = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        org.jsoup.Connection.Response response13 = response1.cookie("hi!", "hi!");
        java.lang.String str14 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("");
        java.lang.String str17 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = response18.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test11323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11323");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Request request7 = response1.req;
        java.lang.String str8 = response1.statusMessage;
        response1.statusMessage = "hi!";
        response1.statusMessage = "hi!";
        boolean boolean14 = response1.hasHeader("hi!");
        response1.statusCode = (short) -1;
        response1.numRedirects = 97;
        int int19 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test11324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11324");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        response1.contentType = "hi!";
        java.lang.String str9 = response1.cookie("hi!");
        java.lang.String str10 = response1.contentType();
        java.lang.String str11 = response1.contentType;
        int int12 = response1.statusCode();
        int int13 = response1.numRedirects;
        java.lang.String str14 = response1.contentType();
        java.lang.String str16 = response1.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.Class<?> wildcardClass18 = response1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test11325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11325");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.statusMessage();
        java.net.URL uRL11 = response1.url();
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        response1.executed = true;
        org.jsoup.Connection.Request request15 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(request15);
    }

    @Test
    public void test11326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11326");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        boolean boolean7 = response1.executed;
        java.lang.String str8 = response1.statusMessage;
        java.lang.String str9 = response1.statusMessage;
        int int10 = response1.statusCode;
        java.lang.String str12 = response1.cookie("hi!");
        java.lang.String str14 = response1.getHeaderCaseInsensitive("");
        java.lang.Class<?> wildcardClass15 = response1.getClass();
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11327");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Request request6 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("");
        boolean boolean10 = response1.executed;
        int int11 = response1.statusCode();
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Method method14 = response1.method();
        java.lang.String str15 = response1.charset();
        boolean boolean17 = response1.hasHeader("hi!");
        java.lang.String str19 = response1.header("");
        response1.executed = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test11328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11328");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.charset();
        response1.statusMessage = "";
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        int int16 = response1.statusCode;
        org.jsoup.Connection.Response response18 = response1.removeCookie("hi!");
        org.jsoup.Connection.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.method(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test11329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11329");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.lang.String str4 = response1.cookie("hi!");
        java.nio.ByteBuffer byteBuffer5 = response1.byteData;
        response1.executed = true;
        response1.executed = false;
        java.lang.String str10 = response1.charset;
        java.lang.String str11 = response1.contentType();
        java.lang.String str13 = response1.header("");
        int int14 = response1.statusCode();
        java.lang.Class<?> wildcardClass15 = response1.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11330");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int3 = response2.statusCode;
        org.jsoup.Connection.Method method4 = response2.method();
        int int5 = response2.statusCode();
        org.jsoup.Connection.Response response7 = response2.removeHeader("hi!");
        response2.executed = true;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response2.headers();
        boolean boolean13 = response2.hasHeaderWithValue("hi!", "");
        int int14 = response2.statusCode;
        org.jsoup.Connection.Response response17 = response2.header("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response2.scanHeaders("");
        org.jsoup.Connection.Request request20 = null;
        response2.req = request20;
        int int22 = response2.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response23 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test11331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11331");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        org.jsoup.Connection.Method method3 = response1.method();
        int int4 = response1.statusCode();
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        response1.executed = true;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        java.lang.String str10 = response1.statusMessage();
        java.lang.String str11 = response1.charset();
        org.jsoup.Connection.Request request12 = response1.req;
        response1.statusMessage = "hi!";
        java.nio.ByteBuffer byteBuffer15 = null;
        response1.byteData = byteBuffer15;
        org.jsoup.Connection.Response response18 = response1.removeHeader("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test11332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11332");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        response1.contentType = "hi!";
        java.lang.String str9 = response1.cookie("hi!");
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        response1.statusCode = (byte) -1;
        java.lang.String str17 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str18 = response1.charset;
        response1.statusCode = '4';
        java.nio.ByteBuffer byteBuffer21 = response1.byteData;
        java.lang.String str23 = response1.getHeaderCaseInsensitive("hi!");
        response1.statusMessage = "";
        java.lang.String str27 = response1.cookie("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(byteBuffer21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test11333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11333");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.net.URL uRL5 = response1.url();
        java.lang.String str7 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method8 = response1.method();
        int int9 = response1.numRedirects;
        org.jsoup.Connection.Request request10 = response1.req;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str12 = response11.contentType;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response11.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11334");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.contentType;
        int int10 = response1.statusCode();
        response1.charset = "";
        response1.statusCode = 10;
        java.lang.String str15 = response1.contentType();
        response1.numRedirects = (byte) 100;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11335");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.contentType;
        int int10 = response1.statusCode();
        response1.executed = false;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response17 = response1.cookie("hi!", "");
        java.lang.String str18 = response1.charset();
        boolean boolean21 = response1.hasHeaderWithValue("hi!", "");
        boolean boolean22 = response1.executed;
        java.net.HttpURLConnection httpURLConnection23 = null;
        org.jsoup.helper.HttpConnection.Response response24 = null;
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response24);
        int int26 = response25.statusCode;
        response25.numRedirects = (short) 10;
        java.lang.String str29 = response25.statusMessage;
        org.jsoup.Connection.Method method30 = response25.method();
        response25.numRedirects = 100;
        java.lang.String str34 = response25.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection23, (org.jsoup.Connection.Response) response25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(method30);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test11336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11336");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.statusMessage();
        java.net.URL uRL11 = response1.url();
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        response1.numRedirects = (byte) -1;
        java.nio.ByteBuffer byteBuffer15 = null;
        response1.byteData = byteBuffer15;
        org.jsoup.Connection.Request request17 = response1.req;
        org.jsoup.Connection.Method method18 = response1.method();
        int int19 = response1.numRedirects;
        java.lang.String str20 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test11337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11337");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        response1.numRedirects = 0;
        response1.contentType = "hi!";
        response1.contentType = "hi!";
        java.lang.String str13 = response1.contentType();
        java.lang.String str14 = response1.contentType;
        java.lang.String str15 = response1.charset;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11338");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.charset;
        response1.contentType = "hi!";
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Response response11 = response1.cookie("hi!", "");
        boolean boolean12 = response1.executed;
        java.lang.String str13 = response1.contentType;
        response1.numRedirects = 1;
        org.jsoup.Connection.Response response18 = response1.cookie("hi!", "hi!");
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test11339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11339");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.charset = "";
        org.jsoup.Connection.Method method9 = response1.method();
        boolean boolean11 = response1.hasCookie("hi!");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test11340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11340");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        java.nio.ByteBuffer byteBuffer6 = response1.byteData;
        boolean boolean8 = response1.hasHeader("hi!");
        response1.statusMessage = "";
        org.jsoup.Connection.Response response12 = response1.removeCookie("hi!");
        response1.statusMessage = "hi!";
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test11341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11341");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("");
        java.lang.String str6 = response1.statusMessage;
        boolean boolean7 = response1.executed;
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        boolean boolean10 = response1.executed;
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        int int13 = response1.statusCode;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test11342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11342");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.executed = false;
        int int8 = response1.statusCode();
        org.jsoup.Connection.Response response11 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        boolean boolean17 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.Connection.Request request18 = response1.req;
        boolean boolean20 = response1.hasCookie("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(request18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test11343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11343");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        java.lang.String str7 = response1.charset;
        response1.executed = false;
        java.lang.String str10 = response1.statusMessage;
        org.jsoup.Connection.Response response13 = response1.cookie("hi!", "");
        java.lang.String str14 = response1.statusMessage;
        java.lang.String str15 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        java.lang.String str18 = response1.cookie("hi!");
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11344");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.contentType;
        int int10 = response1.statusCode();
        response1.executed = false;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response17 = response1.header("hi!", "");
        java.lang.String str18 = response1.charset();
        response1.charset = "hi!";
        org.jsoup.Connection.Method method21 = response1.method();
        response1.statusCode = 52;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(method21);
    }

    @Test
    public void test11345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11345");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.lang.String str11 = response1.statusMessage();
        java.lang.String str13 = response1.getHeaderCaseInsensitive("");
        java.lang.String str14 = response1.contentType();
        response1.charset = "hi!";
        int int17 = response1.statusCode;
        java.lang.String str18 = response1.contentType();
        java.lang.Class<?> wildcardClass19 = response1.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test11346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11346");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.numRedirects = (short) 10;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        response1.statusMessage = "hi!";
        java.lang.String str11 = response1.getHeaderCaseInsensitive("");
        response1.statusMessage = "hi!";
        java.lang.String str14 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer15 = null;
        response1.byteData = byteBuffer15;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test11347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11347");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.contentType;
        int int10 = response1.statusCode();
        response1.executed = false;
        java.lang.String str13 = response1.charset();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("hi!");
        java.lang.String str17 = response1.cookie("hi!");
        java.lang.String str18 = response1.statusMessage;
        org.jsoup.Connection.Response response21 = response1.cookie("hi!", "");
        java.lang.String str23 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str25 = response1.header("");
        org.jsoup.Connection.Response response27 = response1.removeHeader("hi!");
        java.lang.String str28 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap29 = response1.cookies();
        response1.numRedirects = '4';
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(strMap29);
    }

    @Test
    public void test11348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11348");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("");
        response1.charset = "";
        boolean boolean10 = response1.executed;
        org.jsoup.Connection.Request request11 = response1.req;
        org.jsoup.Connection.Response response13 = response1.removeCookie("hi!");
        response1.statusCode = (short) 0;
        java.lang.String str17 = response1.header("");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test11349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11349");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.net.URL uRL9 = response1.url();
        java.lang.String str10 = response1.statusMessage;
        org.jsoup.Connection.Response response13 = response1.header("hi!", "");
        int int14 = response1.statusCode();
        int int15 = response1.numRedirects;
        java.lang.String str16 = response1.charset();
        java.lang.String str18 = response1.getHeaderCaseInsensitive("hi!");
        java.net.URL uRL19 = response1.url();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(uRL19);
    }

    @Test
    public void test11350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11350");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.numRedirects = (short) 10;
        boolean boolean5 = response1.executed;
        java.net.URL uRL6 = response1.url();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        response1.charset = "";
        org.jsoup.Connection.Request request16 = response1.req;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(request16);
    }

    @Test
    public void test11351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11351");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str10 = response9.charset;
        boolean boolean11 = response9.executed;
        java.lang.String str12 = response9.charset;
        java.lang.String str13 = response9.contentType();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11352");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        response1.contentType = "hi!";
        java.lang.String str10 = response1.charset;
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.net.URL uRL12 = response1.url();
        java.lang.String str14 = response1.cookie("hi!");
        java.lang.String str15 = response1.statusMessage();
        java.lang.String str16 = response1.charset;
        boolean boolean17 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11353");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.statusMessage();
        org.jsoup.Connection.Request request11 = response1.req;
        response1.contentType = "";
        response1.charset = "hi!";
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(request11);
    }

    @Test
    public void test11354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11354");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.charset;
        org.jsoup.Connection.Method method11 = response1.method();
        int int12 = response1.statusCode();
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        boolean boolean16 = response1.hasHeader("hi!");
        boolean boolean17 = response1.executed;
        response1.numRedirects = (short) 100;
        response1.contentType = "";
        java.lang.String str23 = response1.header("");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test11355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11355");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.lang.String str9 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("");
        org.jsoup.Connection.Method method12 = response1.method();
        java.lang.String str13 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strEntry15);
    }

    @Test
    public void test11356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11356");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        java.net.URL uRL4 = response1.url();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str7 = response1.contentType;
        response1.statusMessage = "";
        int int10 = response1.numRedirects;
        org.jsoup.Connection.Response response13 = response1.header("hi!", "");
        java.lang.String str15 = response1.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11357");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        boolean boolean4 = response1.executed;
        response1.contentType = "hi!";
        boolean boolean7 = response1.executed;
        java.lang.String str8 = response1.statusMessage();
        response1.numRedirects = (byte) 10;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        java.lang.String str13 = response1.cookie("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11358");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.charset;
        response1.statusCode = (-1);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.headers();
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.url(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test11359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11359");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        java.lang.String str9 = response1.cookie("hi!");
        java.lang.String str11 = response1.header("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        org.jsoup.Connection.Request request13 = response1.req;
        java.lang.String str14 = response1.charset();
        response1.charset = "hi!";
        java.lang.String str17 = response1.statusMessage();
        response1.contentType = "hi!";
        response1.numRedirects = (short) -1;
        int int22 = response1.numRedirects;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test11360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11360");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int3 = response2.statusCode;
        java.lang.String str4 = response2.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        java.lang.String str8 = response2.header("hi!");
        java.nio.ByteBuffer byteBuffer9 = null;
        response2.byteData = byteBuffer9;
        int int11 = response2.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test11361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11361");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.charset;
        response1.contentType = "hi!";
        java.lang.String str9 = response1.header("");
        response1.charset = "hi!";
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.charset();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test11362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11362");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.statusMessage();
        java.lang.String str11 = response1.contentType;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = response1.hasHeaderWithValue("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test11363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11363");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        java.net.URL uRL4 = response1.url();
        java.lang.String str5 = response1.contentType();
        boolean boolean8 = response1.hasHeaderWithValue("hi!", "hi!");
        boolean boolean10 = response1.hasHeader("hi!");
        boolean boolean13 = response1.hasHeaderWithValue("hi!", "hi!");
        java.lang.String str14 = response1.statusMessage;
        int int15 = response1.statusCode();
        java.lang.Class<?> wildcardClass16 = response1.getClass();
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11364");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        boolean boolean4 = response1.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("hi!");
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        response1.statusMessage = "hi!";
        int int13 = response1.numRedirects;
        java.lang.String str14 = response1.statusMessage;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test11365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11365");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        int int8 = response1.statusCode;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        int int13 = response1.statusCode();
        java.lang.String str15 = response1.cookie("hi!");
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.method(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11366");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        boolean boolean5 = response1.hasHeaderWithValue("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test11367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11367");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        java.net.URL uRL7 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        response1.contentType = "";
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        org.jsoup.Connection.Method method14 = response1.method();
        java.lang.String str16 = response1.getHeaderCaseInsensitive("hi!");
        java.net.URL uRL17 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = response1.hasHeaderWithValue("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test11368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11368");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        org.jsoup.Connection.Response response5 = response1.header("hi!", "");
        int int6 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean12 = response1.hasCookie("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11369");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        boolean boolean4 = response1.executed;
        java.lang.String str6 = response1.header("hi!");
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        org.jsoup.Connection.Method method10 = response1.method();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = response11.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test11370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11370");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        response1.contentType = "hi!";
        java.lang.String str9 = response1.cookie("hi!");
        java.lang.String str10 = response1.contentType();
        java.lang.String str11 = response1.statusMessage;
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean17 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11371");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = response2.cookies();
        java.nio.ByteBuffer byteBuffer4 = null;
        response2.byteData = byteBuffer4;
        java.lang.String str6 = response2.charset;
        response2.contentType = "hi!";
        response2.statusCode = 0;
        int int11 = response2.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response2.headers();
        java.lang.String str13 = response2.contentType;
        org.jsoup.Connection.Response response16 = response2.cookie("hi!", "hi!");
        java.lang.String str17 = response2.contentType;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test11372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11372");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.numRedirects = (short) 10;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        org.jsoup.Connection.Request request6 = null;
        response1.req = request6;
        java.lang.String str8 = response1.statusMessage();
        response1.contentType = "hi!";
        boolean boolean11 = response1.executed;
        response1.numRedirects = (short) -1;
        response1.contentType = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test11373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11373");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasCookie("hi!");
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "");
        boolean boolean12 = response1.hasCookie("hi!");
        response1.numRedirects = (-1);
        response1.executed = false;
        java.net.URL uRL17 = response1.url();
        response1.statusMessage = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document20 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test11374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11374");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Request request6 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("");
        boolean boolean10 = response1.executed;
        int int11 = response1.statusCode();
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Method method14 = response1.method();
        java.lang.String str15 = response1.charset();
        boolean boolean17 = response1.hasHeader("hi!");
        int int18 = response1.numRedirects;
        response1.numRedirects = (short) 10;
        java.lang.String str21 = response1.contentType();
        response1.executed = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test11375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11375");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.lang.String str10 = response1.getHeaderCaseInsensitive("hi!");
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        int int12 = response1.statusCode();
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        response1.contentType = "";
        int int17 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(byteBuffer18);
    }

    @Test
    public void test11376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11376");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        boolean boolean14 = response1.hasHeaderWithValue("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11377");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.lang.String str5 = response1.charset();
        boolean boolean8 = response1.hasHeaderWithValue("hi!", "");
        int int9 = response1.numRedirects;
        java.net.URL uRL10 = response1.url();
        response1.executed = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test11378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11378");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        java.lang.String str12 = response1.header("");
        java.lang.String str13 = response1.contentType();
        java.lang.String str14 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("");
        response1.contentType = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = response1.hasHeaderWithValue("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strEntry16);
    }

    @Test
    public void test11379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11379");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.lang.String str8 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        response1.statusMessage = "";
        org.jsoup.Connection.Request request16 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(request16);
    }

    @Test
    public void test11380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11380");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.lang.String str5 = response1.statusMessage();
        response1.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.charset;
        response1.statusCode = (short) 100;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11381");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        java.net.URL uRL7 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        int int9 = response1.statusCode;
        response1.statusCode = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test11382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11382");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.numRedirects = (short) 10;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        org.jsoup.Connection.Response response12 = response1.header("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        response1.statusMessage = "hi!";
        response1.contentType = "";
        java.lang.String str18 = response1.charset;
        org.jsoup.Connection.Method method19 = response1.method();
        response1.statusMessage = "hi!";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test11383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11383");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.numRedirects = (short) 10;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        response1.numRedirects = 0;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        java.lang.Class<?> wildcardClass15 = strMap14.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11384");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        response1.statusCode = (short) 100;
        response1.statusCode = 'a';
        org.jsoup.Connection.Response response14 = response1.header("hi!", "hi!");
        int int15 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        response1.contentType = "";
        java.nio.ByteBuffer byteBuffer19 = response1.byteData;
        int int20 = response1.statusCode;
        response1.numRedirects = 'a';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test11385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11385");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.charset;
        int int6 = response1.statusCode();
        response1.statusCode = '4';
        java.net.URL uRL9 = response1.url();
        int int10 = response1.numRedirects;
        org.jsoup.Connection.Method method11 = response1.method();
        java.lang.String str12 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11386");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        response1.statusMessage = "hi!";
        int int7 = response1.statusCode();
        response1.statusCode = 0;
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        java.lang.String str13 = response1.header("");
        java.lang.String str14 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test11387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11387");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.contentType;
        int int10 = response1.statusCode();
        response1.executed = false;
        int int13 = response1.numRedirects;
        org.jsoup.Connection.Request request14 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test11388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11388");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.charset;
        boolean boolean11 = response1.executed;
        boolean boolean13 = response1.hasHeader("hi!");
        boolean boolean16 = response1.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.Connection.Response response19 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        response1.contentType = "";
        java.lang.String str24 = response1.charset();
        java.lang.String str25 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document26 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test11389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11389");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        org.jsoup.Connection.Request request7 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(request7);
    }

    @Test
    public void test11390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11390");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Method method7 = response1.method();
        boolean boolean9 = response1.hasCookie("hi!");
        response1.statusCode = (short) 0;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strEntry13);
    }

    @Test
    public void test11391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11391");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.lang.String str9 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        response1.contentType = "";
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(byteBuffer10);
    }

    @Test
    public void test11392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11392");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.charset();
        response1.statusMessage = "";
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        org.jsoup.Connection.Response response18 = response1.cookie("hi!", "");
        response1.statusMessage = "hi!";
        java.lang.String str21 = response1.charset;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test11393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11393");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.charset;
        boolean boolean11 = response1.executed;
        boolean boolean13 = response1.hasHeader("hi!");
        java.lang.String str15 = response1.header("hi!");
        int int16 = response1.statusCode();
        boolean boolean17 = response1.executed;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11394");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry3 = response1.scanHeaders("hi!");
        int int4 = response1.statusCode;
        response1.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str9 = response1.header("hi!");
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        int int13 = response12.statusCode;
        response12.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response12.cookies();
        boolean boolean18 = response12.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response12.headers();
        java.net.URL uRL20 = response12.url();
        java.lang.String str21 = response12.statusMessage;
        org.jsoup.Connection.Response response24 = response12.header("hi!", "");
        int int25 = response12.numRedirects;
        java.lang.String str26 = response12.charset;
        int int27 = response12.statusCode();
        boolean boolean28 = response12.executed;
        org.jsoup.Connection.Response response31 = response12.cookie("hi!", "hi!");
        java.lang.String str32 = response12.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test11395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11395");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        java.net.URL uRL8 = response1.url();
        response1.statusMessage = "";
        java.lang.String str11 = response1.statusMessage();
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.lang.String str14 = response1.statusMessage;
        response1.statusMessage = "";
        java.lang.Class<?> wildcardClass17 = response1.getClass();
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11396");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode;
        java.lang.String str6 = response1.charset;
        int int7 = response1.statusCode;
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "hi!");
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        response13.contentType = "";
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11397");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        java.net.URL uRL5 = response1.url();
        java.lang.String str6 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test11398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11398");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        response1.contentType = "hi!";
        java.lang.String str9 = response1.cookie("hi!");
        response1.statusMessage = "hi!";
        java.lang.String str12 = response1.contentType;
        java.lang.String str14 = response1.header("hi!");
        java.lang.String str16 = response1.header("hi!");
        response1.statusMessage = "hi!";
        int int19 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response1.scanHeaders("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(strEntry21);
    }

    @Test
    public void test11399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11399");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        java.lang.String str9 = response1.cookie("hi!");
        java.lang.String str11 = response1.header("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        org.jsoup.Connection.Request request13 = response1.req;
        java.lang.String str14 = response1.charset();
        response1.charset = "hi!";
        java.lang.String str17 = response1.statusMessage();
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer20 = response1.byteData;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(byteBuffer20);
    }

    @Test
    public void test11400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11400");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        boolean boolean4 = response1.executed;
        response1.contentType = "hi!";
        boolean boolean7 = response1.executed;
        java.lang.String str8 = response1.statusMessage();
        int int9 = response1.numRedirects;
        java.lang.String str10 = response1.contentType();
        boolean boolean11 = response1.executed;
        java.lang.String str12 = response1.charset;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11401");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        java.lang.String str9 = response1.cookie("hi!");
        java.lang.String str11 = response1.header("hi!");
        response1.statusMessage = "hi!";
        boolean boolean15 = response1.hasHeader("hi!");
        int int16 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.cookies();
        org.jsoup.Connection.Response response20 = response1.header("hi!", "hi!");
        java.lang.String str21 = response1.contentType;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test11402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11402");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (byte) 1;
        org.jsoup.Connection.Request request4 = response1.req;
        response1.executed = true;
        response1.charset = "";
        java.lang.String str9 = response1.contentType();
        org.jsoup.Connection.Request request10 = response1.req;
        org.junit.Assert.assertNull(request4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
    }

    @Test
    public void test11403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11403");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Request request6 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("");
        boolean boolean10 = response1.executed;
        int int11 = response1.numRedirects;
        org.jsoup.Connection.Request request12 = response1.req;
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        java.lang.String str15 = response1.statusMessage();
        java.lang.Class<?> wildcardClass16 = response1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11404");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        response1.statusMessage = "hi!";
        java.lang.String str7 = response1.charset();
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "");
        java.lang.String str12 = response1.header("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test11405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11405");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        int int8 = response1.statusCode;
        int int9 = response1.statusCode;
        java.net.URL uRL10 = response1.url();
        boolean boolean11 = response1.executed;
        java.lang.String str12 = response1.contentType;
        response1.numRedirects = '4';
        java.nio.ByteBuffer byteBuffer15 = null;
        response1.byteData = byteBuffer15;
        int int17 = response1.statusCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test11406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11406");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        java.lang.String str9 = response1.cookie("hi!");
        java.lang.String str11 = response1.header("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        int int13 = response1.statusCode();
        org.jsoup.Connection.Request request14 = response1.req;
        response1.statusMessage = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        int int20 = response1.numRedirects;
        response1.contentType = "";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test11407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11407");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        org.jsoup.Connection.Method method3 = response1.method();
        int int4 = response1.statusCode();
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        response1.executed = true;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        java.lang.String str10 = response1.statusMessage();
        boolean boolean11 = response1.executed;
        java.lang.String str12 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strEntry14);
    }

    @Test
    public void test11408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11408");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int3 = response2.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response2.scanHeaders("hi!");
        java.nio.ByteBuffer byteBuffer6 = null;
        response2.byteData = byteBuffer6;
        response2.numRedirects = 0;
        int int10 = response2.statusCode();
        response2.statusMessage = "hi!";
        response2.numRedirects = (short) 0;
        java.lang.String str16 = response2.cookie("hi!");
        int int17 = response2.statusCode;
        java.lang.String str18 = response2.contentType;
        response2.charset = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response21 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test11409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11409");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.charset;
        response1.contentType = "";
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11410");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        response1.contentType = "hi!";
        java.lang.String str11 = response1.cookie("hi!");
        java.lang.String str12 = response1.charset();
        org.jsoup.Connection.Response response14 = response1.removeHeader("hi!");
        boolean boolean17 = response1.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.Connection.Response response20 = response1.header("hi!", "");
        java.lang.String str22 = response1.cookie("hi!");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test11411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11411");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.net.URL uRL5 = response1.url();
        org.jsoup.Connection.Request request6 = response1.req;
        java.lang.String str7 = response1.charset();
        response1.statusCode = (byte) -1;
        org.jsoup.Connection.Method method10 = response1.method();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test11412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11412");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        java.net.URL uRL8 = response1.url();
        java.lang.String str9 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        response1.charset = "hi!";
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test11413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11413");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        response1.numRedirects = (byte) 100;
        org.jsoup.Connection.Request request13 = response1.req;
        int int14 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test11414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11414");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.net.URL uRL5 = response1.url();
        response1.statusCode = (-1);
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.statusMessage;
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        response1.statusCode = 52;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test11415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11415");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        response1.statusMessage = "hi!";
        boolean boolean8 = response1.hasHeader("hi!");
        int int9 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response15 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = strEntry17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(strEntry17);
    }

    @Test
    public void test11416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11416");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        response1.numRedirects = 0;
        int int9 = response1.statusCode();
        java.lang.String str11 = response1.header("");
        java.lang.String str13 = response1.header("hi!");
        response1.statusMessage = "";
        response1.statusCode = (byte) 10;
        int int18 = response1.statusCode();
        int int19 = response1.statusCode();
        org.jsoup.Connection.Request request20 = null;
        response1.req = request20;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry23 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer24 = response1.byteData;
        org.jsoup.Connection.Response response27 = response1.header("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNull(strEntry23);
        org.junit.Assert.assertNull(byteBuffer24);
        org.junit.Assert.assertNotNull(response27);
    }

    @Test
    public void test11417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11417");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        org.jsoup.Connection.Response response7 = response1.cookie("hi!", "");
        boolean boolean9 = response1.hasCookie("hi!");
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test11418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11418");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.executed = false;
        int int8 = response1.statusCode();
        response1.statusCode = (byte) 1;
        java.lang.String str11 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Request request14 = null;
        response13.req = request14;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test11419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11419");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusCode = (short) 100;
        boolean boolean5 = response2.executed;
        response2.contentType = "hi!";
        boolean boolean8 = response2.executed;
        java.lang.String str9 = response2.statusMessage();
        int int10 = response2.numRedirects;
        java.lang.String str11 = response2.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test11420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11420");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        int int8 = response1.statusCode;
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        java.net.URL uRL11 = response1.url();
        org.jsoup.Connection.Request request12 = response1.req;
        response1.executed = false;
        java.lang.String str15 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document16 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11421");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.net.URL uRL9 = response1.url();
        java.lang.String str10 = response1.statusMessage;
        org.jsoup.Connection.Response response13 = response1.header("hi!", "");
        int int14 = response1.numRedirects;
        java.lang.String str16 = response1.getHeaderCaseInsensitive("");
        response1.contentType = "hi!";
        response1.statusCode = ' ';
        java.lang.String str21 = response1.contentType;
        java.lang.String str23 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test11422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11422");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.executed = false;
        int int8 = response1.statusCode();
        response1.statusCode = (byte) 1;
        java.lang.String str11 = response1.charset();
        java.lang.String str13 = response1.header("hi!");
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        org.jsoup.Connection.Response response17 = response1.header("hi!", "");
        java.lang.String str18 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str20 = response1.statusMessage();
        java.net.URL uRL21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response1.url(uRL21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test11423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11423");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        response1.contentType = "hi!";
        java.lang.String str9 = response1.cookie("hi!");
        int int10 = response1.statusCode;
        org.jsoup.Connection.Response response13 = response1.cookie("hi!", "hi!");
        java.lang.Class<?> wildcardClass14 = response13.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11424");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Request request6 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("");
        java.lang.String str10 = response1.charset;
        java.lang.String str12 = response1.header("hi!");
        response1.numRedirects = 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11425");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        response1.statusCode = (short) 100;
        response1.statusCode = 'a';
        org.jsoup.Connection.Response response14 = response1.header("hi!", "hi!");
        response1.statusCode = 'a';
        org.jsoup.Connection.Request request17 = response1.req;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(request17);
    }

    @Test
    public void test11426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11426");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        java.nio.ByteBuffer byteBuffer6 = response1.byteData;
        boolean boolean8 = response1.hasHeader("hi!");
        int int9 = response1.statusCode();
        java.lang.String str10 = response1.statusMessage;
        org.jsoup.Connection.Method method11 = response1.method();
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        response1.charset = "hi!";
        java.lang.String str15 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11427");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        response1.contentType = "hi!";
        java.lang.String str9 = response1.cookie("hi!");
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        response1.statusCode = (byte) -1;
        java.lang.String str17 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str18 = response1.charset;
        response1.executed = true;
        response1.statusMessage = "hi!";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test11428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11428");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.lang.String str5 = response1.charset();
        response1.charset = "";
        org.jsoup.Connection.Response response9 = response1.removeHeader("hi!");
        response1.numRedirects = (byte) 10;
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.lang.String str15 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str16 = response1.statusMessage();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test11429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11429");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        response1.charset = "hi!";
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test11430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11430");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        java.net.URL uRL7 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        response1.contentType = "";
        java.lang.String str12 = response1.cookie("hi!");
        org.jsoup.Connection.Request request13 = response1.req;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        boolean boolean18 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.headers();
        boolean boolean22 = response1.hasHeaderWithValue("hi!", "hi!");
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test11431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11431");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        response1.numRedirects = 97;
        java.lang.String str14 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        response1.contentType = "";
        int int18 = response1.statusCode;
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test11432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11432");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode;
        java.lang.String str6 = response1.charset;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        boolean boolean12 = response1.executed;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11433");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        java.net.URL uRL7 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        response1.statusCode = 'a';
        java.lang.String str11 = response1.charset();
        response1.statusCode = 97;
        boolean boolean16 = response1.hasHeaderWithValue("hi!", "hi!");
        response1.statusCode = (byte) 100;
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11434");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        response1.contentType = "hi!";
        java.lang.String str9 = response1.cookie("hi!");
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Request request12 = response1.req;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response13.headers();
        java.lang.String str15 = response13.charset;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11435");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.numRedirects = (short) 10;
        response1.contentType = "";
        java.lang.String str7 = response1.contentType();
        response1.charset = "hi!";
        java.lang.String str11 = response1.header("");
        response1.statusCode = (-1);
        java.lang.String str15 = response1.header("");
        int int16 = response1.numRedirects;
        java.lang.String str17 = response1.contentType;
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.method(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11436");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        org.jsoup.Connection.Method method3 = response1.method();
        java.lang.String str5 = response1.getHeaderCaseInsensitive("hi!");
        response1.statusMessage = "hi!";
        int int8 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        response9.statusMessage = "";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test11437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11437");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.charset;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.net.HttpURLConnection httpURLConnection6 = null;
        org.jsoup.helper.HttpConnection.Response response7 = null;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        response8.statusCode = (short) 100;
        org.jsoup.Connection.Response response13 = response8.cookie("hi!", "hi!");
        org.jsoup.Connection.Request request14 = response8.req;
        int int15 = response8.numRedirects;
        java.lang.String str17 = response8.cookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response8.scanHeaders("hi!");
        java.lang.String str20 = response8.statusMessage;
        response8.numRedirects = 10;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection6, (org.jsoup.Connection.Response) response8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test11438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11438");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.numRedirects = (short) 10;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        org.jsoup.Connection.Response response12 = response1.header("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        response1.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("");
        response1.statusMessage = "";
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(strEntry17);
    }

    @Test
    public void test11439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11439");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.net.URL uRL9 = response1.url();
        java.lang.String str10 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        java.lang.String str12 = response1.contentType;
        boolean boolean13 = response1.executed;
        response1.statusCode = (byte) -1;
        org.jsoup.Connection.Request request16 = response1.req;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(request16);
    }

    @Test
    public void test11440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11440");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.statusMessage();
        java.lang.String str11 = response1.contentType;
        java.lang.String str13 = response1.header("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int15 = response14.numRedirects;
        int int16 = response14.statusCode;
        org.jsoup.Connection.Response response18 = response14.removeHeader("hi!");
        response14.numRedirects = (short) 10;
        response14.charset = "";
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test11441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11441");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        java.nio.ByteBuffer byteBuffer6 = response1.byteData;
        boolean boolean8 = response1.hasHeader("hi!");
        int int9 = response1.statusCode();
        boolean boolean10 = response1.executed;
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        java.lang.String str15 = response1.charset();
        boolean boolean17 = response1.hasCookie("hi!");
        java.lang.Class<?> wildcardClass18 = response1.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test11442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11442");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        java.net.URL uRL4 = response1.url();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        boolean boolean10 = response1.hasHeaderWithValue("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.executed = false;
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test11443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11443");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        boolean boolean4 = response1.executed;
        response1.contentType = "hi!";
        boolean boolean7 = response1.executed;
        java.lang.String str8 = response1.statusMessage();
        response1.contentType = "";
        boolean boolean12 = response1.hasCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.headers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test11444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11444");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.lang.String str11 = response1.statusMessage();
        java.lang.String str13 = response1.getHeaderCaseInsensitive("");
        java.lang.String str14 = response1.contentType();
        response1.charset = "hi!";
        int int17 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test11445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11445");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.lang.String str9 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("");
        int int12 = response1.numRedirects;
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        java.net.URL uRL15 = response1.url();
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test11446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11446");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (byte) 1;
        boolean boolean5 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer6 = response1.byteData;
        org.jsoup.Connection.Method method7 = response1.method();
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        response1.statusMessage = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = response1.hasHeaderWithValue("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test11447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11447");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        org.jsoup.Connection.Method method3 = response1.method();
        int int4 = response1.statusCode();
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        response1.executed = true;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        java.lang.String str10 = response1.statusMessage();
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11448");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        int int8 = response1.statusCode;
        int int9 = response1.statusCode;
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        java.lang.String str12 = response1.charset;
        boolean boolean13 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11449");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Request request7 = response1.req;
        java.lang.String str8 = response1.statusMessage;
        response1.statusMessage = "hi!";
        response1.statusMessage = "hi!";
        response1.numRedirects = 0;
        response1.executed = true;
        java.lang.String str17 = response1.statusMessage;
        response1.statusCode = '4';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test11450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11450");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        int int8 = response1.statusCode;
        int int9 = response1.statusCode;
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        response1.numRedirects = (short) -1;
        response1.executed = false;
        response1.statusMessage = "";
        response1.statusCode = (-1);
        java.lang.String str20 = response1.charset();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test11451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11451");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        response1.charset = "hi!";
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str9 = response1.contentType;
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response1.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test11452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11452");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        java.lang.String str6 = response1.statusMessage();
        java.net.URL uRL7 = response1.url();
        java.lang.String str8 = response1.charset;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response12 = response1.cookie("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test11453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11453");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.lang.String str5 = response1.charset();
        java.nio.ByteBuffer byteBuffer6 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response10 = response1.removeHeader("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test11454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11454");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.charset;
        response1.numRedirects = (short) -1;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11455");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        boolean boolean4 = response1.executed;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        java.lang.String str9 = response1.charset;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test11456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11456");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        java.nio.ByteBuffer byteBuffer4 = null;
        response1.byteData = byteBuffer4;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        int int7 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test11457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11457");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("");
        java.lang.String str8 = response1.statusMessage();
        org.jsoup.Connection.Response response11 = response1.cookie("hi!", "");
        response1.charset = "hi!";
        org.jsoup.Connection.Response response16 = response1.header("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.cookies();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test11458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11458");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasCookie("hi!");
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "");
        boolean boolean12 = response1.hasCookie("hi!");
        response1.numRedirects = (-1);
        response1.statusMessage = "hi!";
        int int17 = response1.statusCode();
        int int18 = response1.statusCode;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test11459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11459");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.nio.ByteBuffer byteBuffer6 = response1.byteData;
        int int7 = response1.numRedirects;
        response1.statusMessage = "hi!";
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test11460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11460");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        response1.contentType = "hi!";
        java.lang.String str9 = response1.cookie("hi!");
        response1.statusMessage = "hi!";
        java.lang.String str12 = response1.contentType;
        response1.contentType = "hi!";
        java.lang.String str15 = response1.contentType();
        int int16 = response1.statusCode;
        java.lang.String str17 = response1.statusMessage;
        response1.numRedirects = ' ';
        org.jsoup.Connection.Request request20 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(request20);
    }

    @Test
    public void test11461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11461");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.charset;
        response1.contentType = "hi!";
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        java.lang.String str12 = response1.cookie("hi!");
        java.lang.String str13 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11462");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("");
        java.lang.String str7 = response2.statusMessage;
        boolean boolean8 = response2.executed;
        java.nio.ByteBuffer byteBuffer9 = response2.byteData;
        java.nio.ByteBuffer byteBuffer10 = response2.byteData;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(byteBuffer10);
    }

    @Test
    public void test11463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11463");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.executed = false;
        int int8 = response1.statusCode();
        response1.statusCode = (byte) 1;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        int int13 = response1.statusCode();
        int int14 = response1.statusCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test11464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11464");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        java.lang.String str9 = response1.cookie("hi!");
        java.lang.String str11 = response1.header("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        org.jsoup.Connection.Request request13 = response1.req;
        java.lang.String str14 = response1.charset();
        java.lang.String str15 = response1.statusMessage();
        int int16 = response1.statusCode;
        java.lang.String str18 = response1.header("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test11465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11465");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        boolean boolean4 = response1.executed;
        response1.contentType = "hi!";
        java.lang.String str7 = response1.contentType;
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        org.jsoup.Connection.Method method10 = response1.method();
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        java.lang.String str14 = response1.contentType;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        java.lang.String str16 = response1.statusMessage;
        java.net.URL uRL17 = response1.url();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test11466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11466");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        java.net.URL uRL7 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        response1.contentType = "";
        java.lang.String str12 = response1.cookie("hi!");
        org.jsoup.Connection.Request request13 = response1.req;
        org.jsoup.Connection.Method method14 = response1.method();
        boolean boolean16 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.cookies();
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test11467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11467");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        int int7 = response1.numRedirects;
        int int8 = response1.statusCode();
        java.lang.String str9 = response1.statusMessage;
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        int int13 = response12.statusCode;
        response12.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response12.cookies();
        boolean boolean18 = response12.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response12.headers();
        java.net.URL uRL20 = response12.url();
        java.lang.String str21 = response12.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response12.cookies();
        java.lang.String str23 = response12.contentType;
        java.nio.ByteBuffer byteBuffer24 = null;
        response12.byteData = byteBuffer24;
        java.lang.String str26 = response12.contentType;
        java.lang.String str27 = response12.contentType;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test11468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11468");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        response1.contentType = "hi!";
        int int6 = response1.numRedirects;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test11469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11469");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.charset;
        java.lang.String str11 = response1.charset();
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        org.jsoup.Connection.Request request15 = response1.req;
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("hi!");
        int int20 = response1.numRedirects;
        response1.executed = true;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test11470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11470");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        response1.contentType = "hi!";
        java.lang.String str9 = response1.cookie("hi!");
        response1.statusMessage = "hi!";
        java.lang.String str12 = response1.contentType;
        response1.contentType = "hi!";
        java.lang.String str16 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Request request17 = response1.req;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "hi!";
        response1.executed = true;
        org.jsoup.Connection.Request request23 = null;
        response1.req = request23;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(request17);
    }

    @Test
    public void test11471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11471");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        boolean boolean4 = response1.executed;
        response1.contentType = "hi!";
        java.lang.String str7 = response1.contentType;
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        int int10 = response1.statusCode();
        response1.statusMessage = "";
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = response1.hasHeaderWithValue("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteBuffer13);
    }

    @Test
    public void test11472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11472");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.lang.String str8 = response1.contentType();
        response1.statusMessage = "hi!";
        boolean boolean12 = response1.hasHeader("hi!");
        org.jsoup.Connection.Response response14 = response1.removeCookie("hi!");
        boolean boolean16 = response1.hasCookie("hi!");
        org.jsoup.Connection.Response response18 = response1.removeCookie("hi!");
        java.lang.String str20 = response1.cookie("hi!");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test11473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11473");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.statusMessage();
        int int10 = response1.statusCode;
        java.lang.String str12 = response1.header("");
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(strEntry15);
    }

    @Test
    public void test11474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11474");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        java.lang.String str9 = response1.cookie("hi!");
        java.lang.String str11 = response1.header("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        java.net.URL uRL13 = response1.url();
        java.lang.String str14 = response1.charset;
        java.lang.String str15 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        response16.contentType = "";
        boolean boolean20 = response16.hasHeader("hi!");
        java.lang.String str21 = response16.charset;
        boolean boolean22 = response16.executed;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test11475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11475");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        int int8 = response1.statusCode;
        int int9 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("hi!");
        response1.statusMessage = "";
        java.lang.String str14 = response1.statusMessage;
        int int15 = response1.statusCode;
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        response18.numRedirects = 10;
        boolean boolean21 = response18.executed;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray22 = response18.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test11476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11476");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        java.nio.ByteBuffer byteBuffer6 = response1.byteData;
        org.jsoup.Connection.Response response8 = response1.removeHeader("hi!");
        java.lang.String str9 = response1.contentType();
        int int10 = response1.numRedirects;
        java.lang.String str12 = response1.header("hi!");
        java.lang.String str13 = response1.charset();
        response1.contentType = "";
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11477");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusCode = (short) 100;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        java.lang.String str12 = response1.header("");
        org.jsoup.Connection.Response response14 = response1.removeHeader("hi!");
        response1.contentType = "";
        response1.numRedirects = '#';
        response1.statusCode = (short) 0;
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test11478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11478");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.statusMessage();
        java.lang.String str6 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test11479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11479");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Request request7 = response1.req;
        java.lang.String str8 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        int int10 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test11480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11480");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.charset;
        boolean boolean11 = response1.executed;
        java.net.URL uRL12 = response1.url();
        java.lang.String str13 = response1.charset;
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test11481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11481");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        response1.statusCode = (byte) 10;
        org.jsoup.Connection.Response response8 = response1.removeHeader("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.Class<?> wildcardClass14 = response1.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11482");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.contentType;
        int int4 = response1.statusCode();
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        org.jsoup.Connection.Response response9 = response1.header("hi!", "");
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        int int11 = response1.statusCode();
        boolean boolean13 = response1.hasHeader("hi!");
        response1.statusCode = (-1);
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test11483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11483");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.numRedirects = (short) 10;
        response1.contentType = "";
        boolean boolean8 = response1.hasCookie("hi!");
        java.lang.String str9 = response1.statusMessage;
        java.lang.String str11 = response1.cookie("hi!");
        int int12 = response1.statusCode;
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        int int15 = response1.numRedirects;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test11484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11484");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = response2.cookies();
        java.nio.ByteBuffer byteBuffer4 = null;
        response2.byteData = byteBuffer4;
        java.lang.String str6 = response2.contentType;
        org.jsoup.Connection.Response response8 = response2.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response2.scanHeaders("hi!");
        java.lang.String str11 = response2.charset;
        boolean boolean12 = response2.executed;
        java.lang.String str13 = response2.charset;
        java.lang.String str14 = response2.contentType();
        java.lang.String str16 = response2.header("");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str18 = response17.charset;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = org.jsoup.helper.HttpConnection.Response.execute(request0, response17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test11485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11485");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.net.URL uRL9 = response1.url();
        java.lang.String str10 = response1.statusMessage;
        org.jsoup.Connection.Response response13 = response1.header("hi!", "");
        org.jsoup.Connection.Request request14 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        java.lang.String str16 = response1.charset;
        boolean boolean18 = response1.hasCookie("hi!");
        java.net.URL uRL19 = response1.url();
        java.net.URL uRL20 = response1.url();
        response1.contentType = "hi!";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(uRL20);
    }

    @Test
    public void test11486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11486");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.numRedirects = (short) 10;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        response1.numRedirects = 100;
        java.lang.String str8 = response1.statusMessage();
        java.lang.String str9 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test11487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11487");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.numRedirects = (short) 10;
        boolean boolean5 = response1.executed;
        java.net.URL uRL6 = response1.url();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str12 = response1.header("");
        int int13 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        response1.statusCode = (short) 0;
        response1.contentType = "";
        org.jsoup.Connection.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.method(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test11488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11488");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.statusMessage();
        int int10 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        boolean boolean15 = response1.hasHeaderWithValue("hi!", "");
        response1.charset = "";
        response1.charset = "";
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test11489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11489");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.contentType();
        java.lang.String str4 = response1.statusMessage;
        java.lang.String str6 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str8 = response1.charset;
        java.lang.String str10 = response1.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11490");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.charset;
        response1.contentType = "hi!";
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Response response11 = response1.cookie("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        org.jsoup.Connection.Method method15 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test11491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11491");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Request request6 = null;
        response1.req = request6;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.lang.String str9 = response1.contentType;
        int int10 = response1.numRedirects;
        java.lang.String str11 = response1.charset();
        org.jsoup.Connection.Response response13 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response15 = response1.removeCookie("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test11492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11492");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType();
        java.lang.String str7 = response1.header("");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        java.lang.String str10 = response1.statusMessage();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11493");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int3 = response2.statusCode;
        java.lang.String str4 = response2.statusMessage;
        boolean boolean5 = response2.executed;
        response2.contentType = "hi!";
        java.lang.String str8 = response2.contentType;
        java.nio.ByteBuffer byteBuffer9 = null;
        response2.byteData = byteBuffer9;
        java.lang.String str11 = response2.charset();
        org.jsoup.Connection.Response response14 = response2.header("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response2.cookies();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response2);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test11494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11494");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.statusMessage();
        org.jsoup.Connection.Method method6 = response1.method();
        boolean boolean9 = response1.hasHeaderWithValue("hi!", "hi!");
        java.lang.String str10 = response1.statusMessage();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11495");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str3 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.header("hi!");
        java.lang.String str9 = response1.cookie("hi!");
        java.lang.String str11 = response1.header("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        org.jsoup.Connection.Request request13 = response1.req;
        java.lang.String str14 = response1.charset();
        java.lang.String str15 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test11496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11496");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        java.nio.ByteBuffer byteBuffer6 = response1.byteData;
        boolean boolean8 = response1.hasHeader("hi!");
        int int9 = response1.statusCode();
        boolean boolean10 = response1.executed;
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        java.lang.String str15 = response1.charset;
        org.jsoup.Connection.Response response17 = response1.removeHeader("hi!");
        response1.contentType = "";
        int int20 = response1.statusCode();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test11497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11497");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.contentType;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.statusMessage();
        int int10 = response1.statusCode;
        java.lang.String str12 = response1.header("");
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        boolean boolean14 = response1.executed;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11498");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        response1.statusMessage = "hi!";
        java.lang.String str7 = response1.charset();
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "");
        org.jsoup.Connection.Request request11 = response1.req;
        boolean boolean12 = response1.executed;
        java.lang.String str13 = response1.charset;
        java.lang.String str14 = response1.charset();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test11499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11499");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.nio.ByteBuffer byteBuffer3 = null;
        response1.byteData = byteBuffer3;
        java.lang.String str5 = response1.charset;
        response1.contentType = "hi!";
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Response response11 = response1.cookie("hi!", "");
        java.lang.String str12 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11500");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.net.URL uRL9 = response1.url();
        java.lang.String str10 = response1.statusMessage;
        org.jsoup.Connection.Response response13 = response1.header("hi!", "");
        int int14 = response1.numRedirects;
        org.jsoup.Connection.Response response16 = response1.removeCookie("hi!");
        java.lang.String str17 = response1.contentType;
        java.lang.String str18 = response1.contentType;
        response1.contentType = "hi!";
        java.lang.String str22 = response1.cookie("hi!");
        java.lang.String str23 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }
}

