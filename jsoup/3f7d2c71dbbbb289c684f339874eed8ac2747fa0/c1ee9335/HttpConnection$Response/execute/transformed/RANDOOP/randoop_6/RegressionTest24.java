import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest24 {

    public static boolean debug = false;

    @Test
    public void test12001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12001");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean9 = response0.hasCookie("");
        java.lang.String str10 = response0.statusMessage();
        java.lang.String str12 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method13 = response0.method();
        java.lang.String str14 = response0.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12002");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.util.Map map7 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response8.cookie("hi!");
        org.jsoup.Connection.Response response12 = response8.removeHeader("hi!");
        java.net.URL uRL13 = response8.url();
        java.net.URL uRL14 = response8.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response8.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test12003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12003");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.charset();
        java.lang.String str9 = response0.charset();
        java.lang.String str11 = response0.header("hi!");
        org.jsoup.Connection.Response response13 = response0.removeCookie("");
        java.lang.String str14 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12004");
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
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        boolean boolean17 = response15.hasCookie("");
        org.jsoup.Connection.Method method18 = response15.method();
        java.net.HttpURLConnection httpURLConnection19 = null;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.Connection.Method method22 = response20.method();
        java.lang.String str23 = response20.statusMessage();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.Connection.Response response27 = response24.cookie("hi!", "");
        java.util.Map.Entry entry29 = response24.scanHeaders("hi!");
        java.lang.String str31 = response24.header("hi!");
        java.util.Map.Entry entry33 = response24.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response15.setupFromConnection(httpURLConnection19, (org.jsoup.Connection.Response) response24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNull(entry29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(entry33);
    }

    @Test
    public void test12005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12005");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.util.Map map3 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL5 = response4.url();
        java.lang.String str6 = response4.statusMessage();
        boolean boolean8 = response4.hasCookie("hi!");
        boolean boolean10 = response4.hasHeader("hi!");
        java.util.Map map11 = response4.cookies();
        java.lang.String str12 = response4.contentType();
        org.jsoup.Connection.Method method13 = response4.method();
        java.net.URL uRL14 = response4.url();
        java.util.Map map15 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map15);
        int int17 = response0.statusCode();
        boolean boolean19 = response0.hasCookie("hi!");
        java.util.Map map20 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL22 = response21.url();
        java.net.URL uRL23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response21.url(uRL23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(uRL22);
    }

    @Test
    public void test12006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12006");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("");
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "");
        java.util.Map map12 = response0.headers();
        org.jsoup.Connection.Response response14 = response0.removeCookie("hi!");
        java.lang.String str16 = response0.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12007");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Response response3 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response4.header("");
        boolean boolean8 = response4.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Method method10 = response4.method();
        java.lang.String str12 = response4.cookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12008");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        int int7 = response0.statusCode();
        java.lang.String str8 = response0.charset();
        int int9 = response0.statusCode();
        java.lang.String str11 = response0.cookie("");
        java.lang.String str13 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response14.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12009");
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
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str17 = response16.charset();
        java.util.Map.Entry entry19 = response16.scanHeaders("hi!");
        boolean boolean21 = response16.hasCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(entry19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test12010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12010");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.cookie("");
        java.util.Map map8 = response0.headers();
        java.net.URL uRL9 = response0.url();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response12 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response14 = response0.removeCookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test12011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12011");
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
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str17 = response15.cookie("hi!");
        org.jsoup.Connection.Response response20 = response15.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.net.URL uRL22 = response15.url();
        org.jsoup.Connection.Response response24 = response15.removeCookie("hi!");
        java.lang.String str25 = response15.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response28 = response15.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test12012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12012");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("hi!");
        int int8 = response0.statusCode();
        boolean boolean10 = response0.hasCookie("");
        java.lang.String str12 = response0.cookie("");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry15 = response13.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Response response19 = response13.header("hi!", "");
        java.util.Map.Entry entry21 = response13.scanHeaders("");
        java.lang.String str22 = response13.contentType();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(entry15);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(entry21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test12013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12013");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.cookie("hi!", "hi!");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.cookie("");
        org.jsoup.Connection.Method method7 = response0.method();
        java.lang.String str9 = response0.cookie("");
        java.util.Map map10 = response0.cookies();
        java.lang.Class<?> wildcardClass11 = response0.getClass();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test12014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12014");
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
        java.util.Map.Entry entry17 = response0.scanHeaders("");
        java.lang.String str18 = response0.contentType();
        java.lang.String str19 = response0.charset();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(entry17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test12015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12015");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str4 = response0.charset();
        boolean boolean6 = response0.hasCookie("hi!");
        java.util.Map.Entry entry8 = response0.scanHeaders("");
        java.lang.String str10 = response0.cookie("");
        int int11 = response0.statusCode();
        int int12 = response0.statusCode();
        java.lang.String str13 = response0.charset();
        org.jsoup.Connection.Response response16 = response0.cookie("hi!", "");
        java.net.HttpURLConnection httpURLConnection17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL19 = response18.url();
        org.jsoup.Connection.Method method20 = response18.method();
        java.lang.String str21 = response18.contentType();
        org.jsoup.Connection.Response response24 = response18.cookie("hi!", "");
        java.lang.String str26 = response18.header("");
        java.lang.String str28 = response18.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection17, (org.jsoup.Connection.Response) response18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test12016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12016");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map4 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map4);
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        java.lang.String str9 = response0.header("");
        org.jsoup.Connection.Response response11 = response0.removeCookie("hi!");
        org.jsoup.Connection.Method method12 = response0.method();
        java.util.Map.Entry entry14 = response0.scanHeaders("hi!");
        java.net.HttpURLConnection httpURLConnection15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response19 = response16.header("hi!", "hi!");
        boolean boolean21 = response16.hasCookie("hi!");
        java.lang.String str23 = response16.header("");
        boolean boolean25 = response16.hasCookie("hi!");
        java.util.Map map26 = response16.cookies();
        boolean boolean28 = response16.hasHeader("hi!");
        org.jsoup.Connection.Response response31 = response16.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection15, response31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(entry14);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(response31);
    }

    @Test
    public void test12017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12017");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        int int4 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean7 = response5.hasCookie("hi!");
        int int8 = response5.statusCode();
        java.lang.String str10 = response5.getHeaderCaseInsensitive("hi!");
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str14 = response12.cookie("");
        java.lang.String str15 = response12.statusMessage();
        java.lang.String str17 = response12.cookie("");
        java.net.URL uRL18 = response12.url();
        org.jsoup.Connection.Response response20 = response12.removeCookie("hi!");
        org.jsoup.Connection.Response response22 = response12.removeCookie("hi!");
        int int23 = response12.statusCode();
        int int24 = response12.statusCode();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response25);
        java.net.URL uRL27 = response26.url();
        java.lang.String str28 = response26.charset();
        java.net.URL uRL29 = response26.url();
        java.util.Map map30 = response26.cookies();
        org.jsoup.Connection.Response response33 = response26.cookie("hi!", "hi!");
        java.lang.String str35 = response26.header("");
        java.util.Map map36 = response26.headers();
        response12.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map36);
        // The following exception was thrown during execution in test generation
        try {
            response5.setupFromConnection(httpURLConnection11, (org.jsoup.Connection.Response) response12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(uRL27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(uRL29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test12018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12018");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response0.cookies();
        java.util.Map map8 = response0.cookies();
        java.lang.String str9 = response0.charset();
        boolean boolean11 = response0.hasCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test12019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12019");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        boolean boolean4 = response0.hasCookie("");
        org.jsoup.Connection.Response response6 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map8 = response7.cookies();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test12020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12020");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response1.removeCookie("");
        java.util.Map map8 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL10 = response1.url();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str14 = response12.cookie("");
        java.lang.String str15 = response12.contentType();
        java.lang.String str17 = response12.header("hi!");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.util.Map.Entry entry20 = response12.scanHeaders("hi!");
        java.util.Map map21 = response12.cookies();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        boolean boolean24 = response1.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray25 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(entry20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test12021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12021");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        java.lang.String str9 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map12 = response11.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test12022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12022");
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
        boolean boolean15 = response0.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test12023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12023");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.net.URL uRL6 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response0.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(uRL6);
    }

    @Test
    public void test12024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12024");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.lang.String str9 = response0.cookie("");
        org.jsoup.Connection.Response response11 = response0.removeCookie("");
        java.util.Map map12 = response0.cookies();
        java.lang.String str14 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int16 = response15.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response15.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test12025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12025");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        java.lang.String str6 = response0.cookie("");
        java.util.Map.Entry entry8 = response0.scanHeaders("");
        boolean boolean10 = response0.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test12026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12026");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.cookie("hi!", "hi!");
        int int4 = response0.statusCode();
        java.util.Map map5 = response0.cookies();
        java.lang.String str7 = response0.header("hi!");
        java.net.URL uRL8 = response0.url();
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.Connection.Response response11 = response0.removeHeader("hi!");
        java.util.Map map12 = response0.headers();
        java.lang.String str13 = response0.statusMessage();
        java.util.Map map14 = response0.cookies();
        java.lang.String str16 = response0.header("hi!");
        java.util.Map map17 = response0.cookies();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test12027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12027");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.charset();
        java.lang.String str9 = response0.charset();
        boolean boolean11 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.net.URL uRL14 = response13.url();
        java.lang.String str15 = response13.charset();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str17 = response16.statusMessage();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response21 = response18.header("hi!", "hi!");
        java.util.Map map22 = response18.cookies();
        response16.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        java.util.Map map25 = response0.headers();
        java.lang.String str27 = response0.header("hi!");
        java.util.Map map28 = response0.cookies();
        java.lang.Class<?> wildcardClass29 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test12028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12028");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map map7 = response0.cookies();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        int int10 = response0.statusCode();
        java.lang.String str11 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response12.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12029");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.cookie("hi!", "hi!");
        int int4 = response0.statusCode();
        java.util.Map map5 = response0.cookies();
        java.lang.String str7 = response0.header("hi!");
        java.net.URL uRL8 = response0.url();
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str10 = response0.charset();
        java.net.URL uRL11 = response0.url();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders(strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test12030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12030");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        boolean boolean9 = response0.hasCookie("hi!");
        org.jsoup.Connection.Method method10 = response0.method();
        boolean boolean12 = response0.hasCookie("");
        java.net.URL uRL13 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = uRL13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test12031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12031");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        boolean boolean4 = response0.hasHeader("hi!");
        java.net.URL uRL5 = response0.url();
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        int int10 = response0.statusCode();
        java.util.Map.Entry entry12 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL14 = response13.url();
        java.lang.String str15 = response13.statusMessage();
        java.util.Map map16 = response13.cookies();
        org.jsoup.Connection.Response response18 = response13.removeHeader("hi!");
        java.net.URL uRL19 = response13.url();
        org.jsoup.Connection.Response response21 = response13.removeCookie("hi!");
        java.util.Map map22 = response13.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        java.lang.Class<?> wildcardClass24 = map22.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(entry12);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test12032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12032");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.net.URL uRL7 = response0.url();
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        java.lang.String str10 = response0.charset();
        boolean boolean12 = response0.hasCookie("");
        java.util.Map map13 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str16 = response14.cookie("");
        boolean boolean18 = response14.hasHeader("hi!");
        java.net.URL uRL19 = response14.url();
        java.lang.String str21 = response14.getHeaderCaseInsensitive("");
        java.net.URL uRL22 = response14.url();
        java.lang.String str23 = response14.statusMessage();
        java.util.Map map24 = response14.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        org.jsoup.Connection.Response response27 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response30 = response0.header("hi!", "hi!");
        java.lang.String str32 = response0.cookie("");
        org.jsoup.Connection.Response response35 = response0.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document37 = response36.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(entry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(response35);
    }

    @Test
    public void test12033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12033");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str13 = response11.cookie("");
        java.lang.String str14 = response11.statusMessage();
        java.lang.String str16 = response11.header("hi!");
        java.lang.String str17 = response11.contentType();
        org.jsoup.Connection.Response response20 = response11.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.Connection.Method method25 = response23.method();
        java.util.Map map26 = response23.headers();
        response22.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        java.lang.String str31 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL33 = response32.url();
        java.lang.String str34 = response32.statusMessage();
        java.util.Map map35 = response32.cookies();
        java.lang.String str37 = response32.header("");
        java.lang.String str39 = response32.header("hi!");
        org.jsoup.helper.HttpConnection.Response response40 = new org.jsoup.helper.HttpConnection.Response(response32);
        org.jsoup.Connection.Response response43 = response32.cookie("hi!", "");
        java.util.Map map44 = response32.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map44);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document46 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(uRL33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(response43);
        org.junit.Assert.assertNotNull(map44);
    }

    @Test
    public void test12034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12034");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        java.lang.String str4 = response0.charset();
        int int5 = response0.statusCode();
        java.util.Map map6 = response0.cookies();
        java.lang.String str7 = response0.charset();
        org.jsoup.Connection.Method method8 = response0.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
    }

    @Test
    public void test12035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12035");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str6 = response0.contentType();
        org.jsoup.Connection.Response response9 = response0.header("hi!", "hi!");
        java.lang.String str10 = response0.statusMessage();
        java.lang.String str11 = response0.charset();
        java.util.Map map12 = response0.cookies();
        org.jsoup.Connection.Response response15 = response0.header("hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test12036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12036");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        boolean boolean9 = response6.hasHeader("hi!");
        org.jsoup.Connection.Response response11 = response6.removeCookie("");
        org.jsoup.Connection.Response response13 = response6.removeCookie("");
        org.jsoup.Connection.Response response16 = response6.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str19 = response17.header("hi!");
        java.lang.String str20 = response17.statusMessage();
        org.jsoup.Connection.Method method21 = response17.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(method21);
    }

    @Test
    public void test12037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12037");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response6.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = response6.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test12038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12038");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response6.getHeaderCaseInsensitive("hi!");
        java.lang.String str9 = response6.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.net.URL uRL11 = response10.url();
        org.jsoup.Connection.Response response13 = response10.removeCookie("hi!");
        java.util.Map map14 = response10.headers();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.util.Map map16 = response10.cookies();
        org.jsoup.Connection.Method method17 = response10.method();
        boolean boolean19 = response10.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response10.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test12039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12039");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response6.cookie("hi!");
        java.lang.String str10 = response6.cookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12040");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        boolean boolean7 = response0.hasCookie("hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response10.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(entry9);
    }

    @Test
    public void test12041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12041");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        int int7 = response0.statusCode();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "hi!");
        java.lang.String str13 = response0.getHeaderCaseInsensitive("");
        java.util.Map map14 = response0.cookies();
        java.lang.String str16 = response0.header("");
        org.jsoup.Connection.Response response19 = response0.header("hi!", "");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test12042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12042");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.util.Map map8 = response0.headers();
        org.jsoup.Connection.Response response10 = response0.removeHeader("hi!");
        boolean boolean12 = response0.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test12043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12043");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "hi!");
        java.lang.String str12 = response0.getHeaderCaseInsensitive("");
        java.lang.String str14 = response0.header("");
        java.lang.String str15 = response0.statusMessage();
        java.lang.String str16 = response0.contentType();
        java.util.Map.Entry entry18 = response0.scanHeaders("hi!");
        java.util.Map map19 = response0.headers();
        org.jsoup.Connection.Method method20 = response0.method();
        org.jsoup.Connection.Response response22 = response0.removeCookie("hi!");
        java.lang.String str24 = response0.cookie("");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(entry18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test12044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12044");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        org.jsoup.Connection.Response response7 = response0.cookie("hi!", "hi!");
        org.jsoup.Connection.Method method8 = response0.method();
        java.lang.String str10 = response0.cookie("");
        java.lang.String str11 = response0.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12045");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        boolean boolean9 = response6.hasHeader("hi!");
        org.jsoup.Connection.Response response11 = response6.removeCookie("");
        org.jsoup.Connection.Response response13 = response6.removeCookie("");
        org.jsoup.Connection.Response response16 = response6.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response6);
        boolean boolean19 = response17.hasCookie("hi!");
        org.jsoup.Connection.Method method20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response17.method(method20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test12046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12046");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.cookie("hi!");
        java.util.Map.Entry entry10 = response0.scanHeaders("hi!");
        java.lang.String str12 = response0.cookie("");
        java.util.Map.Entry entry14 = response0.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = entry14.getClass();
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
    }

    @Test
    public void test12047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12047");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str11 = response9.header("hi!");
        java.util.Map.Entry entry13 = response9.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL15 = response14.url();
        org.jsoup.Connection.Method method16 = response14.method();
        java.lang.String str17 = response14.contentType();
        org.jsoup.Connection.Method method18 = response14.method();
        java.util.Map.Entry entry20 = response14.scanHeaders("");
        java.lang.String str21 = response14.contentType();
        java.util.Map map22 = response14.headers();
        response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        org.jsoup.Connection.Method method25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response26 = response0.method(method25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(entry13);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(entry20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test12048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12048");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        java.util.Map.Entry entry6 = response0.scanHeaders("hi!");
        java.net.URL uRL7 = response0.url();
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response9.getHeaderCaseInsensitive("");
        java.lang.String str12 = response9.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response9.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12049");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.header("");
        java.lang.String str9 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry12 = response10.scanHeaders("");
        org.jsoup.Connection.Response response14 = response10.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response10.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(entry12);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test12050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12050");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str6 = response0.contentType();
        java.lang.String str8 = response0.cookie("hi!");
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.Connection.Method method10 = response0.method();
        java.lang.String str12 = response0.header("hi!");
        org.jsoup.Connection.Method method13 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test12051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12051");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        int int11 = response0.statusCode();
        java.util.Map.Entry entry13 = response0.scanHeaders("");
        java.lang.String str14 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response0.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(entry13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12052");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        java.net.URL uRL3 = response0.url();
        java.net.URL uRL4 = response0.url();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method7 = response0.method();
        java.lang.String str9 = response0.header("hi!");
        org.jsoup.Connection.Method method10 = response0.method();
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL13 = response12.url();
        java.lang.String str14 = response12.statusMessage();
        boolean boolean16 = response12.hasCookie("hi!");
        boolean boolean18 = response12.hasHeader("hi!");
        java.util.Map map19 = response12.cookies();
        java.lang.String str20 = response12.contentType();
        java.lang.String str22 = response12.getHeaderCaseInsensitive("");
        java.util.Map map23 = response12.cookies();
        java.lang.String str24 = response12.contentType();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection11, (org.jsoup.Connection.Response) response12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test12053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12053");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map6 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str9 = response0.header("hi!");
        org.jsoup.Connection.Method method10 = response0.method();
        java.lang.String str12 = response0.cookie("hi!");
        org.jsoup.Connection.Response response15 = response0.cookie("hi!", "hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test12054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12054");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        java.net.URL uRL4 = response1.url();
        java.util.Map map5 = response1.cookies();
        java.lang.String str6 = response1.contentType();
        org.jsoup.Connection.Response response8 = response1.removeCookie("hi!");
        java.lang.Class<?> wildcardClass9 = response8.getClass();
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test12055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12055");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        java.net.URL uRL3 = response0.url();
        java.net.URL uRL4 = response0.url();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method7 = response0.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str10 = response8.cookie("");
        java.lang.String str11 = response8.contentType();
        java.lang.String str13 = response8.header("hi!");
        java.util.Map map14 = response8.cookies();
        java.net.URL uRL15 = response8.url();
        java.net.URL uRL16 = response8.url();
        org.jsoup.Connection.Method method17 = response8.method();
        java.util.Map map18 = response8.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        java.lang.String str21 = response0.header("");
        java.lang.String str22 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test12056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12056");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map4 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map4);
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str9 = response0.statusMessage();
        java.net.URL uRL10 = response0.url();
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.Connection.Response response12 = null;
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection11, response12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test12057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12057");
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
        java.util.Map map14 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response0.bodyAsBytes();
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
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test12058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12058");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        java.util.Map map8 = response0.cookies();
        java.util.Map.Entry entry10 = response0.scanHeaders("");
        int int11 = response0.statusCode();
        org.jsoup.Connection.Response response13 = response0.removeHeader("hi!");
        java.util.Map map14 = response0.cookies();
        boolean boolean16 = response0.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response0.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test12059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12059");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.header("hi!");
        java.lang.String str7 = response0.charset();
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        java.util.Map map11 = response0.headers();
        java.lang.String str13 = response0.cookie("");
        java.lang.String str14 = response0.contentType();
        java.lang.String str16 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str17 = response0.contentType();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test12060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12060");
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
        java.lang.String str16 = response1.statusMessage();
        java.util.Map map17 = response1.cookies();
        java.lang.String str18 = response1.statusMessage();
        java.lang.String str20 = response1.cookie("hi!");
        java.net.URL uRL21 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(uRL21);
    }

    @Test
    public void test12061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12061");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response0.cookie("");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str9 = response7.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response7.method(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12062");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        boolean boolean7 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str11 = response9.header("hi!");
        java.lang.String str13 = response9.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method14 = response9.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = response9.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test12063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12063");
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
        java.lang.String str16 = response0.statusMessage();
        int int17 = response0.statusCode();
        java.lang.String str18 = response0.contentType();
        java.lang.String str19 = response0.statusMessage();
        java.lang.String str21 = response0.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test12064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12064");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.util.Map map7 = response0.cookies();
        java.lang.String str9 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str10 = response0.contentType();
        java.lang.String str12 = response0.getHeaderCaseInsensitive("hi!");
        java.util.Map map13 = response0.cookies();
        boolean boolean15 = response0.hasCookie("hi!");
        java.lang.String str16 = response0.contentType();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12065");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12066");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response8 = response5.header("hi!", "hi!");
        java.util.Map map9 = response5.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        int int11 = response0.statusCode();
        java.lang.String str13 = response0.header("");
        java.util.Map.Entry entry15 = response0.scanHeaders("");
        java.util.Map.Entry entry17 = response0.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(entry15);
        org.junit.Assert.assertNull(entry17);
    }

    @Test
    public void test12067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12067");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        boolean boolean9 = response0.hasCookie("");
        java.lang.String str10 = response0.charset();
        java.lang.String str11 = response0.contentType();
        java.lang.String str13 = response0.header("hi!");
        boolean boolean15 = response0.hasCookie("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test12068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12068");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str6 = response0.charset();
        java.util.Map map7 = response0.cookies();
        boolean boolean9 = response0.hasHeader("hi!");
        int int10 = response0.statusCode();
        org.jsoup.Connection.Method method11 = response0.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test12069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12069");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response8 = response5.header("hi!", "hi!");
        java.util.Map map9 = response5.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.util.Map map11 = response0.headers();
        org.jsoup.Connection.Response response13 = response0.removeCookie("");
        java.lang.String str14 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map16 = response15.headers();
        java.lang.String str18 = response15.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response21 = response15.cookie("hi!", "");
        java.util.Map map22 = response15.cookies();
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test12070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12070");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.util.Map map8 = response0.cookies();
        java.net.HttpURLConnection httpURLConnection9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL11 = response10.url();
        org.jsoup.Connection.Method method12 = response10.method();
        org.jsoup.Connection.Response response15 = response10.header("hi!", "");
        java.util.Map map16 = response10.headers();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response10);
        int int18 = response10.statusCode();
        java.lang.String str19 = response10.charset();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str22 = response20.cookie("");
        boolean boolean24 = response20.hasHeader("hi!");
        java.net.URL uRL25 = response20.url();
        java.lang.String str27 = response20.getHeaderCaseInsensitive("");
        java.net.URL uRL28 = response20.url();
        java.lang.String str29 = response20.statusMessage();
        java.util.Map map30 = response20.headers();
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL33 = response32.url();
        java.lang.String str34 = response32.statusMessage();
        java.util.Map map35 = response32.cookies();
        org.jsoup.Connection.Response response37 = response32.removeHeader("hi!");
        java.util.Map.Entry entry39 = response32.scanHeaders("");
        org.jsoup.Connection.Response response42 = response32.header("hi!", "hi!");
        java.util.Map map43 = response32.cookies();
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map43);
        java.lang.String str45 = response10.charset();
        int int46 = response10.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection9, (org.jsoup.Connection.Response) response10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(uRL28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(uRL33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(response37);
        org.junit.Assert.assertNull(entry39);
        org.junit.Assert.assertNotNull(response42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test12071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12071");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map map7 = response0.cookies();
        java.util.Map map8 = response0.headers();
        org.jsoup.Connection.Method method9 = response0.method();
        java.lang.String str10 = response0.contentType();
        java.util.Map.Entry entry12 = response0.scanHeaders("hi!");
        java.lang.String str14 = response0.getHeaderCaseInsensitive("");
        java.util.Map map15 = response0.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(entry12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test12072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12072");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map6 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str8 = response0.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12073");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        int int7 = response0.statusCode();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "hi!");
        java.lang.String str13 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response17 = response14.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.lang.String str19 = response18.statusMessage();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.Connection.Method method21 = response20.method();
        java.util.Map.Entry entry23 = response20.scanHeaders("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(entry23);
    }

    @Test
    public void test12074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12074");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.lang.String str9 = response0.cookie("");
        java.util.Map map10 = response0.headers();
        java.lang.String str11 = response0.charset();
        java.lang.String str12 = response0.charset();
        java.lang.String str14 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str15 = response0.statusMessage();
        int int16 = response0.statusCode();
        java.lang.String str18 = response0.cookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test12075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12075");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response6.contentType();
        org.jsoup.Connection.Response response9 = response6.removeCookie("hi!");
        java.lang.String str11 = response6.cookie("hi!");
        java.lang.String str12 = response6.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response6.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12076");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        boolean boolean6 = response0.hasCookie("");
        java.lang.String str8 = response0.header("hi!");
        java.util.Map.Entry entry10 = response0.scanHeaders("hi!");
        java.util.Map map11 = response0.headers();
        org.jsoup.Connection.Response response14 = response0.header("hi!", "hi!");
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response0.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test12077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12077");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.net.URL uRL7 = response0.url();
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        java.lang.String str10 = response0.charset();
        java.lang.String str11 = response0.statusMessage();
        java.lang.String str12 = response0.charset();
        org.jsoup.Connection.Response response14 = response0.removeCookie("");
        java.net.HttpURLConnection httpURLConnection15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL17 = response16.url();
        org.jsoup.Connection.Method method18 = response16.method();
        java.lang.String str20 = response16.cookie("hi!");
        boolean boolean22 = response16.hasCookie("hi!");
        org.jsoup.Connection.Response response25 = response16.cookie("hi!", "");
        boolean boolean27 = response16.hasHeader("hi!");
        java.lang.String str28 = response16.statusMessage();
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.lang.String str30 = response29.statusMessage();
        boolean boolean32 = response29.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response29);
        org.jsoup.Connection.Response response35 = response29.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL37 = response36.url();
        org.jsoup.Connection.Method method38 = response36.method();
        java.lang.String str40 = response36.cookie("hi!");
        boolean boolean42 = response36.hasCookie("hi!");
        org.jsoup.Connection.Response response45 = response36.cookie("hi!", "");
        boolean boolean47 = response36.hasHeader("hi!");
        java.lang.String str48 = response36.statusMessage();
        org.jsoup.helper.HttpConnection.Response response49 = new org.jsoup.helper.HttpConnection.Response(response36);
        java.lang.String str50 = response36.statusMessage();
        java.util.Map map51 = response36.headers();
        java.util.Map map52 = response36.cookies();
        org.jsoup.helper.HttpConnection.Response response53 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL54 = response53.url();
        org.jsoup.Connection.Method method55 = response53.method();
        org.jsoup.Connection.Response response57 = response53.removeCookie("hi!");
        java.lang.String str59 = response53.getHeaderCaseInsensitive("");
        java.util.Map map60 = response53.cookies();
        java.util.Map map61 = response53.headers();
        java.util.Map map62 = response53.cookies();
        response36.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map62);
        java.util.Map map64 = response36.headers();
        response29.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map64);
        org.jsoup.Connection.Response response67 = response29.removeCookie("");
        java.lang.String str69 = response29.cookie("hi!");
        java.lang.String str71 = response29.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response72 = new org.jsoup.helper.HttpConnection.Response(response29);
        java.util.Map.Entry entry74 = response29.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection15, (org.jsoup.Connection.Response) response29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(entry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(response35);
        org.junit.Assert.assertNull(uRL37);
        org.junit.Assert.assertNull(method38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(response45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNull(uRL54);
        org.junit.Assert.assertNull(method55);
        org.junit.Assert.assertNotNull(response57);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(response67);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNull(entry74);
    }

    @Test
    public void test12078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12078");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.util.Map map8 = response0.cookies();
        org.jsoup.Connection.Response response11 = response0.header("hi!", "hi!");
        java.lang.Class<?> wildcardClass12 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test12079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12079");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("");
        java.lang.String str4 = response1.contentType();
        java.lang.String str6 = response1.header("hi!");
        boolean boolean8 = response1.hasCookie("hi!");
        java.util.Map.Entry entry10 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.util.Map map13 = response12.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test12080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12080");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.net.URL uRL7 = response0.url();
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        org.jsoup.Connection.Response response11 = response0.removeCookie("hi!");
        boolean boolean13 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response15 = response0.removeHeader("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(entry9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test12081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12081");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.header("hi!", "");
        boolean boolean9 = response0.hasCookie("");
        java.util.Map map10 = response0.headers();
        org.jsoup.Connection.Response response12 = response0.removeCookie("");
        java.net.URL uRL13 = response0.url();
        java.lang.String str15 = response0.cookie("hi!");
        java.lang.String str17 = response0.getHeaderCaseInsensitive("hi!");
        int int18 = response0.statusCode();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test12082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12082");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.net.URL uRL6 = response0.url();
        java.util.Map map7 = response0.headers();
        java.lang.String str9 = response0.header("hi!");
        java.lang.String str11 = response0.header("");
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL14 = response13.url();
        java.lang.String str15 = response13.statusMessage();
        java.util.Map map16 = response13.cookies();
        java.lang.String str17 = response13.charset();
        java.lang.String str18 = response13.contentType();
        java.util.Map map19 = response13.cookies();
        int int20 = response13.statusCode();
        java.lang.String str21 = response13.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection12, (org.jsoup.Connection.Response) response13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test12083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12083");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response4.statusMessage();
        java.lang.String str6 = response4.contentType();
        java.lang.String str7 = response4.contentType();
        java.lang.String str8 = response4.statusMessage();
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12084");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int12 = response11.statusCode();
        boolean boolean14 = response11.hasHeader("hi!");
        boolean boolean16 = response11.hasHeader("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test12085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12085");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        java.net.URL uRL11 = response0.url();
        java.lang.String str12 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry15 = response13.scanHeaders("hi!");
        java.lang.String str16 = response13.contentType();
        int int17 = response13.statusCode();
        org.jsoup.Connection.Response response19 = response13.removeHeader("hi!");
        org.jsoup.Connection.Method method20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response13.method(method20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(entry15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test12086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12086");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map map5 = response0.headers();
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        java.lang.String str8 = response0.contentType();
        java.util.Map map9 = response0.headers();
        org.jsoup.Connection.Response response11 = response0.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test12087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12087");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Method method2 = response0.method();
        boolean boolean4 = response0.hasCookie("");
        java.net.HttpURLConnection httpURLConnection5 = null;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL7 = response6.url();
        java.lang.String str9 = response6.header("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL11 = response10.url();
        java.lang.String str13 = response10.header("hi!");
        java.util.Map map14 = response10.cookies();
        response6.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        int int16 = response6.statusCode();
        java.lang.String str17 = response6.charset();
        java.lang.String str18 = response6.contentType();
        java.lang.String str19 = response6.statusMessage();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response6);
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection5, (org.jsoup.Connection.Response) response20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test12088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12088");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.cookie("hi!");
        org.jsoup.Connection.Response response13 = response0.header("hi!", "");
        org.jsoup.Connection.Response response15 = response0.removeCookie("");
        java.util.Map map16 = response0.cookies();
        java.lang.Class<?> wildcardClass17 = map16.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test12089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12089");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        boolean boolean9 = response0.hasCookie("hi!");
        java.lang.String str10 = response0.statusMessage();
        java.net.URL uRL11 = response0.url();
        java.lang.String str12 = response0.statusMessage();
        java.lang.String str14 = response0.header("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12090");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map map5 = response0.headers();
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "hi!");
        java.util.Map map11 = response0.headers();
        org.jsoup.Connection.Response response13 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test12091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12091");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response0.url();
        java.lang.String str4 = response0.cookie("");
        java.lang.String str6 = response0.cookie("");
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response10 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response13 = response0.cookie("hi!", "hi!");
        java.lang.Class<?> wildcardClass14 = response0.getClass();
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test12092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12092");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response8.method(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
    }

    @Test
    public void test12093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12093");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response0.header("hi!", "hi!");
        org.jsoup.Connection.Response response10 = response0.cookie("hi!", "hi!");
        java.lang.String str12 = response0.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12094");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str6 = response0.contentType();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response9.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12095");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.util.Map map6 = response0.headers();
        java.util.Map.Entry entry8 = response0.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(entry8);
    }

    @Test
    public void test12096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12096");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        boolean boolean5 = response0.hasCookie("hi!");
        boolean boolean7 = response0.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str9 = response8.contentType();
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response8.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12097");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        java.lang.String str7 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response8.header("");
        boolean boolean12 = response8.hasCookie("hi!");
        java.lang.String str14 = response8.getHeaderCaseInsensitive("hi!");
        java.util.Map map15 = response8.headers();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str18 = response8.getHeaderCaseInsensitive("");
        int int19 = response8.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray20 = response8.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test12098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12098");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response1.method();
        boolean boolean8 = response1.hasCookie("");
        java.util.Map.Entry entry10 = response1.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(entry10);
    }

    @Test
    public void test12099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12099");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        java.util.Map map6 = response0.cookies();
        java.net.URL uRL7 = response0.url();
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int11 = response0.statusCode();
        java.util.Map map12 = response0.cookies();
        java.util.Map map13 = response0.headers();
        org.jsoup.Connection.Response response16 = response0.cookie("hi!", "");
        int int17 = response0.statusCode();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test12100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12100");
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
        java.util.Map map17 = response13.headers();
        java.lang.String str19 = response13.header("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test12101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12101");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str6 = response1.cookie("hi!");
        java.util.Map map7 = response1.cookies();
        boolean boolean9 = response1.hasCookie("hi!");
        java.lang.String str10 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL12 = response11.url();
        java.lang.String str14 = response11.header("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL16 = response15.url();
        java.lang.String str18 = response15.header("hi!");
        java.util.Map map19 = response15.cookies();
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        int int21 = response11.statusCode();
        java.lang.String str23 = response11.header("");
        boolean boolean25 = response11.hasHeader("hi!");
        java.util.Map map26 = response11.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test12102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12102");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.net.URL uRL7 = response0.url();
        java.lang.String str9 = response0.header("hi!");
        java.lang.String str11 = response0.cookie("");
        org.jsoup.Connection.Response response13 = response0.removeHeader("hi!");
        java.lang.String str15 = response0.cookie("hi!");
        org.jsoup.Connection.Response response17 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response20 = response0.header("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test12103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12103");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map map7 = response0.cookies();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        int int10 = response0.statusCode();
        java.lang.String str11 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str13 = response12.contentType();
        java.util.Map map14 = response12.headers();
        java.lang.Class<?> wildcardClass15 = response12.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test12104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12104");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response1.method();
        org.jsoup.Connection.Method method3 = response1.method();
        java.lang.String str4 = response1.statusMessage();
        java.lang.String str6 = response1.header("hi!");
        java.util.Map map7 = response1.headers();
        boolean boolean9 = response1.hasCookie("");
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test12105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12105");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasHeader("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response10.contentType();
        java.util.Map.Entry entry13 = response10.scanHeaders("hi!");
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response10.method(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(entry13);
    }

    @Test
    public void test12106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12106");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map map7 = response0.cookies();
        java.util.Map map8 = response0.headers();
        org.jsoup.Connection.Method method9 = response0.method();
        java.lang.String str10 = response0.contentType();
        java.net.URL uRL11 = response0.url();
        java.lang.String str13 = response0.header("hi!");
        java.lang.String str15 = response0.cookie("");
        java.lang.String str16 = response0.charset();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12107");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        java.util.Map.Entry entry8 = response0.scanHeaders("hi!");
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str11 = response0.header("");
        java.lang.String str12 = response0.contentType();
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response0.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(entry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12108");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str4 = response1.header("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str10 = response8.getHeaderCaseInsensitive("");
        java.lang.String str11 = response8.contentType();
        org.jsoup.Connection.Response response13 = response8.removeHeader("hi!");
        java.lang.String str15 = response8.cookie("hi!");
        java.lang.String str16 = response8.charset();
        int int17 = response8.statusCode();
        int int18 = response8.statusCode();
        java.util.Map map19 = response8.headers();
        java.lang.String str20 = response8.statusMessage();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response22 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test12109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12109");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response0.header("hi!", "hi!");
        java.lang.String str8 = response0.contentType();
        org.jsoup.Connection.Response response11 = response0.header("hi!", "");
        org.jsoup.Connection.Response response14 = response0.header("hi!", "");
        java.lang.String str16 = response0.cookie("");
        org.jsoup.Connection.Method method17 = response0.method();
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response0.url(uRL18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test12110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12110");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        java.util.Map map6 = response0.cookies();
        java.net.URL uRL7 = response0.url();
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Method method9 = response0.method();
        java.util.Map map10 = response0.cookies();
        org.jsoup.Connection.Method method11 = response0.method();
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response0.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test12111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12111");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        org.jsoup.Connection.Method method3 = response1.method();
        org.jsoup.Connection.Response response6 = response1.header("hi!", "");
        java.lang.String str8 = response1.header("hi!");
        java.util.Map map9 = response1.headers();
        java.lang.String str10 = response1.statusMessage();
        java.lang.String str11 = response1.statusMessage();
        org.jsoup.Connection.Response response13 = response1.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test12112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12112");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        java.lang.String str6 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12113");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.statusMessage();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeHeader("hi!");
        java.lang.String str10 = response0.header("hi!");
        boolean boolean12 = response0.hasHeader("hi!");
        java.lang.String str13 = response0.statusMessage();
        java.util.Map.Entry entry15 = response0.scanHeaders("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(entry15);
    }

    @Test
    public void test12114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12114");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str4 = response0.charset();
        java.lang.String str5 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str8 = response6.cookie("");
        java.lang.String str9 = response6.contentType();
        java.lang.String str11 = response6.header("hi!");
        org.jsoup.Connection.Method method12 = response6.method();
        java.util.Map map13 = response6.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map13);
        org.jsoup.Connection.Response response16 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response18 = response0.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response0.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test12115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12115");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        boolean boolean6 = response0.hasHeader("hi!");
        java.lang.String str8 = response0.cookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response0.contentType();
        java.lang.String str11 = response0.statusMessage();
        java.lang.String str13 = response0.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12116");
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
        java.lang.String str16 = response0.statusMessage();
        java.util.Map map17 = response0.cookies();
        java.lang.String str18 = response0.charset();
        java.util.Map map19 = response0.headers();
        java.lang.String str20 = response0.statusMessage();
        int int21 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str24 = response22.cookie("");
        java.lang.String str25 = response22.contentType();
        java.lang.String str27 = response22.header("hi!");
        boolean boolean29 = response22.hasCookie("hi!");
        java.lang.String str31 = response22.getHeaderCaseInsensitive("");
        boolean boolean33 = response22.hasHeader("hi!");
        java.util.Map.Entry entry35 = response22.scanHeaders("hi!");
        java.lang.String str37 = response22.header("");
        java.lang.String str39 = response22.getHeaderCaseInsensitive("hi!");
        java.util.Map map40 = response22.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map40);
        java.util.Map.Entry entry43 = response0.scanHeaders("");
        org.jsoup.Connection.Response response45 = response0.removeHeader("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(entry35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(entry43);
        org.junit.Assert.assertNotNull(response45);
    }

    @Test
    public void test12117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12117");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response8 = response5.header("hi!", "hi!");
        java.util.Map map9 = response5.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.lang.String str12 = response0.header("hi!");
        java.lang.String str13 = response0.statusMessage();
        java.util.Map map14 = response0.cookies();
        java.lang.String str15 = response0.charset();
        boolean boolean17 = response0.hasCookie("");
        java.lang.Class<?> wildcardClass18 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test12118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12118");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.header("");
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method13 = response0.method();
        int int14 = response0.statusCode();
        java.lang.String str16 = response0.header("hi!");
        java.util.Map map17 = response0.cookies();
        java.lang.String str18 = response0.charset();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test12119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12119");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str5 = response3.cookie("hi!");
        org.jsoup.Connection.Response response7 = response3.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = response3.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test12120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12120");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.header("hi!");
        java.lang.String str5 = response2.charset();
        org.jsoup.Connection.Response response8 = response2.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response2);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test12121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12121");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test12122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12122");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.header("hi!", "");
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response12 = response0.cookie("hi!", "hi!");
        java.util.Map.Entry entry14 = response0.scanHeaders("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(entry14);
    }

    @Test
    public void test12123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12123");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        java.lang.String str6 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str9 = response7.cookie("");
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL12 = response11.url();
        java.lang.String str14 = response11.header("hi!");
        org.jsoup.Connection.Response response16 = response11.removeHeader("hi!");
        java.lang.String str18 = response11.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response21 = response11.header("hi!", "hi!");
        java.lang.String str23 = response11.getHeaderCaseInsensitive("");
        java.lang.String str25 = response11.header("");
        java.util.Map map26 = response11.headers();
        java.lang.String str27 = response11.contentType();
        int int28 = response11.statusCode();
        java.lang.String str30 = response11.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response7.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test12124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12124");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.charset();
        java.lang.String str9 = response0.charset();
        int int10 = response0.statusCode();
        java.lang.String str12 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response15 = response0.header("hi!", "");
        org.jsoup.Connection.Method method16 = response0.method();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL18 = response17.url();
        java.lang.String str20 = response17.header("hi!");
        org.jsoup.Connection.Response response22 = response17.removeHeader("hi!");
        java.lang.String str24 = response17.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response27 = response17.header("hi!", "hi!");
        java.lang.String str29 = response17.getHeaderCaseInsensitive("");
        java.lang.String str31 = response17.header("");
        java.lang.String str32 = response17.statusMessage();
        org.jsoup.Connection.Response response34 = response17.removeHeader("hi!");
        java.util.Map map35 = response17.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
        java.util.Map map37 = response0.cookies();
        int int38 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response41 = response0.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test12125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12125");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        java.lang.String str7 = response0.cookie("");
        java.util.Map map8 = response0.cookies();
        java.net.HttpURLConnection httpURLConnection9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL11 = response10.url();
        org.jsoup.Connection.Method method12 = response10.method();
        org.jsoup.Connection.Response response15 = response10.header("hi!", "");
        boolean boolean17 = response10.hasCookie("hi!");
        boolean boolean19 = response10.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.Connection.Response response22 = response10.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection9, response22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test12126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12126");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.cookie("hi!");
        java.lang.String str4 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response0.cookie("hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test12127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12127");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response9.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response9.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12128");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.lang.String str9 = response0.cookie("");
        org.jsoup.Connection.Response response11 = response0.removeCookie("");
        java.util.Map map12 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL14 = response13.url();
        org.jsoup.Connection.Method method15 = response13.method();
        java.lang.String str17 = response13.cookie("hi!");
        boolean boolean19 = response13.hasCookie("hi!");
        org.jsoup.Connection.Response response22 = response13.cookie("hi!", "");
        boolean boolean24 = response13.hasHeader("hi!");
        java.lang.String str25 = response13.statusMessage();
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str27 = response13.statusMessage();
        java.util.Map map28 = response13.headers();
        java.util.Map map29 = response13.cookies();
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL31 = response30.url();
        org.jsoup.Connection.Method method32 = response30.method();
        org.jsoup.Connection.Response response34 = response30.removeCookie("hi!");
        java.lang.String str36 = response30.getHeaderCaseInsensitive("");
        java.util.Map map37 = response30.cookies();
        java.util.Map map38 = response30.headers();
        java.util.Map map39 = response30.cookies();
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map39);
        java.net.URL uRL41 = response13.url();
        java.util.Map.Entry entry43 = response13.scanHeaders("hi!");
        java.net.URL uRL44 = response13.url();
        java.lang.String str45 = response13.contentType();
        java.lang.String str47 = response13.cookie("hi!");
        java.util.Map map48 = response13.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map48);
        java.util.Map map50 = response0.headers();
        java.lang.String str52 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str54 = response0.getHeaderCaseInsensitive("hi!");
        java.util.Map.Entry entry56 = response0.scanHeaders("");
        java.lang.String str58 = response0.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(uRL31);
        org.junit.Assert.assertNull(method32);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(uRL41);
        org.junit.Assert.assertNull(entry43);
        org.junit.Assert.assertNull(uRL44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNull(entry56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test12129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12129");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        boolean boolean7 = response0.hasCookie("hi!");
        java.lang.String str9 = response0.getHeaderCaseInsensitive("");
        java.lang.String str10 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str13 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response17 = response14.cookie("hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test12130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12130");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.net.URL uRL7 = response0.url();
        java.lang.String str9 = response0.header("hi!");
        java.lang.String str11 = response0.cookie("");
        java.util.Map map12 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response16 = response0.cookie("hi!", "hi!");
        java.lang.String str18 = response0.cookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test12131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12131");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        java.util.Map.Entry entry6 = response0.scanHeaders("hi!");
        java.util.Map.Entry entry8 = response0.scanHeaders("");
        java.util.Map map9 = response0.cookies();
        int int10 = response0.statusCode();
        java.lang.String str11 = response0.contentType();
        boolean boolean13 = response0.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test12132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12132");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map map5 = response0.headers();
        java.net.URL uRL6 = response0.url();
        java.lang.String str7 = response0.charset();
        java.lang.String str8 = response0.charset();
        java.lang.String str10 = response0.cookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12133");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("hi!");
        int int8 = response0.statusCode();
        boolean boolean10 = response0.hasCookie("");
        java.lang.String str12 = response0.cookie("");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry15 = response13.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.net.URL uRL17 = response16.url();
        java.lang.String str19 = response16.header("hi!");
        java.lang.String str21 = response16.cookie("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = response16.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(entry15);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test12134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12134");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("hi!");
        int int8 = response0.statusCode();
        boolean boolean10 = response0.hasCookie("");
        java.lang.String str12 = response0.cookie("");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry15 = response13.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.net.URL uRL17 = response16.url();
        java.lang.String str19 = response16.getHeaderCaseInsensitive("hi!");
        java.lang.String str21 = response16.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(entry15);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test12135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12135");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.cookie("hi!");
        java.lang.String str5 = response1.header("hi!");
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.util.Map.Entry entry9 = response1.scanHeaders("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(entry9);
    }

    @Test
    public void test12136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12136");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response4 = response1.header("hi!", "hi!");
        java.util.Map map5 = response1.cookies();
        java.lang.String str6 = response1.statusMessage();
        boolean boolean8 = response1.hasCookie("hi!");
        java.util.Map.Entry entry10 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method12 = response11.method();
        java.lang.String str14 = response11.getHeaderCaseInsensitive("");
        java.util.Map.Entry entry16 = response11.scanHeaders("hi!");
        java.util.Map map17 = response11.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(entry10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(entry16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test12137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12137");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Response response8 = response0.removeHeader("hi!");
        java.util.Map map9 = response0.cookies();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test12138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12138");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        java.lang.String str7 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response10 = response0.removeCookie("hi!");
        java.lang.String str11 = response0.statusMessage();
        org.jsoup.Connection.Response response14 = response0.cookie("hi!", "hi!");
        java.lang.String str16 = response0.header("");
        java.lang.String str17 = response0.statusMessage();
        java.lang.String str19 = response0.getHeaderCaseInsensitive("hi!");
        java.net.HttpURLConnection httpURLConnection20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response21);
        java.lang.String str24 = response22.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL26 = response25.url();
        org.jsoup.Connection.Method method27 = response25.method();
        org.jsoup.Connection.Response response30 = response25.header("hi!", "");
        java.lang.String str32 = response25.header("hi!");
        java.util.Map map33 = response25.cookies();
        response22.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map33);
        java.lang.String str36 = response22.getHeaderCaseInsensitive("hi!");
        java.lang.String str37 = response22.statusMessage();
        java.util.Map map38 = response22.cookies();
        java.lang.String str40 = response22.header("hi!");
        org.jsoup.Connection.Response response42 = response22.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection20, (org.jsoup.Connection.Response) response22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(response42);
    }

    @Test
    public void test12139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12139");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.header("");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.cookie("");
        boolean boolean12 = response0.hasHeader("hi!");
        java.util.Map map13 = response0.cookies();
        org.jsoup.Connection.Response response15 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL17 = response16.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response16.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test12140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12140");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("");
        java.lang.String str4 = response1.contentType();
        java.lang.String str6 = response1.header("hi!");
        org.jsoup.Connection.Response response8 = response1.removeCookie("");
        org.jsoup.Connection.Response response11 = response1.header("hi!", "");
        java.lang.String str12 = response1.charset();
        java.lang.String str14 = response1.header("");
        java.util.Map map15 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test12141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12141");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response0.header("hi!");
        boolean boolean5 = response0.hasCookie("");
        java.util.Map map6 = response0.headers();
        org.jsoup.Connection.Method method7 = response0.method();
        java.lang.String str9 = response0.cookie("");
        org.jsoup.Connection.Response response11 = response0.removeCookie("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test12142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12142");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        java.lang.String str6 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean9 = response7.hasCookie("");
        java.lang.String str11 = response7.cookie("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response7.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12143");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map map5 = response0.headers();
        boolean boolean7 = response0.hasCookie("hi!");
        int int8 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response9.header("hi!");
        java.lang.String str12 = response9.charset();
        java.lang.Class<?> wildcardClass13 = response9.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test12144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12144");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method3 = response1.method();
        java.util.Map map4 = response1.headers();
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        java.lang.String str7 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map map9 = response8.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test12145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12145");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean9 = response0.hasCookie("");
        boolean boolean11 = response0.hasCookie("");
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str15 = response13.cookie("");
        java.lang.String str16 = response13.contentType();
        java.lang.String str18 = response13.header("hi!");
        boolean boolean20 = response13.hasCookie("hi!");
        java.lang.String str22 = response13.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response24 = response13.removeCookie("");
        java.lang.String str25 = response13.charset();
        java.lang.String str26 = response13.statusMessage();
        int int27 = response13.statusCode();
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL29 = response28.url();
        org.jsoup.Connection.Method method30 = response28.method();
        org.jsoup.Connection.Response response33 = response28.header("hi!", "");
        org.jsoup.Connection.Response response35 = response28.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response(response36);
        java.lang.String str39 = response37.header("hi!");
        java.util.Map.Entry entry41 = response37.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response42 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL43 = response42.url();
        org.jsoup.Connection.Method method44 = response42.method();
        java.lang.String str45 = response42.contentType();
        org.jsoup.Connection.Method method46 = response42.method();
        java.util.Map.Entry entry48 = response42.scanHeaders("");
        java.lang.String str49 = response42.contentType();
        java.util.Map map50 = response42.headers();
        response37.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map50);
        response28.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map50);
        java.util.Map map53 = response28.cookies();
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map53);
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection12, (org.jsoup.Connection.Response) response13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(uRL29);
        org.junit.Assert.assertNull(method30);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertNotNull(response35);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(entry41);
        org.junit.Assert.assertNull(uRL43);
        org.junit.Assert.assertNull(method44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(method46);
        org.junit.Assert.assertNull(entry48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map53);
    }

    @Test
    public void test12146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12146");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response0.headers();
        java.lang.String str8 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12147");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.Connection.Method method4 = response2.method();
        java.util.Map map5 = response2.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.lang.String str7 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test12148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12148");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response11 = response9.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response9.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test12149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12149");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("");
        org.jsoup.Connection.Method method10 = response0.method();
        java.util.Map map11 = response0.cookies();
        org.jsoup.Connection.Response response14 = response0.cookie("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response17 = response15.removeCookie("");
        org.jsoup.Connection.Response response20 = response15.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response21);
        java.lang.String str24 = response22.header("hi!");
        org.jsoup.Connection.Response response26 = response22.removeHeader("hi!");
        org.jsoup.Connection.Response response28 = response22.removeCookie("");
        java.util.Map map29 = response22.headers();
        java.util.Map map30 = response22.cookies();
        java.util.Map map31 = response22.cookies();
        response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str36 = response34.cookie("hi!");
        java.lang.String str37 = response34.charset();
        org.jsoup.Connection.Response response40 = response34.header("hi!", "hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(response40);
    }

    @Test
    public void test12150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12150");
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
        java.lang.String str45 = response0.header("");
        java.net.URL uRL46 = response0.url();
        java.net.URL uRL47 = response0.url();
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
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(uRL46);
        org.junit.Assert.assertNull(uRL47);
    }

    @Test
    public void test12151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12151");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        int int7 = response0.statusCode();
        java.lang.String str8 = response0.charset();
        int int9 = response0.statusCode();
        java.lang.String str11 = response0.cookie("");
        java.lang.String str13 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response16 = response14.removeHeader("hi!");
        java.net.HttpURLConnection httpURLConnection17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL19 = response18.url();
        org.jsoup.Connection.Method method20 = response18.method();
        java.lang.String str22 = response18.cookie("hi!");
        boolean boolean24 = response18.hasCookie("hi!");
        org.jsoup.Connection.Response response27 = response18.cookie("hi!", "");
        boolean boolean29 = response18.hasHeader("hi!");
        java.lang.String str30 = response18.statusMessage();
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response18);
        java.lang.String str32 = response18.statusMessage();
        java.lang.String str34 = response18.header("");
        java.net.URL uRL35 = response18.url();
        // The following exception was thrown during execution in test generation
        try {
            response14.setupFromConnection(httpURLConnection17, (org.jsoup.Connection.Response) response18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(uRL35);
    }

    @Test
    public void test12152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12152");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL3 = response2.url();
        java.lang.String str4 = response2.charset();
        java.net.URL uRL5 = response2.url();
        org.jsoup.Connection.Response response8 = response2.header("hi!", "");
        java.lang.String str10 = response2.getHeaderCaseInsensitive("");
        java.lang.String str11 = response2.contentType();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.Connection.Method method13 = response2.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test12153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12153");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.charset();
        org.jsoup.Connection.Response response10 = response0.removeCookie("");
        java.lang.String str12 = response0.cookie("hi!");
        java.lang.String str14 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map16 = response15.headers();
        java.lang.String str18 = response15.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response21 = response15.cookie("hi!", "");
        java.util.Map map22 = response15.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        boolean boolean25 = response0.hasCookie("");
        org.jsoup.Connection.Method method26 = response0.method();
        java.lang.String str27 = response0.statusMessage();
        java.lang.String str29 = response0.header("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test12154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12154");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.net.URL uRL7 = response0.url();
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map11 = response10.cookies();
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response10.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(entry9);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test12155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12155");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.net.URL uRL7 = response0.url();
        java.lang.String str9 = response0.header("hi!");
        java.util.Map map10 = response0.cookies();
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test12156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12156");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.statusMessage();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method7 = response6.method();
        boolean boolean9 = response6.hasCookie("hi!");
        java.lang.String str10 = response6.statusMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12157");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = response0.url();
        java.lang.String str9 = response0.cookie("");
        java.lang.String str11 = response0.cookie("");
        java.util.Map map12 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test12158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12158");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        boolean boolean7 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str11 = response9.header("hi!");
        java.lang.String str13 = response9.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response16 = response9.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.net.URL uRL19 = response17.url();
        int int20 = response17.statusCode();
        org.jsoup.Connection.Method method21 = response17.method();
        java.lang.String str23 = response17.cookie("");
        java.lang.String str25 = response17.header("hi!");
        java.util.Map map26 = response17.cookies();
        response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        java.util.Map map28 = response9.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test12159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12159");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str6 = response0.contentType();
        java.lang.String str8 = response0.cookie("hi!");
        org.jsoup.Connection.Method method9 = response0.method();
        java.lang.String str11 = response0.getHeaderCaseInsensitive("");
        boolean boolean13 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response15 = response0.removeHeader("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test12160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12160");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response0.headers();
        java.lang.String str8 = response0.contentType();
        int int9 = response0.statusCode();
        java.lang.String str10 = response0.contentType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12161");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL8 = response7.url();
        java.lang.String str9 = response7.statusMessage();
        boolean boolean11 = response7.hasCookie("hi!");
        boolean boolean13 = response7.hasHeader("hi!");
        java.util.Map map14 = response7.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        java.lang.String str17 = response0.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean20 = response18.hasCookie("hi!");
        java.lang.String str22 = response18.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test12162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12162");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int7 = response6.statusCode();
        java.lang.String str9 = response6.cookie("");
        org.jsoup.Connection.Response response12 = response6.cookie("hi!", "");
        boolean boolean14 = response6.hasCookie("hi!");
        java.lang.String str15 = response6.charset();
        org.jsoup.Connection.Response response18 = response6.header("hi!", "");
        java.lang.String str19 = response6.contentType();
        java.lang.String str21 = response6.getHeaderCaseInsensitive("");
        int int22 = response6.statusCode();
        int int23 = response6.statusCode();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.util.Map map25 = response6.headers();
        int int26 = response6.statusCode();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test12163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12163");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response12 = response9.header("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response9.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test12164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12164");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int8 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL10 = response9.url();
        java.lang.String str12 = response9.header("hi!");
        org.jsoup.Connection.Response response14 = response9.removeCookie("hi!");
        org.jsoup.Connection.Response response16 = response9.removeCookie("");
        java.util.Map map17 = response9.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map17);
        java.lang.String str19 = response0.statusMessage();
        java.lang.String str21 = response0.cookie("");
        boolean boolean23 = response0.hasHeader("hi!");
        java.net.HttpURLConnection httpURLConnection24 = null;
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response25);
        org.jsoup.Connection.Method method27 = response25.method();
        org.jsoup.Connection.Method method28 = response25.method();
        java.lang.String str29 = response25.contentType();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection24, (org.jsoup.Connection.Response) response25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test12165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12165");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str6 = response0.contentType();
        org.jsoup.Connection.Method method7 = response0.method();
        java.util.Map map8 = response0.cookies();
        org.jsoup.Connection.Response response10 = response0.removeHeader("hi!");
        java.lang.String str11 = response0.statusMessage();
        org.jsoup.Connection.Response response13 = response0.removeCookie("hi!");
        java.net.URL uRL14 = response0.url();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test12166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12166");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method3 = response1.method();
        java.util.Map map4 = response1.headers();
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        java.lang.String str7 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.removeHeader("hi!");
        org.jsoup.Connection.Method method10 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test12167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12167");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.header("");
        int int8 = response0.statusCode();
        org.jsoup.Connection.Response response10 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response12 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL14 = response13.url();
        org.jsoup.Connection.Method method15 = response13.method();
        org.jsoup.Connection.Response response17 = response13.removeCookie("hi!");
        java.lang.String str19 = response13.getHeaderCaseInsensitive("");
        java.util.Map map20 = response13.cookies();
        java.util.Map map21 = response13.headers();
        java.util.Map map22 = response13.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str26 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str28 = response0.header("hi!");
        org.jsoup.Connection.Response response30 = response0.removeHeader("hi!");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(response30);
    }

    @Test
    public void test12168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12168");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response6.headers();
        java.lang.String str9 = response6.cookie("hi!");
        java.util.Map map10 = response6.headers();
        java.lang.String str12 = response6.header("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12169");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response6 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry9 = response7.scanHeaders("hi!");
        java.lang.String str11 = response7.cookie("hi!");
        org.jsoup.Connection.Response response13 = response7.removeCookie("");
        java.util.Map map14 = response7.cookies();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response7);
        int int16 = response15.statusCode();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test12170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12170");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map4 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map4);
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response13 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map15 = response14.headers();
        org.jsoup.Connection.Method method16 = response14.method();
        java.lang.String str17 = response14.charset();
        java.lang.String str19 = response14.header("hi!");
        java.util.Map.Entry entry21 = response14.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.util.Map map23 = response14.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        org.jsoup.Connection.Response response26 = response0.removeHeader("hi!");
        java.lang.String str28 = response0.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(entry21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test12171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12171");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str4 = response1.charset();
        org.jsoup.Connection.Response response7 = response1.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str11 = response1.header("");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str14 = response12.header("");
        org.jsoup.Connection.Response response17 = response12.header("hi!", "hi!");
        java.net.URL uRL18 = response12.url();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(uRL18);
    }

    @Test
    public void test12172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12172");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "hi!");
        java.lang.String str12 = response0.getHeaderCaseInsensitive("");
        java.lang.String str14 = response0.header("");
        java.lang.String str15 = response0.statusMessage();
        org.jsoup.Connection.Response response17 = response0.removeHeader("hi!");
        java.util.Map map18 = response0.cookies();
        org.jsoup.Connection.Method method19 = response0.method();
        java.lang.String str21 = response0.header("hi!");
        int int22 = response0.statusCode();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test12173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12173");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.util.Map map3 = response0.headers();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.charset();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "hi!");
        org.jsoup.Connection.Method method12 = response0.method();
        java.lang.String str13 = response0.charset();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12174");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Response response3 = response0.removeCookie("");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test12175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12175");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map map7 = response0.cookies();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        int int10 = response0.statusCode();
        java.lang.String str11 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean14 = response12.hasCookie("");
        java.lang.String str16 = response12.header("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12176");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        boolean boolean9 = response0.hasCookie("hi!");
        org.jsoup.Connection.Method method10 = response0.method();
        java.util.Map map11 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int13 = response0.statusCode();
        java.lang.String str14 = response0.charset();
        java.lang.String str15 = response0.contentType();
        int int16 = response0.statusCode();
        java.util.Map map17 = response0.cookies();
        java.lang.String str18 = response0.charset();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test12177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12177");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.cookie("hi!");
        java.util.Map.Entry entry10 = response0.scanHeaders("hi!");
        boolean boolean12 = response0.hasCookie("");
        java.lang.String str13 = response0.charset();
        java.lang.Class<?> wildcardClass14 = response0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test12178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12178");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response0.header("hi!", "hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("");
        org.jsoup.Connection.Response response11 = response0.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test12179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12179");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str12 = response10.cookie("");
        boolean boolean14 = response10.hasHeader("hi!");
        java.net.URL uRL15 = response10.url();
        java.lang.String str17 = response10.getHeaderCaseInsensitive("");
        java.net.URL uRL18 = response10.url();
        boolean boolean20 = response10.hasCookie("");
        java.util.Map map21 = response10.cookies();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str24 = response22.cookie("");
        java.lang.String str25 = response22.contentType();
        java.lang.String str27 = response22.header("hi!");
        java.util.Map map28 = response22.cookies();
        java.util.Map map29 = response22.cookies();
        java.util.Map map30 = response22.cookies();
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        org.jsoup.Connection.Response response34 = response9.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response(response9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response37 = response35.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(response34);
    }

    @Test
    public void test12180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12180");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response6.statusMessage();
        java.lang.Class<?> wildcardClass9 = response6.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test12181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12181");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response6.headers();
        java.lang.String str9 = response6.cookie("hi!");
        java.util.Map.Entry entry11 = response6.scanHeaders("hi!");
        java.net.URL uRL12 = response6.url();
        boolean boolean14 = response6.hasCookie("hi!");
        java.lang.String str16 = response6.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12182");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.lang.String str9 = response0.header("");
        java.util.Map map10 = response0.headers();
        java.net.URL uRL11 = response0.url();
        java.lang.String str13 = response0.cookie("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12183");
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
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str19 = response17.cookie("");
        java.lang.String str20 = response17.contentType();
        java.lang.String str22 = response17.header("hi!");
        org.jsoup.Connection.Response response24 = response17.removeCookie("");
        org.jsoup.Connection.Response response27 = response17.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.util.Map map29 = response17.headers();
        // The following exception was thrown during execution in test generation
        try {
            response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test12184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12184");
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
        java.util.Map map43 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response44 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL45 = response44.url();
        java.lang.String str46 = response44.statusMessage();
        int int47 = response44.statusCode();
        org.jsoup.Connection.Response response50 = response44.header("hi!", "hi!");
        java.net.URL uRL51 = response44.url();
        java.util.Map.Entry entry53 = response44.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response54 = new org.jsoup.helper.HttpConnection.Response(response44);
        java.lang.String str55 = response44.statusMessage();
        java.util.Map.Entry entry57 = response44.scanHeaders("hi!");
        java.lang.String str58 = response44.statusMessage();
        java.lang.String str60 = response44.header("hi!");
        java.util.Map map61 = response44.headers();
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map61);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(uRL45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(response50);
        org.junit.Assert.assertNull(uRL51);
        org.junit.Assert.assertNotNull(entry53);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(entry57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(map61);
    }

    @Test
    public void test12185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12185");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "hi!");
        java.lang.String str12 = response0.getHeaderCaseInsensitive("");
        java.lang.String str14 = response0.header("");
        java.lang.String str15 = response0.statusMessage();
        java.lang.String str16 = response0.contentType();
        java.util.Map.Entry entry18 = response0.scanHeaders("hi!");
        java.util.Map map19 = response0.headers();
        org.jsoup.Connection.Method method20 = response0.method();
        org.jsoup.Connection.Response response22 = response0.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(entry18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test12186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12186");
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
        org.jsoup.Connection.Response response17 = response11.removeCookie("");
        boolean boolean19 = response11.hasCookie("");
        java.lang.String str20 = response11.statusMessage();
        java.net.URL uRL21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response11.url(uRL21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test12187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12187");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.Connection.Response response11 = response0.header("hi!", "hi!");
        java.util.Map map12 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str16 = response14.header("hi!");
        java.lang.String str17 = response14.charset();
        org.jsoup.Connection.Response response20 = response14.header("hi!", "");
        java.lang.String str22 = response14.getHeaderCaseInsensitive("");
        java.util.Map.Entry entry24 = response14.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str27 = response25.cookie("");
        java.lang.String str28 = response25.contentType();
        java.lang.String str30 = response25.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response25);
        java.util.Map map32 = response25.cookies();
        response14.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map32);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map32);
        java.net.URL uRL35 = response0.url();
        int int36 = response0.statusCode();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(entry24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(uRL35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test12188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12188");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map4 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map4);
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map9 = response8.cookies();
        java.lang.String str10 = response8.contentType();
        java.lang.String str12 = response8.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response8.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12189");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str6 = response1.cookie("hi!");
        java.lang.String str7 = response1.charset();
        java.util.Map map8 = response1.cookies();
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test12190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12190");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map map7 = response0.cookies();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response11 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method12 = response0.method();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str14 = response0.contentType();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12191");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str4 = response1.header("hi!");
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response8 = response1.removeCookie("");
        boolean boolean10 = response1.hasCookie("hi!");
        java.lang.String str11 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12192");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Method method4 = response0.method();
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("");
        java.util.Map map8 = response0.cookies();
        org.jsoup.Connection.Response response10 = response0.removeCookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test12193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12193");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.util.Map map8 = response0.cookies();
        org.jsoup.Connection.Response response11 = response0.header("hi!", "hi!");
        java.lang.String str13 = response0.header("");
        java.util.Map map14 = response0.cookies();
        java.lang.String str15 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12194");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response6.headers();
        java.lang.String str9 = response6.cookie("hi!");
        java.util.Map.Entry entry11 = response6.scanHeaders("hi!");
        boolean boolean13 = response6.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response6.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test12195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12195");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL8 = response7.url();
        java.lang.String str9 = response7.statusMessage();
        java.util.Map map10 = response7.cookies();
        java.lang.String str12 = response7.header("hi!");
        java.lang.String str14 = response7.getHeaderCaseInsensitive("hi!");
        java.lang.String str15 = response7.charset();
        java.lang.String str16 = response7.charset();
        boolean boolean18 = response7.hasHeader("hi!");
        java.util.Map map19 = response7.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        java.lang.String str22 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response25 = response1.header("hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(response25);
    }

    @Test
    public void test12196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12196");
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
        org.jsoup.Connection.Response response14 = response0.removeCookie("");
        java.lang.String str15 = response0.contentType();
        java.net.URL uRL16 = response0.url();
        java.util.Map map17 = response0.cookies();
        java.net.URL uRL18 = response0.url();
        java.lang.String str20 = response0.cookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test12197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12197");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL5 = response4.url();
        java.lang.String str7 = response4.header("hi!");
        java.util.Map map8 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map8);
        java.lang.String str10 = response0.statusMessage();
        int int11 = response0.statusCode();
        boolean boolean13 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response16 = response0.header("hi!", "");
        java.lang.String str17 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        java.lang.String str21 = response19.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL23 = response22.url();
        org.jsoup.Connection.Method method24 = response22.method();
        org.jsoup.Connection.Response response27 = response22.header("hi!", "");
        java.lang.String str29 = response22.header("hi!");
        java.util.Map map30 = response22.cookies();
        response19.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        org.jsoup.Connection.Response response33 = response19.removeCookie("hi!");
        org.jsoup.Connection.Response response36 = response19.cookie("hi!", "");
        int int37 = response19.statusCode();
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response(response19);
        java.lang.String str40 = response19.cookie("hi!");
        java.lang.String str42 = response19.cookie("hi!");
        java.util.Map map43 = response19.headers();
        java.util.Map map44 = response19.cookies();
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map44);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertNotNull(response36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
    }

    @Test
    public void test12198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12198");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response10 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response13 = response0.header("hi!", "");
        java.lang.Class<?> wildcardClass14 = response13.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test12199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12199");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.net.URL uRL7 = response0.url();
        boolean boolean9 = response0.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.net.URL uRL12 = response10.url();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.lang.String str14 = response10.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = response10.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12200");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        java.lang.String str9 = response0.getHeaderCaseInsensitive("hi!");
        java.util.Map map10 = response0.cookies();
        java.lang.String str12 = response0.header("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12201");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.net.URL uRL7 = response0.url();
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response0.statusMessage();
        java.lang.String str13 = response0.cookie("hi!");
        java.lang.String str15 = response0.cookie("hi!");
        java.lang.String str17 = response0.cookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document18 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(entry9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test12202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12202");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        java.util.Map map4 = response0.cookies();
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        java.lang.String str9 = response0.getHeaderCaseInsensitive("");
        java.lang.String str11 = response0.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12203");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.cookie("hi!", "hi!");
        int int4 = response0.statusCode();
        java.util.Map map5 = response0.cookies();
        int int6 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response0.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test12204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12204");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        int int11 = response0.statusCode();
        java.util.Map.Entry entry13 = response0.scanHeaders("");
        java.util.Map map14 = response0.cookies();
        boolean boolean16 = response0.hasCookie("hi!");
        boolean boolean18 = response0.hasHeader("hi!");
        java.util.Map map19 = response0.headers();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(entry13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test12205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12205");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str6 = response0.charset();
        java.lang.String str7 = response0.statusMessage();
        boolean boolean9 = response0.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test12206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12206");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        boolean boolean9 = response0.hasCookie("hi!");
        org.jsoup.Connection.Method method10 = response0.method();
        boolean boolean12 = response0.hasCookie("");
        boolean boolean14 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str17 = response15.cookie("");
        java.lang.String str18 = response15.contentType();
        java.lang.String str20 = response15.header("hi!");
        org.jsoup.Connection.Response response22 = response15.removeCookie("");
        org.jsoup.Connection.Response response25 = response15.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.lang.String str27 = response26.contentType();
        boolean boolean29 = response26.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response26);
        java.util.Map map31 = response30.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        java.lang.String str34 = response0.cookie("hi!");
        org.jsoup.Connection.Response response36 = response0.removeCookie("");
        org.jsoup.Connection.Response response38 = response0.removeCookie("");
        java.lang.Class<?> wildcardClass39 = response38.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(response36);
        org.junit.Assert.assertNotNull(response38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test12207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12207");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        java.lang.String str11 = response0.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12208");
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
        java.util.Map map28 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str30 = response29.statusMessage();
        org.jsoup.Connection.Method method31 = response29.method();
        org.jsoup.Connection.Method method32 = response29.method();
        java.lang.Class<?> wildcardClass33 = response29.getClass();
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
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNull(method32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test12209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12209");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response4.statusMessage();
        java.lang.String str6 = response4.contentType();
        org.jsoup.Connection.Response response8 = response4.removeHeader("hi!");
        org.jsoup.Connection.Response response11 = response4.cookie("hi!", "");
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL14 = response13.url();
        org.jsoup.Connection.Method method15 = response13.method();
        java.lang.String str17 = response13.cookie("hi!");
        boolean boolean19 = response13.hasCookie("hi!");
        int int20 = response13.statusCode();
        org.jsoup.Connection.Method method21 = response13.method();
        org.jsoup.Connection.Response response24 = response13.cookie("hi!", "hi!");
        java.lang.String str26 = response13.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            response4.setupFromConnection(httpURLConnection12, (org.jsoup.Connection.Response) response13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test12210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12210");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method4 = response3.method();
        boolean boolean6 = response3.hasCookie("hi!");
        java.lang.String str7 = response3.statusMessage();
        int int8 = response3.statusCode();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.net.URL uRL11 = response10.url();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test12211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12211");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        boolean boolean4 = response0.hasHeader("hi!");
        java.net.URL uRL5 = response0.url();
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.net.URL uRL8 = response0.url();
        boolean boolean10 = response0.hasCookie("");
        java.lang.String str12 = response0.cookie("");
        org.jsoup.Connection.Response response15 = response0.header("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test12212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12212");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Method method8 = response0.method();
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str11 = response0.header("hi!");
        org.jsoup.Connection.Method method12 = response0.method();
        org.jsoup.Connection.Response response15 = response0.header("hi!", "hi!");
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response0.method(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test12213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12213");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response8 = response5.header("hi!", "hi!");
        java.util.Map map9 = response5.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        int int11 = response0.statusCode();
        java.net.URL uRL12 = response0.url();
        boolean boolean14 = response0.hasCookie("hi!");
        java.util.Map map15 = response0.cookies();
        java.net.URL uRL16 = response0.url();
        java.util.Map map17 = response0.headers();
        java.net.HttpURLConnection httpURLConnection18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL20 = response19.url();
        java.net.URL uRL21 = response19.url();
        org.jsoup.Connection.Response response23 = response19.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response27 = response24.header("hi!", "hi!");
        java.util.Map map28 = response24.cookies();
        response19.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        java.util.Map map30 = response19.headers();
        java.util.Map map31 = response19.cookies();
        org.jsoup.Connection.Response response34 = response19.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str37 = response35.cookie("");
        org.jsoup.Connection.Response response39 = response35.removeHeader("hi!");
        int int40 = response35.statusCode();
        boolean boolean42 = response35.hasHeader("hi!");
        java.lang.String str43 = response35.statusMessage();
        java.lang.String str44 = response35.statusMessage();
        org.jsoup.helper.HttpConnection.Response response45 = new org.jsoup.helper.HttpConnection.Response(response35);
        int int46 = response45.statusCode();
        boolean boolean48 = response45.hasCookie("hi!");
        java.util.Map map49 = response45.cookies();
        response19.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map49);
        org.jsoup.Connection.Response response53 = response19.cookie("hi!", "");
        java.lang.String str55 = response19.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection18, (org.jsoup.Connection.Response) response19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(response39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(response53);
        org.junit.Assert.assertNull(str55);
    }

    @Test
    public void test12214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12214");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "hi!");
        java.lang.String str12 = response0.getHeaderCaseInsensitive("");
        java.lang.String str14 = response0.header("");
        java.lang.String str15 = response0.statusMessage();
        java.lang.String str17 = response0.header("hi!");
        java.util.Map map18 = response0.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test12215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12215");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.util.Map map6 = response0.headers();
        java.lang.String str8 = response0.cookie("");
        org.jsoup.Connection.Method method9 = response0.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test12216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12216");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str10 = response6.cookie("");
        java.lang.String str11 = response6.charset();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response6);
        boolean boolean14 = response12.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response12.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test12217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12217");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        boolean boolean9 = response0.hasCookie("hi!");
        org.jsoup.Connection.Method method10 = response0.method();
        java.util.Map map11 = response0.cookies();
        java.util.Map.Entry entry13 = response0.scanHeaders("hi!");
        org.jsoup.Connection.Response response16 = response0.header("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(entry13);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test12218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12218");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.cookies();
        boolean boolean10 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response13 = response0.cookie("hi!", "");
        java.util.Map map14 = response0.headers();
        java.lang.String str15 = response0.statusMessage();
        java.lang.String str16 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12219");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response4.cookie("hi!", "");
        org.jsoup.Connection.Response response10 = response4.header("hi!", "");
        org.jsoup.Connection.Method method11 = response4.method();
        org.jsoup.Connection.Response response13 = response4.removeCookie("hi!");
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response4.method(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test12220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12220");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        int int7 = response0.statusCode();
        org.jsoup.Connection.Method method8 = response0.method();
        java.util.Map.Entry entry10 = response0.scanHeaders("");
        java.lang.String str12 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str14 = response0.header("hi!");
        java.lang.String str16 = response0.cookie("");
        int int17 = response0.statusCode();
        java.util.Map map18 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response0.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test12221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12221");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL5 = response4.url();
        java.lang.String str7 = response4.header("hi!");
        java.util.Map map8 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map8);
        int int10 = response0.statusCode();
        org.jsoup.Connection.Response response12 = response0.removeCookie("");
        java.lang.String str14 = response0.cookie("hi!");
        java.util.Map.Entry entry16 = response0.scanHeaders("hi!");
        java.util.Map.Entry entry18 = response0.scanHeaders("");
        org.jsoup.Connection.Response response20 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response0.method(method21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(entry16);
        org.junit.Assert.assertNull(entry18);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test12222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12222");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str6 = response0.charset();
        java.lang.String str7 = response0.statusMessage();
        java.lang.String str8 = response0.contentType();
        java.util.Map.Entry entry10 = response0.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entry10);
    }

    @Test
    public void test12223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12223");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int7 = response6.statusCode();
        java.util.Map.Entry entry9 = response6.scanHeaders("");
        org.jsoup.Connection.Method method10 = response6.method();
        boolean boolean12 = response6.hasHeader("hi!");
        java.lang.String str14 = response6.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response17 = response6.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str20 = response18.header("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = response18.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test12224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12224");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        java.lang.String str6 = response0.header("hi!");
        java.lang.String str7 = response0.charset();
        org.jsoup.Connection.Response response9 = response0.removeCookie("");
        java.lang.String str11 = response0.header("");
        java.lang.String str12 = response0.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12225");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.header("");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.cookie("");
        java.util.Map map11 = response0.headers();
        java.net.URL uRL12 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test12226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12226");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        org.jsoup.Connection.Response response7 = response0.cookie("hi!", "hi!");
        org.jsoup.Connection.Method method8 = response0.method();
        java.lang.String str10 = response0.cookie("");
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12227");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        java.net.URL uRL4 = response1.url();
        java.util.Map map5 = response1.cookies();
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "hi!");
        org.jsoup.Connection.Method method9 = response1.method();
        java.util.Map.Entry entry11 = response1.scanHeaders("");
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL14 = response13.url();
        java.lang.String str15 = response13.statusMessage();
        boolean boolean17 = response13.hasCookie("hi!");
        java.lang.String str19 = response13.header("hi!");
        int int20 = response13.statusCode();
        boolean boolean22 = response13.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL25 = response24.url();
        java.lang.String str27 = response24.header("hi!");
        org.jsoup.Connection.Response response29 = response24.removeHeader("hi!");
        org.jsoup.Connection.Method method30 = response24.method();
        java.util.Map map31 = response24.headers();
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response(response24);
        java.lang.String str33 = response32.contentType();
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL35 = response34.url();
        org.jsoup.Connection.Method method36 = response34.method();
        org.jsoup.Connection.Response response39 = response34.header("hi!", "");
        java.util.Map map40 = response34.headers();
        org.jsoup.Connection.Response response42 = response34.removeCookie("");
        java.util.Map map43 = response34.cookies();
        response32.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map43);
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map43);
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection12, (org.jsoup.Connection.Response) response13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNull(method30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(uRL35);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertNotNull(response39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(response42);
        org.junit.Assert.assertNotNull(map43);
    }

    @Test
    public void test12228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12228");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        boolean boolean4 = response0.hasHeader("hi!");
        java.lang.String str5 = response0.contentType();
        java.lang.String str6 = response0.charset();
        org.jsoup.Connection.Response response9 = response0.header("hi!", "");
        java.util.Map.Entry entry11 = response0.scanHeaders("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(entry11);
    }

    @Test
    public void test12229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12229");
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
        org.jsoup.Connection.Response response17 = response0.removeCookie("");
        org.jsoup.Connection.Method method18 = response0.method();
        java.util.Map.Entry entry20 = response0.scanHeaders("");
        org.jsoup.Connection.Response response23 = response0.cookie("hi!", "");
        java.lang.String str24 = response0.contentType();
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
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(entry20);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test12230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12230");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        org.jsoup.Connection.Method method3 = response1.method();
        org.jsoup.Connection.Response response6 = response1.header("hi!", "");
        java.lang.String str8 = response1.header("hi!");
        java.util.Map map9 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str12 = response1.header("");
        java.util.Map map13 = response1.headers();
        java.net.URL uRL14 = response1.url();
        org.jsoup.Connection.Response response17 = response1.header("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test12231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12231");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        java.util.Map map4 = response0.headers();
        java.lang.String str6 = response0.cookie("hi!");
        java.lang.String str7 = response0.charset();
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str12 = response10.cookie("");
        java.lang.String str13 = response10.contentType();
        java.lang.String str15 = response10.header("hi!");
        java.util.Map map16 = response10.cookies();
        java.net.URL uRL17 = response10.url();
        java.net.URL uRL18 = response10.url();
        org.jsoup.Connection.Method method19 = response10.method();
        java.util.Map map20 = response10.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map20);
        java.util.Map.Entry entry23 = response0.scanHeaders("");
        java.net.HttpURLConnection httpURLConnection24 = null;
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL26 = response25.url();
        java.lang.String str27 = response25.statusMessage();
        java.util.Map map28 = response25.cookies();
        java.lang.String str29 = response25.charset();
        java.util.Map map30 = response25.headers();
        java.lang.String str32 = response25.getHeaderCaseInsensitive("");
        java.util.Map map33 = response25.headers();
        org.jsoup.Connection.Method method34 = response25.method();
        org.jsoup.Connection.Response response37 = response25.header("hi!", "hi!");
        org.jsoup.Connection.Response response40 = response25.cookie("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection24, response40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(entry23);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertNotNull(response37);
        org.junit.Assert.assertNotNull(response40);
    }

    @Test
    public void test12232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12232");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        java.util.Map map8 = response0.cookies();
        java.util.Map.Entry entry10 = response0.scanHeaders("");
        int int11 = response0.statusCode();
        org.jsoup.Connection.Response response13 = response0.removeHeader("hi!");
        java.util.Map map14 = response0.cookies();
        java.lang.String str16 = response0.header("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12233");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL3 = response2.url();
        java.lang.String str4 = response2.charset();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str6 = response5.statusMessage();
        java.lang.String str8 = response5.header("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str11 = response5.header("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.Connection.Method method13 = response5.method();
        org.jsoup.Connection.Response response16 = response5.header("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test12234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12234");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        boolean boolean9 = response0.hasCookie("hi!");
        java.lang.String str11 = response0.cookie("hi!");
        java.net.URL uRL12 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test12235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12235");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.cookie("hi!", "hi!");
        java.net.URL uRL4 = response0.url();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Response response10 = response0.cookie("hi!", "");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test12236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12236");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        boolean boolean7 = response0.hasCookie("hi!");
        java.util.Map map8 = response0.headers();
        java.lang.String str9 = response0.statusMessage();
        java.net.URL uRL10 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response0.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test12237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12237");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL6 = response5.url();
        java.net.URL uRL7 = response5.url();
        org.jsoup.Connection.Response response9 = response5.removeCookie("");
        java.lang.String str11 = response5.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.net.URL uRL14 = response13.url();
        java.lang.String str15 = response13.charset();
        java.net.URL uRL16 = response13.url();
        java.util.Map map17 = response13.cookies();
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map17);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map17);
        boolean boolean21 = response0.hasCookie("");
        java.lang.String str22 = response0.statusMessage();
        java.util.Map.Entry entry24 = response0.scanHeaders("hi!");
        java.util.Map map25 = response0.headers();
        java.lang.String str26 = response0.charset();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(entry24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test12238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12238");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int7 = response6.statusCode();
        java.util.Map.Entry entry9 = response6.scanHeaders("");
        boolean boolean11 = response6.hasCookie("");
        java.lang.String str12 = response6.statusMessage();
        java.util.Map.Entry entry14 = response6.scanHeaders("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(entry14);
    }

    @Test
    public void test12239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12239");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        int int7 = response0.statusCode();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "hi!");
        java.lang.String str13 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response17 = response14.header("hi!", "");
        java.lang.String str18 = response14.statusMessage();
        boolean boolean20 = response14.hasCookie("");
        java.lang.String str21 = response14.charset();
        java.lang.String str22 = response14.contentType();
        java.util.Map map23 = response14.headers();
        java.util.Map map24 = response14.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test12240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12240");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map map5 = response0.headers();
        boolean boolean7 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response9 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response0.statusMessage();
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response0.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12241");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("");
        boolean boolean7 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response10 = response0.cookie("hi!", "hi!");
        java.util.Map map11 = response0.headers();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test12242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12242");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        java.lang.String str12 = response0.cookie("");
        org.jsoup.Connection.Response response14 = response0.removeHeader("hi!");
        java.lang.String str16 = response0.getHeaderCaseInsensitive("");
        java.net.URL uRL17 = response0.url();
        java.lang.String str18 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document19 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test12243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12243");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.statusMessage();
        java.util.Map map4 = response1.cookies();
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.lang.String str8 = response1.statusMessage();
        java.lang.String str10 = response1.cookie("");
        boolean boolean12 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method14 = response1.method();
        java.net.URL uRL15 = response1.url();
        org.jsoup.Connection.Response response17 = response1.removeCookie("");
        java.lang.String str19 = response1.cookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test12244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12244");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.net.URL uRL7 = response0.url();
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response0.statusMessage();
        java.util.Map.Entry entry13 = response0.scanHeaders("hi!");
        java.lang.String str14 = response0.statusMessage();
        int int15 = response0.statusCode();
        java.util.Map.Entry entry17 = response0.scanHeaders("");
        java.lang.String str19 = response0.getHeaderCaseInsensitive("");
        int int20 = response0.statusCode();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(entry9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(entry13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(entry17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test12245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12245");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.cookie("");
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        java.util.Map map9 = response0.headers();
        int int10 = response0.statusCode();
        boolean boolean12 = response0.hasHeader("hi!");
        boolean boolean14 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response17 = response0.cookie("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response0.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test12246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12246");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL8 = response7.url();
        java.lang.String str9 = response7.statusMessage();
        boolean boolean11 = response7.hasCookie("hi!");
        boolean boolean13 = response7.hasHeader("hi!");
        java.util.Map map14 = response7.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        java.util.Map map16 = response0.cookies();
        org.jsoup.Connection.Method method17 = response0.method();
        java.lang.String str19 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str21 = response0.contentType();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap22 = null;
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders(strMap22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test12247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12247");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("hi!");
        int int8 = response0.statusCode();
        boolean boolean10 = response0.hasCookie("");
        java.lang.String str12 = response0.cookie("");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry15 = response13.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.net.URL uRL17 = response16.url();
        java.lang.String str19 = response16.header("hi!");
        org.jsoup.Connection.Method method20 = response16.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(entry15);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(method20);
    }

    @Test
    public void test12248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12248");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.net.URL uRL7 = response0.url();
        boolean boolean9 = response0.hasCookie("hi!");
        org.jsoup.Connection.Method method10 = response0.method();
        java.util.Map.Entry entry12 = response0.scanHeaders("");
        java.lang.String str13 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.lang.String str16 = response14.statusMessage();
        java.util.Map map17 = response14.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map17);
        org.jsoup.Connection.Response response20 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL22 = response21.url();
        org.jsoup.Connection.Method method23 = response21.method();
        java.lang.String str25 = response21.cookie("hi!");
        boolean boolean27 = response21.hasCookie("hi!");
        org.jsoup.Connection.Response response30 = response21.cookie("hi!", "");
        boolean boolean32 = response21.hasHeader("hi!");
        java.lang.String str33 = response21.statusMessage();
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response21);
        java.lang.String str35 = response21.statusMessage();
        java.util.Map map36 = response21.headers();
        java.util.Map map37 = response21.cookies();
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL39 = response38.url();
        java.lang.String str40 = response38.statusMessage();
        int int41 = response38.statusCode();
        org.jsoup.Connection.Response response44 = response38.header("hi!", "hi!");
        java.util.Map map45 = response38.cookies();
        response21.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map45);
        org.jsoup.helper.HttpConnection.Response response47 = new org.jsoup.helper.HttpConnection.Response(response21);
        java.util.Map map48 = response47.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map48);
        java.lang.String str51 = response0.cookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document52 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(entry12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(uRL39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(response44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test12249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12249");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str5 = response1.cookie("hi!");
        org.jsoup.Connection.Method method6 = response1.method();
        java.util.Map map7 = response1.headers();
        java.net.HttpURLConnection httpURLConnection8 = null;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL10 = response9.url();
        java.lang.String str12 = response9.header("hi!");
        org.jsoup.Connection.Response response14 = response9.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection8, (org.jsoup.Connection.Response) response15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test12250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12250");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response6.hasCookie("");
        java.lang.String str10 = response6.header("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12251");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map.Entry entry6 = response0.scanHeaders("");
        java.lang.String str7 = response0.contentType();
        java.util.Map map8 = response0.headers();
        java.util.Map map9 = response0.headers();
        boolean boolean11 = response0.hasCookie("hi!");
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response0.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test12252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12252");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map4 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map4);
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response13 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map15 = response14.headers();
        org.jsoup.Connection.Method method16 = response14.method();
        java.lang.String str17 = response14.charset();
        java.lang.String str19 = response14.header("hi!");
        java.util.Map.Entry entry21 = response14.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.util.Map map23 = response14.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        boolean boolean26 = response0.hasHeader("hi!");
        java.lang.String str28 = response0.getHeaderCaseInsensitive("");
        java.lang.String str30 = response0.getHeaderCaseInsensitive("");
        java.lang.String str32 = response0.cookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(entry21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test12253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12253");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response6.contentType();
        java.lang.String str9 = response6.cookie("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Response response13 = response6.cookie("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response6.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test12254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12254");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        java.lang.String str11 = response0.charset();
        java.lang.String str13 = response0.header("");
        boolean boolean15 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response17 = response0.removeCookie("");
        boolean boolean19 = response0.hasCookie("");
        java.util.Map map20 = response0.headers();
        java.lang.String str22 = response0.cookie("hi!");
        boolean boolean24 = response0.hasHeader("hi!");
        java.net.URL uRL25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response26 = response0.url(uRL25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test12255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12255");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int7 = response6.statusCode();
        java.util.Map.Entry entry9 = response6.scanHeaders("");
        boolean boolean11 = response6.hasCookie("");
        java.lang.String str13 = response6.cookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12256");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response8 = response5.header("hi!", "hi!");
        java.util.Map map9 = response5.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.util.Map map11 = response0.headers();
        java.util.Map.Entry entry13 = response0.scanHeaders("hi!");
        org.jsoup.Connection.Method method14 = response0.method();
        org.jsoup.Connection.Method method15 = response0.method();
        java.util.Map map16 = response0.headers();
        java.lang.String str18 = response0.header("hi!");
        java.lang.String str19 = response0.charset();
        java.lang.String str20 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response0.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(entry13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test12257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12257");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        java.util.Map map6 = response0.cookies();
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
        java.util.Map map23 = response7.cookies();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL25 = response24.url();
        java.lang.String str26 = response24.statusMessage();
        int int27 = response24.statusCode();
        org.jsoup.Connection.Response response30 = response24.header("hi!", "hi!");
        java.util.Map map31 = response24.cookies();
        response7.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map35 = response34.cookies();
        org.jsoup.Connection.Method method36 = response34.method();
        java.util.Map map37 = response34.cookies();
        java.util.Map map38 = response34.cookies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = response34.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
    }

    @Test
    public void test12258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12258");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.charset();
        java.lang.String str9 = response0.charset();
        boolean boolean11 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.net.URL uRL14 = response13.url();
        java.lang.String str15 = response13.charset();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str17 = response16.statusMessage();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response21 = response18.header("hi!", "hi!");
        java.util.Map map22 = response18.cookies();
        response16.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        org.jsoup.Connection.Method method25 = response0.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(method25);
    }

    @Test
    public void test12259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12259");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.cookie("hi!", "hi!");
        int int4 = response0.statusCode();
        java.util.Map map5 = response0.cookies();
        java.lang.String str6 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response10 = response7.cookie("hi!", "");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test12260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12260");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str4 = response1.statusMessage();
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Response response8 = response1.header("hi!", "hi!");
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str11 = response1.header("");
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response1.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12261");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        boolean boolean9 = response0.hasCookie("");
        java.lang.String str10 = response0.charset();
        java.lang.String str11 = response0.contentType();
        int int12 = response0.statusCode();
        java.util.Map.Entry entry14 = response0.scanHeaders("");
        java.lang.String str16 = response0.cookie("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(entry14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12262");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("");
        java.util.Map map3 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(map3);
    }

    @Test
    public void test12263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12263");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map.Entry entry6 = response0.scanHeaders("");
        java.lang.String str7 = response0.contentType();
        java.lang.String str9 = response0.header("hi!");
        java.util.Map map10 = response0.headers();
        java.lang.String str11 = response0.charset();
        java.lang.String str12 = response0.charset();
        java.lang.String str14 = response0.cookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12264");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str6 = response0.charset();
        org.jsoup.Connection.Response response9 = response0.cookie("hi!", "hi!");
        java.net.URL uRL10 = response0.url();
        org.jsoup.Connection.Response response12 = response0.removeCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test12265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12265");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.headers();
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str10 = response0.statusMessage();
        java.util.Map map11 = response0.headers();
        java.lang.String str12 = response0.contentType();
        boolean boolean14 = response0.hasCookie("");
        java.lang.String str15 = response0.statusMessage();
        java.lang.String str17 = response0.getHeaderCaseInsensitive("");
        java.lang.String str19 = response0.cookie("hi!");
        java.lang.Class<?> wildcardClass20 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test12266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12266");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map map5 = response0.headers();
        java.util.Map.Entry entry7 = response0.scanHeaders("hi!");
        java.util.Map map8 = response0.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test12267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12267");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        java.util.Map map6 = response0.cookies();
        java.net.URL uRL7 = response0.url();
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry12 = response10.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response10.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(entry12);
    }

    @Test
    public void test12268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12268");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.lang.String str4 = response0.contentType();
        java.lang.String str5 = response0.charset();
        boolean boolean7 = response0.hasCookie("hi!");
        int int8 = response0.statusCode();
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "");
        org.jsoup.Connection.Response response13 = response0.removeHeader("hi!");
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test12269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12269");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.cookie("hi!");
        java.util.Map.Entry entry10 = response0.scanHeaders("hi!");
        java.net.URL uRL11 = response0.url();
        org.jsoup.Connection.Response response13 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response16 = response0.cookie("hi!", "hi!");
        java.lang.String str17 = response0.statusMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test12270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12270");
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
        java.lang.String str19 = response13.header("");
        org.jsoup.Connection.Response response21 = response13.removeCookie("");
        java.lang.String str22 = response13.contentType();
        java.util.Map.Entry entry24 = response13.scanHeaders("hi!");
        java.lang.String str26 = response13.getHeaderCaseInsensitive("hi!");
        java.util.Map map27 = response13.cookies();
        java.lang.String str28 = response13.contentType();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(entry24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test12271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12271");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test12272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12272");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str6 = response1.cookie("hi!");
        java.util.Map map7 = response1.cookies();
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str10 = response1.statusMessage();
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12273");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str6 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str9 = response7.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response7.method(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12274");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.util.Map map8 = response0.cookies();
        org.jsoup.Connection.Method method9 = response0.method();
        java.lang.String str11 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str12 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str15 = response0.cookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12275");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        boolean boolean4 = response0.hasHeader("hi!");
        java.net.URL uRL5 = response0.url();
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.net.URL uRL8 = response0.url();
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str10 = response0.statusMessage();
        java.util.Map map11 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map13 = response0.headers();
        int int14 = response0.statusCode();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test12276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12276");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method4 = response3.method();
        boolean boolean6 = response3.hasCookie("hi!");
        java.lang.String str7 = response3.statusMessage();
        int int8 = response3.statusCode();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response3);
        boolean boolean11 = response9.hasHeader("hi!");
        java.net.URL uRL12 = response9.url();
        java.util.Map map13 = response9.headers();
        java.util.Map map14 = response9.headers();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response9.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test12277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12277");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response6.getHeaderCaseInsensitive("hi!");
        java.lang.String str9 = response6.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.net.URL uRL11 = response10.url();
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Method method15 = response13.method();
        java.util.Map map16 = response13.headers();
        boolean boolean18 = response13.hasCookie("");
        java.util.Map map19 = response13.cookies();
        java.lang.String str21 = response13.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            response10.setupFromConnection(httpURLConnection12, (org.jsoup.Connection.Response) response13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test12278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12278");
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
        boolean boolean15 = response0.hasHeader("hi!");
        java.net.URL uRL16 = response0.url();
        java.net.URL uRL17 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test12279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12279");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.Connection.Response response4 = response0.cookie("hi!", "hi!");
        java.net.URL uRL5 = response0.url();
        org.jsoup.Connection.Response response8 = response0.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL10 = response9.url();
        org.jsoup.Connection.Method method11 = response9.method();
        java.lang.String str12 = response9.contentType();
        org.jsoup.Connection.Response response15 = response9.cookie("hi!", "");
        java.lang.String str16 = response9.charset();
        int int17 = response9.statusCode();
        java.lang.String str18 = response9.charset();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str21 = response19.cookie("");
        java.lang.String str22 = response19.contentType();
        java.lang.String str24 = response19.header("hi!");
        org.jsoup.Connection.Method method25 = response19.method();
        java.util.Map map26 = response19.cookies();
        response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        java.net.URL uRL29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response30 = response0.url(uRL29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test12280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12280");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.net.URL uRL7 = response0.url();
        java.lang.String str9 = response0.header("hi!");
        java.lang.String str11 = response0.cookie("");
        org.jsoup.Connection.Response response13 = response0.removeHeader("hi!");
        java.lang.String str15 = response0.cookie("hi!");
        org.jsoup.Connection.Response response17 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response20 = response0.header("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response0.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test12281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12281");
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
        java.util.Map map14 = response0.cookies();
        org.jsoup.Connection.Response response16 = response0.removeCookie("hi!");
        org.jsoup.Connection.Method method17 = response0.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test12282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12282");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.lang.String str9 = response0.cookie("");
        java.util.Map map10 = response0.headers();
        java.lang.String str11 = response0.charset();
        java.lang.String str12 = response0.charset();
        org.jsoup.Connection.Response response14 = response0.removeCookie("");
        java.lang.Class<?> wildcardClass15 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test12283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12283");
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
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL29 = response28.url();
        org.jsoup.Connection.Method method30 = response28.method();
        java.lang.String str32 = response28.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map34 = response33.headers();
        response28.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map34);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map34);
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str40 = response38.cookie("");
        java.lang.String str41 = response38.contentType();
        java.lang.String str43 = response38.header("hi!");
        boolean boolean45 = response38.hasCookie("hi!");
        int int46 = response38.statusCode();
        java.util.Map map47 = response38.cookies();
        response37.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map47);
        java.util.Map map49 = response37.cookies();
        org.jsoup.Connection.Response response51 = response37.removeCookie("hi!");
        java.lang.String str52 = response37.statusMessage();
        java.lang.String str53 = response37.statusMessage();
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
        org.junit.Assert.assertNull(uRL29);
        org.junit.Assert.assertNull(method30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(response51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test12284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12284");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str6 = response0.contentType();
        org.jsoup.Connection.Response response9 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response0.contentType();
        org.jsoup.Connection.Response response13 = response0.removeCookie("hi!");
        java.util.Map map14 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test12285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12285");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response8 = response5.header("hi!", "hi!");
        java.util.Map map9 = response5.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.util.Map map11 = response0.headers();
        java.util.Map map12 = response0.cookies();
        org.jsoup.Connection.Response response15 = response0.cookie("hi!", "");
        java.lang.String str17 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response20 = response18.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str23 = response21.cookie("");
        java.lang.String str24 = response21.contentType();
        java.lang.String str26 = response21.header("hi!");
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response21);
        java.util.Map map28 = response21.headers();
        java.util.Map map29 = response21.cookies();
        response18.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
        java.util.Map.Entry entry33 = response0.scanHeaders("hi!");
        java.util.Map map34 = response0.cookies();
        org.jsoup.Connection.Method method35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response36 = response0.method(method35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(entry33);
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test12286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12286");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        java.net.URL uRL4 = response1.url();
        java.util.Map map5 = response1.cookies();
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "hi!");
        java.util.Map.Entry entry10 = response1.scanHeaders("hi!");
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.statusMessage();
        java.util.Map map13 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test12287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12287");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map4 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map4);
        java.lang.String str7 = response0.header("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response0.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test12288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12288");
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
        java.lang.String str19 = response17.statusMessage();
        int int20 = response17.statusCode();
        org.jsoup.Connection.Response response23 = response17.header("hi!", "hi!");
        java.util.Map map24 = response17.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        java.lang.String str27 = response0.getHeaderCaseInsensitive("");
        java.util.Map map28 = response0.headers();
        java.lang.String str29 = response0.statusMessage();
        org.jsoup.Connection.Response response31 = response0.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray32 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(response31);
    }

    @Test
    public void test12289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12289");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str4 = response0.contentType();
        java.lang.String str5 = response0.contentType();
        java.util.Map map6 = response0.cookies();
        java.lang.String str7 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test12290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12290");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.charset();
        java.lang.String str5 = response0.header("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("hi!");
        java.lang.String str8 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response0.cookie("hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12291");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        org.jsoup.Connection.Method method3 = response1.method();
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Response response7 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.header("");
        org.jsoup.Connection.Response response12 = response1.cookie("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test12292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12292");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        java.lang.String str4 = response0.charset();
        int int5 = response0.statusCode();
        java.util.Map map6 = response0.cookies();
        java.lang.String str7 = response0.charset();
        java.lang.String str8 = response0.charset();
        java.lang.String str9 = response0.charset();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12293");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.headers();
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str10 = response0.statusMessage();
        org.jsoup.Connection.Response response12 = response0.removeCookie("hi!");
        java.lang.String str14 = response0.getHeaderCaseInsensitive("");
        java.lang.Class<?> wildcardClass15 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test12294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12294");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Response response6 = response0.cookie("hi!", "");
        java.lang.String str7 = response0.statusMessage();
        int int8 = response0.statusCode();
        java.lang.String str9 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL11 = response10.url();
        java.net.URL uRL12 = response10.url();
        java.net.URL uRL13 = response10.url();
        java.net.URL uRL14 = response10.url();
        java.lang.String str16 = response10.getHeaderCaseInsensitive("");
        int int17 = response10.statusCode();
        java.lang.String str18 = response10.contentType();
        java.util.Map map19 = response10.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test12295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12295");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response0.statusMessage();
        java.lang.String str8 = response0.header("");
        java.util.Map map9 = response0.headers();
        java.lang.String str10 = response0.statusMessage();
        org.jsoup.Connection.Response response12 = response0.removeCookie("hi!");
        boolean boolean14 = response0.hasCookie("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test12296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12296");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        java.net.URL uRL3 = response0.url();
        java.net.URL uRL4 = response0.url();
        org.jsoup.Connection.Method method5 = response0.method();
        boolean boolean7 = response0.hasHeader("hi!");
        java.lang.String str8 = response0.charset();
        org.jsoup.Connection.Response response10 = response0.removeCookie("");
        java.lang.String str11 = response0.statusMessage();
        java.lang.String str12 = response0.contentType();
        org.jsoup.Connection.Response response14 = response0.removeCookie("");
        java.net.HttpURLConnection httpURLConnection15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL17 = response16.url();
        java.lang.String str18 = response16.statusMessage();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map20 = response19.headers();
        response16.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map20);
        java.util.Map.Entry entry23 = response16.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.lang.String str25 = response16.statusMessage();
        java.lang.String str26 = response16.charset();
        java.lang.String str27 = response16.statusMessage();
        int int28 = response16.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection15, (org.jsoup.Connection.Response) response16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(entry23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test12297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12297");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        org.jsoup.Connection.Method method3 = response1.method();
        java.lang.String str5 = response1.cookie("hi!");
        boolean boolean7 = response1.hasCookie("hi!");
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "");
        boolean boolean12 = response1.hasHeader("hi!");
        java.lang.String str13 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str15 = response1.statusMessage();
        java.util.Map map16 = response1.headers();
        java.util.Map map17 = response1.cookies();
        java.util.Map map18 = response1.cookies();
        org.jsoup.Connection.Response response21 = response1.header("hi!", "");
        java.lang.String str23 = response1.cookie("hi!");
        java.lang.String str24 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response26 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test12298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12298");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        java.net.URL uRL3 = response0.url();
        java.net.URL uRL4 = response0.url();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response5.removeCookie("hi!");
        java.util.Map map8 = response5.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = response5.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test12299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12299");
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
        org.jsoup.Connection.Response response17 = response13.header("hi!", "hi!");
        java.util.Map.Entry entry19 = response13.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Response response22 = response13.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.util.Map.Entry entry25 = response13.scanHeaders("");
        java.lang.String str27 = response13.header("");
        int int28 = response13.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = response13.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(entry19);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(entry25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test12300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12300");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response6.contentType();
        boolean boolean9 = response6.hasCookie("");
        org.jsoup.Connection.Response response12 = response6.header("hi!", "");
        java.lang.String str13 = response6.charset();
        java.lang.Class<?> wildcardClass14 = response6.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test12301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12301");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response0.contentType();
        int int8 = response0.statusCode();
        org.jsoup.Connection.Response response11 = response0.header("hi!", "");
        java.lang.String str13 = response0.header("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12302");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map map7 = response0.cookies();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        java.lang.String str10 = response0.statusMessage();
        java.lang.String str12 = response0.cookie("hi!");
        org.jsoup.Connection.Response response15 = response0.cookie("hi!", "hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test12303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12303");
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
        java.lang.String str12 = response0.contentType();
        java.lang.String str13 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = response14.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12304");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str4 = response0.charset();
        org.jsoup.Connection.Response response6 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.statusMessage();
        java.lang.String str9 = response0.cookie("");
        boolean boolean11 = response0.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean14 = response12.hasCookie("");
        java.lang.Class<?> wildcardClass15 = response12.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test12305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12305");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.util.Map map3 = response0.headers();
        java.net.URL uRL4 = response0.url();
        java.util.Map map5 = response0.cookies();
        java.util.Map map6 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response0.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test12306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12306");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str9 = response8.charset();
        java.lang.String str11 = response8.header("");
        org.jsoup.Connection.Method method12 = response8.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test12307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12307");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str6 = response0.contentType();
        java.util.Map map7 = response0.headers();
        int int8 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test12308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12308");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.cookie("hi!", "hi!");
        int int4 = response0.statusCode();
        java.util.Map map5 = response0.cookies();
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL9 = response8.url();
        java.lang.String str10 = response8.statusMessage();
        int int11 = response8.statusCode();
        org.jsoup.Connection.Response response14 = response8.header("hi!", "hi!");
        java.net.URL uRL15 = response8.url();
        org.jsoup.Connection.Method method16 = response8.method();
        org.jsoup.Connection.Response response18 = response8.removeCookie("");
        java.util.Map map19 = response8.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        java.lang.String str22 = response0.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test12309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12309");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.header("");
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str14 = response0.header("hi!");
        java.util.Map map15 = response0.headers();
        java.util.Map map16 = response0.headers();
        org.jsoup.Connection.Response response18 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test12310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12310");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.net.URL uRL10 = response9.url();
        java.lang.String str11 = response9.charset();
        java.net.URL uRL12 = response9.url();
        int int13 = response9.statusCode();
        java.lang.String str14 = response9.statusMessage();
        java.lang.String str16 = response9.header("");
        java.util.Map map17 = response9.headers();
        java.util.Map map18 = response9.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test12311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12311");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean9 = response0.hasCookie("");
        java.util.Map map10 = response0.headers();
        java.lang.String str12 = response0.header("hi!");
        java.util.Map.Entry entry14 = response0.scanHeaders("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(entry14);
    }

    @Test
    public void test12312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12312");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str5 = response3.contentType();
        org.jsoup.Connection.Method method6 = response3.method();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = response3.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
    }

    @Test
    public void test12313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12313");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL5 = response4.url();
        java.lang.String str7 = response4.header("hi!");
        java.util.Map map8 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map8);
        java.lang.String str10 = response0.statusMessage();
        int int11 = response0.statusCode();
        boolean boolean13 = response0.hasHeader("hi!");
        int int14 = response0.statusCode();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test12314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12314");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        boolean boolean6 = response0.hasHeader("hi!");
        java.util.Map map7 = response0.cookies();
        java.lang.String str8 = response0.contentType();
        java.util.Map.Entry entry10 = response0.scanHeaders("hi!");
        java.lang.String str11 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12315");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str4 = response1.header("");
        java.lang.String str5 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL7 = response6.url();
        java.lang.String str8 = response6.statusMessage();
        boolean boolean10 = response6.hasCookie("hi!");
        boolean boolean12 = response6.hasHeader("hi!");
        java.lang.String str14 = response6.cookie("");
        java.util.Map map15 = response6.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map15);
        java.net.URL uRL17 = response1.url();
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.url(uRL18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test12316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12316");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        boolean boolean11 = response0.hasCookie("hi!");
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL14 = response13.url();
        org.jsoup.Connection.Method method15 = response13.method();
        java.lang.String str17 = response13.cookie("hi!");
        boolean boolean19 = response13.hasCookie("hi!");
        org.jsoup.Connection.Response response22 = response13.cookie("hi!", "");
        boolean boolean24 = response13.hasHeader("hi!");
        java.lang.String str25 = response13.statusMessage();
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str27 = response13.statusMessage();
        java.util.Map map28 = response13.headers();
        java.lang.String str29 = response13.statusMessage();
        int int30 = response13.statusCode();
        java.lang.String str31 = response13.contentType();
        java.lang.String str32 = response13.statusMessage();
        org.jsoup.Connection.Response response34 = response13.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str37 = response35.cookie("");
        java.lang.String str38 = response35.statusMessage();
        java.lang.String str40 = response35.header("hi!");
        java.lang.String str41 = response35.contentType();
        org.jsoup.Connection.Response response44 = response35.header("hi!", "hi!");
        java.lang.String str45 = response35.statusMessage();
        java.util.Map map46 = response35.cookies();
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map46);
        org.jsoup.helper.HttpConnection.Response response48 = new org.jsoup.helper.HttpConnection.Response(response13);
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection12, (org.jsoup.Connection.Response) response48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(response44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(map46);
    }

    @Test
    public void test12317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12317");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        boolean boolean6 = response0.hasHeader("hi!");
        java.util.Map map7 = response0.cookies();
        java.lang.String str8 = response0.contentType();
        java.util.Map.Entry entry10 = response0.scanHeaders("hi!");
        java.util.Map map11 = response0.headers();
        java.net.URL uRL12 = response0.url();
        org.jsoup.Connection.Response response14 = response0.removeCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test12318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12318");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.header("");
        java.lang.String str9 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str12 = response0.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response0.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test12319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12319");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        java.lang.String str6 = response0.header("hi!");
        int int7 = response0.statusCode();
        boolean boolean9 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int11 = response10.statusCode();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response12.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test12320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12320");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.util.Map map3 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL5 = response4.url();
        java.lang.String str6 = response4.statusMessage();
        boolean boolean8 = response4.hasCookie("hi!");
        boolean boolean10 = response4.hasHeader("hi!");
        java.util.Map map11 = response4.cookies();
        java.lang.String str12 = response4.contentType();
        org.jsoup.Connection.Method method13 = response4.method();
        java.net.URL uRL14 = response4.url();
        java.util.Map map15 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map15);
        int int17 = response0.statusCode();
        boolean boolean19 = response0.hasCookie("hi!");
        java.util.Map map20 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document22 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test12321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12321");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        java.lang.String str6 = response0.header("hi!");
        int int7 = response0.statusCode();
        boolean boolean9 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.lang.String str13 = response11.cookie("hi!");
        java.lang.Class<?> wildcardClass14 = response11.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test12322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12322");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.contentType();
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        boolean boolean9 = response0.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test12323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12323");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        java.util.Map map8 = response0.cookies();
        java.util.Map.Entry entry10 = response0.scanHeaders("");
        int int11 = response0.statusCode();
        org.jsoup.Connection.Response response13 = response0.removeHeader("hi!");
        java.util.Map map14 = response0.cookies();
        java.lang.String str16 = response0.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12324");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str8 = response6.cookie("");
        java.lang.String str9 = response6.contentType();
        java.lang.String str11 = response6.header("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str14 = response6.cookie("hi!");
        java.util.Map map15 = response6.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map15);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL18 = response17.url();
        java.lang.String str19 = response17.statusMessage();
        boolean boolean21 = response17.hasCookie("hi!");
        boolean boolean23 = response17.hasHeader("hi!");
        java.util.Map map24 = response17.cookies();
        java.lang.String str25 = response17.contentType();
        org.jsoup.Connection.Method method26 = response17.method();
        java.net.URL uRL27 = response17.url();
        java.util.Map map28 = response17.cookies();
        java.util.Map map29 = response17.cookies();
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.util.Map map31 = response17.headers();
        java.util.Map map32 = response17.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map32);
        boolean boolean35 = response0.hasCookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNull(uRL27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test12325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12325");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        boolean boolean9 = response0.hasCookie("");
        java.lang.String str10 = response0.charset();
        org.jsoup.Connection.Response response13 = response0.cookie("hi!", "hi!");
        java.lang.String str14 = response0.contentType();
        java.lang.String str16 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12326");
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
        java.util.Map map17 = response0.cookies();
        java.lang.String str19 = response0.header("hi!");
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
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test12327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12327");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response6.contentType();
        java.lang.String str9 = response6.cookie("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str11 = response10.charset();
        int int12 = response10.statusCode();
        org.jsoup.Connection.Response response15 = response10.header("hi!", "hi!");
        java.lang.String str16 = response10.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response10.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12328");
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
        java.lang.String str16 = response0.statusMessage();
        int int17 = response0.statusCode();
        java.lang.String str18 = response0.contentType();
        java.lang.String str19 = response0.statusMessage();
        org.jsoup.Connection.Response response21 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str24 = response22.cookie("");
        java.lang.String str25 = response22.statusMessage();
        java.lang.String str27 = response22.header("hi!");
        java.lang.String str28 = response22.contentType();
        org.jsoup.Connection.Response response31 = response22.header("hi!", "hi!");
        java.lang.String str32 = response22.statusMessage();
        java.util.Map map33 = response22.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map33);
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response38 = response35.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test12329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12329");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.cookie("hi!");
        java.util.Map map9 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.util.Map map12 = response10.cookies();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test12330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12330");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.lang.String str9 = response0.cookie("");
        java.util.Map map10 = response0.cookies();
        java.util.Map map11 = response0.cookies();
        boolean boolean13 = response0.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str15 = response14.statusMessage();
        java.util.Map.Entry entry17 = response14.scanHeaders("hi!");
        java.util.Map map18 = response14.cookies();
        java.net.URL uRL19 = response14.url();
        java.lang.String str20 = response14.statusMessage();
        java.lang.Class<?> wildcardClass21 = response14.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(entry17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test12331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12331");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str4 = response0.charset();
        boolean boolean6 = response0.hasCookie("hi!");
        java.util.Map.Entry entry8 = response0.scanHeaders("");
        java.lang.String str10 = response0.cookie("");
        int int11 = response0.statusCode();
        boolean boolean13 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response15 = response0.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document16 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test12332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12332");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        boolean boolean7 = response0.hasCookie("hi!");
        java.lang.String str9 = response0.getHeaderCaseInsensitive("");
        int int10 = response0.statusCode();
        java.lang.String str12 = response0.header("");
        java.net.URL uRL13 = response0.url();
        java.lang.String str14 = response0.contentType();
        java.lang.String str16 = response0.header("");
        java.lang.String str17 = response0.statusMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test12333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12333");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str9 = response7.getHeaderCaseInsensitive("");
        java.lang.String str10 = response7.contentType();
        org.jsoup.Connection.Response response12 = response7.removeHeader("hi!");
        java.lang.String str14 = response7.cookie("");
        boolean boolean16 = response7.hasCookie("hi!");
        java.lang.String str18 = response7.header("");
        java.lang.String str19 = response7.contentType();
        java.lang.String str20 = response7.charset();
        org.jsoup.Connection.Response response22 = response7.removeCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test12334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12334");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        int int7 = response0.statusCode();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "hi!");
        java.lang.String str13 = response0.getHeaderCaseInsensitive("");
        java.lang.String str14 = response0.statusMessage();
        java.lang.String str15 = response0.contentType();
        java.util.Map map16 = response0.cookies();
        org.jsoup.Connection.Response response18 = response0.removeHeader("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test12335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12335");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method9 = response8.method();
        org.jsoup.Connection.Response response12 = response8.cookie("hi!", "");
        java.lang.String str14 = response8.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response8.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12336");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response13 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.lang.String str17 = response15.header("hi!");
        java.lang.String str18 = response15.charset();
        org.jsoup.Connection.Response response21 = response15.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.util.Map map23 = response22.headers();
        org.jsoup.Connection.Response response25 = response22.removeCookie("");
        java.util.Map map26 = response22.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        org.jsoup.Connection.Method method28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response29 = response0.method(method28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test12337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12337");
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
        org.jsoup.Connection.Response response16 = response0.cookie("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response0.method();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL19 = response18.url();
        java.net.URL uRL20 = response18.url();
        org.jsoup.Connection.Response response22 = response18.removeCookie("");
        org.jsoup.Connection.Response response25 = response18.cookie("hi!", "hi!");
        org.jsoup.Connection.Method method26 = response18.method();
        int int27 = response18.statusCode();
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL29 = response28.url();
        java.lang.String str31 = response28.header("hi!");
        org.jsoup.Connection.Response response33 = response28.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response28);
        java.util.Map map35 = response28.cookies();
        java.util.Map map36 = response28.cookies();
        response18.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map36);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map36);
        org.jsoup.Connection.Response response41 = response0.cookie("hi!", "");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(uRL29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(response41);
    }

    @Test
    public void test12338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12338");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL5 = response4.url();
        java.lang.String str7 = response4.header("hi!");
        java.util.Map map8 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map8);
        int int10 = response0.statusCode();
        java.lang.String str12 = response0.header("");
        boolean boolean14 = response0.hasHeader("hi!");
        java.util.Map map15 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response0.method(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test12339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12339");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response0.url();
        java.lang.String str4 = response0.cookie("");
        java.util.Map.Entry entry6 = response0.scanHeaders("hi!");
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response0.contentType();
        java.lang.String str12 = response0.getHeaderCaseInsensitive("");
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response0.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12340");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        org.jsoup.Connection.Method method3 = response1.method();
        java.lang.String str5 = response1.cookie("hi!");
        boolean boolean7 = response1.hasCookie("hi!");
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "");
        boolean boolean12 = response1.hasHeader("hi!");
        java.lang.String str13 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str15 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str17 = response1.charset();
        java.lang.String str19 = response1.cookie("hi!");
        org.jsoup.Connection.Response response21 = response1.removeHeader("hi!");
        boolean boolean23 = response1.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response24 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test12341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12341");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("hi!");
        int int8 = response0.statusCode();
        boolean boolean10 = response0.hasCookie("");
        java.lang.String str12 = response0.cookie("");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean15 = response0.hasCookie("");
        java.lang.String str17 = response0.cookie("");
        java.net.HttpURLConnection httpURLConnection18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL20 = response19.url();
        org.jsoup.Connection.Response response22 = response19.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response19);
        boolean boolean25 = response19.hasHeader("hi!");
        java.net.URL uRL26 = response19.url();
        java.lang.String str28 = response19.cookie("");
        java.lang.String str30 = response19.header("");
        java.lang.String str32 = response19.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection18, (org.jsoup.Connection.Response) response19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test12342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12342");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response0.url();
        java.lang.String str4 = response0.cookie("");
        java.lang.String str6 = response0.cookie("");
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        java.lang.String str10 = response0.header("");
        java.lang.String str11 = response0.charset();
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12343");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        java.lang.String str10 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response12 = response0.removeHeader("hi!");
        java.lang.String str14 = response0.cookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12344");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map map7 = response0.cookies();
        java.util.Map map8 = response0.headers();
        java.util.Map map9 = response0.cookies();
        java.lang.String str10 = response0.statusMessage();
        java.util.Map.Entry entry12 = response0.scanHeaders("hi!");
        java.util.Map map13 = response0.headers();
        java.lang.String str15 = response0.header("");
        java.lang.String str16 = response0.statusMessage();
        java.lang.Class<?> wildcardClass17 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(entry12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test12345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12345");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        java.util.Map map6 = response0.cookies();
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
        java.util.Map map23 = response7.cookies();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL25 = response24.url();
        java.lang.String str26 = response24.statusMessage();
        int int27 = response24.statusCode();
        org.jsoup.Connection.Response response30 = response24.header("hi!", "hi!");
        java.util.Map map31 = response24.cookies();
        response7.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        java.lang.String str35 = response0.header("");
        java.lang.String str37 = response0.getHeaderCaseInsensitive("");
        boolean boolean39 = response0.hasHeader("hi!");
        boolean boolean41 = response0.hasCookie("");
        java.net.HttpURLConnection httpURLConnection42 = null;
        org.jsoup.helper.HttpConnection.Response response43 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response46 = response43.header("hi!", "hi!");
        java.util.Map map47 = response43.cookies();
        org.jsoup.Connection.Response response50 = response43.header("hi!", "hi!");
        boolean boolean52 = response43.hasCookie("");
        java.lang.String str53 = response43.contentType();
        org.jsoup.Connection.Response response56 = response43.cookie("hi!", "hi!");
        java.lang.String str58 = response43.cookie("");
        java.util.Map.Entry entry60 = response43.scanHeaders("");
        java.net.URL uRL61 = response43.url();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection42, (org.jsoup.Connection.Response) response43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(response46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(response50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(response56);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(entry60);
        org.junit.Assert.assertNull(uRL61);
    }

    @Test
    public void test12346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12346");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean9 = response0.hasCookie("");
        java.lang.String str10 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map12 = response11.headers();
        org.jsoup.Connection.Method method13 = response11.method();
        boolean boolean15 = response11.hasCookie("");
        java.util.Map map16 = response11.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map16);
        java.util.Map map18 = response0.headers();
        java.lang.String str19 = response0.statusMessage();
        java.util.Map map20 = response0.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test12347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12347");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map12 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry17 = response15.scanHeaders("hi!");
        java.util.Map.Entry entry19 = response15.scanHeaders("");
        java.lang.String str20 = response15.charset();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(entry17);
        org.junit.Assert.assertNull(entry19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test12348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12348");
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
        org.jsoup.Connection.Method method16 = response0.method();
        boolean boolean18 = response0.hasHeader("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test12349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12349");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        boolean boolean4 = response0.hasCookie("");
        java.util.Map map5 = response0.headers();
        java.net.URL uRL6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = response0.url(uRL6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test12350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12350");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response0.url();
        java.lang.String str4 = response0.cookie("");
        java.util.Map.Entry entry6 = response0.scanHeaders("hi!");
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Response response10 = response0.cookie("hi!", "");
        org.jsoup.Connection.Method method11 = response0.method();
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test12351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12351");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.util.Map map7 = response0.cookies();
        java.lang.String str9 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str10 = response0.contentType();
        java.lang.String str12 = response0.getHeaderCaseInsensitive("hi!");
        java.util.Map map13 = response0.cookies();
        boolean boolean15 = response0.hasCookie("hi!");
        java.net.URL uRL16 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response0.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test12352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12352");
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
        java.util.Map map28 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str30 = response29.statusMessage();
        org.jsoup.Connection.Method method31 = response29.method();
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response(response29);
        java.net.URL uRL33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response34 = response29.url(uRL33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(method31);
    }

    @Test
    public void test12353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12353");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        java.lang.String str10 = response0.getHeaderCaseInsensitive("");
        java.net.URL uRL11 = response0.url();
        org.jsoup.Connection.Response response13 = response0.removeHeader("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test12354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12354");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean6 = response0.hasHeader("hi!");
        java.lang.String str8 = response0.getHeaderCaseInsensitive("hi!");
        java.util.Map.Entry entry10 = response0.scanHeaders("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
    }

    @Test
    public void test12355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12355");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        org.jsoup.Connection.Method method3 = response1.method();
        org.jsoup.Connection.Response response6 = response1.header("hi!", "");
        java.util.Map map7 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int9 = response1.statusCode();
        java.util.Map.Entry entry11 = response1.scanHeaders("");
        org.jsoup.Connection.Response response13 = response1.removeCookie("");
        java.util.Map map14 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test12356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12356");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map map5 = response0.headers();
        boolean boolean7 = response0.hasCookie("hi!");
        java.lang.String str9 = response0.cookie("");
        java.lang.String str10 = response0.charset();
        boolean boolean12 = response0.hasHeader("hi!");
        java.lang.String str14 = response0.cookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12357");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int8 = response0.statusCode();
        java.util.Map map9 = response0.headers();
        int int10 = response0.statusCode();
        java.net.URL uRL11 = response0.url();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map13 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test12358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12358");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("");
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response10 = response8.removeHeader("hi!");
        int int11 = response8.statusCode();
        boolean boolean13 = response8.hasHeader("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test12359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12359");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        boolean boolean7 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str11 = response9.header("hi!");
        java.lang.String str13 = response9.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method14 = response9.method();
        java.util.Map map15 = response9.headers();
        java.lang.String str17 = response9.getHeaderCaseInsensitive("");
        java.lang.Class<?> wildcardClass18 = response9.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test12360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12360");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        boolean boolean4 = response0.hasHeader("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        org.jsoup.Connection.Response response10 = response0.removeCookie("hi!");
        java.lang.String str12 = response0.cookie("");
        java.lang.String str14 = response0.cookie("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12361");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method5 = response2.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response6 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
    }

    @Test
    public void test12362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12362");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str4 = response1.header("hi!");
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response8 = response1.removeCookie("");
        boolean boolean10 = response1.hasCookie("hi!");
        org.jsoup.Connection.Method method11 = response1.method();
        boolean boolean13 = response1.hasCookie("");
        org.jsoup.Connection.Method method14 = response1.method();
        java.lang.String str16 = response1.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12363");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        org.jsoup.Connection.Method method3 = response1.method();
        java.lang.String str5 = response1.cookie("hi!");
        boolean boolean7 = response1.hasCookie("hi!");
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "");
        boolean boolean12 = response1.hasHeader("hi!");
        java.lang.String str13 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str15 = response1.statusMessage();
        java.util.Map map16 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test12364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12364");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        boolean boolean9 = response0.hasCookie("hi!");
        java.lang.String str10 = response0.statusMessage();
        java.lang.String str11 = response0.contentType();
        org.jsoup.Connection.Response response14 = response0.cookie("hi!", "");
        org.jsoup.Connection.Method method15 = response0.method();
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response0.method(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test12365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12365");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.statusMessage();
        int int4 = response1.statusCode();
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.net.URL uRL8 = response1.url();
        boolean boolean10 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL12 = response1.url();
        org.jsoup.Connection.Response response14 = response1.removeHeader("hi!");
        java.util.Map.Entry entry16 = response1.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(entry16);
    }

    @Test
    public void test12366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12366");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        java.net.URL uRL4 = response1.url();
        java.util.Map map5 = response1.cookies();
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "hi!");
        java.util.Map.Entry entry10 = response1.scanHeaders("hi!");
        java.lang.String str11 = response1.contentType();
        java.lang.String str12 = response1.charset();
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12367");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response5.removeCookie("");
        java.lang.String str9 = response5.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response5.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12368");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry6 = response4.scanHeaders("");
        java.lang.String str8 = response4.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.lang.String str10 = response9.contentType();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.util.Map map12 = response9.headers();
        java.net.URL uRL13 = response9.url();
        java.lang.String str15 = response9.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response9.method(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12369");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map4 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map4);
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str9 = response8.charset();
        java.util.Map.Entry entry11 = response8.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response8.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(entry11);
    }

    @Test
    public void test12370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12370");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str6 = response0.contentType();
        java.lang.String str8 = response0.cookie("hi!");
        org.jsoup.Connection.Method method9 = response0.method();
        java.net.URL uRL10 = response0.url();
        boolean boolean12 = response0.hasHeader("hi!");
        java.lang.String str13 = response0.statusMessage();
        java.util.Map.Entry entry15 = response0.scanHeaders("hi!");
        java.lang.String str16 = response0.charset();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(entry15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12371");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.header("hi!", "");
        org.jsoup.Connection.Response response10 = response0.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str12 = response0.contentType();
        java.util.Map map13 = response0.cookies();
        java.lang.String str14 = response0.contentType();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12372");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response0.header("hi!");
        boolean boolean5 = response0.hasCookie("");
        java.util.Map map6 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test12373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12373");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map4 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map4);
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str12 = response0.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12374");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.cookie("");
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.Connection.Response response11 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method12 = response0.method();
        java.lang.String str14 = response0.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12375");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response1.removeCookie("");
        java.util.Map map8 = response1.headers();
        java.util.Map map9 = response1.cookies();
        java.lang.String str11 = response1.cookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12376");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.cookie("hi!", "hi!");
        java.net.URL uRL4 = response0.url();
        java.lang.String str5 = response0.contentType();
        boolean boolean7 = response0.hasHeader("hi!");
        java.lang.String str8 = response0.statusMessage();
        boolean boolean10 = response0.hasCookie("");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test12377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12377");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        java.lang.String str7 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response10 = response0.removeCookie("hi!");
        java.lang.String str11 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12378");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        java.lang.String str11 = response0.charset();
        java.lang.String str13 = response0.header("");
        java.net.URL uRL14 = response0.url();
        org.jsoup.Connection.Response response16 = response0.removeCookie("");
        java.util.Map map17 = response0.cookies();
        org.jsoup.Connection.Response response19 = response0.removeHeader("hi!");
        java.util.Map.Entry entry21 = response0.scanHeaders("");
        boolean boolean23 = response0.hasCookie("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(entry21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test12379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12379");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str12 = response10.cookie("");
        boolean boolean14 = response10.hasHeader("hi!");
        java.net.URL uRL15 = response10.url();
        java.lang.String str17 = response10.getHeaderCaseInsensitive("");
        java.net.URL uRL18 = response10.url();
        boolean boolean20 = response10.hasCookie("");
        java.util.Map map21 = response10.cookies();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str24 = response22.cookie("");
        java.lang.String str25 = response22.contentType();
        java.lang.String str27 = response22.header("hi!");
        java.util.Map map28 = response22.cookies();
        java.util.Map map29 = response22.cookies();
        java.util.Map map30 = response22.cookies();
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        java.util.Map map33 = response9.cookies();
        org.jsoup.Connection.Response response35 = response9.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document36 = response9.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(response35);
    }

    @Test
    public void test12380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12380");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        java.lang.String str10 = response0.getHeaderCaseInsensitive("");
        boolean boolean12 = response0.hasHeader("hi!");
        java.util.Map map13 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean16 = response0.hasHeader("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test12381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12381");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("");
        org.jsoup.Connection.Method method10 = response0.method();
        java.util.Map map11 = response0.cookies();
        org.jsoup.Connection.Response response14 = response0.cookie("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response17 = response15.removeCookie("");
        org.jsoup.Connection.Response response20 = response15.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response21);
        java.lang.String str24 = response22.header("hi!");
        org.jsoup.Connection.Response response26 = response22.removeHeader("hi!");
        org.jsoup.Connection.Response response28 = response22.removeCookie("");
        java.util.Map map29 = response22.headers();
        java.util.Map map30 = response22.cookies();
        java.util.Map map31 = response22.cookies();
        response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str36 = response0.getHeaderCaseInsensitive("hi!");
        java.util.Map.Entry entry38 = response0.scanHeaders("");
        java.util.Map map39 = response0.headers();
        java.lang.String str40 = response0.contentType();
        java.lang.String str42 = response0.cookie("");
        java.lang.String str43 = response0.statusMessage();
        java.util.Map.Entry entry45 = response0.scanHeaders("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(entry38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(entry45);
    }

    @Test
    public void test12382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12382");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.util.Map map3 = response0.headers();
        boolean boolean5 = response0.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response10 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str13 = response0.cookie("hi!");
        java.lang.String str15 = response0.header("hi!");
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12383");
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
        java.lang.String str18 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response21 = response19.removeCookie("hi!");
        java.lang.String str23 = response19.getHeaderCaseInsensitive("");
        java.util.Map.Entry entry25 = response19.scanHeaders("hi!");
        org.jsoup.Connection.Response response28 = response19.header("hi!", "hi!");
        java.lang.String str30 = response19.header("");
        java.lang.String str32 = response19.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document33 = response19.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(entry25);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test12384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12384");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.util.Map map3 = response0.headers();
        boolean boolean5 = response0.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response10 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str12 = response0.charset();
        java.util.Map map13 = response0.cookies();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test12385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12385");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        java.lang.String str6 = response0.header("hi!");
        int int7 = response0.statusCode();
        boolean boolean9 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response12.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test12386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12386");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasHeader("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response13 = response10.header("hi!", "");
        java.net.URL uRL14 = response10.url();
        java.util.Map.Entry entry16 = response10.scanHeaders("");
        java.lang.String str18 = response10.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document20 = response10.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(entry16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test12387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12387");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        int int3 = response0.statusCode();
        java.util.Map map4 = response0.cookies();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.lang.String str7 = response0.charset();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Response response10 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL12 = response11.url();
        java.net.URL uRL13 = response11.url();
        org.jsoup.Connection.Response response15 = response11.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response19 = response16.header("hi!", "hi!");
        java.util.Map map20 = response16.cookies();
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map20);
        java.lang.String str23 = response11.header("hi!");
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str26 = response24.cookie("");
        java.lang.String str27 = response24.statusMessage();
        java.lang.String str29 = response24.header("hi!");
        java.lang.String str30 = response24.contentType();
        org.jsoup.Connection.Response response33 = response24.cookie("hi!", "");
        int int34 = response24.statusCode();
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL36 = response35.url();
        java.lang.String str38 = response35.header("hi!");
        org.jsoup.helper.HttpConnection.Response response39 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL40 = response39.url();
        java.lang.String str42 = response39.header("hi!");
        java.util.Map map43 = response39.cookies();
        response35.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map43);
        int int45 = response35.statusCode();
        java.lang.String str46 = response35.charset();
        org.jsoup.Connection.Method method47 = response35.method();
        org.jsoup.Connection.Method method48 = response35.method();
        org.jsoup.helper.HttpConnection.Response response49 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str51 = response49.cookie("");
        boolean boolean53 = response49.hasHeader("hi!");
        java.net.URL uRL54 = response49.url();
        java.lang.String str56 = response49.getHeaderCaseInsensitive("");
        boolean boolean58 = response49.hasCookie("hi!");
        java.util.Map map59 = response49.cookies();
        response35.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map59);
        org.jsoup.helper.HttpConnection.Response response61 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str63 = response61.cookie("");
        java.lang.String str64 = response61.contentType();
        java.lang.String str66 = response61.getHeaderCaseInsensitive("hi!");
        java.lang.String str67 = response61.contentType();
        org.jsoup.Connection.Method method68 = response61.method();
        java.util.Map map69 = response61.cookies();
        response35.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map69);
        response24.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map69);
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map69);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map69);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(uRL36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(uRL40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(method47);
        org.junit.Assert.assertNull(method48);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(uRL54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNull(method68);
        org.junit.Assert.assertNotNull(map69);
    }

    @Test
    public void test12388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12388");
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
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL21 = response20.url();
        org.jsoup.Connection.Method method22 = response20.method();
        java.lang.String str24 = response20.cookie("hi!");
        boolean boolean26 = response20.hasCookie("hi!");
        org.jsoup.Connection.Response response29 = response20.cookie("hi!", "");
        boolean boolean31 = response20.hasHeader("hi!");
        java.lang.String str32 = response20.statusMessage();
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response20);
        java.lang.String str34 = response20.statusMessage();
        java.util.Map map35 = response20.headers();
        java.util.Map map36 = response20.cookies();
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL38 = response37.url();
        org.jsoup.Connection.Method method39 = response37.method();
        org.jsoup.Connection.Response response41 = response37.removeCookie("hi!");
        java.lang.String str43 = response37.getHeaderCaseInsensitive("");
        java.util.Map map44 = response37.cookies();
        java.util.Map map45 = response37.headers();
        java.util.Map map46 = response37.cookies();
        response20.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map46);
        java.util.Map map48 = response20.headers();
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map48);
        java.lang.String str51 = response13.getHeaderCaseInsensitive("");
        java.net.HttpURLConnection httpURLConnection52 = null;
        org.jsoup.helper.HttpConnection.Response response53 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL54 = response53.url();
        java.lang.String str55 = response53.statusMessage();
        int int56 = response53.statusCode();
        int int57 = response53.statusCode();
        int int58 = response53.statusCode();
        org.jsoup.Connection.Response response60 = response53.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response13.setupFromConnection(httpURLConnection52, response60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(uRL38);
        org.junit.Assert.assertNull(method39);
        org.junit.Assert.assertNotNull(response41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(uRL54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(response60);
    }

    @Test
    public void test12389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12389");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        org.jsoup.Connection.Response response6 = response0.removeHeader("hi!");
        java.lang.String str8 = response0.header("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12390");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str6 = response0.contentType();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method9 = response0.method();
        java.util.Map.Entry entry11 = response0.scanHeaders("hi!");
        boolean boolean13 = response0.hasCookie("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test12391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12391");
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
        java.lang.String str16 = response0.statusMessage();
        org.jsoup.Connection.Method method17 = response0.method();
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response0.method(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test12392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12392");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        boolean boolean7 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL10 = response0.url();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response11.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test12393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12393");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        int int4 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean7 = response5.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL9 = response8.url();
        java.lang.String str10 = response8.statusMessage();
        boolean boolean12 = response8.hasCookie("hi!");
        boolean boolean14 = response8.hasHeader("hi!");
        java.util.Map map15 = response8.cookies();
        int int16 = response8.statusCode();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.Connection.Method method19 = response17.method();
        java.util.Map map20 = response17.headers();
        java.net.URL uRL21 = response17.url();
        java.util.Map map22 = response17.cookies();
        java.util.Map map23 = response17.headers();
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        java.lang.String str26 = response5.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray27 = response5.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test12394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12394");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response8 = response5.header("hi!", "hi!");
        java.util.Map map9 = response5.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.util.Map map11 = response0.headers();
        org.jsoup.Connection.Response response13 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str16 = response14.cookie("");
        java.lang.String str17 = response14.contentType();
        java.lang.String str19 = response14.header("hi!");
        java.util.Map map20 = response14.cookies();
        java.util.Map map21 = response14.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        java.net.URL uRL23 = response0.url();
        boolean boolean25 = response0.hasHeader("hi!");
        java.lang.String str26 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry29 = response27.scanHeaders("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(entry29);
    }

    @Test
    public void test12395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12395");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str6 = response0.contentType();
        java.lang.String str7 = response0.charset();
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        org.jsoup.Connection.Response response12 = response0.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response0.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test12396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12396");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = response6.url();
        int int8 = response6.statusCode();
        org.jsoup.Connection.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response6.method(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test12397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12397");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response8 = response5.header("hi!", "hi!");
        java.util.Map map9 = response5.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        int int11 = response0.statusCode();
        java.lang.String str13 = response0.header("");
        java.util.Map.Entry entry15 = response0.scanHeaders("");
        java.util.Map.Entry entry17 = response0.scanHeaders("");
        java.lang.String str19 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response21 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response24 = response0.cookie("hi!", "");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(entry15);
        org.junit.Assert.assertNull(entry17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(response24);
    }

    @Test
    public void test12398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12398");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str4 = response0.getHeaderCaseInsensitive("hi!");
        boolean boolean6 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response7.contentType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12399");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.net.URL uRL8 = response0.url();
        boolean boolean10 = response0.hasCookie("");
        boolean boolean12 = response0.hasHeader("hi!");
        java.lang.String str13 = response0.contentType();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12400");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.cookie("hi!");
        java.util.Map.Entry entry10 = response0.scanHeaders("hi!");
        java.lang.String str12 = response0.cookie("");
        boolean boolean14 = response0.hasCookie("");
        java.lang.String str16 = response0.header("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12401");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("");
        org.jsoup.Connection.Method method10 = response0.method();
        java.util.Map map11 = response0.cookies();
        org.jsoup.Connection.Response response14 = response0.cookie("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response17 = response15.removeCookie("");
        org.jsoup.Connection.Response response20 = response15.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response21);
        java.lang.String str24 = response22.header("hi!");
        org.jsoup.Connection.Response response26 = response22.removeHeader("hi!");
        org.jsoup.Connection.Response response28 = response22.removeCookie("");
        java.util.Map map29 = response22.headers();
        java.util.Map map30 = response22.cookies();
        java.util.Map map31 = response22.cookies();
        response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str36 = response0.getHeaderCaseInsensitive("hi!");
        java.util.Map.Entry entry38 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response39 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL40 = response39.url();
        java.lang.String str41 = response39.statusMessage();
        int int42 = response39.statusCode();
        org.jsoup.Connection.Response response45 = response39.header("hi!", "hi!");
        java.net.URL uRL46 = response39.url();
        java.lang.String str48 = response39.header("hi!");
        java.lang.String str50 = response39.cookie("");
        org.jsoup.Connection.Response response52 = response39.removeHeader("hi!");
        java.lang.String str54 = response39.cookie("hi!");
        org.jsoup.Connection.Response response56 = response39.removeHeader("hi!");
        java.lang.String str57 = response39.contentType();
        java.util.Map map58 = response39.headers();
        org.jsoup.Connection.Response response60 = response39.removeHeader("hi!");
        java.util.Map map61 = response39.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map61);
        org.jsoup.Connection.Method method63 = response0.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(entry38);
        org.junit.Assert.assertNull(uRL40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(response45);
        org.junit.Assert.assertNull(uRL46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(response52);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(response56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(response60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNull(method63);
    }

    @Test
    public void test12402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12402");
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
        java.util.Map map46 = response0.headers();
        java.util.Map map47 = response0.headers();
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
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
    }

    @Test
    public void test12403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12403");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.cookies();
        boolean boolean10 = response0.hasHeader("hi!");
        java.lang.String str11 = response0.charset();
        java.lang.String str13 = response0.cookie("");
        java.util.Map.Entry entry15 = response0.scanHeaders("");
        java.lang.String str17 = response0.header("hi!");
        java.lang.String str18 = response0.contentType();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(entry15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test12404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12404");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        org.jsoup.Connection.Method method3 = response1.method();
        java.lang.String str5 = response1.cookie("hi!");
        boolean boolean7 = response1.hasCookie("hi!");
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "");
        boolean boolean12 = response1.hasHeader("hi!");
        java.lang.String str13 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str15 = response1.statusMessage();
        java.util.Map map16 = response1.headers();
        java.util.Map map17 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL19 = response18.url();
        org.jsoup.Connection.Method method20 = response18.method();
        org.jsoup.Connection.Response response22 = response18.removeCookie("hi!");
        java.lang.String str24 = response18.getHeaderCaseInsensitive("");
        java.util.Map map25 = response18.cookies();
        java.util.Map map26 = response18.headers();
        java.util.Map map27 = response18.cookies();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map27);
        java.net.URL uRL29 = response1.url();
        java.lang.String str30 = response1.charset();
        boolean boolean32 = response1.hasHeader("hi!");
        java.lang.String str34 = response1.header("");
        java.util.Map.Entry entry36 = response1.scanHeaders("hi!");
        java.net.URL uRL37 = response1.url();
        java.lang.String str38 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response39 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(uRL29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(entry36);
        org.junit.Assert.assertNull(uRL37);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test12405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12405");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        java.net.URL uRL3 = response0.url();
        java.net.URL uRL4 = response0.url();
        org.jsoup.Connection.Method method5 = response0.method();
        boolean boolean7 = response0.hasHeader("hi!");
        java.lang.String str8 = response0.charset();
        org.jsoup.Connection.Response response10 = response0.removeCookie("");
        java.lang.String str11 = response0.statusMessage();
        java.lang.String str12 = response0.contentType();
        boolean boolean14 = response0.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL16 = response15.url();
        java.lang.String str17 = response15.statusMessage();
        int int18 = response15.statusCode();
        org.jsoup.Connection.Response response21 = response15.header("hi!", "hi!");
        java.net.URL uRL22 = response15.url();
        java.util.Map.Entry entry24 = response15.scanHeaders("hi!");
        java.lang.String str25 = response15.charset();
        boolean boolean27 = response15.hasCookie("");
        boolean boolean29 = response15.hasCookie("");
        java.util.Map.Entry entry31 = response15.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL33 = response32.url();
        java.lang.String str34 = response32.statusMessage();
        java.util.Map map35 = response32.cookies();
        java.lang.String str37 = response32.header("hi!");
        java.lang.String str39 = response32.getHeaderCaseInsensitive("hi!");
        java.lang.String str40 = response32.contentType();
        java.util.Map map41 = response32.cookies();
        org.jsoup.helper.HttpConnection.Response response42 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL43 = response42.url();
        org.jsoup.Connection.Method method44 = response42.method();
        java.lang.String str46 = response42.cookie("hi!");
        boolean boolean48 = response42.hasCookie("hi!");
        org.jsoup.Connection.Response response51 = response42.cookie("hi!", "");
        boolean boolean53 = response42.hasHeader("hi!");
        java.lang.String str54 = response42.statusMessage();
        org.jsoup.helper.HttpConnection.Response response55 = new org.jsoup.helper.HttpConnection.Response(response42);
        java.lang.String str56 = response42.statusMessage();
        java.util.Map map57 = response42.headers();
        java.util.Map map58 = response42.cookies();
        org.jsoup.helper.HttpConnection.Response response59 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL60 = response59.url();
        java.lang.String str61 = response59.statusMessage();
        int int62 = response59.statusCode();
        org.jsoup.Connection.Response response65 = response59.header("hi!", "hi!");
        java.util.Map map66 = response59.cookies();
        response42.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map66);
        int int68 = response42.statusCode();
        org.jsoup.helper.HttpConnection.Response response69 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response70 = new org.jsoup.helper.HttpConnection.Response(response69);
        org.jsoup.Connection.Method method71 = response69.method();
        java.util.Map map72 = response69.headers();
        response42.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map72);
        response32.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map72);
        java.util.Map map75 = response32.cookies();
        response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map75);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map75);
        java.lang.String str79 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response80 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL81 = response80.url();
        org.jsoup.Connection.Method method82 = response80.method();
        java.lang.String str83 = response80.contentType();
        org.jsoup.Connection.Response response86 = response80.cookie("hi!", "");
        java.lang.String str87 = response80.charset();
        int int88 = response80.statusCode();
        java.lang.String str89 = response80.charset();
        org.jsoup.helper.HttpConnection.Response response90 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str92 = response90.cookie("");
        java.lang.String str93 = response90.contentType();
        java.lang.String str95 = response90.header("hi!");
        org.jsoup.Connection.Method method96 = response90.method();
        java.util.Map map97 = response90.cookies();
        response80.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map97);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map97);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNotNull(entry24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(entry31);
        org.junit.Assert.assertNull(uRL33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(uRL43);
        org.junit.Assert.assertNull(method44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(response51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(uRL60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(response65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNull(method71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNull(uRL81);
        org.junit.Assert.assertNull(method82);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNotNull(response86);
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertNull(str92);
        org.junit.Assert.assertNull(str93);
        org.junit.Assert.assertNull(str95);
        org.junit.Assert.assertNull(method96);
        org.junit.Assert.assertNotNull(map97);
    }

    @Test
    public void test12406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12406");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.util.Map map8 = response0.cookies();
        org.jsoup.Connection.Response response11 = response0.header("hi!", "hi!");
        java.lang.String str13 = response0.header("");
        java.util.Map map14 = response0.cookies();
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response0.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test12407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12407");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("hi!");
        int int8 = response0.statusCode();
        boolean boolean10 = response0.hasCookie("");
        java.lang.String str12 = response0.cookie("");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry15 = response13.scanHeaders("");
        org.jsoup.Connection.Response response18 = response13.cookie("hi!", "hi!");
        java.util.Map map19 = response13.cookies();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.net.URL uRL21 = response20.url();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(entry15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(uRL21);
    }

    @Test
    public void test12408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12408");
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
        boolean boolean15 = response0.hasHeader("hi!");
        boolean boolean17 = response0.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response0.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test12409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12409");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.cookies();
        boolean boolean10 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response13 = response0.cookie("hi!", "");
        org.jsoup.Connection.Response response15 = response0.removeHeader("hi!");
        java.lang.Class<?> wildcardClass16 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test12410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12410");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response0.url();
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        java.util.Map map6 = response0.headers();
        int int7 = response0.statusCode();
        boolean boolean9 = response0.hasCookie("hi!");
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test12411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12411");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response0.hasCookie("hi!");
        java.util.Map.Entry entry10 = response0.scanHeaders("hi!");
        int int11 = response0.statusCode();
        java.lang.String str12 = response0.contentType();
        java.util.Map map13 = response0.cookies();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test12412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12412");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        boolean boolean7 = response0.hasCookie("hi!");
        java.lang.String str9 = response0.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        boolean boolean13 = response11.hasHeader("hi!");
        org.jsoup.Connection.Response response15 = response11.removeCookie("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test12413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12413");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        java.util.Map map8 = response0.cookies();
        java.lang.String str9 = response0.statusMessage();
        java.net.URL uRL10 = response0.url();
        boolean boolean12 = response0.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test12414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12414");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        org.jsoup.Connection.Method method3 = response1.method();
        java.lang.String str5 = response1.cookie("hi!");
        boolean boolean7 = response1.hasCookie("hi!");
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "");
        boolean boolean12 = response1.hasHeader("hi!");
        java.lang.String str13 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str15 = response1.statusMessage();
        java.util.Map map16 = response1.headers();
        java.util.Map map17 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL19 = response18.url();
        org.jsoup.Connection.Method method20 = response18.method();
        org.jsoup.Connection.Response response22 = response18.removeCookie("hi!");
        java.lang.String str24 = response18.getHeaderCaseInsensitive("");
        java.util.Map map25 = response18.cookies();
        java.util.Map map26 = response18.headers();
        java.util.Map map27 = response18.cookies();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map27);
        java.util.Map map29 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map map31 = response1.cookies();
        org.jsoup.Connection.Response response33 = response1.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response34 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(response33);
    }

    @Test
    public void test12415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12415");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response9 = response0.cookie("hi!", "");
        boolean boolean11 = response0.hasHeader("hi!");
        java.lang.String str12 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str15 = response0.getHeaderCaseInsensitive("");
        java.lang.String str16 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response0.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12416");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("");
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "");
        java.lang.String str12 = response0.contentType();
        java.lang.String str14 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str17 = response15.cookie("");
        java.lang.String str18 = response15.contentType();
        java.lang.String str20 = response15.header("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.util.Map map22 = response15.headers();
        java.util.Map map23 = response15.cookies();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL25 = response24.url();
        java.lang.String str27 = response24.header("hi!");
        org.jsoup.Connection.Response response29 = response24.removeCookie("hi!");
        java.util.Map.Entry entry31 = response24.scanHeaders("hi!");
        int int32 = response24.statusCode();
        boolean boolean34 = response24.hasCookie("");
        java.lang.String str36 = response24.cookie("");
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response(response24);
        java.util.Map map38 = response24.cookies();
        response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map38);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map38);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray41 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNull(entry31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(map38);
    }

    @Test
    public void test12417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12417");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        java.util.Map map4 = response0.cookies();
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str7 = response0.cookie("");
        java.lang.String str9 = response0.header("");
        java.lang.String str11 = response0.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12418");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map map7 = response0.cookies();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        int int10 = response0.statusCode();
        java.lang.String str11 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str13 = response12.contentType();
        java.util.Map map14 = response12.headers();
        org.jsoup.Connection.Response response16 = response12.removeCookie("");
        java.util.Map map17 = response12.headers();
        org.jsoup.Connection.Response response20 = response12.cookie("hi!", "hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test12419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12419");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        int int7 = response0.statusCode();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "hi!");
        java.lang.String str13 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response17 = response14.header("hi!", "");
        java.lang.String str18 = response14.statusMessage();
        boolean boolean20 = response14.hasCookie("");
        java.lang.String str21 = response14.charset();
        java.lang.String str22 = response14.contentType();
        java.lang.String str24 = response14.cookie("");
        java.lang.String str25 = response14.charset();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test12420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12420");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        java.util.Map.Entry entry8 = response0.scanHeaders("hi!");
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str11 = response0.cookie("");
        boolean boolean13 = response0.hasCookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(entry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test12421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12421");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int7 = response6.statusCode();
        java.lang.String str9 = response6.cookie("");
        org.jsoup.Connection.Response response12 = response6.cookie("hi!", "");
        boolean boolean14 = response6.hasCookie("hi!");
        java.lang.String str15 = response6.charset();
        org.jsoup.Connection.Response response18 = response6.header("hi!", "");
        java.lang.String str19 = response6.contentType();
        java.lang.String str21 = response6.getHeaderCaseInsensitive("");
        int int22 = response6.statusCode();
        int int23 = response6.statusCode();
        java.net.URL uRL24 = response6.url();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(uRL24);
    }

    @Test
    public void test12422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12422");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str4 = response1.header("hi!");
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response8 = response1.removeCookie("");
        boolean boolean10 = response1.hasCookie("hi!");
        java.lang.String str12 = response1.cookie("hi!");
        org.jsoup.Connection.Response response14 = response1.removeCookie("");
        java.util.Map.Entry entry16 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str19 = response17.header("hi!");
        org.jsoup.Connection.Method method20 = response17.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response21 = org.jsoup.helper.HttpConnection.Response.execute(request0, response17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(entry16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(method20);
    }

    @Test
    public void test12423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12423");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method4 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
    }

    @Test
    public void test12424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12424");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response10 = response0.removeCookie("hi!");
        org.jsoup.Connection.Method method11 = response0.method();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test12425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12425");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method3 = response1.method();
        org.jsoup.Connection.Method method4 = response1.method();
        boolean boolean6 = response1.hasCookie("hi!");
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.contentType();
        boolean boolean10 = response1.hasCookie("hi!");
        boolean boolean12 = response1.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test12426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12426");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        java.lang.String str6 = response0.cookie("");
        org.jsoup.Connection.Method method7 = response0.method();
        java.lang.String str8 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12427");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.lang.String str9 = response0.cookie("");
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
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map34);
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str38 = response0.contentType();
        java.util.Map map39 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response40 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response42 = response40.removeCookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
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
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(response42);
    }

    @Test
    public void test12428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12428");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map map5 = response0.headers();
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        java.lang.String str8 = response0.contentType();
        org.jsoup.Connection.Method method9 = response0.method();
        java.lang.String str10 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean13 = response11.hasCookie("");
        java.lang.String str14 = response11.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12429");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.lang.String str8 = response0.header("");
        org.jsoup.Connection.Response response10 = response0.removeHeader("hi!");
        java.lang.String str12 = response0.cookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12430");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.headers();
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str10 = response0.statusMessage();
        java.util.Map map11 = response0.headers();
        java.lang.String str12 = response0.contentType();
        java.util.Map map13 = response0.headers();
        java.lang.String str14 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12431");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.cookie("hi!", "");
        java.util.Map map6 = response0.cookies();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL10 = response9.url();
        org.jsoup.Connection.Method method11 = response9.method();
        java.lang.String str13 = response9.cookie("hi!");
        boolean boolean15 = response9.hasCookie("hi!");
        org.jsoup.Connection.Response response18 = response9.cookie("hi!", "");
        boolean boolean20 = response9.hasHeader("hi!");
        java.lang.String str21 = response9.statusMessage();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str23 = response9.statusMessage();
        java.util.Map map24 = response9.headers();
        java.util.Map map25 = response9.cookies();
        org.jsoup.Connection.Response response27 = response9.removeHeader("hi!");
        java.lang.String str29 = response9.getHeaderCaseInsensitive("hi!");
        java.util.Map map30 = response9.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str33 = response0.contentType();
        java.lang.String str34 = response0.statusMessage();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test12432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12432");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        java.util.Map map4 = response0.cookies();
        java.lang.String str5 = response0.statusMessage();
        boolean boolean7 = response0.hasCookie("hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method11 = response10.method();
        java.lang.String str13 = response10.getHeaderCaseInsensitive("");
        java.util.Map.Entry entry15 = response10.scanHeaders("hi!");
        boolean boolean17 = response10.hasHeader("hi!");
        java.lang.String str19 = response10.cookie("");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(entry9);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(entry15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test12433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12433");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        boolean boolean7 = response0.hasCookie("hi!");
        java.lang.String str9 = response0.getHeaderCaseInsensitive("");
        java.util.Map.Entry entry11 = response0.scanHeaders("hi!");
        org.jsoup.Connection.Response response14 = response0.cookie("hi!", "");
        java.net.URL uRL15 = response0.url();
        org.jsoup.Connection.Response response17 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response20 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.jsoup.Connection.Method method23 = response21.method();
        java.lang.String str24 = response21.statusMessage();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.jsoup.Connection.Response response28 = response25.cookie("hi!", "");
        java.lang.String str29 = response25.contentType();
        int int30 = response25.statusCode();
        org.jsoup.Connection.Response response32 = response25.removeHeader("hi!");
        java.util.Map map33 = response25.cookies();
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map33);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test12434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12434");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.header("hi!");
        int int4 = response0.statusCode();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test12435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12435");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        org.jsoup.Connection.Method method4 = response0.method();
        int int5 = response0.statusCode();
        int int6 = response0.statusCode();
        org.jsoup.Connection.Method method7 = response0.method();
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        java.util.Map map10 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(entry9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test12436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12436");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        java.lang.String str7 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str9 = response8.statusMessage();
        java.net.URL uRL10 = response8.url();
        java.lang.String str12 = response8.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12437");
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
        java.util.Map map16 = response11.cookies();
        org.jsoup.Connection.Response response19 = response11.cookie("hi!", "hi!");
        java.lang.String str20 = response11.statusMessage();
        org.jsoup.Connection.Response response22 = response11.removeCookie("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test12438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12438");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.cookie("hi!", "hi!");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.cookie("");
        java.util.Map map7 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test12439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12439");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("");
        org.jsoup.Connection.Method method10 = response0.method();
        java.util.Map map11 = response0.cookies();
        org.jsoup.Connection.Response response14 = response0.cookie("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response17 = response15.removeCookie("");
        org.jsoup.Connection.Response response20 = response15.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response21);
        java.lang.String str24 = response22.header("hi!");
        org.jsoup.Connection.Response response26 = response22.removeHeader("hi!");
        org.jsoup.Connection.Response response28 = response22.removeCookie("");
        java.util.Map map29 = response22.headers();
        java.util.Map map30 = response22.cookies();
        java.util.Map map31 = response22.cookies();
        response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str36 = response34.cookie("hi!");
        java.lang.String str37 = response34.charset();
        java.lang.String str39 = response34.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = response34.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test12440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12440");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.cookie("hi!");
        org.jsoup.Connection.Response response9 = response0.removeHeader("hi!");
        boolean boolean11 = response0.hasHeader("hi!");
        java.lang.String str13 = response0.getHeaderCaseInsensitive("");
        java.lang.String str15 = response0.cookie("");
        java.net.URL uRL16 = response0.url();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str19 = response17.cookie("");
        java.lang.String str20 = response17.contentType();
        java.lang.String str22 = response17.header("hi!");
        boolean boolean24 = response17.hasCookie("hi!");
        java.lang.String str26 = response17.getHeaderCaseInsensitive("");
        java.lang.String str27 = response17.statusMessage();
        java.net.URL uRL28 = response17.url();
        org.jsoup.Connection.Response response31 = response17.header("hi!", "");
        java.net.URL uRL32 = response17.url();
        java.lang.String str33 = response17.statusMessage();
        java.util.Map map34 = response17.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map34);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(uRL28);
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertNull(uRL32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test12441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12441");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.header("");
        int int8 = response0.statusCode();
        org.jsoup.Connection.Response response10 = response0.removeCookie("hi!");
        boolean boolean12 = response0.hasCookie("hi!");
        java.lang.String str14 = response0.getHeaderCaseInsensitive("hi!");
        java.util.Map map15 = response0.cookies();
        java.lang.String str16 = response0.charset();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12442");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean6 = response0.hasHeader("hi!");
        java.lang.String str7 = response0.charset();
        org.jsoup.Connection.Method method8 = response0.method();
        java.lang.String str10 = response0.cookie("");
        java.lang.String str12 = response0.cookie("hi!");
        java.net.URL uRL13 = response0.url();
        org.jsoup.Connection.Method method14 = response0.method();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test12443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12443");
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
        org.jsoup.Connection.Response response15 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response18 = response1.cookie("hi!", "");
        int int19 = response1.statusCode();
        boolean boolean21 = response1.hasCookie("");
        org.jsoup.Connection.Response response24 = response1.header("hi!", "hi!");
        java.lang.String str25 = response1.contentType();
        java.util.Map.Entry entry27 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(entry27);
    }

    @Test
    public void test12444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12444");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("hi!");
        int int8 = response0.statusCode();
        boolean boolean10 = response0.hasCookie("");
        java.lang.String str12 = response0.cookie("");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean15 = response0.hasCookie("hi!");
        java.lang.String str17 = response0.cookie("");
        java.lang.String str19 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str21 = response0.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test12445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12445");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        java.net.URL uRL3 = response0.url();
        java.net.URL uRL4 = response0.url();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method7 = response0.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str10 = response8.cookie("");
        java.lang.String str11 = response8.contentType();
        java.lang.String str13 = response8.header("hi!");
        java.util.Map map14 = response8.cookies();
        java.net.URL uRL15 = response8.url();
        java.net.URL uRL16 = response8.url();
        org.jsoup.Connection.Method method17 = response8.method();
        java.util.Map map18 = response8.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        java.lang.String str21 = response0.header("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document22 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test12446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12446");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.charset();
        java.lang.String str5 = response0.header("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response11 = response8.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL13 = response12.url();
        org.jsoup.Connection.Method method14 = response12.method();
        java.lang.String str16 = response12.cookie("hi!");
        boolean boolean18 = response12.hasCookie("hi!");
        org.jsoup.Connection.Response response21 = response12.cookie("hi!", "");
        boolean boolean23 = response12.hasHeader("hi!");
        java.lang.String str24 = response12.statusMessage();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str26 = response12.statusMessage();
        java.util.Map map27 = response12.headers();
        java.lang.String str28 = response12.statusMessage();
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map30 = response29.headers();
        response12.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str35 = response8.cookie("hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test12447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12447");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Response response6 = response0.cookie("hi!", "");
        java.lang.String str7 = response0.statusMessage();
        int int8 = response0.statusCode();
        java.lang.String str9 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12448");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response0.statusMessage();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12449");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.util.Map map8 = response0.headers();
        java.lang.String str10 = response0.cookie("hi!");
        java.util.Map.Entry entry12 = response0.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(entry12);
    }

    @Test
    public void test12450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12450");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.util.Map map7 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry10 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL12 = response11.url();
        org.jsoup.Connection.Method method13 = response11.method();
        java.lang.String str15 = response11.cookie("hi!");
        boolean boolean17 = response11.hasCookie("hi!");
        org.jsoup.Connection.Response response20 = response11.cookie("hi!", "");
        boolean boolean22 = response11.hasHeader("hi!");
        java.lang.String str23 = response11.statusMessage();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.lang.String str25 = response11.statusMessage();
        java.util.Map map26 = response11.headers();
        java.util.Map map27 = response11.cookies();
        org.jsoup.Connection.Response response29 = response11.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.Connection.Response response33 = response11.header("hi!", "hi!");
        java.util.Map map34 = response11.headers();
        java.util.Map map35 = response11.cookies();
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
    }

    @Test
    public void test12451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12451");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.lang.String str9 = response0.cookie("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map11 = response0.headers();
        java.lang.String str13 = response0.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test12452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12452");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.cookies();
        boolean boolean10 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response13 = response0.cookie("hi!", "");
        java.util.Map map14 = response0.headers();
        java.lang.String str15 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12453");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.cookie("hi!");
        org.jsoup.Connection.Response response13 = response0.header("hi!", "");
        java.net.URL uRL14 = response0.url();
        java.util.Map.Entry entry16 = response0.scanHeaders("");
        java.lang.String str17 = response0.charset();
        java.lang.String str19 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL21 = response20.url();
        java.lang.String str22 = response20.statusMessage();
        java.util.Map map23 = response20.cookies();
        java.lang.String str25 = response20.header("hi!");
        java.lang.String str27 = response20.getHeaderCaseInsensitive("hi!");
        java.lang.String str28 = response20.charset();
        java.lang.String str29 = response20.charset();
        boolean boolean31 = response20.hasHeader("hi!");
        org.jsoup.Connection.Response response33 = response20.removeCookie("hi!");
        org.jsoup.Connection.Response response35 = response20.removeHeader("hi!");
        org.jsoup.Connection.Method method36 = response20.method();
        java.util.Map map37 = response20.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map37);
        java.lang.String str39 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(entry16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertNotNull(response35);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test12454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12454");
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
        org.jsoup.Connection.Response response15 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response18 = response1.cookie("hi!", "");
        int int19 = response1.statusCode();
        boolean boolean21 = response1.hasCookie("");
        org.jsoup.Connection.Method method22 = response1.method();
        boolean boolean24 = response1.hasCookie("hi!");
        java.lang.String str25 = response1.statusMessage();
        org.jsoup.Connection.Method method26 = response1.method();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(method26);
    }

    @Test
    public void test12455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12455");
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
        org.jsoup.Connection.Response response15 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response18 = response1.cookie("hi!", "");
        int int19 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL21 = response20.url();
        java.lang.String str23 = response20.header("hi!");
        org.jsoup.Connection.Response response25 = response20.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response26);
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response26);
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL30 = response29.url();
        org.jsoup.Connection.Method method31 = response29.method();
        org.jsoup.Connection.Response response34 = response29.header("hi!", "");
        boolean boolean36 = response29.hasCookie("hi!");
        java.lang.String str37 = response29.contentType();
        org.jsoup.Connection.Method method38 = response29.method();
        java.util.Map map39 = response29.cookies();
        response28.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map39);
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map39);
        java.net.URL uRL42 = response1.url();
        org.jsoup.helper.HttpConnection.Response response43 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response44 = new org.jsoup.helper.HttpConnection.Response(response43);
        java.lang.String str46 = response44.header("hi!");
        org.jsoup.Connection.Response response48 = response44.removeHeader("hi!");
        org.jsoup.Connection.Response response50 = response44.removeCookie("");
        java.util.Map map51 = response44.headers();
        java.util.Map map52 = response44.cookies();
        java.util.Map map53 = response44.cookies();
        java.lang.String str55 = response44.cookie("");
        java.lang.String str56 = response44.charset();
        java.util.Map map57 = response44.cookies();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map57);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNull(uRL30);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(method38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(uRL42);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(response48);
        org.junit.Assert.assertNotNull(response50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(map57);
    }

    @Test
    public void test12456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12456");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.cookie("hi!");
        java.util.Map.Entry entry10 = response0.scanHeaders("hi!");
        org.jsoup.Connection.Response response12 = response0.removeHeader("hi!");
        java.util.Map map13 = response0.headers();
        org.jsoup.Connection.Method method14 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test12457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12457");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("");
        org.jsoup.Connection.Method method10 = response0.method();
        java.lang.String str11 = response0.statusMessage();
        java.lang.String str13 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str14 = response0.charset();
        java.lang.String str16 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str17 = response0.contentType();
        java.net.URL uRL18 = response0.url();
        boolean boolean20 = response0.hasCookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test12458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12458");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.util.Map.Entry entry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str9 = response8.statusMessage();
        java.util.Map.Entry entry11 = response8.scanHeaders("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(entry11);
    }

    @Test
    public void test12459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12459");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response8 = response5.header("hi!", "hi!");
        java.util.Map map9 = response5.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.util.Map map11 = response0.headers();
        org.jsoup.Connection.Response response13 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL15 = response14.url();
        java.lang.String str16 = response14.statusMessage();
        java.util.Map map17 = response14.cookies();
        org.jsoup.Connection.Response response19 = response14.removeHeader("hi!");
        java.util.Map.Entry entry21 = response14.scanHeaders("");
        java.util.Map.Entry entry23 = response14.scanHeaders("");
        java.util.Map.Entry entry25 = response14.scanHeaders("");
        java.util.Map map26 = response14.cookies();
        org.jsoup.Connection.Response response28 = response14.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str31 = response29.cookie("");
        boolean boolean33 = response29.hasHeader("hi!");
        java.net.URL uRL34 = response29.url();
        java.lang.String str36 = response29.getHeaderCaseInsensitive("");
        java.net.URL uRL37 = response29.url();
        boolean boolean39 = response29.hasCookie("");
        java.util.Map map40 = response29.cookies();
        response14.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map40);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map40);
        boolean boolean44 = response0.hasHeader("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(entry21);
        org.junit.Assert.assertNull(entry23);
        org.junit.Assert.assertNull(entry25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(uRL34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(uRL37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test12460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12460");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.header("hi!", "");
        boolean boolean9 = response0.hasCookie("");
        org.jsoup.Connection.Response response11 = response0.removeCookie("hi!");
        java.lang.String str13 = response0.header("hi!");
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response0.method(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test12461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12461");
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
        java.lang.String str17 = response11.getHeaderCaseInsensitive("hi!");
        int int18 = response11.statusCode();
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response11.url(uRL19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test12462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12462");
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
        java.lang.String str16 = response15.charset();
        org.jsoup.Connection.Response response18 = response15.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.Connection.Method method20 = response19.method();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(method20);
    }

    @Test
    public void test12463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12463");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map6 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        boolean boolean9 = response0.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test12464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12464");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.cookie("hi!");
        org.jsoup.Connection.Response response13 = response0.cookie("hi!", "hi!");
        java.lang.String str15 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL17 = response16.url();
        org.jsoup.Connection.Method method18 = response16.method();
        org.jsoup.Connection.Response response21 = response16.header("hi!", "");
        java.util.Map map22 = response16.headers();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response16);
        int int24 = response16.statusCode();
        java.util.Map map25 = response16.headers();
        java.util.Map map26 = response16.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        org.jsoup.Connection.Response response29 = response0.removeCookie("");
        java.lang.String str31 = response0.getHeaderCaseInsensitive("");
        int int32 = response0.statusCode();
        java.lang.String str34 = response0.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test12465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12465");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("hi!");
        int int8 = response0.statusCode();
        java.lang.String str9 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12466");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response9 = response0.cookie("hi!", "");
        boolean boolean11 = response0.hasHeader("hi!");
        java.lang.String str12 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str15 = response0.header("");
        int int16 = response0.statusCode();
        java.util.Map map17 = response0.headers();
        java.util.Map.Entry entry19 = response0.scanHeaders("hi!");
        java.util.Map.Entry entry21 = response0.scanHeaders("");
        boolean boolean23 = response0.hasHeader("hi!");
        boolean boolean25 = response0.hasCookie("");
        java.net.URL uRL26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response27 = response0.url(uRL26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(entry19);
        org.junit.Assert.assertNull(entry21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test12467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12467");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response6.getHeaderCaseInsensitive("hi!");
        java.lang.String str9 = response6.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        boolean boolean12 = response6.hasCookie("hi!");
        java.lang.String str13 = response6.contentType();
        java.util.Map map14 = response6.headers();
        java.lang.String str15 = response6.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response6.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12468");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response9 = response0.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test12469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12469");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response10 = response8.removeHeader("hi!");
        java.lang.String str11 = response8.charset();
        int int12 = response8.statusCode();
        java.util.Map map13 = response8.cookies();
        java.util.Map.Entry entry15 = response8.scanHeaders("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(entry15);
    }

    @Test
    public void test12470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12470");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        int int4 = response0.statusCode();
        java.util.Map map5 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response0.url(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test12471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12471");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = response0.url();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response11 = response8.header("hi!", "hi!");
        java.util.Map map12 = response8.cookies();
        org.jsoup.Connection.Response response15 = response8.header("hi!", "hi!");
        java.util.Map map16 = response8.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map16);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document18 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test12472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12472");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.util.Map map8 = response0.cookies();
        org.jsoup.Connection.Method method9 = response0.method();
        java.net.URL uRL10 = response0.url();
        java.util.Map map11 = response0.headers();
        java.lang.String str13 = response0.cookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12473");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.util.Map map3 = response0.headers();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.header("");
        boolean boolean12 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response14 = response0.removeCookie("");
        java.lang.String str15 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document16 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12474");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        boolean boolean4 = response0.hasHeader("hi!");
        java.net.URL uRL5 = response0.url();
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL11 = response10.url();
        org.jsoup.Connection.Method method12 = response10.method();
        org.jsoup.Connection.Response response15 = response10.header("hi!", "");
        java.util.Map map16 = response10.headers();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.lang.String str18 = response17.statusMessage();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL20 = response19.url();
        java.net.URL uRL21 = response19.url();
        org.jsoup.Connection.Response response23 = response19.removeCookie("");
        java.lang.String str25 = response19.cookie("hi!");
        java.util.Map map26 = response19.cookies();
        response17.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        java.lang.String str29 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL31 = response30.url();
        org.jsoup.Connection.Method method32 = response30.method();
        org.jsoup.Connection.Response response35 = response30.header("hi!", "");
        java.lang.String str37 = response30.getHeaderCaseInsensitive("");
        java.lang.String str39 = response30.cookie("");
        org.jsoup.Connection.Response response41 = response30.removeCookie("");
        java.util.Map map42 = response30.cookies();
        java.lang.String str44 = response30.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response45 = new org.jsoup.helper.HttpConnection.Response(response30);
        java.lang.String str46 = response45.statusMessage();
        java.util.Map map47 = response45.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map47);
        java.util.Map map49 = response0.cookies();
        org.jsoup.Connection.Method method50 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response51 = response0.method(method50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(uRL31);
        org.junit.Assert.assertNull(method32);
        org.junit.Assert.assertNotNull(response35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(response41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map49);
    }

    @Test
    public void test12475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12475");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response0.url();
        java.lang.String str4 = response0.cookie("");
        java.util.Map.Entry entry6 = response0.scanHeaders("hi!");
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        java.lang.String str10 = response0.cookie("hi!");
        java.lang.String str11 = response0.contentType();
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12476");
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
        java.util.Map map14 = response0.cookies();
        org.jsoup.Connection.Response response16 = response0.removeCookie("hi!");
        org.jsoup.Connection.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response0.method(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test12477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12477");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response9 = response0.cookie("hi!", "");
        java.lang.String str11 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map13 = response0.headers();
        org.jsoup.Connection.Response response16 = response0.header("hi!", "hi!");
        org.jsoup.Connection.Response response18 = response0.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test12478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12478");
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
        java.util.Map map28 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map30 = response0.cookies();
        org.jsoup.Connection.Response response32 = response0.removeCookie("hi!");
        java.net.URL uRL33 = response0.url();
        org.jsoup.Connection.Method method34 = response0.method();
        java.util.Map map35 = response0.cookies();
        java.util.Map map36 = response0.headers();
        java.lang.String str38 = response0.getHeaderCaseInsensitive("");
        boolean boolean40 = response0.hasCookie("hi!");
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
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNull(uRL33);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test12479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12479");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.header("hi!");
        org.jsoup.Connection.Response response8 = response0.removeCookie("hi!");
        boolean boolean10 = response0.hasHeader("hi!");
        org.jsoup.Connection.Method method11 = response0.method();
        java.net.URL uRL12 = response0.url();
        java.util.Map.Entry entry14 = response0.scanHeaders("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(entry14);
    }

    @Test
    public void test12480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12480");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str6 = response0.contentType();
        java.lang.String str7 = response0.contentType();
        boolean boolean9 = response0.hasCookie("hi!");
        boolean boolean11 = response0.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL13 = response12.url();
        org.jsoup.Connection.Method method14 = response12.method();
        java.lang.String str15 = response12.contentType();
        org.jsoup.Connection.Method method16 = response12.method();
        java.util.Map map17 = response12.headers();
        org.jsoup.Connection.Response response19 = response12.removeHeader("hi!");
        java.lang.String str20 = response12.contentType();
        java.lang.String str21 = response12.charset();
        java.util.Map map22 = response12.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        java.lang.String str24 = response0.contentType();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test12481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12481");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response7.statusMessage();
        java.lang.String str10 = response7.getHeaderCaseInsensitive("hi!");
        int int11 = response7.statusCode();
        org.jsoup.Connection.Method method12 = response7.method();
        java.lang.String str14 = response7.cookie("hi!");
        java.lang.String str16 = response7.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12482");
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
        java.util.Map map28 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map30 = response0.cookies();
        org.jsoup.Connection.Response response32 = response0.removeCookie("hi!");
        java.net.HttpURLConnection httpURLConnection33 = null;
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response37 = response34.header("hi!", "hi!");
        boolean boolean39 = response34.hasCookie("hi!");
        java.util.Map map40 = response34.headers();
        java.util.Map map41 = response34.cookies();
        boolean boolean43 = response34.hasCookie("");
        org.jsoup.Connection.Response response45 = response34.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection33, (org.jsoup.Connection.Response) response34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNotNull(response37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(response45);
    }

    @Test
    public void test12483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12483");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response8 = response5.header("hi!", "hi!");
        java.util.Map map9 = response5.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        int int11 = response0.statusCode();
        java.lang.String str13 = response0.header("");
        java.util.Map.Entry entry15 = response0.scanHeaders("");
        org.jsoup.Connection.Response response17 = response0.removeHeader("hi!");
        java.lang.String str18 = response0.charset();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(entry15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test12484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12484");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        int int7 = response0.statusCode();
        java.lang.String str8 = response0.charset();
        int int9 = response0.statusCode();
        java.lang.String str11 = response0.getHeaderCaseInsensitive("hi!");
        java.util.Map map12 = response0.cookies();
        java.lang.String str14 = response0.getHeaderCaseInsensitive("");
        java.lang.String str15 = response0.statusMessage();
        java.lang.String str17 = response0.cookie("");
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response0.url(uRL18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test12485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12485");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Method method3 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray4 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(method3);
    }

    @Test
    public void test12486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12486");
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
        org.jsoup.Connection.Response response17 = response11.removeCookie("");
        boolean boolean19 = response11.hasCookie("");
        java.lang.String str20 = response11.statusMessage();
        java.net.HttpURLConnection httpURLConnection21 = null;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str24 = response22.cookie("");
        java.lang.String str25 = response22.contentType();
        java.lang.String str27 = response22.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response22);
        boolean boolean30 = response22.hasCookie("hi!");
        java.util.Map.Entry entry32 = response22.scanHeaders("hi!");
        int int33 = response22.statusCode();
        boolean boolean35 = response22.hasCookie("");
        int int36 = response22.statusCode();
        java.lang.String str37 = response22.statusMessage();
        int int38 = response22.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            response11.setupFromConnection(httpURLConnection21, (org.jsoup.Connection.Response) response22);
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
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(entry32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test12487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12487");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL7 = response6.url();
        java.lang.String str8 = response6.statusMessage();
        java.util.Map map9 = response6.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.lang.String str11 = response0.charset();
        org.jsoup.Connection.Method method12 = response0.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test12488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12488");
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
        java.util.Map map28 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map30 = response0.cookies();
        org.jsoup.Connection.Response response32 = response0.removeCookie("hi!");
        java.lang.Class<?> wildcardClass33 = response32.getClass();
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
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test12489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12489");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry9 = response7.scanHeaders("");
        org.jsoup.Connection.Method method10 = response7.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test12490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12490");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.contentType();
        java.lang.String str4 = response0.getHeaderCaseInsensitive("hi!");
        java.util.Map.Entry entry6 = response0.scanHeaders("");
        org.jsoup.Connection.Response response9 = response0.cookie("hi!", "");
        java.util.Map map10 = response0.cookies();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test12491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12491");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.util.Map map8 = response0.cookies();
        int int9 = response0.statusCode();
        java.lang.String str10 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.Class<?> wildcardClass12 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test12492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12492");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        java.lang.String str7 = response0.cookie("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean10 = response8.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.Connection.Method method13 = response11.method();
        java.lang.String str14 = response11.statusMessage();
        int int15 = response11.statusCode();
        java.util.Map map16 = response11.headers();
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map16);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test12493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12493");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        java.lang.String str12 = response0.cookie("");
        org.jsoup.Connection.Response response14 = response0.removeCookie("hi!");
        java.lang.String str16 = response0.cookie("hi!");
        org.jsoup.Connection.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response0.method(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12494");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        boolean boolean4 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.cookie("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12495");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        java.net.URL uRL4 = response1.url();
        java.util.Map map5 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str7 = response6.contentType();
        java.util.Map map8 = response6.cookies();
        java.lang.String str9 = response6.charset();
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str13 = response11.cookie("");
        java.lang.String str14 = response11.statusMessage();
        java.lang.String str16 = response11.header("hi!");
        java.lang.String str17 = response11.contentType();
        org.jsoup.Connection.Response response20 = response11.header("hi!", "hi!");
        java.lang.String str21 = response11.statusMessage();
        org.jsoup.Connection.Response response23 = response11.removeCookie("");
        org.jsoup.Connection.Response response25 = response11.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            response6.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNotNull(response25);
    }

    @Test
    public void test12496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12496");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        java.lang.String str7 = response0.header("");
        int int8 = response0.statusCode();
        org.jsoup.Connection.Response response10 = response0.removeCookie("");
        java.lang.String str11 = response0.statusMessage();
        org.jsoup.Connection.Method method12 = response0.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test12497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12497");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        java.util.Map map9 = response0.headers();
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.Connection.Method method11 = response0.method();
        org.jsoup.Connection.Response response14 = response0.cookie("hi!", "hi!");
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test12498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12498");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("");
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response8.getHeaderCaseInsensitive("hi!");
        java.lang.String str12 = response8.header("");
        org.jsoup.Connection.Method method13 = response8.method();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.util.Map map15 = response8.headers();
        boolean boolean17 = response8.hasHeader("hi!");
        boolean boolean19 = response8.hasCookie("hi!");
        org.jsoup.Connection.Response response22 = response8.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL24 = response23.url();
        org.jsoup.Connection.Method method25 = response23.method();
        java.lang.String str27 = response23.cookie("hi!");
        boolean boolean29 = response23.hasCookie("hi!");
        org.jsoup.Connection.Response response32 = response23.cookie("hi!", "");
        boolean boolean34 = response23.hasHeader("hi!");
        java.lang.String str35 = response23.statusMessage();
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response(response23);
        java.lang.String str37 = response23.statusMessage();
        java.util.Map map38 = response23.headers();
        java.util.Map map39 = response23.cookies();
        java.util.Map map40 = response23.cookies();
        java.util.Map map41 = response23.headers();
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map41);
        org.jsoup.Connection.Response response44 = response8.removeCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(response44);
    }

    @Test
    public void test12499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12499");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response8 = response5.header("hi!", "hi!");
        java.util.Map map9 = response5.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.util.Map map11 = response0.headers();
        java.util.Map.Entry entry13 = response0.scanHeaders("hi!");
        boolean boolean15 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response18 = response0.cookie("hi!", "hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(entry13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test12500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12500");
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
        java.lang.String str13 = response0.charset();
        java.net.URL uRL14 = response0.url();
        boolean boolean16 = response0.hasCookie("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }
}

