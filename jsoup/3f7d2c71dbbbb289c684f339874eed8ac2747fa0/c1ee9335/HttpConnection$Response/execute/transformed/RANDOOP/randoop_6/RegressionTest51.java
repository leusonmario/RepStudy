import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest51 {

    public static boolean debug = false;

    @Test
    public void test25501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25501");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int8 = response0.statusCode();
        java.util.Map.Entry entry10 = response0.scanHeaders("");
        java.lang.String str12 = response0.header("");
        java.lang.String str13 = response0.charset();
        int int14 = response0.statusCode();
        org.jsoup.Connection.Response response16 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL18 = response17.url();
        java.lang.String str20 = response17.header("hi!");
        org.jsoup.Connection.Response response22 = response17.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response23);
        boolean boolean26 = response23.hasHeader("hi!");
        org.jsoup.Connection.Response response28 = response23.removeCookie("");
        java.lang.String str30 = response23.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response32 = response23.removeCookie("hi!");
        java.util.Map map33 = response23.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map33);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test25502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25502");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str11 = response9.cookie("");
        java.lang.String str12 = response9.contentType();
        java.lang.String str14 = response9.header("hi!");
        java.util.Map map15 = response9.cookies();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL17 = response16.url();
        org.jsoup.Connection.Method method18 = response16.method();
        java.lang.String str20 = response16.cookie("hi!");
        boolean boolean22 = response16.hasCookie("hi!");
        org.jsoup.Connection.Response response25 = response16.cookie("hi!", "");
        boolean boolean27 = response16.hasHeader("hi!");
        java.lang.String str28 = response16.statusMessage();
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.lang.String str30 = response16.statusMessage();
        java.util.Map map31 = response16.headers();
        java.util.Map map32 = response16.cookies();
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL34 = response33.url();
        java.lang.String str35 = response33.statusMessage();
        int int36 = response33.statusCode();
        org.jsoup.Connection.Response response39 = response33.header("hi!", "hi!");
        java.util.Map map40 = response33.cookies();
        response16.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map40);
        response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map40);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map40);
        java.lang.String str44 = response0.charset();
        java.lang.String str45 = response0.contentType();
        boolean boolean47 = response0.hasCookie("hi!");
        java.util.Map map48 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response49 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method50 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response51 = response49.method(method50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(uRL34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(response39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(map48);
    }

    @Test
    public void test25503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25503");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.cookie("hi!");
        java.util.Map.Entry entry10 = response0.scanHeaders("hi!");
        java.lang.String str12 = response0.cookie("");
        java.util.Map.Entry entry14 = response0.scanHeaders("hi!");
        boolean boolean16 = response0.hasCookie("");
        java.lang.String str17 = response0.statusMessage();
        org.jsoup.Connection.Response response19 = response0.removeCookie("");
        java.net.HttpURLConnection httpURLConnection20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL22 = response21.url();
        java.lang.String str24 = response21.header("hi!");
        org.jsoup.Connection.Response response26 = response21.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response21);
        java.lang.String str28 = response21.contentType();
        org.jsoup.Connection.Response response30 = response21.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection20, response30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(entry14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(response30);
    }

    @Test
    public void test25504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25504");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.charset();
        java.lang.String str9 = response0.charset();
        java.lang.String str11 = response0.header("hi!");
        boolean boolean13 = response0.hasCookie("");
        java.lang.String str14 = response0.contentType();
        java.lang.String str16 = response0.cookie("hi!");
        java.lang.String str17 = response0.charset();
        java.lang.String str18 = response0.charset();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test25505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25505");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.net.URL uRL6 = response0.url();
        org.jsoup.Connection.Response response8 = response0.removeCookie("hi!");
        java.lang.String str9 = response0.contentType();
        java.lang.String str11 = response0.cookie("");
        boolean boolean13 = response0.hasHeader("hi!");
        java.lang.String str14 = response0.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test25506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25506");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL5 = response4.url();
        java.lang.String str7 = response4.header("hi!");
        java.util.Map map8 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map8);
        int int10 = response0.statusCode();
        java.lang.String str11 = response0.charset();
        org.jsoup.Connection.Method method12 = response0.method();
        org.jsoup.Connection.Method method13 = response0.method();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response16 = response14.removeCookie("");
        java.lang.String str17 = response14.statusMessage();
        java.lang.String str18 = response14.charset();
        java.util.Map.Entry entry20 = response14.scanHeaders("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(entry20);
    }

    @Test
    public void test25507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25507");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.util.Map map8 = response0.headers();
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "hi!");
        java.lang.String str12 = response0.statusMessage();
        java.lang.String str13 = response0.contentType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test25508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25508");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map map7 = response0.cookies();
        java.util.Map map8 = response0.headers();
        java.util.Map map9 = response0.cookies();
        java.lang.String str11 = response0.getHeaderCaseInsensitive("hi!");
        boolean boolean13 = response0.hasCookie("hi!");
        int int14 = response0.statusCode();
        java.util.Map map15 = response0.headers();
        java.lang.String str17 = response0.cookie("");
        java.net.URL uRL18 = response0.url();
        int int19 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test25509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25509");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry6 = response0.scanHeaders("hi!");
        java.net.HttpURLConnection httpURLConnection7 = null;
        org.jsoup.Connection.Response response8 = null;
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection7, response8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(entry6);
    }

    @Test
    public void test25510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25510");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        int int7 = response0.statusCode();
        java.lang.String str8 = response0.charset();
        int int9 = response0.statusCode();
        java.lang.String str11 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str12 = response0.charset();
        java.util.Map.Entry entry14 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method16 = response0.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(entry14);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test25511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25511");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map map7 = response0.cookies();
        java.util.Map map8 = response0.headers();
        java.util.Map map9 = response0.cookies();
        java.lang.String str11 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str12 = response0.contentType();
        java.net.URL uRL13 = response0.url();
        boolean boolean15 = response0.hasCookie("");
        org.jsoup.Connection.Method method16 = response0.method();
        java.lang.String str17 = response0.statusMessage();
        java.lang.String str18 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test25512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25512");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        java.lang.String str6 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.net.URL uRL9 = response8.url();
        java.lang.String str10 = response8.charset();
        java.net.URL uRL11 = response8.url();
        java.util.Map map12 = response8.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map12);
        org.jsoup.Connection.Response response15 = response0.removeHeader("hi!");
        java.lang.String str17 = response0.cookie("hi!");
        java.util.Map map18 = response0.cookies();
        int int19 = response0.statusCode();
        java.lang.String str20 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map22 = response21.cookies();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray23 = response21.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test25513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25513");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        java.util.Map map4 = response0.cookies();
        org.jsoup.Connection.Response response7 = response0.header("hi!", "hi!");
        boolean boolean9 = response0.hasCookie("");
        java.lang.String str10 = response0.contentType();
        org.jsoup.Connection.Response response13 = response0.cookie("hi!", "hi!");
        java.lang.String str15 = response0.cookie("");
        java.net.URL uRL16 = response0.url();
        java.util.Map map17 = response0.cookies();
        java.lang.String str19 = response0.cookie("hi!");
        org.jsoup.Connection.Method method20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response0.method(method20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test25514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25514");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map4 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map4);
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str11 = response9.cookie("");
        java.lang.String str12 = response9.contentType();
        java.lang.String str14 = response9.getHeaderCaseInsensitive("hi!");
        java.lang.String str15 = response9.contentType();
        org.jsoup.Connection.Method method16 = response9.method();
        java.util.Map map17 = response9.cookies();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL19 = response18.url();
        org.jsoup.Connection.Method method20 = response18.method();
        java.lang.String str22 = response18.cookie("hi!");
        boolean boolean24 = response18.hasCookie("hi!");
        org.jsoup.Connection.Response response27 = response18.cookie("hi!", "");
        boolean boolean29 = response18.hasHeader("hi!");
        java.lang.String str30 = response18.statusMessage();
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response18);
        java.lang.String str32 = response31.statusMessage();
        org.jsoup.Connection.Response response35 = response31.header("hi!", "hi!");
        java.util.Map.Entry entry37 = response31.scanHeaders("");
        java.util.Map map38 = response31.cookies();
        response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map38);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map38);
        org.jsoup.helper.HttpConnection.Response response41 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str43 = response41.cookie("");
        java.lang.String str44 = response41.contentType();
        java.lang.String str46 = response41.getHeaderCaseInsensitive("hi!");
        java.lang.String str47 = response41.contentType();
        java.lang.String str49 = response41.cookie("hi!");
        org.jsoup.Connection.Method method50 = response41.method();
        org.jsoup.Connection.Method method51 = response41.method();
        java.util.Map map52 = response41.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map52);
        java.net.URL uRL54 = response0.url();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(response35);
        org.junit.Assert.assertNull(entry37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(method50);
        org.junit.Assert.assertNull(method51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNull(uRL54);
    }

    @Test
    public void test25515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25515");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        java.util.Map map4 = response0.cookies();
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Response response11 = response0.header("hi!", "hi!");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test25516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25516");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response9 = response0.removeHeader("hi!");
        java.util.Map map10 = response0.cookies();
        org.jsoup.Connection.Method method11 = response0.method();
        org.jsoup.Connection.Response response13 = response0.removeHeader("hi!");
        java.util.Map.Entry entry15 = response0.scanHeaders("");
        org.jsoup.Connection.Method method16 = response0.method();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(entry15);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test25517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25517");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        int int4 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response5.contentType();
        org.jsoup.Connection.Response response8 = response5.removeCookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test25518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25518");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.util.Map map7 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str9 = response0.contentType();
        java.util.Map.Entry entry11 = response0.scanHeaders("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(entry11);
    }

    @Test
    public void test25519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25519");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str6 = response0.charset();
        java.util.Map map7 = response0.cookies();
        boolean boolean9 = response0.hasHeader("hi!");
        java.lang.String str10 = response0.statusMessage();
        org.jsoup.Connection.Method method11 = response0.method();
        java.lang.String str12 = response0.contentType();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test25520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25520");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.header("hi!", "");
        boolean boolean9 = response0.hasCookie("");
        java.util.Map map10 = response0.headers();
        org.jsoup.Connection.Response response12 = response0.removeCookie("");
        java.lang.String str13 = response0.statusMessage();
        org.jsoup.Connection.Response response15 = response0.removeCookie("");
        java.util.Map.Entry entry17 = response0.scanHeaders("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(entry17);
    }

    @Test
    public void test25521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25521");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response9 = response0.cookie("hi!", "");
        boolean boolean11 = response0.hasHeader("hi!");
        java.lang.String str12 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str14 = response13.statusMessage();
        boolean boolean16 = response13.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Response response19 = response13.removeCookie("hi!");
        org.jsoup.Connection.Method method20 = response13.method();
        int int21 = response13.statusCode();
        java.lang.String str22 = response13.charset();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test25522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25522");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.contentType();
        java.util.Map map9 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL11 = response10.url();
        org.jsoup.Connection.Method method12 = response10.method();
        java.lang.String str14 = response10.cookie("hi!");
        boolean boolean16 = response10.hasCookie("hi!");
        org.jsoup.Connection.Response response19 = response10.cookie("hi!", "");
        boolean boolean21 = response10.hasHeader("hi!");
        java.lang.String str22 = response10.statusMessage();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.lang.String str24 = response10.statusMessage();
        java.util.Map map25 = response10.headers();
        java.util.Map map26 = response10.cookies();
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL28 = response27.url();
        java.lang.String str29 = response27.statusMessage();
        int int30 = response27.statusCode();
        org.jsoup.Connection.Response response33 = response27.header("hi!", "hi!");
        java.util.Map map34 = response27.cookies();
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map34);
        int int36 = response10.statusCode();
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response(response37);
        org.jsoup.Connection.Method method39 = response37.method();
        java.util.Map map40 = response37.headers();
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map40);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map40);
        java.lang.String str44 = response0.header("hi!");
        java.lang.String str45 = response0.contentType();
        java.lang.String str46 = response0.charset();
        java.lang.String str48 = response0.header("");
        java.lang.String str49 = response0.statusMessage();
        java.lang.String str51 = response0.cookie("");
        java.util.Map map52 = response0.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(uRL28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(method39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(map52);
    }

    @Test
    public void test25523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25523");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean9 = response0.hasCookie("");
        java.lang.String str11 = response0.cookie("hi!");
        boolean boolean13 = response0.hasHeader("hi!");
        boolean boolean15 = response0.hasCookie("hi!");
        java.lang.String str17 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map19 = response18.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test25524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25524");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL5 = response4.url();
        org.jsoup.Connection.Method method6 = response4.method();
        org.jsoup.Connection.Response response9 = response4.header("hi!", "");
        java.lang.String str11 = response4.header("hi!");
        java.util.Map map12 = response4.cookies();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map12);
        java.lang.String str14 = response1.charset();
        java.net.URL uRL15 = response1.url();
        java.lang.String str17 = response1.getHeaderCaseInsensitive("");
        java.lang.String str19 = response1.header("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test25525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25525");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response9 = response0.cookie("hi!", "");
        boolean boolean11 = response0.hasHeader("hi!");
        java.lang.String str12 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str14 = response0.statusMessage();
        java.util.Map map15 = response0.headers();
        java.util.Map map16 = response0.cookies();
        org.jsoup.Connection.Response response18 = response0.removeHeader("hi!");
        java.lang.String str20 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str22 = response0.cookie("hi!");
        java.lang.String str23 = response0.contentType();
        java.lang.String str25 = response0.cookie("hi!");
        java.lang.String str27 = response0.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test25526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25526");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.lang.String str5 = response0.contentType();
        java.net.URL uRL6 = response0.url();
        java.lang.String str7 = response0.statusMessage();
        boolean boolean9 = response0.hasCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test25527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25527");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Response response6 = response0.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response10 = response7.header("hi!", "");
        java.lang.String str11 = response7.statusMessage();
        org.jsoup.Connection.Method method12 = response7.method();
        java.lang.String str14 = response7.header("");
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response7.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test25528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25528");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response9 = response0.cookie("hi!", "");
        java.lang.String str11 = response0.cookie("hi!");
        java.lang.String str12 = response0.contentType();
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL15 = response14.url();
        java.lang.String str17 = response14.header("hi!");
        org.jsoup.Connection.Response response19 = response14.removeHeader("hi!");
        java.lang.String str21 = response14.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response24 = response14.header("hi!", "hi!");
        java.lang.String str26 = response14.getHeaderCaseInsensitive("");
        java.lang.String str27 = response14.charset();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test25529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25529");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL5 = response4.url();
        org.jsoup.Connection.Method method6 = response4.method();
        org.jsoup.Connection.Response response9 = response4.header("hi!", "");
        java.lang.String str11 = response4.header("hi!");
        java.util.Map map12 = response4.cookies();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map12);
        java.lang.String str15 = response1.getHeaderCaseInsensitive("hi!");
        boolean boolean17 = response1.hasCookie("");
        java.net.URL uRL18 = response1.url();
        java.lang.String str19 = response1.charset();
        boolean boolean21 = response1.hasHeader("hi!");
        org.jsoup.Connection.Response response24 = response1.cookie("hi!", "hi!");
        boolean boolean26 = response1.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test25530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25530");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response9 = response0.cookie("hi!", "");
        boolean boolean11 = response0.hasHeader("hi!");
        java.lang.String str12 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str14 = response0.statusMessage();
        java.util.Map map15 = response0.headers();
        java.util.Map map16 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL18 = response17.url();
        org.jsoup.Connection.Method method19 = response17.method();
        org.jsoup.Connection.Response response21 = response17.removeCookie("hi!");
        java.lang.String str23 = response17.getHeaderCaseInsensitive("");
        java.util.Map map24 = response17.cookies();
        java.util.Map map25 = response17.headers();
        java.util.Map map26 = response17.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        java.net.URL uRL28 = response0.url();
        java.lang.String str29 = response0.charset();
        boolean boolean31 = response0.hasHeader("hi!");
        java.lang.String str33 = response0.header("");
        java.util.Map.Entry entry35 = response0.scanHeaders("hi!");
        org.jsoup.Connection.Method method36 = response0.method();
        boolean boolean38 = response0.hasCookie("hi!");
        boolean boolean40 = response0.hasCookie("hi!");
        int int41 = response0.statusCode();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(uRL28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(entry35);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test25531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25531");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response0.url();
        java.net.URL uRL3 = response0.url();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        int int6 = response0.statusCode();
        java.lang.String str8 = response0.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test25532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25532");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        java.net.URL uRL4 = response1.url();
        java.lang.String str6 = response1.header("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL8 = response7.url();
        org.jsoup.Connection.Method method9 = response7.method();
        java.lang.String str11 = response7.cookie("hi!");
        boolean boolean13 = response7.hasCookie("hi!");
        org.jsoup.Connection.Response response16 = response7.cookie("hi!", "");
        boolean boolean18 = response7.hasHeader("hi!");
        java.lang.String str19 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str21 = response7.statusMessage();
        java.util.Map map22 = response7.headers();
        java.lang.String str23 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map25 = response24.headers();
        response7.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map28 = response27.cookies();
        response7.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        org.jsoup.Connection.Response response33 = response1.header("hi!", "");
        java.lang.String str35 = response1.cookie("");
        boolean boolean37 = response1.hasCookie("");
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test25533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25533");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        boolean boolean9 = response0.hasCookie("");
        java.lang.String str10 = response0.charset();
        java.lang.String str11 = response0.contentType();
        java.lang.String str12 = response0.charset();
        boolean boolean14 = response0.hasCookie("");
        org.jsoup.Connection.Method method15 = response0.method();
        java.lang.String str17 = response0.header("");
        java.lang.String str18 = response0.statusMessage();
        java.lang.String str20 = response0.header("hi!");
        java.util.Map map21 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str23 = response22.charset();
        boolean boolean25 = response22.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response22);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test25534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25534");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.cookie("hi!");
        java.lang.String str4 = response0.statusMessage();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map.Entry entry8 = response0.scanHeaders("hi!");
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test25535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25535");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.contentType();
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method11 = response0.method();
        java.lang.String str12 = response0.statusMessage();
        java.lang.Class<?> wildcardClass13 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test25536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25536");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Response response3 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response4.header("");
        boolean boolean8 = response4.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Method method10 = response4.method();
        org.jsoup.Connection.Response response12 = response4.removeCookie("");
        boolean boolean14 = response4.hasCookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test25537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25537");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        java.util.Map map4 = response0.cookies();
        java.lang.String str5 = response0.statusMessage();
        boolean boolean7 = response0.hasCookie("hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method11 = response10.method();
        java.lang.String str13 = response10.getHeaderCaseInsensitive("");
        java.lang.String str15 = response10.header("");
        org.jsoup.Connection.Response response18 = response10.cookie("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.lang.String str21 = response10.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method22 = response10.method();
        java.lang.String str24 = response10.getHeaderCaseInsensitive("hi!");
        java.lang.String str26 = response10.cookie("");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(entry9);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test25538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25538");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str4 = response0.charset();
        org.jsoup.Connection.Response response6 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response8 = response0.removeCookie("hi!");
        java.lang.String str10 = response0.header("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test25539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25539");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str12 = response11.contentType();
        boolean boolean14 = response11.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.util.Map map16 = response15.cookies();
        java.lang.String str18 = response15.header("hi!");
        java.lang.String str19 = response15.charset();
        java.net.HttpURLConnection httpURLConnection20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL22 = response21.url();
        org.jsoup.Connection.Method method23 = response21.method();
        java.lang.String str25 = response21.cookie("hi!");
        boolean boolean27 = response21.hasCookie("hi!");
        int int28 = response21.statusCode();
        java.lang.String str30 = response21.cookie("hi!");
        java.util.Map map31 = response21.headers();
        java.util.Map map32 = response21.cookies();
        boolean boolean34 = response21.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response15.setupFromConnection(httpURLConnection20, (org.jsoup.Connection.Response) response21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test25540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25540");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        java.util.Map map6 = response0.cookies();
        java.net.URL uRL7 = response0.url();
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Method method9 = response0.method();
        boolean boolean11 = response0.hasCookie("hi!");
        java.util.Map map12 = response0.cookies();
        java.lang.String str14 = response0.cookie("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str14);
    }
}

