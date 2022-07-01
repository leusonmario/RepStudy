import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test01501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01501");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "hi!");
        java.lang.String str12 = response0.getHeaderCaseInsensitive("");
        java.lang.String str14 = response0.header("");
        org.jsoup.Connection.Response response17 = response0.cookie("hi!", "");
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response0.method(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test01502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01502");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.lang.String str20 = response18.header("hi!");
        org.jsoup.Connection.Response response22 = response18.removeHeader("hi!");
        org.jsoup.Connection.Response response24 = response18.removeCookie("");
        java.util.Map map25 = response18.headers();
        java.util.Map map26 = response18.cookies();
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = response13.body();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test01503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01503");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response4.statusMessage();
        java.lang.String str6 = response4.contentType();
        java.lang.String str8 = response4.header("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = response4.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01504");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response0.header("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
    public void test01505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01505");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean9 = response0.hasCookie("");
        java.lang.String str11 = response0.cookie("hi!");
        boolean boolean13 = response0.hasHeader("hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders(strMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test01506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01506");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.cookie("hi!");
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01507");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response6.charset();
        int int8 = response6.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = response6.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test01508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01508");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.net.URL uRL6 = response0.url();
        java.util.Map map7 = response0.headers();
        java.util.Map.Entry entry9 = response0.scanHeaders("");
        java.util.Map.Entry entry11 = response0.scanHeaders("");
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response16 = response13.header("hi!", "hi!");
        boolean boolean18 = response13.hasCookie("hi!");
        java.lang.String str20 = response13.header("");
        boolean boolean22 = response13.hasCookie("hi!");
        java.util.Map map23 = response13.cookies();
        boolean boolean25 = response13.hasHeader("hi!");
        java.lang.String str26 = response13.charset();
        java.util.Map map27 = response13.cookies();
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
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test01509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01509");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response4.statusMessage();
        java.lang.String str6 = response4.contentType();
        java.lang.String str8 = response4.header("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response4.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01510");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        java.net.URL uRL4 = response1.url();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.header("");
        org.jsoup.Connection.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response1.method(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01511");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("hi!");
        org.jsoup.Connection.Method method8 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response0.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(method8);
    }

    @Test
    public void test01512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01512");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str13 = response11.cookie("");
        java.lang.String str14 = response11.contentType();
        java.lang.String str16 = response11.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test01513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01513");
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
        org.jsoup.Connection.Method method16 = response15.method();
        org.jsoup.Connection.Method method17 = response15.method();
        int int18 = response15.statusCode();
        org.jsoup.Connection.Method method19 = response15.method();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        java.lang.String str23 = response21.header("hi!");
        java.lang.String str24 = response21.statusMessage();
        java.util.Map.Entry entry26 = response21.scanHeaders("hi!");
        org.jsoup.Connection.Response response29 = response21.cookie("hi!", "");
        boolean boolean31 = response21.hasCookie("hi!");
        java.util.Map map32 = response21.cookies();
        // The following exception was thrown during execution in test generation
        try {
            response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to java.util.List");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(entry26);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(map32);
    }

    @Test
    public void test01514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01514");
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
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.Class<?> wildcardClass21 = response1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01515");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        boolean boolean6 = response0.hasHeader("hi!");
        java.util.Map map7 = response0.cookies();
        java.lang.String str8 = response0.contentType();
        org.jsoup.Connection.Method method9 = response0.method();
        java.net.URL uRL10 = response0.url();
        java.util.Map map11 = response0.cookies();
        java.lang.String str12 = response0.statusMessage();
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response0.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test01516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01516");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        boolean boolean4 = response0.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01517");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("");
        org.jsoup.Connection.Method method4 = response1.method();
        boolean boolean6 = response1.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01518");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("");
        java.lang.String str4 = response1.contentType();
        java.lang.String str6 = response1.header("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map map8 = response7.headers();
        java.lang.String str10 = response7.header("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01519");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        java.net.URL uRL3 = response0.url();
        java.net.URL uRL4 = response0.url();
        org.jsoup.Connection.Method method5 = response0.method();
        int int6 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test01520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01520");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        org.jsoup.Connection.Method method3 = response1.method();
        org.jsoup.Connection.Response response6 = response1.header("hi!", "");
        java.util.Map map7 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int9 = response1.statusCode();
        java.util.Map map10 = response1.headers();
        java.util.Map map11 = response1.cookies();
        java.lang.String str13 = response1.cookie("");
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
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01521");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.cookie("");
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.Connection.Response response12 = response0.cookie("hi!", "");
        java.lang.String str13 = response0.charset();
        java.net.URL uRL14 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test01522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01522");
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
        java.util.Map.Entry entry27 = response0.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response30 = response0.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
        org.junit.Assert.assertNotNull(entry27);
    }

    @Test
    public void test01523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01523");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL11 = response10.url();
        org.jsoup.Connection.Method method12 = response10.method();
        org.jsoup.Connection.Response response15 = response10.header("hi!", "");
        java.util.Map map16 = response10.headers();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response10);
        boolean boolean19 = response10.hasCookie("");
        java.util.Map map20 = response10.headers();
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to java.util.List");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test01524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01524");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response9 = response0.cookie("hi!", "");
        java.lang.String str11 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry14 = response12.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response12.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(entry14);
    }

    @Test
    public void test01525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01525");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.headers();
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map map6 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test01526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01526");
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
        java.lang.Class<?> wildcardClass16 = response15.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01527");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        boolean boolean9 = response0.hasCookie("hi!");
        java.lang.String str11 = response0.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response0.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01528");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        java.util.Map map4 = response0.cookies();
        java.lang.String str5 = response0.statusMessage();
        boolean boolean7 = response0.hasCookie("hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(entry9);
    }

    @Test
    public void test01529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01529");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        boolean boolean9 = response0.hasCookie("hi!");
        java.lang.String str11 = response0.cookie("hi!");
        org.jsoup.Connection.Response response13 = response0.removeCookie("");
        java.lang.String str15 = response0.header("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test01530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01530");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response8 = response5.header("hi!", "hi!");
        java.util.Map map9 = response5.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        int int11 = response0.statusCode();
        boolean boolean13 = response0.hasHeader("hi!");
        java.util.Map map14 = response0.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test01531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01531");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str6 = response0.contentType();
        java.util.Map map7 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test01532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01532");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("");
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = response0.bodyAsBytes();
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
    }

    @Test
    public void test01533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01533");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Method method3 = response0.method();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str8 = response6.cookie("");
        java.lang.String str9 = response6.contentType();
        java.lang.String str11 = response6.header("hi!");
        boolean boolean13 = response6.hasCookie("hi!");
        java.lang.String str15 = response6.getHeaderCaseInsensitive("");
        java.lang.String str16 = response6.statusMessage();
        java.lang.String str18 = response6.header("");
        java.util.Map map19 = response6.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        java.util.Map map21 = response0.headers();
        org.jsoup.Connection.Method method22 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray23 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(method22);
    }

    @Test
    public void test01534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01534");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response0.statusMessage();
        java.net.URL uRL7 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
    }

    @Test
    public void test01535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01535");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        java.util.Map map4 = response0.cookies();
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str7 = response0.cookie("");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.header("");
        int int11 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = response12.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test01536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01536");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        int int7 = response0.statusCode();
        java.lang.String str8 = response0.charset();
        int int9 = response0.statusCode();
        java.lang.String str11 = response0.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
    }

    @Test
    public void test01537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01537");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Method method3 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response5 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(method3);
    }

    @Test
    public void test01538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01538");
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
        org.jsoup.Connection.Method method16 = response15.method();
        java.lang.String str18 = response15.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = response15.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test01539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01539");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document16 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test01540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01540");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response0.method(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test01541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01541");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.cookie("");
        java.net.URL uRL4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response5 = response0.url(uRL4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01542");
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
        java.util.Map.Entry entry27 = response0.scanHeaders("hi!");
        java.lang.String str28 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response31 = response0.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
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
        org.junit.Assert.assertNotNull(entry27);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test01543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01543");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str4 = response1.header("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response11 = response1.header("hi!", "hi!");
        java.lang.String str13 = response1.getHeaderCaseInsensitive("");
        java.util.Map.Entry entry15 = response1.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(entry15);
    }

    @Test
    public void test01544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01544");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        java.util.Map.Entry entry9 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL11 = response10.url();
        java.lang.String str12 = response10.statusMessage();
        java.util.Map map13 = response10.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map13);
        java.lang.Class<?> wildcardClass15 = map13.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01545");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean8 = response6.hasCookie("");
        org.jsoup.Connection.Response response10 = response6.removeCookie("");
        java.net.URL uRL11 = response6.url();
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL14 = response13.url();
        java.lang.String str15 = response13.statusMessage();
        int int16 = response13.statusCode();
        org.jsoup.Connection.Response response19 = response13.header("hi!", "hi!");
        java.net.URL uRL20 = response13.url();
        org.jsoup.Connection.Method method21 = response13.method();
        org.jsoup.Connection.Response response23 = response13.removeCookie("");
        java.lang.String str24 = response13.charset();
        // The following exception was thrown during execution in test generation
        try {
            response6.setupFromConnection(httpURLConnection12, (org.jsoup.Connection.Response) response13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test01546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01546");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response0.header("hi!", "hi!");
        java.lang.String str8 = response0.contentType();
        org.jsoup.Connection.Response response11 = response0.header("hi!", "");
        java.lang.String str13 = response0.header("hi!");
        org.jsoup.Connection.Method method14 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test01547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01547");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map4 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map4);
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str10 = response0.charset();
        java.util.Map map11 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test01548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01548");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.Class<?> wildcardClass7 = response6.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01549");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str4 = response0.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders(strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test01550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01550");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test01551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01551");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        java.util.Map map4 = response0.headers();
        java.lang.String str6 = response0.cookie("hi!");
        java.net.URL uRL7 = response0.url();
        java.lang.String str9 = response0.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01552");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        int int7 = response0.statusCode();
        java.lang.String str8 = response0.charset();
        int int9 = response0.statusCode();
        java.lang.String str11 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str12 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method14 = response13.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test01553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01553");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str3 = response1.statusMessage();
        java.lang.String str4 = response1.statusMessage();
        java.util.Map.Entry entry6 = response1.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(entry6);
    }

    @Test
    public void test01554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01554");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.cookie("");
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        java.util.Map map9 = response0.headers();
        int int10 = response0.statusCode();
        java.util.Map map11 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response0.header("", "");
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
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test01555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01555");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        org.jsoup.Connection.Method method3 = response1.method();
        java.lang.String str5 = response1.cookie("hi!");
        boolean boolean7 = response1.hasCookie("hi!");
        int int8 = response1.statusCode();
        org.jsoup.Connection.Method method9 = response1.method();
        java.util.Map.Entry entry11 = response1.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(entry11);
    }

    @Test
    public void test01556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01556");
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
        java.lang.Class<?> wildcardClass16 = map15.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01557");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str9 = response0.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test01558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01558");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response8 = response5.header("hi!", "hi!");
        java.util.Map map9 = response5.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.lang.String str12 = response0.header("hi!");
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str16 = response14.cookie("");
        org.jsoup.Connection.Response response18 = response14.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response14);
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test01559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01559");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Response response8 = response0.removeCookie("hi!");
        java.net.HttpURLConnection httpURLConnection9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL11 = response10.url();
        org.jsoup.Connection.Method method12 = response10.method();
        java.lang.String str13 = response10.contentType();
        org.jsoup.Connection.Response response16 = response10.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection9, response16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test01560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01560");
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
        org.jsoup.Connection.Method method15 = response0.method();
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response0.url(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test01561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01561");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        int int11 = response0.statusCode();
        org.jsoup.Connection.Response response13 = response0.removeCookie("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test01562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01562");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        org.jsoup.Connection.Response response7 = response0.cookie("hi!", "hi!");
        boolean boolean9 = response0.hasCookie("");
        org.jsoup.Connection.Response response12 = response0.cookie("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test01563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01563");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str6 = response0.charset();
        java.util.Map.Entry entry8 = response0.scanHeaders("");
        java.lang.String str10 = response0.getHeaderCaseInsensitive("");
        java.lang.String str11 = response0.contentType();
        org.jsoup.Connection.Method method12 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test01564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01564");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response0.url();
        java.lang.String str4 = response0.cookie("");
        java.util.Map.Entry entry6 = response0.scanHeaders("hi!");
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response10 = response0.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test01565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01565");
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
        java.lang.Class<?> wildcardClass16 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01566");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean9 = response0.hasCookie("");
        java.lang.String str11 = response0.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01567");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int8 = response0.statusCode();
        java.util.Map map9 = response0.headers();
        java.util.Map map10 = response0.cookies();
        java.lang.String str12 = response0.cookie("");
        java.lang.String str14 = response0.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test01568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01568");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response8 = response5.header("hi!", "hi!");
        java.util.Map map9 = response5.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.lang.String str12 = response0.header("hi!");
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str16 = response14.cookie("");
        java.lang.String str17 = response14.contentType();
        java.lang.String str19 = response14.header("hi!");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.util.Map map21 = response20.headers();
        java.lang.String str23 = response20.cookie("hi!");
        java.util.Map.Entry entry25 = response20.scanHeaders("hi!");
        java.net.URL uRL26 = response20.url();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(entry25);
        org.junit.Assert.assertNull(uRL26);
    }

    @Test
    public void test01569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01569");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        org.jsoup.Connection.Method method3 = response1.method();
        org.jsoup.Connection.Response response6 = response1.header("hi!", "");
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry entry10 = response1.scanHeaders("");
        org.jsoup.Connection.Method method11 = response1.method();
        java.util.Map map12 = response1.cookies();
        org.jsoup.Connection.Response response15 = response1.cookie("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response18 = response16.removeCookie("");
        org.jsoup.Connection.Response response21 = response16.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response22);
        java.lang.String str25 = response23.header("hi!");
        org.jsoup.Connection.Response response27 = response23.removeHeader("hi!");
        org.jsoup.Connection.Response response29 = response23.removeCookie("");
        java.util.Map map30 = response23.headers();
        java.util.Map map31 = response23.cookies();
        java.util.Map map32 = response23.cookies();
        response16.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map32);
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map32);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response35 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
    }

    @Test
    public void test01570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01570");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str6 = response0.charset();
        java.lang.String str8 = response0.header("hi!");
        java.lang.String str10 = response0.header("");
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL13 = response12.url();
        java.lang.String str15 = response12.header("hi!");
        org.jsoup.Connection.Response response17 = response12.removeCookie("hi!");
        java.util.Map.Entry entry19 = response12.scanHeaders("hi!");
        int int20 = response12.statusCode();
        boolean boolean22 = response12.hasCookie("");
        java.lang.String str24 = response12.cookie("");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.util.Map.Entry entry27 = response25.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response25);
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection11, (org.jsoup.Connection.Response) response28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(entry19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(entry27);
    }

    @Test
    public void test01571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01571");
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
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response13.method(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01572");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.net.URL uRL7 = response0.url();
        java.lang.String str9 = response0.header("hi!");
        java.lang.String str11 = response0.cookie("");
        java.util.Map map12 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test01573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01573");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.net.URL uRL6 = response0.url();
        java.util.Map map7 = response0.headers();
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        org.jsoup.Connection.Response response12 = response0.removeHeader("hi!");
        java.lang.String str14 = response0.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test01574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01574");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.statusMessage();
        int int4 = response1.statusCode();
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.net.URL uRL8 = response1.url();
        java.util.Map.Entry entry10 = response1.scanHeaders("hi!");
        java.lang.String str11 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(entry10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01575");
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
        org.jsoup.Connection.Response response25 = response13.cookie("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray26 = response13.bodyAsBytes();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(response25);
    }

    @Test
    public void test01576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01576");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Method method4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response5 = response0.method(method4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01577");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        java.net.URL uRL4 = response1.url();
        org.jsoup.Connection.Response response7 = response1.header("hi!", "");
        java.lang.String str9 = response1.cookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01578");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        boolean boolean7 = response0.hasCookie("hi!");
        int int8 = response0.statusCode();
        java.util.Map map9 = response0.cookies();
        boolean boolean11 = response0.hasCookie("hi!");
        java.lang.Class<?> wildcardClass12 = response0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01579");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map4 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map4);
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.Connection.Response response12 = response0.header("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test01580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01580");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        java.net.URL uRL3 = response0.url();
        java.net.URL uRL4 = response0.url();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL8 = response7.url();
        org.jsoup.Connection.Method method9 = response7.method();
        java.lang.String str11 = response7.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map13 = response12.headers();
        response7.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map13);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document16 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test01581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01581");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("");
        org.jsoup.Connection.Method method10 = response0.method();
        java.util.Map map11 = response0.cookies();
        org.jsoup.Connection.Response response14 = response0.cookie("hi!", "hi!");
        java.lang.String str16 = response0.getHeaderCaseInsensitive("hi!");
        java.net.HttpURLConnection httpURLConnection17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str20 = response18.cookie("");
        java.lang.String str21 = response18.contentType();
        java.lang.String str23 = response18.header("hi!");
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response18);
        java.lang.String str25 = response24.contentType();
        boolean boolean27 = response24.hasHeader("hi!");
        int int28 = response24.statusCode();
        java.lang.String str29 = response24.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection17, (org.jsoup.Connection.Response) response24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test01582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01582");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        java.util.Map.Entry entry6 = response0.scanHeaders("hi!");
        java.util.Map.Entry entry8 = response0.scanHeaders("");
        org.jsoup.Connection.Response response10 = response0.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test01583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01583");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        java.util.Map map4 = response0.headers();
        java.lang.String str6 = response0.cookie("hi!");
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        java.lang.String str12 = response0.header("");
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response0.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test01584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01584");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        java.lang.String str7 = response0.cookie("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str10 = response8.charset();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = response8.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01585");
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
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01586");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str4 = response1.statusMessage();
        int int5 = response1.statusCode();
        org.jsoup.Connection.Method method6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = response1.method(method6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test01587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01587");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Response response3 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean6 = response0.hasHeader("hi!");
        java.lang.String str7 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response0.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01588");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response10 = response0.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test01589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01589");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        int int7 = response0.statusCode();
        java.lang.String str9 = response0.cookie("hi!");
        java.util.Map map10 = response0.headers();
        boolean boolean12 = response0.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response0.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01590");
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
        org.jsoup.Connection.Method method16 = response15.method();
        java.lang.String str18 = response15.cookie("hi!");
        org.jsoup.Connection.Response response20 = response15.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = response15.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test01591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01591");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response1.removeCookie("");
        java.util.Map map8 = response1.headers();
        java.util.Map map9 = response1.cookies();
        java.util.Map map10 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test01592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01592");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = response0.body();
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
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(response32);
    }

    @Test
    public void test01593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01593");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.util.Map map6 = response0.headers();
        org.jsoup.Connection.Response response8 = response0.removeHeader("hi!");
        java.util.Map.Entry entry10 = response0.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(entry10);
    }

    @Test
    public void test01594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01594");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.Class<?> wildcardClass10 = response9.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01595");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        boolean boolean6 = response0.hasHeader("hi!");
        boolean boolean8 = response0.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01596");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        boolean boolean9 = response0.hasCookie("hi!");
        java.lang.String str10 = response0.statusMessage();
        org.jsoup.Connection.Response response12 = response0.removeCookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test01597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01597");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.cookie("");
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        java.util.Map map9 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str12 = response10.cookie("");
        java.lang.String str13 = response10.contentType();
        java.lang.String str15 = response10.header("hi!");
        java.util.Map map16 = response10.cookies();
        java.util.Map map17 = response10.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map17);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response0.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test01598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01598");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map map5 = response0.headers();
        boolean boolean7 = response0.hasCookie("hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        java.lang.String str11 = response0.header("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01599");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response0.headers();
        boolean boolean9 = response0.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01600");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("");
        java.lang.String str4 = response1.contentType();
        java.lang.String str6 = response1.header("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str8 = response7.charset();
        boolean boolean10 = response7.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01601");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int8 = response0.statusCode();
        java.util.Map.Entry entry10 = response0.scanHeaders("");
        java.lang.String str12 = response0.header("");
        java.lang.String str14 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.lang.String str18 = response16.header("hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL20 = response19.url();
        java.lang.String str22 = response19.header("hi!");
        org.jsoup.Connection.Response response24 = response19.removeHeader("hi!");
        java.lang.String str26 = response19.header("hi!");
        java.lang.String str27 = response19.statusMessage();
        java.lang.String str29 = response19.cookie("hi!");
        org.jsoup.Connection.Response response32 = response19.cookie("hi!", "hi!");
        java.lang.String str34 = response19.header("hi!");
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL36 = response35.url();
        org.jsoup.Connection.Method method37 = response35.method();
        org.jsoup.Connection.Response response40 = response35.header("hi!", "");
        java.util.Map map41 = response35.headers();
        org.jsoup.helper.HttpConnection.Response response42 = new org.jsoup.helper.HttpConnection.Response(response35);
        int int43 = response35.statusCode();
        java.util.Map map44 = response35.headers();
        java.util.Map map45 = response35.cookies();
        response19.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map45);
        response16.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map45);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map45);
        java.lang.Class<?> wildcardClass49 = map45.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(uRL36);
        org.junit.Assert.assertNull(method37);
        org.junit.Assert.assertNotNull(response40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test01602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01602");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL5 = response4.url();
        java.lang.String str7 = response4.header("hi!");
        java.util.Map map8 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map8);
        int int10 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str13 = response11.cookie("");
        java.lang.String str14 = response11.contentType();
        java.lang.String str16 = response11.header("hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.lang.String str19 = response11.cookie("hi!");
        java.util.Map map20 = response11.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response0.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test01603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01603");
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
        org.jsoup.Connection.Response response30 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str33 = response31.cookie("");
        java.lang.String str34 = response31.contentType();
        java.lang.String str36 = response31.header("hi!");
        org.jsoup.Connection.Response response38 = response31.removeCookie("");
        boolean boolean40 = response31.hasCookie("");
        java.lang.String str41 = response31.charset();
        java.util.Map map42 = response31.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map42);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response44 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(response38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(map42);
    }

    @Test
    public void test01604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01604");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        boolean boolean4 = response0.hasCookie("hi!");
        java.lang.Class<?> wildcardClass5 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test01605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01605");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Response response3 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean6 = response0.hasHeader("hi!");
        java.lang.String str7 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01606");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        java.lang.String str11 = response0.charset();
        java.lang.String str13 = response0.header("");
        boolean boolean15 = response0.hasCookie("hi!");
        java.util.Map map16 = response0.cookies();
        org.jsoup.Connection.Response response19 = response0.header("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response0.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
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
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test01607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01607");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test01608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01608");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.cookie("");
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        java.util.Map map9 = response0.headers();
        int int10 = response0.statusCode();
        org.jsoup.Connection.Response response12 = response0.removeHeader("hi!");
        java.lang.String str13 = response0.statusMessage();
        java.net.URL uRL14 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response0.header("", "");
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
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test01609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01609");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        java.util.Map map4 = response0.cookies();
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.net.URL uRL8 = response0.url();
        int int9 = response0.statusCode();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test01610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01610");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        org.jsoup.Connection.Method method3 = response1.method();
        java.lang.String str5 = response1.cookie("hi!");
        java.util.Map.Entry entry7 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test01611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01611");
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
        java.util.Map map21 = response0.headers();
        java.lang.String str22 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str25 = response23.cookie("");
        java.lang.String str26 = response23.contentType();
        java.lang.String str28 = response23.header("hi!");
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response23);
        java.util.Map map30 = response23.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        java.lang.Class<?> wildcardClass32 = response0.getClass();
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
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test01612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01612");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        boolean boolean4 = response0.hasHeader("hi!");
        java.lang.String str5 = response0.statusMessage();
        java.net.URL uRL6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = response0.url(uRL6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test01613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01613");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response0.url(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01614");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str5 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response7 = response1.removeCookie("");
        java.net.HttpURLConnection httpURLConnection8 = null;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL10 = response9.url();
        org.jsoup.Connection.Method method11 = response9.method();
        org.jsoup.Connection.Response response14 = response9.header("hi!", "");
        java.util.Map map15 = response9.headers();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        int int17 = response9.statusCode();
        java.util.Map map18 = response9.headers();
        java.util.Map map19 = response9.cookies();
        java.lang.String str21 = response9.cookie("");
        java.lang.String str23 = response9.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection8, (org.jsoup.Connection.Response) response9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test01615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01615");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response6.url(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
    }

    @Test
    public void test01616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01616");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.header("hi!");
        java.net.HttpURLConnection httpURLConnection7 = null;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL9 = response8.url();
        org.jsoup.Connection.Method method10 = response8.method();
        org.jsoup.Connection.Response response13 = response8.header("hi!", "");
        org.jsoup.Connection.Response response15 = response8.removeHeader("hi!");
        java.lang.String str17 = response8.header("hi!");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response8);
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection7, (org.jsoup.Connection.Response) response8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test01617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01617");
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
        java.net.URL uRL36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response37 = response34.url(uRL36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
    }

    @Test
    public void test01618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01618");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response9 = response0.removeHeader("hi!");
        java.util.Map map10 = response0.cookies();
        java.lang.Class<?> wildcardClass11 = response0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01619");
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
        java.lang.String str15 = response14.statusMessage();
        org.jsoup.Connection.Response response18 = response14.header("hi!", "hi!");
        java.util.Map.Entry entry20 = response14.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.Connection.Response response23 = response14.removeCookie("");
        java.lang.String str25 = response14.header("");
        java.util.Map.Entry entry27 = response14.scanHeaders("");
        java.lang.String str29 = response14.cookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response30 = org.jsoup.helper.HttpConnection.Response.execute(request0, response14);
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
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(entry20);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(entry27);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test01620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01620");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response6.headers();
        java.lang.String str9 = response6.header("hi!");
        org.jsoup.Connection.Response response12 = response6.cookie("hi!", "");
        boolean boolean14 = response6.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response6.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test01621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01621");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str4 = response1.header("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test01622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01622");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.statusMessage();
        int int4 = response1.statusCode();
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.net.URL uRL8 = response1.url();
        org.jsoup.Connection.Method method9 = response1.method();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test01623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01623");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str13 = response11.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response11.bodyAsBytes();
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
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01624");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.header("hi!", "");
        org.jsoup.Connection.Response response10 = response0.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map12 = response0.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test01625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01625");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        java.lang.String str12 = response0.cookie("");
        org.jsoup.Connection.Response response14 = response0.removeHeader("hi!");
        java.lang.Class<?> wildcardClass15 = response0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01626");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int8 = response0.statusCode();
        java.util.Map.Entry entry10 = response0.scanHeaders("");
        java.lang.String str12 = response0.header("");
        java.lang.String str14 = response0.cookie("hi!");
        java.net.HttpURLConnection httpURLConnection15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL17 = response16.url();
        java.lang.String str18 = response16.statusMessage();
        java.util.Map map19 = response16.cookies();
        java.lang.String str21 = response16.header("hi!");
        java.lang.String str23 = response16.getHeaderCaseInsensitive("hi!");
        java.lang.String str24 = response16.charset();
        java.lang.String str25 = response16.charset();
        boolean boolean27 = response16.hasHeader("hi!");
        org.jsoup.Connection.Response response29 = response16.removeCookie("hi!");
        org.jsoup.Connection.Response response31 = response16.removeHeader("hi!");
        org.jsoup.Connection.Method method32 = response16.method();
        java.util.Map map33 = response16.cookies();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection15, (org.jsoup.Connection.Response) response16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertNull(method32);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test01627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01627");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        boolean boolean9 = response0.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01628");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        java.lang.String str9 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response11 = response0.removeHeader("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test01629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01629");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map map5 = response0.headers();
        boolean boolean7 = response0.hasCookie("hi!");
        int int8 = response0.statusCode();
        int int9 = response0.statusCode();
        java.util.Map.Entry entry11 = response0.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(entry11);
    }

    @Test
    public void test01630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01630");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        java.lang.String str4 = response0.charset();
        int int5 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test01631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01631");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.statusMessage();
        java.util.Map map4 = response1.cookies();
        java.lang.String str6 = response1.header("hi!");
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str9 = response1.contentType();
        java.util.Map map10 = response1.cookies();
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
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL29 = response28.url();
        java.lang.String str30 = response28.statusMessage();
        int int31 = response28.statusCode();
        org.jsoup.Connection.Response response34 = response28.header("hi!", "hi!");
        java.util.Map map35 = response28.cookies();
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
        int int37 = response11.statusCode();
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response39 = new org.jsoup.helper.HttpConnection.Response(response38);
        org.jsoup.Connection.Method method40 = response38.method();
        java.util.Map map41 = response38.headers();
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map41);
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map41);
        java.lang.String str44 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response45 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
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
        org.junit.Assert.assertNull(uRL29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(method40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test01632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01632");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.cookie("");
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response0.url(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01633");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document31 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test01634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01634");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01635");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        java.net.URL uRL4 = response1.url();
        org.jsoup.Connection.Response response7 = response1.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.HttpURLConnection httpURLConnection9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL11 = response10.url();
        org.jsoup.Connection.Method method12 = response10.method();
        java.lang.String str14 = response10.cookie("hi!");
        boolean boolean16 = response10.hasCookie("hi!");
        org.jsoup.Connection.Response response19 = response10.cookie("hi!", "");
        boolean boolean21 = response10.hasHeader("hi!");
        java.lang.String str22 = response10.statusMessage();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.lang.String str25 = response10.header("");
        // The following exception was thrown during execution in test generation
        try {
            response8.setupFromConnection(httpURLConnection9, (org.jsoup.Connection.Response) response10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test01636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01636");
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
        java.lang.String str19 = response13.header("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray20 = response13.bodyAsBytes();
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
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test01637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01637");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        org.jsoup.Connection.Method method3 = response1.method();
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.getHeaderCaseInsensitive("");
        java.util.Map map8 = response1.cookies();
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        int int11 = response1.statusCode();
        java.lang.String str12 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test01638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01638");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Response response6 = response0.cookie("hi!", "");
        java.lang.String str7 = response0.charset();
        int int8 = response0.statusCode();
        java.lang.Class<?> wildcardClass9 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01639");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.charset();
        java.lang.String str4 = response0.contentType();
        boolean boolean6 = response0.hasHeader("hi!");
        java.lang.String str8 = response0.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01640");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method4 = response3.method();
        boolean boolean6 = response3.hasCookie("hi!");
        java.lang.String str7 = response3.statusMessage();
        int int8 = response3.statusCode();
        int int9 = response3.statusCode();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test01641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01641");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean6 = response0.hasHeader("hi!");
        java.lang.String str7 = response0.charset();
        org.jsoup.Connection.Method method8 = response0.method();
        boolean boolean10 = response0.hasCookie("");
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01642");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        java.lang.String str10 = response0.getHeaderCaseInsensitive("");
        boolean boolean12 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response14 = response0.removeHeader("hi!");
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
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test01643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01643");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map4 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map4);
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str10 = response0.charset();
        java.util.Map map11 = response0.cookies();
        java.lang.String str13 = response0.cookie("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01644");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = response0.body();
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test01645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01645");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Response response3 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean6 = response0.hasHeader("hi!");
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str10 = response8.cookie("");
        org.jsoup.Connection.Response response12 = response8.removeHeader("hi!");
        int int13 = response8.statusCode();
        boolean boolean15 = response8.hasHeader("hi!");
        java.lang.String str16 = response8.statusMessage();
        java.lang.String str17 = response8.statusMessage();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL19 = response18.url();
        org.jsoup.Connection.Method method20 = response18.method();
        org.jsoup.Connection.Response response23 = response18.header("hi!", "");
        java.lang.String str24 = response18.charset();
        java.util.Map map25 = response18.cookies();
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        java.net.HttpURLConnection httpURLConnection28 = null;
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL30 = response29.url();
        org.jsoup.Connection.Method method31 = response29.method();
        org.jsoup.Connection.Response response33 = response29.removeCookie("hi!");
        java.lang.String str35 = response29.getHeaderCaseInsensitive("");
        java.util.Map map36 = response29.cookies();
        java.util.Map map37 = response29.headers();
        org.jsoup.Connection.Method method38 = response29.method();
        java.lang.String str39 = response29.contentType();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection28, (org.jsoup.Connection.Response) response29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(uRL30);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(method38);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test01646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01646");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response9 = response0.cookie("hi!", "");
        java.lang.String str11 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL14 = response13.url();
        java.lang.String str15 = response13.statusMessage();
        java.util.Map map16 = response13.cookies();
        org.jsoup.Connection.Response response18 = response13.removeHeader("hi!");
        java.util.Map.Entry entry20 = response13.scanHeaders("");
        java.util.Map.Entry entry22 = response13.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL24 = response23.url();
        java.lang.String str25 = response23.statusMessage();
        java.util.Map map26 = response23.cookies();
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        response12.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray29 = response12.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(entry20);
        org.junit.Assert.assertNull(entry22);
        org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test01647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01647");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        java.net.URL uRL3 = response0.url();
        java.net.URL uRL4 = response0.url();
        org.jsoup.Connection.Method method5 = response0.method();
        boolean boolean7 = response0.hasHeader("hi!");
        java.lang.String str8 = response0.charset();
        java.net.HttpURLConnection httpURLConnection9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str12 = response10.cookie("");
        org.jsoup.Connection.Response response14 = response10.removeHeader("hi!");
        int int15 = response10.statusCode();
        boolean boolean17 = response10.hasHeader("hi!");
        java.lang.String str18 = response10.statusMessage();
        java.lang.String str19 = response10.statusMessage();
        int int20 = response10.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection9, (org.jsoup.Connection.Response) response10);
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test01648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01648");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.cookie("hi!", "hi!");
        int int4 = response0.statusCode();
        java.util.Map map5 = response0.cookies();
        java.lang.String str6 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01649");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.cookies();
        boolean boolean10 = response0.hasHeader("hi!");
        java.util.Map map11 = response0.cookies();
        int int12 = response0.statusCode();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test01650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01650");
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
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response0.method(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test01651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01651");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("");
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response0.header("");
        org.jsoup.Connection.Method method11 = response0.method();
        java.util.Map map12 = response0.headers();
        java.lang.String str14 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response0.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test01652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01652");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("");
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response0.header("");
        org.jsoup.Connection.Method method11 = response0.method();
        java.util.Map map12 = response0.headers();
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response0.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test01653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01653");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        java.net.URL uRL4 = response1.url();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test01654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01654");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("");
        java.lang.String str4 = response1.contentType();
        java.lang.String str6 = response1.header("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str8 = response7.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01655");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response6 = response0.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test01656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01656");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        java.lang.String str7 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response8.header("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response8.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01657");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map4 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map4);
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        java.lang.String str9 = response0.header("");
        java.lang.Class<?> wildcardClass10 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01658");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.util.Map map7 = response0.cookies();
        java.lang.Class<?> wildcardClass8 = response0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01659");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("hi!");
        java.lang.String str9 = response0.contentType();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01660");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.charset();
        java.lang.String str9 = response0.charset();
        boolean boolean11 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response13 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response16 = response0.header("hi!", "hi!");
        org.jsoup.Connection.Response response18 = response0.removeHeader("hi!");
        java.net.HttpURLConnection httpURLConnection19 = null;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL21 = response20.url();
        java.lang.String str23 = response20.header("hi!");
        org.jsoup.Connection.Response response25 = response20.removeCookie("hi!");
        org.jsoup.Connection.Response response27 = response20.removeCookie("");
        boolean boolean29 = response20.hasCookie("hi!");
        org.jsoup.Connection.Method method30 = response20.method();
        boolean boolean32 = response20.hasCookie("");
        java.lang.String str33 = response20.contentType();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection19, (org.jsoup.Connection.Response) response20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(method30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test01661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01661");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.util.Map map7 = response0.cookies();
        java.lang.String str9 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str10 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response0.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
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
    }

    @Test
    public void test01662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01662");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.util.Map map3 = response0.headers();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.charset();
        java.lang.String str7 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01663");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str7 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01664");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.Connection.Method method4 = response2.method();
        java.util.Map map5 = response2.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.net.URL uRL7 = response1.url();
        java.lang.String str9 = response1.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01665");
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
        java.lang.String str14 = response13.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = response13.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test01666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01666");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response7.statusMessage();
        java.util.Map map9 = response7.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response7.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test01667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01667");
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
        java.lang.String str15 = response14.statusMessage();
        org.jsoup.Connection.Response response18 = response14.header("hi!", "hi!");
        java.util.Map.Entry entry20 = response14.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.Connection.Response response23 = response14.removeCookie("");
        java.lang.String str25 = response14.header("");
        java.util.Map.Entry entry27 = response14.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response28 = org.jsoup.helper.HttpConnection.Response.execute(request0, response14);
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
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(entry20);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(entry27);
    }

    @Test
    public void test01668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01668");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response0.bodyAsBytes();
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test01669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01669");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method4 = response3.method();
        boolean boolean6 = response3.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str9 = response7.cookie("");
        java.lang.String str10 = response7.contentType();
        java.lang.String str12 = response7.header("hi!");
        boolean boolean14 = response7.hasCookie("hi!");
        int int15 = response7.statusCode();
        java.util.Map map16 = response7.cookies();
        response3.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map16);
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response3.url(uRL18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test01670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01670");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("");
        java.lang.String str4 = response1.contentType();
        java.lang.String str6 = response1.header("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str9 = response1.cookie("hi!");
        java.util.Map.Entry entry11 = response1.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(entry11);
    }

    @Test
    public void test01671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01671");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL10 = response9.url();
        java.net.URL uRL11 = response9.url();
        org.jsoup.Connection.Response response13 = response9.removeCookie("");
        java.lang.String str15 = response9.cookie("hi!");
        java.util.Map map16 = response9.cookies();
        response7.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map16);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response7.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test01672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01672");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.util.Map map3 = response0.headers();
        boolean boolean5 = response0.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = response6.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test01673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01673");
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
        int int26 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response27);
        org.jsoup.Connection.Method method29 = response27.method();
        java.util.Map map30 = response27.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        java.net.URL uRL32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response33 = response0.url(uRL32);
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
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(method29);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test01674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01674");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str4 = response1.header("hi!");
        boolean boolean6 = response1.hasCookie("hi!");
        org.jsoup.Connection.Response response8 = response1.removeCookie("");
        java.util.Map map9 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test01675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01675");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.charset();
        java.lang.String str9 = response0.charset();
        boolean boolean11 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response13 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response15 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method16 = response0.method();
        org.jsoup.Connection.Response response19 = response0.header("hi!", "hi!");
        java.lang.String str21 = response0.header("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test01676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01676");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Method method3 = response0.method();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str8 = response6.cookie("");
        java.lang.String str9 = response6.contentType();
        java.lang.String str11 = response6.header("hi!");
        boolean boolean13 = response6.hasCookie("hi!");
        java.lang.String str15 = response6.getHeaderCaseInsensitive("");
        java.lang.String str16 = response6.statusMessage();
        java.lang.String str18 = response6.header("");
        java.util.Map map19 = response6.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        java.util.Map map21 = response0.headers();
        org.jsoup.Connection.Method method22 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(method22);
    }

    @Test
    public void test01677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01677");
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
        java.util.Map map18 = response0.cookies();
        org.jsoup.Connection.Response response21 = response0.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = response0.body();
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test01678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01678");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        int int7 = response0.statusCode();
        org.jsoup.Connection.Method method8 = response0.method();
        java.net.HttpURLConnection httpURLConnection9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL11 = response10.url();
        java.lang.String str12 = response10.statusMessage();
        java.util.Map map13 = response10.cookies();
        java.lang.String str15 = response10.header("hi!");
        java.lang.String str17 = response10.getHeaderCaseInsensitive("hi!");
        java.lang.String str18 = response10.charset();
        java.lang.String str19 = response10.charset();
        boolean boolean21 = response10.hasHeader("hi!");
        org.jsoup.Connection.Response response23 = response10.removeCookie("hi!");
        org.jsoup.Connection.Response response26 = response10.header("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection9, (org.jsoup.Connection.Response) response10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNotNull(response26);
    }

    @Test
    public void test01679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01679");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        java.util.Map map6 = response0.cookies();
        java.util.Map map7 = response0.cookies();
        java.util.Map map8 = response0.cookies();
        org.jsoup.Connection.Response response11 = response0.header("hi!", "hi!");
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
        java.lang.String str27 = response26.statusMessage();
        org.jsoup.Connection.Response response30 = response26.header("hi!", "hi!");
        org.jsoup.Connection.Response response32 = response26.removeHeader("hi!");
        java.lang.String str34 = response26.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection12, (org.jsoup.Connection.Response) response26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test01680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01680");
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
        org.jsoup.Connection.Response response17 = response0.cookie("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test01681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01681");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        org.jsoup.Connection.Method method3 = response1.method();
        org.jsoup.Connection.Response response6 = response1.header("hi!", "");
        org.jsoup.Connection.Response response8 = response1.removeHeader("hi!");
        boolean boolean10 = response1.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01682");
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
        java.util.Map map14 = response0.headers();
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
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test01683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01683");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        org.jsoup.Connection.Method method3 = response1.method();
        org.jsoup.Connection.Response response6 = response1.header("hi!", "");
        java.lang.String str8 = response1.header("hi!");
        java.util.Map map9 = response1.headers();
        java.lang.String str10 = response1.statusMessage();
        java.lang.String str11 = response1.statusMessage();
        java.util.Map map12 = response1.headers();
        java.lang.String str13 = response1.contentType();
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
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01684");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("");
        org.jsoup.Connection.Method method10 = response0.method();
        java.util.Map map11 = response0.cookies();
        java.lang.Class<?> wildcardClass12 = map11.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01685");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response8 = response5.header("hi!", "hi!");
        java.util.Map map9 = response5.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        int int11 = response0.statusCode();
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response0.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test01686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01686");
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
        java.util.Map.Entry entry30 = response0.scanHeaders("hi!");
        java.net.URL uRL31 = response0.url();
        org.jsoup.Connection.Response response34 = response0.cookie("hi!", "");
        java.lang.Class<?> wildcardClass35 = response0.getClass();
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
        org.junit.Assert.assertNull(entry30);
        org.junit.Assert.assertNull(uRL31);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test01687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01687");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("");
        java.lang.String str4 = response1.contentType();
        java.lang.String str6 = response1.header("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str8 = response7.contentType();
        boolean boolean10 = response7.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01688");
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
        org.jsoup.Connection.Response response17 = response14.header("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response14);
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
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test01689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01689");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response6 = response0.removeCookie("hi!");
        java.lang.Class<?> wildcardClass7 = response0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01690");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        boolean boolean7 = response0.hasCookie("hi!");
        java.lang.String str8 = response0.contentType();
        org.jsoup.Connection.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response0.method(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01691");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.charset();
        java.lang.String str5 = response0.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test01692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01692");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response0.url();
        java.lang.String str4 = response0.cookie("");
        org.jsoup.Connection.Response response6 = response0.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response0.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test01693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01693");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("");
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "");
        java.lang.Class<?> wildcardClass12 = response11.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01694");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.net.URL uRL6 = response5.url();
        java.lang.String str7 = response5.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str9 = response8.contentType();
        java.util.Map map10 = response8.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test01695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01695");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        java.util.Map map6 = response0.cookies();
        java.net.URL uRL7 = response0.url();
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "");
        java.net.URL uRL12 = response0.url();
        org.jsoup.Connection.Response response14 = response0.removeCookie("");
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response0.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test01696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01696");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response4.header("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = response4.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01697");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.util.Map map3 = response0.cookies();
        java.net.URL uRL4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response5 = response0.url(uRL4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
    }

    @Test
    public void test01698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01698");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int8 = response0.statusCode();
        java.util.Map.Entry entry10 = response0.scanHeaders("");
        java.lang.String str12 = response0.header("");
        java.lang.String str14 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.lang.String str18 = response16.header("hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL20 = response19.url();
        java.lang.String str22 = response19.header("hi!");
        org.jsoup.Connection.Response response24 = response19.removeHeader("hi!");
        java.lang.String str26 = response19.header("hi!");
        java.lang.String str27 = response19.statusMessage();
        java.lang.String str29 = response19.cookie("hi!");
        org.jsoup.Connection.Response response32 = response19.cookie("hi!", "hi!");
        java.lang.String str34 = response19.header("hi!");
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL36 = response35.url();
        org.jsoup.Connection.Method method37 = response35.method();
        org.jsoup.Connection.Response response40 = response35.header("hi!", "");
        java.util.Map map41 = response35.headers();
        org.jsoup.helper.HttpConnection.Response response42 = new org.jsoup.helper.HttpConnection.Response(response35);
        int int43 = response35.statusCode();
        java.util.Map map44 = response35.headers();
        java.util.Map map45 = response35.cookies();
        response19.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map45);
        response16.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map45);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map45);
        org.jsoup.Connection.Method method49 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response50 = response0.method(method49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(uRL36);
        org.junit.Assert.assertNull(method37);
        org.junit.Assert.assertNotNull(response40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
    }

    @Test
    public void test01699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01699");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        int int11 = response0.statusCode();
        org.jsoup.Connection.Response response14 = response0.cookie("hi!", "");
        org.jsoup.Connection.Method method15 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document16 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test01700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01700");
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
        java.net.URL uRL24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response25 = response0.url(uRL24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test01701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01701");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.header("");
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method13 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response0.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test01702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01702");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.cookie("hi!", "hi!");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.cookie("");
        org.jsoup.Connection.Method method7 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = method7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test01703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01703");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.cookie("");
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.Connection.Response response12 = response0.cookie("hi!", "");
        java.lang.String str13 = response0.charset();
        java.lang.String str14 = response0.statusMessage();
        java.lang.String str15 = response0.charset();
        org.jsoup.Connection.Response response18 = response0.cookie("hi!", "hi!");
        org.jsoup.Connection.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response0.method(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test01704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01704");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str4 = response1.header("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        java.util.Map map7 = response1.headers();
        java.lang.String str8 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01705");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response4.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = response4.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01706");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry6 = response0.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(entry6);
    }

    @Test
    public void test01707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01707");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response10 = response7.header("hi!", "");
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str14 = response12.cookie("");
        java.lang.String str15 = response12.contentType();
        java.lang.String str17 = response12.header("hi!");
        boolean boolean19 = response12.hasCookie("hi!");
        java.lang.String str21 = response12.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response23 = response12.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            response7.setupFromConnection(httpURLConnection11, (org.jsoup.Connection.Response) response12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test01708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01708");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        java.util.Map map6 = response0.cookies();
        java.util.Map map7 = response0.cookies();
        java.util.Map map8 = response0.cookies();
        java.lang.Class<?> wildcardClass9 = map8.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01709");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        java.net.URL uRL4 = response1.url();
        org.jsoup.Connection.Response response7 = response1.header("hi!", "");
        java.lang.String str9 = response1.cookie("");
        int int10 = response1.statusCode();
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
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test01710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01710");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response6 = response0.header("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test01711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01711");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        org.jsoup.Connection.Method method4 = response0.method();
        int int5 = response0.statusCode();
        int int6 = response0.statusCode();
        java.lang.String str7 = response0.contentType();
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response0.url(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01712");
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
        java.net.HttpURLConnection httpURLConnection33 = null;
        org.jsoup.Connection.Response response34 = null;
        // The following exception was thrown during execution in test generation
        try {
            response8.setupFromConnection(httpURLConnection33, response34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test01713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01713");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response0.hasCookie("");
        org.jsoup.Connection.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response0.method(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01714");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        org.jsoup.Connection.Method method3 = response1.method();
        org.jsoup.Connection.Response response6 = response1.header("hi!", "");
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        java.lang.String str10 = response1.cookie("");
        java.util.Map map11 = response1.cookies();
        java.util.Map map12 = response1.cookies();
        boolean boolean14 = response1.hasCookie("");
        org.jsoup.Connection.Response response17 = response1.cookie("hi!", "");
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
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test01715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01715");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        int int4 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.HttpURLConnection httpURLConnection6 = null;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL8 = response7.url();
        org.jsoup.Connection.Method method9 = response7.method();
        org.jsoup.Connection.Response response11 = response7.removeCookie("hi!");
        java.lang.String str13 = response7.getHeaderCaseInsensitive("");
        java.util.Map map14 = response7.cookies();
        java.util.Map map15 = response7.headers();
        java.util.Map map16 = response7.cookies();
        java.lang.String str18 = response7.getHeaderCaseInsensitive("hi!");
        int int19 = response7.statusCode();
        java.util.Map.Entry entry21 = response7.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection6, (org.jsoup.Connection.Response) response7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(entry21);
    }

    @Test
    public void test01716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01716");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        java.util.Map map9 = response0.headers();
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response0.method(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test01717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01717");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean6 = response0.hasCookie("");
        int int7 = response0.statusCode();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test01718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01718");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean6 = response0.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01719");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response0.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response0.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01720");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response4 = response1.cookie("hi!", "hi!");
        int int5 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response6 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test01721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01721");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response6.contentType();
        boolean boolean9 = response6.hasHeader("hi!");
        int int10 = response6.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = response6.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test01722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01722");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        java.net.URL uRL5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response6 = response0.url(uRL5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01723");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str4 = response1.header("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry entry10 = response1.scanHeaders("hi!");
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
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01724");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        java.lang.String str9 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response0.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01725");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL10 = response9.url();
        java.net.URL uRL11 = response9.url();
        org.jsoup.Connection.Response response13 = response9.removeCookie("");
        java.lang.String str15 = response9.cookie("hi!");
        java.util.Map map16 = response9.cookies();
        response7.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map16);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response7.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test01726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01726");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = response6.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = response6.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(uRL7);
    }

    @Test
    public void test01727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01727");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = response6.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
    }

    @Test
    public void test01728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01728");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.charset();
        java.lang.Class<?> wildcardClass9 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01729");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        boolean boolean7 = response0.hasCookie("hi!");
        java.lang.String str9 = response0.getHeaderCaseInsensitive("");
        int int10 = response0.statusCode();
        java.util.Map map11 = response0.headers();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test01730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01730");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response8.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
    }

    @Test
    public void test01731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01731");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        java.lang.String str7 = response0.cookie("");
        java.lang.String str9 = response0.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01732");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        java.net.URL uRL3 = response0.url();
        java.net.URL uRL4 = response0.url();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response5.charset();
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response5.url(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01733");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.statusMessage();
        int int4 = response1.statusCode();
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.net.URL uRL8 = response1.url();
        org.jsoup.Connection.Method method9 = response1.method();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test01734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01734");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str4 = response1.statusMessage();
        java.util.Map.Entry entry6 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "");
        boolean boolean11 = response1.hasCookie("hi!");
        java.util.Map map12 = response1.cookies();
        java.lang.String str13 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01735");
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
        java.util.Map map20 = response13.cookies();
        java.lang.String str21 = response13.charset();
        java.net.HttpURLConnection httpURLConnection22 = null;
        org.jsoup.Connection.Response response23 = null;
        // The following exception was thrown during execution in test generation
        try {
            response13.setupFromConnection(httpURLConnection22, response23);
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
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(entry19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test01736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01736");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = response0.url();
        boolean boolean9 = response0.hasCookie("hi!");
        java.util.Map.Entry entry11 = response0.scanHeaders("");
        java.lang.Class<?> wildcardClass12 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01737");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("");
        java.lang.String str4 = response1.contentType();
        java.lang.String str6 = response1.header("hi!");
        org.jsoup.Connection.Response response8 = response1.removeCookie("");
        org.jsoup.Connection.Response response11 = response1.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str13 = response12.contentType();
        boolean boolean15 = response12.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test01738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01738");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.cookie("hi!");
        org.jsoup.Connection.Response response13 = response0.cookie("hi!", "hi!");
        int int14 = response0.statusCode();
        java.lang.String str16 = response0.cookie("hi!");
        org.jsoup.Connection.Method method17 = response0.method();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str20 = response18.cookie("");
        java.lang.String str21 = response18.contentType();
        java.lang.String str23 = response18.header("hi!");
        java.util.Map map24 = response18.cookies();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL26 = response25.url();
        org.jsoup.Connection.Method method27 = response25.method();
        java.lang.String str29 = response25.cookie("hi!");
        boolean boolean31 = response25.hasCookie("hi!");
        org.jsoup.Connection.Response response34 = response25.cookie("hi!", "");
        boolean boolean36 = response25.hasHeader("hi!");
        java.lang.String str37 = response25.statusMessage();
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response(response25);
        java.lang.String str39 = response25.statusMessage();
        java.util.Map map40 = response25.headers();
        java.util.Map map41 = response25.cookies();
        org.jsoup.helper.HttpConnection.Response response42 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL43 = response42.url();
        java.lang.String str44 = response42.statusMessage();
        int int45 = response42.statusCode();
        org.jsoup.Connection.Response response48 = response42.header("hi!", "hi!");
        java.util.Map map49 = response42.cookies();
        response25.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map49);
        response18.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map49);
        org.jsoup.helper.HttpConnection.Response response52 = new org.jsoup.helper.HttpConnection.Response(response18);
        java.util.Map map53 = response52.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map53);
        java.util.Map.Entry entry56 = response0.scanHeaders("");
        java.lang.Class<?> wildcardClass57 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(uRL43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(response48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(entry56);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test01739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01739");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("");
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response8 = response1.header("hi!", "hi!");
        java.lang.String str9 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01740");
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
        int int14 = response0.statusCode();
        java.lang.Class<?> wildcardClass15 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01741");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        int int11 = response0.statusCode();
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map14 = response13.headers();
        java.lang.String str16 = response13.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response19 = response13.cookie("hi!", "");
        int int20 = response13.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection12, (org.jsoup.Connection.Response) response13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test01742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01742");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response4.header("");
        org.jsoup.Connection.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response4.method(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01743");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method4 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
    }

    @Test
    public void test01744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01744");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str6 = response0.contentType();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method9 = response0.method();
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
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test01745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01745");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.cookie("");
        java.net.URL uRL6 = response0.url();
        org.jsoup.Connection.Method method7 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test01746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01746");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        java.util.Map.Entry entry8 = response0.scanHeaders("hi!");
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str11 = response0.header("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
    }

    @Test
    public void test01747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01747");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.cookie("");
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        java.util.Map map9 = response0.headers();
        int int10 = response0.statusCode();
        org.jsoup.Connection.Response response12 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method13 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test01748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01748");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response0.header("hi!", "hi!");
        java.lang.String str8 = response0.statusMessage();
        java.util.Map.Entry entry10 = response0.scanHeaders("");
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL13 = response12.url();
        java.lang.String str14 = response12.statusMessage();
        int int15 = response12.statusCode();
        org.jsoup.Connection.Response response18 = response12.header("hi!", "hi!");
        java.net.URL uRL19 = response12.url();
        boolean boolean21 = response12.hasCookie("hi!");
        java.lang.String str22 = response12.contentType();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection11, (org.jsoup.Connection.Response) response12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test01749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01749");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.header("");
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response0.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test01750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01750");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response4 = response0.url(uRL3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
    }

    @Test
    public void test01751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01751");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map.Entry entry6 = response0.scanHeaders("");
        org.jsoup.Connection.Response response9 = response0.header("hi!", "hi!");
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response0.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test01752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01752");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        boolean boolean7 = response0.hasCookie("hi!");
        java.lang.String str8 = response0.contentType();
        java.util.Map map9 = response0.headers();
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response0.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test01753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01753");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map.Entry entry4 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.HttpURLConnection httpURLConnection6 = null;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL8 = response7.url();
        java.lang.String str9 = response7.statusMessage();
        boolean boolean11 = response7.hasCookie("hi!");
        boolean boolean13 = response7.hasHeader("hi!");
        boolean boolean15 = response7.hasCookie("");
        java.util.Map.Entry entry17 = response7.scanHeaders("hi!");
        java.lang.String str19 = response7.cookie("hi!");
        int int20 = response7.statusCode();
        java.lang.String str21 = response7.contentType();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection6, (org.jsoup.Connection.Response) response7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(entry4);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(entry17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test01754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01754");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response32 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
    }

    @Test
    public void test01755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01755");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01756");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.cookies();
        boolean boolean10 = response0.hasHeader("hi!");
        java.lang.String str11 = response0.charset();
        java.util.Map map12 = response0.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test01757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01757");
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
        java.lang.String str18 = response0.getHeaderCaseInsensitive("");
        java.lang.String str20 = response0.cookie("hi!");
        java.util.Map.Entry entry22 = response0.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(entry22);
    }

    @Test
    public void test01758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01758");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.util.Map map8 = response0.cookies();
        org.jsoup.Connection.Response response11 = response0.header("hi!", "hi!");
        java.lang.String str13 = response0.header("");
        java.net.URL uRL14 = response0.url();
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response0.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test01759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01759");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.net.URL uRL3 = response1.url();
        java.net.URL uRL4 = response1.url();
        java.net.URL uRL5 = response1.url();
        java.lang.String str7 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL9 = response8.url();
        org.jsoup.Connection.Method method10 = response8.method();
        java.lang.String str12 = response8.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map14 = response13.headers();
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test01760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01760");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.headers();
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str10 = response0.statusMessage();
        boolean boolean12 = response0.hasHeader("hi!");
        int int13 = response0.statusCode();
        org.jsoup.Connection.Response response16 = response0.header("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test01761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01761");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.statusMessage();
        java.util.Map map4 = response1.cookies();
        java.lang.String str6 = response1.header("hi!");
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.charset();
        boolean boolean12 = response1.hasHeader("hi!");
        org.jsoup.Connection.Response response14 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response16 = response1.removeHeader("hi!");
        int int17 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test01762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01762");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.net.URL uRL7 = response0.url();
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response0.url(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL7);
    }

    @Test
    public void test01763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01763");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        java.lang.String str6 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry9 = response7.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response7.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(entry9);
    }

    @Test
    public void test01764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01764");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.util.Map map8 = response0.cookies();
        org.jsoup.Connection.Response response11 = response0.header("hi!", "hi!");
        java.lang.String str13 = response0.header("");
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response0.method(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
    }

    @Test
    public void test01765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01765");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map map5 = response0.headers();
        boolean boolean7 = response0.hasCookie("hi!");
        int int8 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test01766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01766");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean9 = response0.hasCookie("");
        java.lang.String str10 = response0.statusMessage();
        org.jsoup.Connection.Response response13 = response0.cookie("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response0.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test01767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01767");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        boolean boolean6 = response0.hasHeader("hi!");
        java.util.Map map7 = response0.cookies();
        org.jsoup.Connection.Response response9 = response0.removeCookie("");
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.net.URL uRL13 = response11.url();
        java.lang.String str15 = response11.cookie("");
        java.util.Map.Entry entry17 = response11.scanHeaders("hi!");
        java.lang.String str19 = response11.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response21 = response11.removeCookie("");
        int int22 = response11.statusCode();
        int int23 = response11.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(entry17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test01768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01768");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.cookie("");
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.Connection.Response response12 = response0.cookie("hi!", "");
        java.lang.String str13 = response0.charset();
        java.lang.String str14 = response0.statusMessage();
        java.lang.String str15 = response0.charset();
        java.net.HttpURLConnection httpURLConnection16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL18 = response17.url();
        org.jsoup.Connection.Method method19 = response17.method();
        org.jsoup.Connection.Response response22 = response17.header("hi!", "");
        org.jsoup.Connection.Response response24 = response17.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection16, (org.jsoup.Connection.Response) response17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(response24);
    }

    @Test
    public void test01769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01769");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL12 = response0.url();
        java.lang.Class<?> wildcardClass13 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01770");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response4.statusMessage();
        java.net.URL uRL6 = response4.url();
        org.jsoup.Connection.Method method7 = response4.method();
        java.net.URL uRL8 = response4.url();
        org.jsoup.Connection.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response4.method(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test01771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01771");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map4 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map4);
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map9 = response8.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = response8.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test01772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01772");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response0.url();
        java.lang.String str4 = response0.cookie("");
        java.util.Map.Entry entry6 = response0.scanHeaders("hi!");
        java.lang.String str7 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL9 = response8.url();
        java.lang.String str11 = response8.header("hi!");
        org.jsoup.Connection.Response response13 = response8.removeHeader("hi!");
        java.lang.String str15 = response8.cookie("hi!");
        boolean boolean17 = response8.hasHeader("hi!");
        java.util.Map map18 = response8.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        java.net.HttpURLConnection httpURLConnection20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL22 = response21.url();
        org.jsoup.Connection.Method method23 = response21.method();
        java.lang.String str25 = response21.cookie("hi!");
        boolean boolean27 = response21.hasCookie("hi!");
        org.jsoup.Connection.Response response30 = response21.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection20, (org.jsoup.Connection.Response) response21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(response30);
    }

    @Test
    public void test01773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01773");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response6 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry9 = response7.scanHeaders("hi!");
        java.lang.String str11 = response7.cookie("hi!");
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response7.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01774");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.util.Map map3 = response0.headers();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.net.URL uRL6 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
    }

    @Test
    public void test01775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01775");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.charset();
        java.lang.String str9 = response0.charset();
        org.jsoup.Connection.Response response12 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test01776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01776");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.util.Map map7 = response0.headers();
        int int8 = response0.statusCode();
        java.util.Map map9 = response0.cookies();
        java.util.Map map10 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test01777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01777");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map map7 = response0.cookies();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        java.lang.String str11 = response0.header("hi!");
        java.lang.String str12 = response0.contentType();
        org.jsoup.Connection.Response response14 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL16 = response15.url();
        org.jsoup.Connection.Method method17 = response15.method();
        org.jsoup.Connection.Response response20 = response15.header("hi!", "");
        java.util.Map map21 = response15.headers();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response15);
        int int23 = response15.statusCode();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL25 = response24.url();
        java.lang.String str27 = response24.header("hi!");
        org.jsoup.Connection.Response response29 = response24.removeCookie("hi!");
        org.jsoup.Connection.Response response31 = response24.removeCookie("");
        java.util.Map map32 = response24.cookies();
        response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map32);
        java.lang.String str34 = response15.statusMessage();
        java.util.Map map35 = response15.headers();
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to java.util.List");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(map35);
    }

    @Test
    public void test01778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01778");
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
        java.lang.String str15 = response0.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test01779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01779");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        org.jsoup.Connection.Method method3 = response1.method();
        java.lang.String str5 = response1.cookie("hi!");
        boolean boolean7 = response1.hasCookie("hi!");
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "");
        java.lang.String str12 = response1.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test01780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01780");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response0.headers();
        java.lang.Class<?> wildcardClass8 = response0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01781");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        boolean boolean7 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str11 = response9.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response9.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01782");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.header("hi!");
        java.lang.String str5 = response2.statusMessage();
        java.util.Map.Entry entry7 = response2.scanHeaders("hi!");
        org.jsoup.Connection.Response response10 = response2.cookie("hi!", "");
        boolean boolean12 = response2.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test01783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01783");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasHeader("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str12 = response0.header("");
        java.lang.String str13 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean16 = response14.hasCookie("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01784");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int8 = response0.statusCode();
        java.util.Map map9 = response0.headers();
        java.util.Map map10 = response0.cookies();
        java.lang.String str12 = response0.cookie("");
        java.lang.String str14 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response0.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test01785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01785");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(method6);
    }

    @Test
    public void test01786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01786");
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
        org.jsoup.Connection.Response response20 = response0.header("hi!", "");
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
        org.jsoup.Connection.Method method40 = response38.method();
        org.jsoup.Connection.Response response42 = response38.removeCookie("hi!");
        java.lang.String str44 = response38.getHeaderCaseInsensitive("");
        java.util.Map map45 = response38.cookies();
        java.util.Map map46 = response38.headers();
        java.util.Map map47 = response38.cookies();
        response21.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map47);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map47);
        java.lang.String str51 = response0.getHeaderCaseInsensitive("hi!");
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
        org.junit.Assert.assertNull(method40);
        org.junit.Assert.assertNotNull(response42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test01787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01787");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str6 = response0.contentType();
        java.lang.String str8 = response0.cookie("hi!");
        boolean boolean10 = response0.hasHeader("hi!");
        int int11 = response0.statusCode();
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test01788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01788");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.Connection.Method method5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response6 = response1.method(method5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
    }

    @Test
    public void test01789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01789");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("");
        java.lang.String str4 = response1.contentType();
        java.lang.String str6 = response1.header("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str9 = response1.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response13 = response10.header("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test01790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01790");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        boolean boolean4 = response0.hasHeader("hi!");
        java.net.URL uRL5 = response0.url();
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        boolean boolean9 = response0.hasCookie("hi!");
        java.util.Map map10 = response0.cookies();
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test01791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01791");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        java.net.URL uRL4 = response1.url();
        int int5 = response1.statusCode();
        java.lang.String str6 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response7.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01792");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response6.getHeaderCaseInsensitive("hi!");
        java.net.HttpURLConnection httpURLConnection9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL11 = response10.url();
        org.jsoup.Connection.Method method12 = response10.method();
        java.lang.String str14 = response10.cookie("hi!");
        boolean boolean16 = response10.hasCookie("hi!");
        org.jsoup.Connection.Response response19 = response10.cookie("hi!", "");
        boolean boolean21 = response10.hasHeader("hi!");
        java.lang.String str22 = response10.statusMessage();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.lang.String str25 = response10.getHeaderCaseInsensitive("");
        java.lang.String str26 = response10.charset();
        // The following exception was thrown during execution in test generation
        try {
            response6.setupFromConnection(httpURLConnection9, (org.jsoup.Connection.Response) response10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test01793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01793");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response7.statusMessage();
        java.util.Map map9 = response7.headers();
        org.jsoup.Connection.Method method10 = response7.method();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = response11.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test01794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01794");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(entry9);
    }

    @Test
    public void test01795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01795");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01796");
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
        org.jsoup.Connection.Method method49 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response50 = response37.method(method49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
    }

    @Test
    public void test01797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01797");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response9 = response0.removeHeader("hi!");
        java.lang.Class<?> wildcardClass10 = response9.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01798");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response4.contentType();
        java.util.Map map6 = response4.headers();
        org.jsoup.Connection.Response response8 = response4.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = response4.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test01799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01799");
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
        java.net.URL uRL14 = response0.url();
        java.lang.String str16 = response0.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response0.bodyAsBytes();
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
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test01800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01800");
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
        java.lang.String str15 = response0.charset();
        java.net.HttpURLConnection httpURLConnection16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str19 = response17.cookie("");
        java.lang.String str20 = response17.statusMessage();
        java.lang.String str22 = response17.header("hi!");
        org.jsoup.Connection.Method method23 = response17.method();
        int int24 = response17.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection16, (org.jsoup.Connection.Response) response17);
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test01801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01801");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.cookies();
        boolean boolean10 = response0.hasHeader("hi!");
        java.lang.String str11 = response0.charset();
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL14 = response13.url();
        java.lang.String str16 = response13.header("hi!");
        boolean boolean18 = response13.hasCookie("hi!");
        org.jsoup.Connection.Response response20 = response13.removeCookie("");
        java.net.URL uRL21 = response13.url();
        org.jsoup.Connection.Response response23 = response13.removeCookie("hi!");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test01802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01802");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
    }

    @Test
    public void test01803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01803");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.cookie("hi!", "hi!");
        int int4 = response0.statusCode();
        java.util.Map map5 = response0.cookies();
        java.lang.String str6 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response0.url(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01804");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.cookie("hi!");
        org.jsoup.Connection.Response response13 = response0.cookie("hi!", "hi!");
        int int14 = response0.statusCode();
        java.lang.String str16 = response0.cookie("hi!");
        org.jsoup.Connection.Method method17 = response0.method();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str20 = response18.cookie("");
        java.lang.String str21 = response18.contentType();
        java.lang.String str23 = response18.header("hi!");
        java.util.Map map24 = response18.cookies();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL26 = response25.url();
        org.jsoup.Connection.Method method27 = response25.method();
        java.lang.String str29 = response25.cookie("hi!");
        boolean boolean31 = response25.hasCookie("hi!");
        org.jsoup.Connection.Response response34 = response25.cookie("hi!", "");
        boolean boolean36 = response25.hasHeader("hi!");
        java.lang.String str37 = response25.statusMessage();
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response(response25);
        java.lang.String str39 = response25.statusMessage();
        java.util.Map map40 = response25.headers();
        java.util.Map map41 = response25.cookies();
        org.jsoup.helper.HttpConnection.Response response42 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL43 = response42.url();
        java.lang.String str44 = response42.statusMessage();
        int int45 = response42.statusCode();
        org.jsoup.Connection.Response response48 = response42.header("hi!", "hi!");
        java.util.Map map49 = response42.cookies();
        response25.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map49);
        response18.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map49);
        org.jsoup.helper.HttpConnection.Response response52 = new org.jsoup.helper.HttpConnection.Response(response18);
        java.util.Map map53 = response52.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map53);
        java.util.Map.Entry entry56 = response0.scanHeaders("");
        java.net.URL uRL57 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response58 = response0.url(uRL57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(uRL43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(response48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(entry56);
    }

    @Test
    public void test01805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01805");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.lang.String str9 = response0.cookie("");
        java.util.Map map10 = response0.cookies();
        int int11 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test01806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01806");
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
        java.util.Map.Entry entry30 = response0.scanHeaders("hi!");
        java.lang.String str32 = response0.cookie("");
        java.lang.String str33 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = response0.body();
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
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(uRL28);
        org.junit.Assert.assertNull(entry30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test01807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01807");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.util.Map map3 = response0.headers();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.charset();
        java.util.Map map7 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response0.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test01808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01808");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.charset();
        java.lang.String str4 = response0.contentType();
        boolean boolean6 = response0.hasHeader("hi!");
        java.lang.String str8 = response0.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response0.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01809");
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
        boolean boolean14 = response0.hasCookie("");
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response0.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01810");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.util.Map map3 = response0.headers();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.charset();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01811");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map.Entry entry4 = response0.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(entry4);
    }

    @Test
    public void test01812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01812");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response1.hasCookie("hi!");
        int int4 = response1.statusCode();
        int int5 = response1.statusCode();
        java.lang.String str6 = response1.charset();
        boolean boolean8 = response1.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.Connection.Method method11 = response9.method();
        java.util.Map map12 = response9.headers();
        java.net.URL uRL13 = response9.url();
        java.util.Map map14 = response9.cookies();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test01813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01813");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        boolean boolean4 = response0.hasHeader("hi!");
        java.net.URL uRL5 = response0.url();
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.net.URL uRL8 = response0.url();
        int int9 = response0.statusCode();
        java.net.HttpURLConnection httpURLConnection10 = null;
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
        java.lang.String str27 = response11.statusMessage();
        java.util.Map map28 = response11.cookies();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test01814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01814");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map.Entry entry4 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL6 = response5.url();
        java.lang.String str7 = response5.contentType();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(entry4);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01815");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response9 = response0.cookie("hi!", "");
        java.util.Map.Entry entry11 = response0.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(entry11);
    }

    @Test
    public void test01816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01816");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL3 = response2.url();
        java.lang.String str4 = response2.charset();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str6 = response5.statusMessage();
        java.lang.String str8 = response5.header("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01817");
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
        org.jsoup.Connection.Method method20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response0.method(method20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test01818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01818");
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
        boolean boolean16 = response0.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test01819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01819");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        int int7 = response0.statusCode();
        java.lang.String str8 = response0.charset();
        int int9 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response10.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
    }

    @Test
    public void test01820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01820");
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
        org.jsoup.Connection.Response response20 = response0.header("hi!", "");
        java.net.HttpURLConnection httpURLConnection21 = null;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str24 = response22.cookie("");
        java.lang.String str25 = response22.contentType();
        java.lang.String str27 = response22.header("hi!");
        org.jsoup.Connection.Response response29 = response22.removeCookie("");
        java.lang.String str31 = response22.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection21, (org.jsoup.Connection.Response) response22);
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
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test01821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01821");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.statusMessage();
        java.util.Map map4 = response1.cookies();
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        java.util.Map.Entry entry8 = response1.scanHeaders("");
        java.util.Map.Entry entry10 = response1.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL12 = response11.url();
        java.lang.String str13 = response11.statusMessage();
        java.util.Map map14 = response11.cookies();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        boolean boolean17 = response1.hasCookie("");
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
        java.util.Map map33 = response18.headers();
        java.util.Map map34 = response18.cookies();
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL36 = response35.url();
        org.jsoup.Connection.Method method37 = response35.method();
        org.jsoup.Connection.Response response39 = response35.removeCookie("hi!");
        java.lang.String str41 = response35.getHeaderCaseInsensitive("");
        java.util.Map map42 = response35.cookies();
        java.util.Map map43 = response35.headers();
        java.util.Map map44 = response35.cookies();
        response18.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map44);
        org.jsoup.helper.HttpConnection.Response response46 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL47 = response46.url();
        org.jsoup.Connection.Method method48 = response46.method();
        java.lang.String str50 = response46.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response51 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map52 = response51.headers();
        response46.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map52);
        response18.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map52);
        org.jsoup.helper.HttpConnection.Response response55 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.helper.HttpConnection.Response response56 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str58 = response56.cookie("");
        java.lang.String str59 = response56.contentType();
        java.lang.String str61 = response56.header("hi!");
        boolean boolean63 = response56.hasCookie("hi!");
        int int64 = response56.statusCode();
        java.util.Map map65 = response56.cookies();
        response55.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map65);
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map65);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response68 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(uRL36);
        org.junit.Assert.assertNull(method37);
        org.junit.Assert.assertNotNull(response39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(uRL47);
        org.junit.Assert.assertNull(method48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(map65);
    }

    @Test
    public void test01822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01822");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.cookie("hi!");
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response6 = response0.method(method5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
    }

    @Test
    public void test01823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01823");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response4 = response1.header("hi!", "hi!");
        boolean boolean6 = response1.hasCookie("hi!");
        java.lang.String str8 = response1.header("");
        boolean boolean10 = response1.hasCookie("hi!");
        java.util.Map map11 = response1.cookies();
        java.lang.String str12 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test01824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01824");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        boolean boolean7 = response0.hasCookie("hi!");
        java.lang.String str9 = response0.getHeaderCaseInsensitive("");
        java.lang.String str10 = response0.statusMessage();
        java.lang.String str12 = response0.header("");
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str16 = response14.cookie("");
        java.net.URL uRL17 = response14.url();
        org.jsoup.Connection.Method method18 = response14.method();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.Connection.Response response21 = response19.removeCookie("");
        java.lang.String str23 = response19.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test01825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01825");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.cookie("hi!", "hi!");
        int int4 = response0.statusCode();
        java.util.Map map5 = response0.cookies();
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.util.Map.Entry entry9 = response0.scanHeaders("");
        java.lang.String str10 = response0.statusMessage();
        java.lang.String str11 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01826");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        java.lang.String str6 = response0.header("hi!");
        int int7 = response0.statusCode();
        boolean boolean9 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response10.method(method11);
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
    public void test01827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01827");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        boolean boolean4 = response0.hasHeader("hi!");
        java.net.URL uRL5 = response0.url();
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.net.URL uRL8 = response0.url();
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str10 = response0.statusMessage();
        java.util.Map.Entry entry12 = response0.scanHeaders("");
        org.jsoup.Connection.Response response14 = response0.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(entry12);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test01828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01828");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Response response3 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean6 = response0.hasHeader("hi!");
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str10 = response8.cookie("");
        org.jsoup.Connection.Response response12 = response8.removeHeader("hi!");
        int int13 = response8.statusCode();
        boolean boolean15 = response8.hasHeader("hi!");
        java.lang.String str16 = response8.statusMessage();
        java.lang.String str17 = response8.statusMessage();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL19 = response18.url();
        org.jsoup.Connection.Method method20 = response18.method();
        org.jsoup.Connection.Response response23 = response18.header("hi!", "");
        java.lang.String str24 = response18.charset();
        java.util.Map map25 = response18.cookies();
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray28 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test01829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01829");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        org.jsoup.Connection.Response response7 = response0.cookie("hi!", "hi!");
        boolean boolean9 = response0.hasCookie("");
        org.jsoup.Connection.Response response12 = response0.cookie("hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01830");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response1.removeCookie("");
        java.util.Map map8 = response1.headers();
        java.util.Map map9 = response1.cookies();
        java.lang.Class<?> wildcardClass10 = map9.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01831");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        boolean boolean9 = response0.hasCookie("hi!");
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.lang.String str14 = response12.header("hi!");
        org.jsoup.Connection.Response response16 = response12.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Response response19 = response17.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test01832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01832");
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
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response0.method(method13);
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test01833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01833");
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
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str17 = response15.cookie("");
        java.lang.String str18 = response15.statusMessage();
        java.lang.String str20 = response15.cookie("");
        java.lang.String str22 = response15.getHeaderCaseInsensitive("hi!");
        int int23 = response15.statusCode();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str26 = response24.cookie("");
        java.lang.String str27 = response24.statusMessage();
        java.lang.String str29 = response24.header("hi!");
        java.lang.String str30 = response24.contentType();
        java.util.Map map31 = response24.headers();
        response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        java.net.URL uRL34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response35 = response0.url(uRL34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test01834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01834");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response1.hasCookie("hi!");
        int int4 = response1.statusCode();
        int int5 = response1.statusCode();
        java.lang.String str6 = response1.charset();
        boolean boolean8 = response1.hasCookie("");
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response1.url(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01835");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = response0.url();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL9 = response8.url();
        org.jsoup.Connection.Method method10 = response8.method();
        java.lang.String str12 = response8.cookie("hi!");
        boolean boolean14 = response8.hasCookie("hi!");
        org.jsoup.Connection.Response response17 = response8.cookie("hi!", "");
        boolean boolean19 = response8.hasHeader("hi!");
        java.lang.String str20 = response8.statusMessage();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str22 = response21.statusMessage();
        boolean boolean24 = response21.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response25);
        java.lang.String str28 = response26.header("hi!");
        org.jsoup.Connection.Response response30 = response26.removeHeader("hi!");
        org.jsoup.Connection.Response response32 = response26.removeCookie("");
        java.util.Map map33 = response26.headers();
        java.util.Map map34 = response26.cookies();
        response21.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map34);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map34);
        int int37 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test01836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01836");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.util.Map map8 = response0.headers();
        java.lang.String str10 = response0.getHeaderCaseInsensitive("");
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01837");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = response7.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test01838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01838");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        java.lang.String str6 = response0.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01839");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response6 = response0.removeCookie("hi!");
        java.util.Map map7 = response0.headers();
        java.lang.Class<?> wildcardClass8 = map7.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01840");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.lang.String str5 = response0.cookie("");
        org.jsoup.Connection.Method method6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = response0.method(method6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test01841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01841");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str6 = response0.contentType();
        org.jsoup.Connection.Response response9 = response0.header("hi!", "hi!");
        java.lang.String str10 = response0.statusMessage();
        java.util.Map map11 = response0.cookies();
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response0.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test01842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01842");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method3 = response1.method();
        org.jsoup.Connection.Method method4 = response1.method();
        java.util.Map.Entry entry6 = response1.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(entry6);
    }

    @Test
    public void test01843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01843");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.statusMessage();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        java.lang.String str6 = response0.contentType();
        java.lang.String str7 = response0.contentType();
        java.net.HttpURLConnection httpURLConnection8 = null;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL10 = response9.url();
        java.lang.String str12 = response9.header("hi!");
        org.jsoup.Connection.Response response14 = response9.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection8, response14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test01844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01844");
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
        java.lang.String str52 = response13.contentType();
        java.lang.String str53 = response13.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document54 = response13.parse();
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
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test01845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01845");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.cookie("hi!");
        java.lang.String str4 = response0.statusMessage();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map.Entry entry8 = response0.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(entry8);
    }

    @Test
    public void test01846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01846");
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
        java.util.Map map21 = response0.headers();
        java.lang.String str22 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str25 = response23.cookie("");
        java.lang.String str26 = response23.contentType();
        java.lang.String str28 = response23.header("hi!");
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response23);
        java.util.Map map30 = response23.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        java.net.URL uRL32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response33 = response0.url(uRL32);
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
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test01847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01847");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        java.lang.String str7 = response0.cookie("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method9 = response8.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response8.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test01848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01848");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.cookie("");
        java.net.URL uRL6 = response0.url();
        org.jsoup.Connection.Response response8 = response0.removeCookie("hi!");
        java.util.Map map9 = response0.cookies();
        java.lang.Class<?> wildcardClass10 = map9.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01849");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Method method4 = response0.method();
        java.lang.String str6 = response0.header("hi!");
        org.jsoup.Connection.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response0.method(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01850");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response0.method(method9);
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
    }

    @Test
    public void test01851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01851");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        java.util.Map map8 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test01852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01852");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response0.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
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
    }

    @Test
    public void test01853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01853");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        java.util.Map map4 = response0.cookies();
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response0.url(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test01854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01854");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str8 = response0.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response0.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01855");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.lang.String str9 = response0.cookie("");
        java.util.Map map10 = response0.cookies();
        java.util.Map map11 = response0.cookies();
        boolean boolean13 = response0.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01856");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        boolean boolean9 = response0.hasCookie("hi!");
        org.jsoup.Connection.Method method10 = response0.method();
        boolean boolean12 = response0.hasCookie("");
        java.lang.String str13 = response0.contentType();
        java.net.HttpURLConnection httpURLConnection14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL16 = response15.url();
        java.lang.String str18 = response15.header("hi!");
        java.util.Map map19 = response15.headers();
        java.lang.String str21 = response15.cookie("hi!");
        java.net.URL uRL22 = response15.url();
        org.jsoup.Connection.Response response25 = response15.header("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection14, response25);
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
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNotNull(response25);
    }

    @Test
    public void test01857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01857");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        java.util.Map.Entry entry6 = response0.scanHeaders("hi!");
        java.util.Map.Entry entry8 = response0.scanHeaders("");
        java.util.Map map9 = response0.cookies();
        int int10 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response0.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
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
    }

    @Test
    public void test01858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01858");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.charset();
        java.lang.String str9 = response0.charset();
        boolean boolean11 = response0.hasHeader("hi!");
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL14 = response13.url();
        org.jsoup.Connection.Method method15 = response13.method();
        java.lang.String str17 = response13.cookie("hi!");
        boolean boolean19 = response13.hasCookie("hi!");
        int int20 = response13.statusCode();
        java.lang.String str21 = response13.charset();
        int int22 = response13.statusCode();
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test01859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01859");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        org.jsoup.Connection.Method method3 = response1.method();
        java.lang.String str5 = response1.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map7);
        boolean boolean10 = response1.hasCookie("");
        java.lang.String str11 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01860");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.net.URL uRL7 = response0.url();
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL11 = response0.url();
        java.util.Map map12 = response0.headers();
        java.lang.String str13 = response0.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(entry9);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01861");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.cookie("hi!");
        boolean boolean9 = response0.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01862");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.util.Map.Entry entry5 = response1.scanHeaders("hi!");
        int int6 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test01863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01863");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test01864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01864");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.net.URL uRL7 = response0.url();
        boolean boolean9 = response0.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01865");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        boolean boolean4 = response0.hasHeader("hi!");
        java.net.URL uRL5 = response0.url();
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.util.Map map8 = response0.headers();
        java.util.Map.Entry entry10 = response0.scanHeaders("");
        org.jsoup.Connection.Response response12 = response0.removeCookie("hi!");
        boolean boolean14 = response0.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response0.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01866");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        java.lang.String str6 = response0.header("hi!");
        int int7 = response0.statusCode();
        boolean boolean9 = response0.hasHeader("hi!");
        java.util.Map map10 = response0.headers();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test01867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01867");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = response0.url();
        java.util.Map map8 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test01868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01868");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        boolean boolean4 = response0.hasHeader("hi!");
        java.net.URL uRL5 = response0.url();
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.net.URL uRL8 = response0.url();
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str10 = response0.statusMessage();
        java.util.Map map11 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response0.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test01869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01869");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("");
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "");
        java.lang.String str12 = response0.statusMessage();
        java.util.Map map13 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response0.body();
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
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test01870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01870");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        boolean boolean7 = response0.hasCookie("hi!");
        java.lang.String str8 = response0.contentType();
        org.jsoup.Connection.Method method9 = response0.method();
        java.util.Map map10 = response0.cookies();
        java.lang.String str12 = response0.cookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response0.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test01871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01871");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("hi!");
        int int8 = response0.statusCode();
        boolean boolean10 = response0.hasCookie("");
        java.lang.String str12 = response0.cookie("");
        java.lang.Class<?> wildcardClass13 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01872");
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
        java.util.Map map18 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = response0.hasHeader("");
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
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test01873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01873");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        java.net.URL uRL4 = response1.url();
        java.util.Map map5 = response1.cookies();
        java.util.Map map6 = response1.cookies();
        java.lang.Class<?> wildcardClass7 = map6.getClass();
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01874");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        java.lang.String str7 = response0.charset();
        int int8 = response0.statusCode();
        org.jsoup.Connection.Method method9 = response0.method();
        java.lang.String str11 = response0.header("hi!");
        java.lang.Class<?> wildcardClass12 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01875");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.Connection.Response response11 = response0.header("hi!", "hi!");
        boolean boolean13 = response0.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test01876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01876");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.cookie("hi!");
        java.lang.String str4 = response0.statusMessage();
        java.net.URL uRL5 = response0.url();
        org.jsoup.Connection.Response response8 = response0.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test01877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01877");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        java.util.Map.Entry entry6 = response0.scanHeaders("hi!");
        java.net.URL uRL7 = response0.url();
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method10 = response9.method();
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response9.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test01878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01878");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response6 = response0.header("hi!", "");
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response0.url(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test01879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01879");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.lang.String str8 = response0.cookie("");
        java.lang.Class<?> wildcardClass9 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01880");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = response0.url();
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(entry9);
    }

    @Test
    public void test01881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01881");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.cookie("hi!");
        java.lang.String str9 = response0.getHeaderCaseInsensitive("hi!");
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response0.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01882");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.lang.String str8 = response0.cookie("");
        org.jsoup.Connection.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response0.method(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01883");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.Connection.Method method4 = response2.method();
        java.util.Map map5 = response2.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.net.URL uRL7 = response1.url();
        java.lang.String str9 = response1.cookie("hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            response1.processResponseHeaders(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01884");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str9 = response6.charset();
        java.lang.Class<?> wildcardClass10 = response6.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01885");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.statusMessage();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        org.jsoup.Connection.Method method6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = response0.method(method6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(entry5);
    }

    @Test
    public void test01886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01886");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray3 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01887");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean6 = response0.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01888");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        java.util.Map map6 = response0.cookies();
        java.net.URL uRL7 = response0.url();
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Method method9 = response0.method();
        boolean boolean11 = response0.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response0.bodyAsBytes();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01889");
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
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response(response35);
        java.lang.String str38 = response36.header("hi!");
        java.lang.String str40 = response36.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response42 = response36.removeCookie("");
        org.jsoup.Connection.Response response45 = response36.cookie("hi!", "hi!");
        java.util.Map map46 = response36.cookies();
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map46);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to java.util.List");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(response42);
        org.junit.Assert.assertNotNull(response45);
        org.junit.Assert.assertNotNull(map46);
    }

    @Test
    public void test01890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01890");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "hi!");
        java.lang.String str12 = response0.getHeaderCaseInsensitive("");
        java.lang.String str14 = response0.header("");
        java.util.Map map15 = response0.headers();
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response0.url(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test01891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01891");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        java.util.Map.Entry entry8 = response0.scanHeaders("hi!");
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str11 = response0.header("");
        org.jsoup.Connection.Method method12 = response0.method();
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
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test01892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01892");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.util.Map map8 = response0.headers();
        org.jsoup.Connection.Response response10 = response0.removeHeader("hi!");
        java.lang.String str12 = response0.header("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test01893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01893");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.util.Map map8 = response0.cookies();
        org.jsoup.Connection.Response response11 = response0.header("hi!", "hi!");
        java.lang.String str13 = response0.header("");
        java.net.URL uRL14 = response0.url();
        java.util.Map.Entry entry16 = response0.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response0.body();
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
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(entry16);
    }

    @Test
    public void test01894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01894");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.util.Map map3 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray4 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(map3);
    }

    @Test
    public void test01895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01895");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str7 = response0.contentType();
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test01896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01896");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        boolean boolean9 = response0.hasCookie("hi!");
        java.lang.String str10 = response0.statusMessage();
        org.jsoup.Connection.Method method11 = response0.method();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Method method14 = response12.method();
        org.jsoup.Connection.Response response17 = response12.cookie("hi!", "");
        java.util.Map map18 = response12.cookies();
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to java.util.List");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test01897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01897");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01898");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str6 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str9 = response0.header("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
    public void test01899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01899");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("");
        boolean boolean5 = response1.hasHeader("hi!");
        java.net.URL uRL6 = response1.url();
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        boolean boolean10 = response1.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01900");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        java.net.URL uRL4 = response1.url();
        java.util.Map map5 = response1.cookies();
        java.util.Map map6 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test01901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01901");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response1.hasCookie("hi!");
        org.jsoup.Connection.Method method4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response5 = response1.method(method4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test01902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01902");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL5 = response4.url();
        java.lang.String str7 = response4.header("hi!");
        java.util.Map map8 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map8);
        java.lang.String str10 = response0.statusMessage();
        org.jsoup.Connection.Response response12 = response0.removeCookie("");
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL15 = response14.url();
        java.lang.String str17 = response14.header("hi!");
        org.jsoup.Connection.Response response19 = response14.removeHeader("hi!");
        java.util.Map map20 = response14.headers();
        org.jsoup.Connection.Response response22 = response14.removeHeader("hi!");
        java.util.Map.Entry entry24 = response14.scanHeaders("hi!");
        boolean boolean26 = response14.hasCookie("hi!");
        java.util.Map.Entry entry28 = response14.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(entry24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(entry28);
    }

    @Test
    public void test01903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01903");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        boolean boolean4 = response0.hasHeader("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.net.URL uRL9 = response7.url();
        java.lang.String str11 = response7.cookie("");
        java.util.Map map12 = response7.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response0.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test01904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01904");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response4 = response1.header("hi!", "hi!");
        boolean boolean6 = response1.hasCookie("hi!");
        java.lang.String str8 = response1.header("");
        boolean boolean10 = response1.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01905");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str4 = response1.statusMessage();
        java.util.Map.Entry entry6 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "");
        java.lang.Class<?> wildcardClass10 = response1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01906");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map.Entry entry4 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response0.cookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response0.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(entry4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01907");
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
        java.util.Map map37 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = response0.hasHeader("");
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
        org.junit.Assert.assertNotNull(map37);
    }

    @Test
    public void test01908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01908");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response0.method(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01909");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.cookie("hi!");
        org.jsoup.Connection.Response response13 = response0.cookie("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str15 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test01910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01910");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        java.util.Map map4 = response0.cookies();
        java.lang.String str5 = response0.statusMessage();
        boolean boolean7 = response0.hasCookie("hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(entry9);
    }

    @Test
    public void test01911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01911");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map4 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map4);
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = response8.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(entry7);
    }

    @Test
    public void test01912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01912");
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
        org.jsoup.Connection.Response response51 = response13.removeCookie("");
        java.lang.String str53 = response13.cookie("hi!");
        java.net.HttpURLConnection httpURLConnection54 = null;
        org.jsoup.helper.HttpConnection.Response response55 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL56 = response55.url();
        java.lang.String str57 = response55.statusMessage();
        boolean boolean59 = response55.hasCookie("hi!");
        java.lang.String str61 = response55.header("hi!");
        org.jsoup.helper.HttpConnection.Response response62 = new org.jsoup.helper.HttpConnection.Response(response55);
        java.util.Map.Entry entry64 = response62.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response65 = new org.jsoup.helper.HttpConnection.Response(response62);
        // The following exception was thrown during execution in test generation
        try {
            response13.setupFromConnection(httpURLConnection54, (org.jsoup.Connection.Response) response65);
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
        org.junit.Assert.assertNotNull(response51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(uRL56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(entry64);
    }

    @Test
    public void test01913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01913");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.cookie("hi!");
        org.jsoup.Connection.Response response13 = response0.header("hi!", "");
        java.net.URL uRL14 = response0.url();
        java.lang.String str16 = response0.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test01914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01914");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map map5 = response0.headers();
        boolean boolean7 = response0.hasCookie("hi!");
        int int8 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str12 = response10.cookie("");
        java.lang.String str13 = response10.statusMessage();
        java.lang.String str15 = response10.cookie("");
        java.net.URL uRL16 = response10.url();
        org.jsoup.Connection.Response response18 = response10.removeCookie("hi!");
        org.jsoup.Connection.Response response20 = response10.removeCookie("hi!");
        java.lang.String str22 = response10.header("hi!");
        java.util.Map map23 = response10.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test01915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01915");
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
        java.lang.String str37 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = response0.body();
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
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test01916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01916");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int8 = response0.statusCode();
        java.util.Map map9 = response0.headers();
        int int10 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.Class<?> wildcardClass12 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01917");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response14.cookie("", "");
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
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test01918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01918");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        java.net.URL uRL10 = response0.url();
        org.jsoup.Connection.Response response13 = response0.header("hi!", "");
        java.lang.Class<?> wildcardClass14 = response13.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01919");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.util.Map map3 = response0.headers();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str6 = response0.charset();
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response0.url(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01920");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response0.url();
        java.lang.String str4 = response0.cookie("");
        org.jsoup.Connection.Response response6 = response0.removeCookie("");
        java.lang.String str7 = response0.charset();
        org.jsoup.Connection.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response0.method(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01921");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        boolean boolean4 = response0.hasHeader("hi!");
        java.net.URL uRL5 = response0.url();
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.net.URL uRL8 = response0.url();
        java.lang.String str9 = response0.statusMessage();
        java.util.Map map10 = response0.headers();
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL13 = response12.url();
        org.jsoup.Connection.Method method14 = response12.method();
        java.lang.String str16 = response12.cookie("hi!");
        boolean boolean18 = response12.hasCookie("hi!");
        org.jsoup.Connection.Response response21 = response12.cookie("hi!", "");
        boolean boolean23 = response12.hasHeader("hi!");
        java.lang.String str24 = response12.statusMessage();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.net.URL uRL26 = response25.url();
        org.jsoup.Connection.Response response28 = response25.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection11, response28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNotNull(response28);
    }

    @Test
    public void test01922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01922");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map5 = response4.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.util.Map.Entry entry8 = response1.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str11 = response1.header("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01923");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("hi!");
        int int8 = response0.statusCode();
        boolean boolean10 = response0.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response0.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01924");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.net.URL uRL6 = response0.url();
        boolean boolean8 = response0.hasCookie("");
        java.util.Map map9 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test01925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01925");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str4 = response1.charset();
        org.jsoup.Connection.Response response7 = response1.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test01926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01926");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.cookie("");
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        java.lang.String str7 = response0.header("hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01927");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.HttpURLConnection httpURLConnection6 = null;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.net.URL uRL9 = response8.url();
        java.lang.String str10 = response8.charset();
        java.net.URL uRL11 = response8.url();
        boolean boolean13 = response8.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection6, (org.jsoup.Connection.Response) response8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01928");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.cookie("");
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        java.util.Map map9 = response0.headers();
        int int10 = response0.statusCode();
        java.util.Map map11 = response0.headers();
        java.util.Map.Entry entry13 = response0.scanHeaders("hi!");
        java.util.Map map14 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(entry13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test01929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01929");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str6 = response0.contentType();
        java.util.Map map7 = response0.cookies();
        org.jsoup.Connection.Response response9 = response0.removeCookie("");
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL12 = response11.url();
        java.lang.String str13 = response11.statusMessage();
        java.util.Map map14 = response11.cookies();
        org.jsoup.Connection.Response response16 = response11.removeHeader("hi!");
        java.net.URL uRL17 = response11.url();
        java.util.Map map18 = response11.headers();
        java.lang.String str20 = response11.header("hi!");
        java.lang.String str22 = response11.header("");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test01930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01930");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.lang.String str9 = response0.cookie("");
        java.util.Map map10 = response0.cookies();
        java.util.Map map11 = response0.cookies();
        boolean boolean13 = response0.hasCookie("");
        java.lang.Class<?> wildcardClass14 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01931");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = response9.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
    }

    @Test
    public void test01932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01932");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str5 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str7 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map map8 = response1.headers();
        java.lang.String str10 = response1.cookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01933");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response9 = response0.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test01934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01934");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response4.statusMessage();
        java.lang.String str7 = response4.header("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response4);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = response8.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01935");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        boolean boolean7 = response0.hasCookie("hi!");
        boolean boolean9 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response10.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test01936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01936");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map4 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map4);
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.Connection.Response response12 = response0.header("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test01937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01937");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response0.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test01938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01938");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "hi!");
        java.lang.String str12 = response0.getHeaderCaseInsensitive("");
        java.lang.String str14 = response0.header("");
        java.util.Map map15 = response0.headers();
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test01939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01939");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        java.lang.String str11 = response0.charset();
        java.lang.String str13 = response0.header("");
        java.net.URL uRL14 = response0.url();
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
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test01940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01940");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.cookie("hi!");
        org.jsoup.Connection.Response response13 = response0.cookie("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean16 = response0.hasHeader("hi!");
        java.lang.String str17 = response0.statusMessage();
        java.lang.String str18 = response0.statusMessage();
        java.lang.String str20 = response0.cookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test01941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01941");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        boolean boolean7 = response0.hasHeader("hi!");
        boolean boolean9 = response0.hasHeader("hi!");
        java.lang.String str10 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01942");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test01943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01943");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response6.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = response6.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01944");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response10 = response0.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test01945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01945");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response1.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response5 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test01946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01946");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        java.lang.String str9 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response12 = response10.removeHeader("hi!");
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str16 = response14.cookie("");
        java.lang.String str17 = response14.contentType();
        java.lang.String str19 = response14.getHeaderCaseInsensitive("hi!");
        java.lang.String str20 = response14.contentType();
        java.util.Map map21 = response14.cookies();
        org.jsoup.Connection.Response response23 = response14.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            response10.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test01947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01947");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.charset();
        java.lang.String str9 = response0.charset();
        boolean boolean11 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response13 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response15 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method16 = response0.method();
        org.jsoup.Connection.Response response19 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method21 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(method21);
    }

    @Test
    public void test01948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01948");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        boolean boolean7 = response0.hasCookie("hi!");
        java.lang.String str9 = response0.getHeaderCaseInsensitive("");
        java.util.Map.Entry entry11 = response0.scanHeaders("hi!");
        org.jsoup.Connection.Response response14 = response0.cookie("hi!", "");
        java.lang.Class<?> wildcardClass15 = response0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01949");
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
        java.net.URL uRL14 = response0.url();
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
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test01950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01950");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.cookie("hi!");
        java.util.Map.Entry entry10 = response0.scanHeaders("hi!");
        java.net.URL uRL11 = response0.url();
        java.lang.String str13 = response0.cookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01951");
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
        java.net.URL uRL14 = response0.url();
        java.lang.String str16 = response0.getHeaderCaseInsensitive("");
        java.net.HttpURLConnection httpURLConnection17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL19 = response18.url();
        org.jsoup.Connection.Method method20 = response18.method();
        org.jsoup.Connection.Response response23 = response18.header("hi!", "");
        org.jsoup.Connection.Response response25 = response18.removeHeader("hi!");
        java.lang.String str27 = response18.header("hi!");
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response18);
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test01952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01952");
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
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int16 = response15.statusCode();
        java.lang.Class<?> wildcardClass17 = response15.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01953");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.statusMessage();
        boolean boolean5 = response1.hasCookie("hi!");
        org.jsoup.Connection.Response response8 = response1.header("hi!", "");
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01954");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL5 = response4.url();
        java.lang.String str7 = response4.header("hi!");
        org.jsoup.Connection.Response response9 = response4.removeHeader("hi!");
        java.lang.String str11 = response4.header("hi!");
        java.lang.String str12 = response4.statusMessage();
        java.lang.String str14 = response4.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.util.Map map16 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map16);
        org.jsoup.Connection.Method method18 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(method18);
    }

    @Test
    public void test01955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01955");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean9 = response0.hasCookie("");
        java.lang.String str10 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str12 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL14 = response13.url();
        java.lang.String str16 = response13.header("hi!");
        org.jsoup.Connection.Response response18 = response13.removeHeader("hi!");
        java.util.Map map19 = response13.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response0.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test01956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01956");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.contentType();
        java.lang.String str9 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.cookie("", "hi!");
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
    }

    @Test
    public void test01957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01957");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        int int7 = response0.statusCode();
        java.lang.String str8 = response0.charset();
        int int9 = response0.statusCode();
        java.lang.String str11 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str12 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL15 = response14.url();
        org.jsoup.Connection.Method method16 = response14.method();
        org.jsoup.Connection.Response response18 = response14.removeCookie("hi!");
        java.lang.String str20 = response14.getHeaderCaseInsensitive("");
        java.util.Map map21 = response14.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        java.lang.Class<?> wildcardClass23 = map21.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test01958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01958");
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
        java.lang.String str15 = response14.statusMessage();
        org.jsoup.Connection.Response response18 = response14.header("hi!", "hi!");
        java.util.Map.Entry entry20 = response14.scanHeaders("");
        java.lang.String str22 = response14.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response23 = org.jsoup.helper.HttpConnection.Response.execute(request0, response14);
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
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(entry20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test01959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01959");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.cookies();
        boolean boolean10 = response0.hasHeader("hi!");
        java.util.Map map11 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test01960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01960");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("");
        java.lang.String str4 = response1.contentType();
        java.lang.String str6 = response1.header("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str9 = response1.cookie("hi!");
        java.util.Map map10 = response1.cookies();
        java.lang.String str11 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01961");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        boolean boolean6 = response0.hasHeader("hi!");
        java.util.Map map7 = response0.cookies();
        java.lang.String str8 = response0.contentType();
        org.jsoup.Connection.Method method9 = response0.method();
        java.net.URL uRL10 = response0.url();
        java.util.Map map11 = response0.cookies();
        org.jsoup.Connection.Response response14 = response0.cookie("hi!", "hi!");
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
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test01962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01962");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method3 = response1.method();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method5 = response4.method();
        org.jsoup.Connection.Method method6 = response4.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = org.jsoup.helper.HttpConnection.Response.execute(request0, response4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
    }

    @Test
    public void test01963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01963");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test01964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01964");
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
        java.lang.String str24 = response23.statusMessage();
        boolean boolean26 = response23.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = response23.body();
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
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(entry19);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test01965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01965");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Response response3 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean6 = response0.hasHeader("hi!");
        java.net.HttpURLConnection httpURLConnection7 = null;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str11 = response9.header("hi!");
        java.lang.String str12 = response9.statusMessage();
        java.util.Map.Entry entry14 = response9.scanHeaders("hi!");
        org.jsoup.Connection.Response response17 = response9.cookie("hi!", "");
        boolean boolean19 = response9.hasCookie("hi!");
        java.lang.String str21 = response9.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection7, (org.jsoup.Connection.Response) response9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(entry14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test01966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01966");
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
            org.jsoup.Connection.Response response14 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
    public void test01967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01967");
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
        java.lang.String str15 = response0.cookie("hi!");
        org.jsoup.Connection.Method method16 = response0.method();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL18 = response17.url();
        java.lang.String str20 = response17.header("hi!");
        boolean boolean22 = response17.hasCookie("hi!");
        org.jsoup.Connection.Response response24 = response17.removeCookie("");
        java.util.Map map25 = response17.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        java.net.URL uRL27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response28 = response0.url(uRL27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test01968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01968");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.cookie("");
        java.net.URL uRL6 = response0.url();
        org.jsoup.Connection.Response response8 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response10 = response0.removeCookie("hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test01969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01969");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        java.net.URL uRL4 = response1.url();
        org.jsoup.Connection.Response response7 = response1.header("hi!", "");
        java.lang.String str9 = response1.getHeaderCaseInsensitive("");
        java.lang.String str10 = response1.contentType();
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL13 = response12.url();
        java.lang.String str14 = response12.statusMessage();
        java.util.Map map15 = response12.cookies();
        org.jsoup.Connection.Response response17 = response12.removeHeader("hi!");
        java.net.URL uRL18 = response12.url();
        java.util.Map map19 = response12.headers();
        java.lang.String str21 = response12.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response23 = response12.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection11, (org.jsoup.Connection.Response) response12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test01970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01970");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("");
        org.jsoup.Connection.Method method10 = response0.method();
        java.util.Map map11 = response0.cookies();
        org.jsoup.Connection.Response response14 = response0.cookie("hi!", "hi!");
        java.lang.String str16 = response0.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test01971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01971");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("");
        org.jsoup.Connection.Method method10 = response0.method();
        java.lang.String str11 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01972");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.charset();
        java.lang.String str9 = response0.charset();
        java.lang.String str11 = response0.header("hi!");
        org.jsoup.Connection.Response response14 = response0.cookie("hi!", "");
        java.net.HttpURLConnection httpURLConnection15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL17 = response16.url();
        org.jsoup.Connection.Method method18 = response16.method();
        org.jsoup.Connection.Response response21 = response16.header("hi!", "");
        java.util.Map map22 = response16.headers();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.lang.String str24 = response23.statusMessage();
        java.util.Map map25 = response23.headers();
        org.jsoup.Connection.Method method26 = response23.method();
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response23);
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection15, (org.jsoup.Connection.Response) response27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(method26);
    }

    @Test
    public void test01973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01973");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response6.getHeaderCaseInsensitive("hi!");
        java.lang.String str9 = response6.statusMessage();
        org.jsoup.Connection.Response response11 = response6.removeCookie("hi!");
        java.lang.String str12 = response6.statusMessage();
        java.lang.Class<?> wildcardClass13 = response6.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01974");
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
        int int26 = response0.statusCode();
        org.jsoup.Connection.Method method27 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray28 = response0.bodyAsBytes();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(method27);
    }

    @Test
    public void test01975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01975");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        java.net.URL uRL4 = response1.url();
        java.lang.String str6 = response1.header("hi!");
        org.jsoup.Connection.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response1.method(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01976");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.util.Map map7 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str9 = response8.contentType();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL11 = response10.url();
        org.jsoup.Connection.Method method12 = response10.method();
        org.jsoup.Connection.Response response15 = response10.header("hi!", "");
        java.util.Map map16 = response10.headers();
        org.jsoup.Connection.Response response18 = response10.removeCookie("");
        java.util.Map map19 = response10.cookies();
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        org.jsoup.Connection.Method method21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response8.method(method21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test01977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01977");
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
        java.lang.String str14 = response0.contentType();
        java.lang.String str16 = response0.cookie("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = response0.hasHeader("");
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test01978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01978");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.cookie("");
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.Connection.Response response11 = response0.removeHeader("hi!");
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
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test01979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01979");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response6 = response0.removeCookie("hi!");
        java.util.Map map7 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response0.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test01980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01980");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        java.lang.String str6 = response0.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01981");
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
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response14.url(uRL19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test01982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01982");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Response response8 = response0.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test01983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01983");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL3 = response1.url();
        int int4 = response1.statusCode();
        java.util.Map.Entry entry6 = response1.scanHeaders("");
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test01984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01984");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Method method3 = response0.method();
        java.lang.String str4 = response0.contentType();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders(strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test01985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01985");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        boolean boolean6 = response0.hasHeader("hi!");
        java.util.Map map7 = response0.cookies();
        java.lang.String str8 = response0.contentType();
        org.jsoup.Connection.Method method9 = response0.method();
        java.net.URL uRL10 = response0.url();
        java.util.Map map11 = response0.cookies();
        java.lang.String str13 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str15 = response0.header("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test01986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01986");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("");
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01987");
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
        org.jsoup.Connection.Method method28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response29 = response0.method(method28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
    }

    @Test
    public void test01988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01988");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        java.net.URL uRL3 = response0.url();
        java.net.URL uRL4 = response0.url();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response5.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response5.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test01989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01989");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.charset();
        java.lang.String str9 = response0.charset();
        java.util.Map map10 = response0.headers();
        org.jsoup.Connection.Response response12 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response15 = response0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL17 = response16.url();
        java.lang.String str19 = response16.header("hi!");
        org.jsoup.Connection.Response response21 = response16.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL23 = response22.url();
        java.lang.String str24 = response22.statusMessage();
        java.util.Map map25 = response22.cookies();
        response16.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        int int28 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = response0.body();
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
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test01990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01990");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "hi!");
        java.lang.String str13 = response0.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test01991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01991");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.net.URL uRL3 = response1.url();
        org.jsoup.Connection.Response response5 = response1.removeCookie("");
        java.lang.String str7 = response1.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.net.URL uRL10 = response9.url();
        java.lang.String str11 = response9.charset();
        java.net.URL uRL12 = response9.url();
        java.util.Map map13 = response9.cookies();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test01992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01992");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        java.util.Map.Entry entry8 = response0.scanHeaders("hi!");
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str11 = response0.header("");
        org.jsoup.Connection.Method method12 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test01993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01993");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int8 = response0.statusCode();
        java.util.Map map9 = response0.headers();
        java.util.Map map10 = response0.cookies();
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL13 = response12.url();
        org.jsoup.Connection.Method method14 = response12.method();
        org.jsoup.Connection.Response response17 = response12.header("hi!", "");
        java.lang.String str19 = response12.header("hi!");
        java.util.Map.Entry entry21 = response12.scanHeaders("");
        org.jsoup.Connection.Method method22 = response12.method();
        java.util.Map map23 = response12.cookies();
        org.jsoup.Connection.Response response26 = response12.cookie("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection11, (org.jsoup.Connection.Response) response12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(entry21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(response26);
    }

    @Test
    public void test01994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01994");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test01995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01995");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01996");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        boolean boolean4 = response0.hasHeader("hi!");
        java.net.URL uRL5 = response0.url();
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.net.URL uRL8 = response0.url();
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str10 = response0.statusMessage();
        java.util.Map.Entry entry12 = response0.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(entry12);
    }

    @Test
    public void test01997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01997");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        java.util.Map map4 = response0.headers();
        java.lang.String str6 = response0.cookie("hi!");
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        java.lang.Class<?> wildcardClass11 = response10.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01998");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.cookie("hi!");
        org.jsoup.Connection.Response response13 = response0.cookie("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean16 = response0.hasHeader("hi!");
        java.lang.String str17 = response0.statusMessage();
        java.lang.String str18 = response0.statusMessage();
        java.util.Map map19 = response0.cookies();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap20 = null;
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders(strMap20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test01999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01999");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response9.header("hi!");
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str15 = response13.cookie("");
        java.lang.String str16 = response13.statusMessage();
        java.lang.String str18 = response13.header("hi!");
        java.lang.String str19 = response13.contentType();
        org.jsoup.Connection.Response response22 = response13.header("hi!", "hi!");
        java.lang.String str23 = response13.statusMessage();
        java.util.Map map24 = response13.cookies();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Method method26 = response25.method();
        // The following exception was thrown during execution in test generation
        try {
            response9.setupFromConnection(httpURLConnection12, (org.jsoup.Connection.Response) response25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(method26);
    }

    @Test
    public void test02000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test02000");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.charset();
        java.lang.String str5 = response0.header("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response11 = response8.header("hi!", "");
        org.jsoup.Connection.Response response14 = response8.cookie("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response8.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response14);
    }
}

